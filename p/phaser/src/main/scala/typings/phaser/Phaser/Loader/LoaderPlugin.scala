package typings.phaser.Phaser.Loader

import typings.phaser.Phaser.Cache.CacheManager
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.SceneManager
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Structs.Set
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.BinaryFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.BitmapFontFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.CSSFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.GLSLFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.HTMLFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.HTMLTextureFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.ImageFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.ImageFrameConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.JSONFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.MultiScriptFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PackFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PluginFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.SVGFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.SVGSizeConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.SceneFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.ScenePluginFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.ScriptFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.SpriteSheetFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.TextFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.TilemapCSVFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.TilemapImpactFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.TilemapJSONFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.UnityAtlasFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.VideoFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.XMLFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Loader handles loading all external content such as Images, Sounds, Texture Atlases and data files.
  * You typically interact with it via `this.load` in your Scene. Scenes can have a `preload` method, which is always
  * called before the Scenes `create` method, allowing you to preload assets that the Scene may need.
  * 
  * If you call any `this.load` methods from outside of `Scene.preload` then you need to start the Loader going
  * yourself by calling `Loader.start()`. It's only automatically started during the Scene preload.
  * 
  * The Loader uses a combination of tag loading (eg. Audio elements) and XHR and provides progress and completion events.
  * Files are loaded in parallel by default. The amount of concurrent connections can be controlled in your Game Configuration.
  * 
  * Once the Loader has started loading you are still able to add files to it. These can be injected as a result of a loader
  * event, the type of file being loaded (such as a pack file) or other external events. As long as the Loader hasn't finished
  * simply adding a new file to it, while running, will ensure it's added into the current queue.
  * 
  * Every Scene has its own instance of the Loader and they are bound to the Scene in which they are created. However,
  * assets loaded by the Loader are placed into global game-level caches. For example, loading an XML file will place that
  * file inside `Game.cache.xml`, which is accessible from every Scene in your game, no matter who was responsible
  * for loading it. The same is true of Textures. A texture loaded in one Scene is instantly available to all other Scenes
  * in your game.
  * 
  * The Loader works by using custom File Types. These are stored in the FileTypesManager, which injects them into the Loader
  * when it's instantiated. You can create your own custom file types by extending either the File or MultiFile classes.
  * See those files for more details.
  */
@JSGlobal("Phaser.Loader.LoaderPlugin")
@js.native
class LoaderPlugin protected () extends EventEmitter {
  /**
    * 
    * @param scene The Scene which owns this Loader instance.
    */
  def this(scene: Scene) = this()
  /**
    * If you want to append a URL before the path of any asset you can set this here.
    * 
    * Useful if allowing the asset base url to be configured outside of the game code.
    * 
    * If you set this property directly then it _must_ end with a "/". Alternatively, call `setBaseURL()` and it'll do it for you.
    */
  var baseURL: String = js.native
  /**
    * A reference to the global Cache Manager.
    */
  var cacheManager: CacheManager = js.native
  /**
    * The crossOrigin value applied to loaded images. Very often this needs to be set to 'anonymous'.
    */
  var crossOrigin: String = js.native
  /**
    * Files are stored in this Set while they're in the process of being loaded.
    * 
    * Upon a successful load they are moved to the `queue` Set.
    * 
    * By the end of the load process this Set will be empty.
    */
  var inflight: Set[File] = js.native
  /**
    * Files are placed in this Set when they're added to the Loader via `addFile`.
    * 
    * They are moved to the `inflight` Set when they start loading, and assuming a successful
    * load, to the `queue` Set for further processing.
    * 
    * By the end of the load process this Set will be empty.
    */
  var list: Set[File] = js.native
  /**
    * The number of concurrent / parallel resources to try and fetch at once.
    * 
    * Old browsers limit 6 requests per domain; modern ones, especially those with HTTP/2 don't limit it at all.
    * 
    * The default is 32 but you can change this in your Game Config, or by changing this property before the Loader starts.
    */
  var maxParallelDownloads: integer = js.native
  /**
    * The value of `path`, if set, is placed before any _relative_ file path given. For example:
    * 
    * ```javascript
    * this.load.path = "images/sprites/";
    * this.load.image("ball", "ball.png");
    * this.load.image("tree", "level1/oaktree.png");
    * this.load.image("boom", "http://server.com/explode.png");
    * ```
    * 
    * Would load the `ball` file from `images/sprites/ball.png` and the tree from
    * `images/sprites/level1/oaktree.png` but the file `boom` would load from the URL
    * given as it's an absolute URL.
    * 
    * Please note that the path is added before the filename but *after* the baseURL (if set.)
    * 
    * If you set this property directly then it _must_ end with a "/". Alternatively, call `setPath()` and it'll do it for you.
    */
  var path: String = js.native
  /**
    * An optional prefix that is automatically prepended to the start of every file key.
    * If prefix was `MENU.` and you load an image with the key 'Background' the resulting key would be `MENU.Background`.
    * You can set this directly, or call `Loader.setPrefix()`. It will then affect every file added to the Loader
    * from that point on. It does _not_ change any file already in the load queue.
    */
  var prefix: String = js.native
  /**
    * The progress of the current load queue, as a float value between 0 and 1.
    * This is updated automatically as files complete loading.
    * Note that it is possible for this value to go down again if you add content to the current load queue during a load.
    */
  var progress: Double = js.native
  /**
    * Files are stored in this Set while they're being processed.
    * 
    * If the process is successful they are moved to their final destination, which could be
    * a Cache or the Texture Manager.
    * 
    * At the end of the load process this Set will be empty.
    */
  var queue: Set[File] = js.native
  /**
    * The Scene which owns this Loader instance.
    */
  var scene: Scene = js.native
  /**
    * A reference to the global Scene Manager.
    */
  var sceneManager: SceneManager = js.native
  /**
    * The current state of the Loader.
    */
  val state: integer = js.native
  /**
    * A reference to the Scene Systems.
    */
  var systems: Systems = js.native
  /**
    * A reference to the global Texture Manager.
    */
  var textureManager: TextureManager = js.native
  /**
    * The total number of files that successfully loaded during the most recent load.
    * This value is reset when you call `Loader.start`.
    */
  var totalComplete: integer = js.native
  /**
    * The total number of files that failed to load during the most recent load.
    * This value is reset when you call `Loader.start`.
    */
  var totalFailed: integer = js.native
  /**
    * The total number of files to load. It may not always be accurate because you may add to the Loader during the process
    * of loading, especially if you load a Pack File. Therefore this value can change, but in most cases remains static.
    */
  var totalToLoad: integer = js.native
  /**
    * xhr specific global settings (can be overridden on a per-file basis)
    */
  var xhr: XHRSettingsObject = js.native
  def addFile(file: js.Array[File]): Unit = js.native
  /**
    * Adds a file, or array of files, into the load queue.
    * 
    * The file must be an instance of `Phaser.Loader.File`, or a class that extends it. The Loader will check that the key
    * used by the file won't conflict with any other key either in the loader, the inflight queue or the target cache.
    * If allowed it will then add the file into the pending list, read for the load to start. Or, if the load has already
    * started, ready for the next batch of files to be pulled from the list to the inflight queue.
    * 
    * You should not normally call this method directly, but rather use one of the Loader methods like `image` or `atlas`,
    * however you can call this as long as the file given to it is well formed.
    * @param file The file, or array of files, to be added to the load queue.
    */
  def addFile(file: File): Unit = js.native
  /**
    * Takes a well formed, fully parsed pack file object and adds its entries into the load queue. Usually you do not call
    * this method directly, but instead use `Loader.pack` and supply a path to a JSON file that holds the
    * pack data. However, if you've got the data prepared you can pass it to this method.
    * 
    * You can also provide an optional key. If you do then it will only add the entries from that part of the pack into
    * to the load queue. If not specified it will add all entries it finds. For more details about the pack file format
    * see the `LoaderPlugin.pack` method.
    * @param data The Pack File data to be parsed and each entry of it to added to the load queue.
    * @param packKey An optional key to use from the pack file data.
    */
  def addPack(data: js.Any): Boolean = js.native
  def addPack(data: js.Any, packKey: String): Boolean = js.native
  /**
    * Adds an Animation JSON Data file, or array of Animation JSON files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.animation('baddieAnims', 'files/BaddieAnims.json');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * The key must be a unique String. It is used to add the file to the global JSON Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the JSON Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the JSON Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.animation({
    *     key: 'baddieAnims',
    *     url: 'files/BaddieAnims.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.JSONFileConfig` for more details.
    * 
    * Once the file has finished loading it will automatically be passed to the global Animation Managers `fromJSON` method.
    * This will parse all of the JSON data and create animation data from it. This process happens at the very end
    * of the Loader, once every other file in the load queue has finished. The reason for this is to allow you to load
    * both animation data and the images it relies upon in the same load call.
    * 
    * Once the animation data has been parsed you will be able to play animations using that data.
    * Please see the Animation Manager `fromJSON` method for more details about the format and playback.
    * 
    * You can also access the raw animation data from its Cache using its key:
    * 
    * ```javascript
    * this.load.animation('baddieAnims', 'files/BaddieAnims.json');
    * // and later in your game ...
    * var data = this.cache.json.get('baddieAnims');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Waves` the final key will be `LEVEL1.Waves` and
    * this is what you would use to retrieve the text from the JSON Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "data"
    * and no URL is given then the Loader will set the URL to be "data.json". It will always add `.json` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * You can also optionally provide a `dataKey` to use. This allows you to extract only a part of the JSON and store it in the Cache,
    * rather than the whole file. For example, if your JSON data had a structure like this:
    * 
    * ```json
    * {
    *     "level1": {
    *         "baddies": {
    *             "aliens": {},
    *             "boss": {}
    *         }
    *     },
    *     "level2": {},
    *     "level3": {}
    * }
    * ```
    * 
    * And if you only wanted to create animations from the `boss` data, then you could pass `level1.baddies.boss`as the `dataKey`.
    * 
    * Note: The ability to load this type of file will only be available if the JSON File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param dataKey When the Animation JSON file loads only this property will be stored in the Cache and used to create animation data.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def animation(key: String): LoaderPlugin = js.native
  def animation(key: String, url: String): LoaderPlugin = js.native
  def animation(key: String, url: String, dataKey: String): LoaderPlugin = js.native
  def animation(key: String, url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def animation(key: js.Array[JSONFileConfig]): LoaderPlugin = js.native
  def animation(key: js.Array[JSONFileConfig], url: String): LoaderPlugin = js.native
  def animation(key: js.Array[JSONFileConfig], url: String, dataKey: String): LoaderPlugin = js.native
  def animation(key: js.Array[JSONFileConfig], url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def animation(key: JSONFileConfig): LoaderPlugin = js.native
  def animation(key: JSONFileConfig, url: String): LoaderPlugin = js.native
  def animation(key: JSONFileConfig, url: String, dataKey: String): LoaderPlugin = js.native
  def animation(key: JSONFileConfig, url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a JSON based Texture Atlas, or array of atlases, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.atlas('mainmenu', 'images/MainMenu.png', 'images/MainMenu.json');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * Phaser expects the atlas data to be provided in a JSON file, using either the JSON Hash or JSON Array format.
    * These files are created by software such as Texture Packer, Shoebox and Adobe Flash / Animate.
    * If you are using Texture Packer and have enabled multi-atlas support, then please use the Phaser Multi Atlas loader
    * instead of this one.
    * 
    * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.atlas({
    *     key: 'mainmenu',
    *     textureURL: 'images/MainMenu.png',
    *     atlasURL: 'images/MainMenu.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig` for more details.
    * 
    * Instead of passing a URL for the atlas JSON data you can also pass in a well formed JSON object instead.
    * 
    * Once the atlas has finished loading you can use frames from it as textures for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.atlas('mainmenu', 'images/MainMenu.png', 'images/MainMenu.json');
    * // and later in your game ...
    * this.add.image(x, y, 'mainmenu', 'background');
    * ```
    * 
    * To get a list of all available frames within an atlas please consult your Texture Atlas software.
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
    * then you can specify it by providing an array as the `url` where the second element is the normal map:
    * 
    * ```javascript
    * this.load.atlas('mainmenu', [ 'images/MainMenu.png', 'images/MainMenu-n.png' ], 'images/MainMenu.json');
    * ```
    * 
    * Or, if you are using a config object use the `normalMap` property:
    * 
    * ```javascript
    * this.load.atlas({
    *     key: 'mainmenu',
    *     textureURL: 'images/MainMenu.png',
    *     normalMap: 'images/MainMenu-n.png',
    *     atlasURL: 'images/MainMenu.json'
    * });
    * ```
    * 
    * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
    * Normal maps are a WebGL only feature.
    * 
    * Note: The ability to load this type of file will only be available if the Atlas JSON File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
    */
  def atlas(key: String): LoaderPlugin = js.native
  def atlas(key: String, textureURL: String): LoaderPlugin = js.native
  def atlas(key: String, textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def atlas(key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def atlas(
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(key: String, textureURL: js.Array[String]): LoaderPlugin = js.native
  def atlas(key: String, textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def atlas(key: String, textureURL: js.Array[String], atlasURL: String, textureXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def atlas(
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(key: js.Array[AtlasJSONFileConfig]): LoaderPlugin = js.native
  def atlas(key: js.Array[AtlasJSONFileConfig], textureURL: String): LoaderPlugin = js.native
  def atlas(key: js.Array[AtlasJSONFileConfig], textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def atlas(
    key: js.Array[AtlasJSONFileConfig],
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(
    key: js.Array[AtlasJSONFileConfig],
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(key: js.Array[AtlasJSONFileConfig], textureURL: js.Array[String]): LoaderPlugin = js.native
  def atlas(key: js.Array[AtlasJSONFileConfig], textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def atlas(
    key: js.Array[AtlasJSONFileConfig],
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(
    key: js.Array[AtlasJSONFileConfig],
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(key: AtlasJSONFileConfig): LoaderPlugin = js.native
  def atlas(key: AtlasJSONFileConfig, textureURL: String): LoaderPlugin = js.native
  def atlas(key: AtlasJSONFileConfig, textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def atlas(
    key: AtlasJSONFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(
    key: AtlasJSONFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(key: AtlasJSONFileConfig, textureURL: js.Array[String]): LoaderPlugin = js.native
  def atlas(key: AtlasJSONFileConfig, textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def atlas(
    key: AtlasJSONFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlas(
    key: AtlasJSONFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Adds an XML based Texture Atlas, or array of atlases, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.atlasXML('mainmenu', 'images/MainMenu.png', 'images/MainMenu.xml');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * Phaser expects the atlas data to be provided in an XML file format.
    * These files are created by software such as Shoebox and Adobe Flash / Animate.
    * 
    * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.atlasXML({
    *     key: 'mainmenu',
    *     textureURL: 'images/MainMenu.png',
    *     atlasURL: 'images/MainMenu.xml'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig` for more details.
    * 
    * Once the atlas has finished loading you can use frames from it as textures for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.atlasXML('mainmenu', 'images/MainMenu.png', 'images/MainMenu.xml');
    * // and later in your game ...
    * this.add.image(x, y, 'mainmenu', 'background');
    * ```
    * 
    * To get a list of all available frames within an atlas please consult your Texture Atlas software.
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
    * then you can specify it by providing an array as the `url` where the second element is the normal map:
    * 
    * ```javascript
    * this.load.atlasXML('mainmenu', [ 'images/MainMenu.png', 'images/MainMenu-n.png' ], 'images/MainMenu.xml');
    * ```
    * 
    * Or, if you are using a config object use the `normalMap` property:
    * 
    * ```javascript
    * this.load.atlasXML({
    *     key: 'mainmenu',
    *     textureURL: 'images/MainMenu.png',
    *     normalMap: 'images/MainMenu-n.png',
    *     atlasURL: 'images/MainMenu.xml'
    * });
    * ```
    * 
    * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
    * Normal maps are a WebGL only feature.
    * 
    * Note: The ability to load this type of file will only be available if the Atlas XML File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas xml file. Used in replacement of the Loaders default XHR Settings.
    */
  def atlasXML(key: String): LoaderPlugin = js.native
  def atlasXML(key: String, textureURL: String): LoaderPlugin = js.native
  def atlasXML(key: String, textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def atlasXML(key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def atlasXML(
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(key: String, textureURL: js.Array[String]): LoaderPlugin = js.native
  def atlasXML(key: String, textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def atlasXML(key: String, textureURL: js.Array[String], atlasURL: String, textureXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def atlasXML(
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(key: js.Array[AtlasXMLFileConfig]): LoaderPlugin = js.native
  def atlasXML(key: js.Array[AtlasXMLFileConfig], textureURL: String): LoaderPlugin = js.native
  def atlasXML(key: js.Array[AtlasXMLFileConfig], textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def atlasXML(
    key: js.Array[AtlasXMLFileConfig],
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(
    key: js.Array[AtlasXMLFileConfig],
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(key: js.Array[AtlasXMLFileConfig], textureURL: js.Array[String]): LoaderPlugin = js.native
  def atlasXML(key: js.Array[AtlasXMLFileConfig], textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def atlasXML(
    key: js.Array[AtlasXMLFileConfig],
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(
    key: js.Array[AtlasXMLFileConfig],
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(key: AtlasXMLFileConfig): LoaderPlugin = js.native
  def atlasXML(key: AtlasXMLFileConfig, textureURL: String): LoaderPlugin = js.native
  def atlasXML(key: AtlasXMLFileConfig, textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def atlasXML(
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(key: AtlasXMLFileConfig, textureURL: js.Array[String]): LoaderPlugin = js.native
  def atlasXML(key: AtlasXMLFileConfig, textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def atlasXML(
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def atlasXML(
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Adds an Audio or HTML5Audio file, or array of audio files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.audio('title', [ 'music/Title.ogg', 'music/Title.mp3', 'music/Title.m4a' ]);
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Audio Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Audio Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Audio Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.audio({
    *     key: 'title',
    *     url: [ 'music/Title.ogg', 'music/Title.mp3', 'music/Title.m4a' ]
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.AudioFileConfig` for more details.
    * 
    * The URLs can be relative or absolute. If the URLs are relative the `Loader.baseURL` and `Loader.path` values will be prepended to them.
    * 
    * Due to different browsers supporting different audio file types you should usually provide your audio files in a variety of formats.
    * ogg, mp3 and m4a are the most common. If you provide an array of URLs then the Loader will determine which _one_ file to load based on
    * browser support.
    * 
    * If audio has been disabled in your game, either via the game config, or lack of support from the device, then no audio will be loaded.
    * 
    * Note: The ability to load this type of file will only be available if the Audio File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param urls The absolute or relative URL to load the audio files from.
    * @param config An object containing an `instances` property for HTML5Audio. Defaults to 1.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def audio(key: String): LoaderPlugin = js.native
  def audio(key: String, urls: String): LoaderPlugin = js.native
  def audio(key: String, urls: String, config: js.Any): LoaderPlugin = js.native
  def audio(key: String, urls: String, config: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def audio(key: String, urls: js.Array[String]): LoaderPlugin = js.native
  def audio(key: String, urls: js.Array[String], config: js.Any): LoaderPlugin = js.native
  def audio(key: String, urls: js.Array[String], config: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def audio(key: js.Array[AudioFileConfig]): LoaderPlugin = js.native
  def audio(key: js.Array[AudioFileConfig], urls: String): LoaderPlugin = js.native
  def audio(key: js.Array[AudioFileConfig], urls: String, config: js.Any): LoaderPlugin = js.native
  def audio(key: js.Array[AudioFileConfig], urls: String, config: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def audio(key: js.Array[AudioFileConfig], urls: js.Array[String]): LoaderPlugin = js.native
  def audio(key: js.Array[AudioFileConfig], urls: js.Array[String], config: js.Any): LoaderPlugin = js.native
  def audio(
    key: js.Array[AudioFileConfig],
    urls: js.Array[String],
    config: js.Any,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audio(key: AudioFileConfig): LoaderPlugin = js.native
  def audio(key: AudioFileConfig, urls: String): LoaderPlugin = js.native
  def audio(key: AudioFileConfig, urls: String, config: js.Any): LoaderPlugin = js.native
  def audio(key: AudioFileConfig, urls: String, config: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def audio(key: AudioFileConfig, urls: js.Array[String]): LoaderPlugin = js.native
  def audio(key: AudioFileConfig, urls: js.Array[String], config: js.Any): LoaderPlugin = js.native
  def audio(key: AudioFileConfig, urls: js.Array[String], config: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a JSON based Audio Sprite, or array of audio sprites, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.audioSprite('kyobi', 'kyobi.json', [
    *         'kyobi.ogg',
    *         'kyobi.mp3',
    *         'kyobi.m4a'
    *     ]);
    * }
    * ```
    * 
    * Audio Sprites are a combination of audio files and a JSON configuration.
    * The JSON follows the format of that created by https://github.com/tonistiigi/audiosprite
    * 
    * If the JSON file includes a 'resource' object then you can let Phaser parse it and load the audio
    * files automatically based on its content. To do this exclude the audio URLs from the load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.audioSprite('kyobi', 'kyobi.json');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * The key must be a unique String. It is used to add the file to the global Audio Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Audio Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Audio Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.audioSprite({
    *     key: 'kyobi',
    *     jsonURL: 'audio/Kyobi.json',
    *     audioURL: [
    *         'audio/Kyobi.ogg',
    *         'audio/Kyobi.mp3',
    *         'audio/Kyobi.m4a'
    *     ]
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig` for more details.
    * 
    * Instead of passing a URL for the audio JSON data you can also pass in a well formed JSON object instead.
    * 
    * Once the audio has finished loading you can use it create an Audio Sprite by referencing its key:
    * 
    * ```javascript
    * this.load.audioSprite('kyobi', 'kyobi.json');
    * // and later in your game ...
    * var music = this.sound.addAudioSprite('kyobi');
    * music.play('title');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * Due to different browsers supporting different audio file types you should usually provide your audio files in a variety of formats.
    * ogg, mp3 and m4a are the most common. If you provide an array of URLs then the Loader will determine which _one_ file to load based on
    * browser support.
    * 
    * If audio has been disabled in your game, either via the game config, or lack of support from the device, then no audio will be loaded.
    * 
    * Note: The ability to load this type of file will only be available if the Audio Sprite File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or an array of objects.
    * @param jsonURL The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    * @param audioURL The absolute or relative URL to load the audio file from. If empty it will be obtained by parsing the JSON file.
    * @param audioConfig The audio configuration options.
    * @param audioXhrSettings An XHR Settings configuration object for the audio file. Used in replacement of the Loaders default XHR Settings.
    * @param jsonXhrSettings An XHR Settings configuration object for the json file. Used in replacement of the Loaders default XHR Settings.
    */
  def audioSprite(key: String, jsonURL: String): LoaderPlugin = js.native
  def audioSprite(key: String, jsonURL: String, audioURL: String): LoaderPlugin = js.native
  def audioSprite(key: String, jsonURL: String, audioURL: String, audioConfig: js.Any): LoaderPlugin = js.native
  def audioSprite(
    key: String,
    jsonURL: String,
    audioURL: String,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(
    key: String,
    jsonURL: String,
    audioURL: String,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(key: String, jsonURL: String, audioURL: js.Array[String]): LoaderPlugin = js.native
  def audioSprite(key: String, jsonURL: String, audioURL: js.Array[String], audioConfig: js.Any): LoaderPlugin = js.native
  def audioSprite(
    key: String,
    jsonURL: String,
    audioURL: js.Array[String],
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(
    key: String,
    jsonURL: String,
    audioURL: js.Array[String],
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(key: js.Array[AudioSpriteFileConfig], jsonURL: String): LoaderPlugin = js.native
  def audioSprite(key: js.Array[AudioSpriteFileConfig], jsonURL: String, audioURL: String): LoaderPlugin = js.native
  def audioSprite(key: js.Array[AudioSpriteFileConfig], jsonURL: String, audioURL: String, audioConfig: js.Any): LoaderPlugin = js.native
  def audioSprite(
    key: js.Array[AudioSpriteFileConfig],
    jsonURL: String,
    audioURL: String,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(
    key: js.Array[AudioSpriteFileConfig],
    jsonURL: String,
    audioURL: String,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(key: js.Array[AudioSpriteFileConfig], jsonURL: String, audioURL: js.Array[String]): LoaderPlugin = js.native
  def audioSprite(
    key: js.Array[AudioSpriteFileConfig],
    jsonURL: String,
    audioURL: js.Array[String],
    audioConfig: js.Any
  ): LoaderPlugin = js.native
  def audioSprite(
    key: js.Array[AudioSpriteFileConfig],
    jsonURL: String,
    audioURL: js.Array[String],
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(
    key: js.Array[AudioSpriteFileConfig],
    jsonURL: String,
    audioURL: js.Array[String],
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(key: AudioSpriteFileConfig, jsonURL: String): LoaderPlugin = js.native
  def audioSprite(key: AudioSpriteFileConfig, jsonURL: String, audioURL: String): LoaderPlugin = js.native
  def audioSprite(key: AudioSpriteFileConfig, jsonURL: String, audioURL: String, audioConfig: js.Any): LoaderPlugin = js.native
  def audioSprite(
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: String,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: String,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(key: AudioSpriteFileConfig, jsonURL: String, audioURL: js.Array[String]): LoaderPlugin = js.native
  def audioSprite(key: AudioSpriteFileConfig, jsonURL: String, audioURL: js.Array[String], audioConfig: js.Any): LoaderPlugin = js.native
  def audioSprite(
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Array[String],
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def audioSprite(
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Array[String],
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Adds a Binary file, or array of Binary files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.binary('doom', 'files/Doom.wad');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Binary Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Binary Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Binary Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.binary({
    *     key: 'doom',
    *     url: 'files/Doom.wad',
    *     dataType: Uint8Array
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.BinaryFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.binary('doom', 'files/Doom.wad');
    * // and later in your game ...
    * var data = this.cache.binary.get('doom');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Data` the final key will be `LEVEL1.Data` and
    * this is what you would use to retrieve the text from the Binary Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "doom"
    * and no URL is given then the Loader will set the URL to be "doom.bin". It will always add `.bin` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Binary File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.bin`, i.e. if `key` was "alien" then the URL will be "alien.bin".
    * @param dataType Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def binary(key: String): LoaderPlugin = js.native
  def binary(key: String, url: String): LoaderPlugin = js.native
  def binary(key: String, url: String, dataType: js.Any): LoaderPlugin = js.native
  def binary(key: String, url: String, dataType: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def binary(key: js.Array[BinaryFileConfig]): LoaderPlugin = js.native
  def binary(key: js.Array[BinaryFileConfig], url: String): LoaderPlugin = js.native
  def binary(key: js.Array[BinaryFileConfig], url: String, dataType: js.Any): LoaderPlugin = js.native
  def binary(key: js.Array[BinaryFileConfig], url: String, dataType: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def binary(key: BinaryFileConfig): LoaderPlugin = js.native
  def binary(key: BinaryFileConfig, url: String): LoaderPlugin = js.native
  def binary(key: BinaryFileConfig, url: String, dataType: js.Any): LoaderPlugin = js.native
  def binary(key: BinaryFileConfig, url: String, dataType: js.Any, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds an XML based Bitmap Font, or array of fonts, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * ```javascript
    * function preload ()
    * {
    *     this.load.bitmapFont('goldenFont', 'images/GoldFont.png', 'images/GoldFont.xml');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * Phaser expects the font data to be provided in an XML file format.
    * These files are created by software such as the [Angelcode Bitmap Font Generator](http://www.angelcode.com/products/bmfont/),
    * [Littera](http://kvazars.com/littera/) or [Glyph Designer](https://71squared.com/glyphdesigner)
    * 
    * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.bitmapFont({
    *     key: 'goldenFont',
    *     textureURL: 'images/GoldFont.png',
    *     fontDataURL: 'images/GoldFont.xml'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.BitmapFontFileConfig` for more details.
    * 
    * Once the atlas has finished loading you can use key of it when creating a Bitmap Text Game Object:
    * 
    * ```javascript
    * this.load.bitmapFont('goldenFont', 'images/GoldFont.png', 'images/GoldFont.xml');
    * // and later in your game ...
    * this.add.bitmapText(x, y, 'goldenFont', 'Hello World');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use when creating a Bitmap Text object.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
    * then you can specify it by providing an array as the `url` where the second element is the normal map:
    * 
    * ```javascript
    * this.load.bitmapFont('goldenFont', [ 'images/GoldFont.png', 'images/GoldFont-n.png' ], 'images/GoldFont.xml');
    * ```
    * 
    * Or, if you are using a config object use the `normalMap` property:
    * 
    * ```javascript
    * this.load.bitmapFont({
    *     key: 'goldenFont',
    *     textureURL: 'images/GoldFont.png',
    *     normalMap: 'images/GoldFont-n.png',
    *     fontDataURL: 'images/GoldFont.xml'
    * });
    * ```
    * 
    * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
    * Normal maps are a WebGL only feature.
    * 
    * Note: The ability to load this type of file will only be available if the Bitmap Font File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param textureURL The absolute or relative URL to load the font image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param fontDataURL The absolute or relative URL to load the font xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
    * @param textureXhrSettings An XHR Settings configuration object for the font image file. Used in replacement of the Loaders default XHR Settings.
    * @param fontDataXhrSettings An XHR Settings configuration object for the font data xml file. Used in replacement of the Loaders default XHR Settings.
    */
  def bitmapFont(key: String): LoaderPlugin = js.native
  def bitmapFont(key: String, textureURL: String): LoaderPlugin = js.native
  def bitmapFont(key: String, textureURL: String, fontDataURL: String): LoaderPlugin = js.native
  def bitmapFont(key: String, textureURL: String, fontDataURL: String, textureXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def bitmapFont(
    key: String,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(key: String, textureURL: js.Array[String]): LoaderPlugin = js.native
  def bitmapFont(key: String, textureURL: js.Array[String], fontDataURL: String): LoaderPlugin = js.native
  def bitmapFont(
    key: String,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(
    key: String,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(key: js.Array[BitmapFontFileConfig]): LoaderPlugin = js.native
  def bitmapFont(key: js.Array[BitmapFontFileConfig], textureURL: String): LoaderPlugin = js.native
  def bitmapFont(key: js.Array[BitmapFontFileConfig], textureURL: String, fontDataURL: String): LoaderPlugin = js.native
  def bitmapFont(
    key: js.Array[BitmapFontFileConfig],
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(
    key: js.Array[BitmapFontFileConfig],
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(key: js.Array[BitmapFontFileConfig], textureURL: js.Array[String]): LoaderPlugin = js.native
  def bitmapFont(key: js.Array[BitmapFontFileConfig], textureURL: js.Array[String], fontDataURL: String): LoaderPlugin = js.native
  def bitmapFont(
    key: js.Array[BitmapFontFileConfig],
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(
    key: js.Array[BitmapFontFileConfig],
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(key: BitmapFontFileConfig): LoaderPlugin = js.native
  def bitmapFont(key: BitmapFontFileConfig, textureURL: String): LoaderPlugin = js.native
  def bitmapFont(key: BitmapFontFileConfig, textureURL: String, fontDataURL: String): LoaderPlugin = js.native
  def bitmapFont(
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(key: BitmapFontFileConfig, textureURL: js.Array[String]): LoaderPlugin = js.native
  def bitmapFont(key: BitmapFontFileConfig, textureURL: js.Array[String], fontDataURL: String): LoaderPlugin = js.native
  def bitmapFont(
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def bitmapFont(
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Adds a CSS file, or array of CSS files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.css('headers', 'styles/headers.css');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String and not already in-use by another file in the Loader.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.css({
    *     key: 'headers',
    *     url: 'styles/headers.css'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.CSSFileConfig` for more details.
    * 
    * Once the file has finished loading it will automatically be converted into a style DOM element
    * via `document.createElement('style')`. It will have its `defer` property set to false and then the
    * resulting element will be appended to `document.head`. The CSS styles are then applied to the current document.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.css". It will always add `.css` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the CSS File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.css`, i.e. if `key` was "alien" then the URL will be "alien.css".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def css(key: String): LoaderPlugin = js.native
  def css(key: String, url: String): LoaderPlugin = js.native
  def css(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def css(key: js.Array[CSSFileConfig]): LoaderPlugin = js.native
  def css(key: js.Array[CSSFileConfig], url: String): LoaderPlugin = js.native
  def css(key: js.Array[CSSFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def css(key: CSSFileConfig): LoaderPlugin = js.native
  def css(key: CSSFileConfig, url: String): LoaderPlugin = js.native
  def css(key: CSSFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * An internal method that is called automatically by the File when it has finished processing.
    * 
    * If the process was successful, and the File isn't part of a MultiFile, its `addToCache` method is called.
    * 
    * It this then removed from the queue. If there are no more files to load `loadComplete` is called.
    * @param file The file that has finished processing.
    */
  def fileProcessComplete(file: File): Unit = js.native
  /**
    * Adds a File into the pending-deletion queue.
    * @param file The File to be queued for deletion when the Loader completes.
    */
  def flagForRemoval(file: File): Unit = js.native
  /**
    * Adds a GLSL file, or array of GLSL files, to the current load queue.
    * In Phaser 3 GLSL files are just plain Text files at the current moment in time.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.glsl('plasma', 'shaders/Plasma.glsl');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Shader Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Shader Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Shader Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.glsl({
    *     key: 'plasma',
    *     shaderType: 'fragment',
    *     url: 'shaders/Plasma.glsl'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.GLSLFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.glsl('plasma', 'shaders/Plasma.glsl');
    * // and later in your game ...
    * var data = this.cache.shader.get('plasma');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `FX.` and the key was `Plasma` the final key will be `FX.Plasma` and
    * this is what you would use to retrieve the text from the Shader Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "plasma"
    * and no URL is given then the Loader will set the URL to be "plasma.glsl". It will always add `.glsl` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the GLSL File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.glsl`, i.e. if `key` was "alien" then the URL will be "alien.glsl".
    * @param shaderType The type of shader. Either `fragment` for a fragment shader, or `vertex` for a vertex shader. This is ignored if you load a shader bundle. Default 'fragment'.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def glsl(key: String): LoaderPlugin = js.native
  def glsl(key: String, url: String): LoaderPlugin = js.native
  def glsl(key: String, url: String, shaderType: String): LoaderPlugin = js.native
  def glsl(key: String, url: String, shaderType: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def glsl(key: js.Array[GLSLFileConfig]): LoaderPlugin = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: String): LoaderPlugin = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: String, shaderType: String): LoaderPlugin = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: String, shaderType: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def glsl(key: GLSLFileConfig): LoaderPlugin = js.native
  def glsl(key: GLSLFileConfig, url: String): LoaderPlugin = js.native
  def glsl(key: GLSLFileConfig, url: String, shaderType: String): LoaderPlugin = js.native
  def glsl(key: GLSLFileConfig, url: String, shaderType: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds an HTML file, or array of HTML files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.html('story', 'files/LoginForm.html');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global HTML Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the HTML Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the HTML Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.html({
    *     key: 'login',
    *     url: 'files/LoginForm.html'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.HTMLFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.html('login', 'files/LoginForm.html');
    * // and later in your game ...
    * var data = this.cache.html.get('login');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Story` the final key will be `LEVEL1.Story` and
    * this is what you would use to retrieve the html from the HTML Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "story"
    * and no URL is given then the Loader will set the URL to be "story.html". It will always add `.html` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the HTML File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.html`, i.e. if `key` was "alien" then the URL will be "alien.html".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def html(key: String): LoaderPlugin = js.native
  def html(key: String, url: String): LoaderPlugin = js.native
  def html(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def html(key: js.Array[HTMLFileConfig]): LoaderPlugin = js.native
  def html(key: js.Array[HTMLFileConfig], url: String): LoaderPlugin = js.native
  def html(key: js.Array[HTMLFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def html(key: HTMLFileConfig): LoaderPlugin = js.native
  def html(key: HTMLFileConfig, url: String): LoaderPlugin = js.native
  def html(key: HTMLFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds an HTML File, or array of HTML Files, to the current load queue. When the files are loaded they
    * will be rendered to textures and stored in the Texture Manager.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.htmlTexture('instructions', 'content/intro.html', 256, 512);
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.htmlTexture({
    *     key: 'instructions',
    *     url: 'content/intro.html',
    *     width: 256,
    *     height: 512
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.HTMLTextureFileConfig` for more details.
    * 
    * Once the file has finished loading you can use it as a texture for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.htmlTexture('instructions', 'content/intro.html', 256, 512);
    * // and later in your game ...
    * this.add.image(x, y, 'instructions');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.html". It will always add `.html` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * The width and height are the size of the texture to which the HTML will be rendered. It's not possible to determine these
    * automatically, so you will need to provide them, either as arguments or in the file config object.
    * When the HTML file has loaded a new SVG element is created with a size and viewbox set to the width and height given.
    * The SVG file has a body tag added to it, with the HTML file contents included. It then calls `window.Blob` on the SVG,
    * and if successful is added to the Texture Manager, otherwise it fails processing. The overall quality of the rendered
    * HTML depends on your browser, and some of them may not even support the svg / blob process used. Be aware that there are
    * limitations on what HTML can be inside an SVG. You can find out more details in this
    * [Mozilla MDN entry](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API/Drawing_DOM_objects_into_a_canvas).
    * 
    * Note: The ability to load this type of file will only be available if the HTMLTextureFile File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.html`, i.e. if `key` was "alien" then the URL will be "alien.html".
    * @param width The width of the texture the HTML will be rendered to. Default 512.
    * @param height The height of the texture the HTML will be rendered to. Default 512.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def htmlTexture(key: String): LoaderPlugin = js.native
  def htmlTexture(key: String, url: String): LoaderPlugin = js.native
  def htmlTexture(key: String, url: String, width: integer): LoaderPlugin = js.native
  def htmlTexture(key: String, url: String, width: integer, height: integer): LoaderPlugin = js.native
  def htmlTexture(key: String, url: String, width: integer, height: integer, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig]): LoaderPlugin = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: String): LoaderPlugin = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: String, width: integer): LoaderPlugin = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: String, width: integer, height: integer): LoaderPlugin = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: String,
    width: integer,
    height: integer,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def htmlTexture(key: HTMLTextureFileConfig): LoaderPlugin = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String): LoaderPlugin = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String, width: integer): LoaderPlugin = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String, width: integer, height: integer): LoaderPlugin = js.native
  def htmlTexture(
    key: HTMLTextureFileConfig,
    url: String,
    width: integer,
    height: integer,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Adds an Image, or array of Images, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.image('logo', 'images/phaserLogo.png');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
    * If you try to load an animated gif only the first frame will be rendered. Browsers do not natively support playback
    * of animated gifs to Canvas elements.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.image({
    *     key: 'logo',
    *     url: 'images/AtariLogo.png'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.ImageFileConfig` for more details.
    * 
    * Once the file has finished loading you can use it as a texture for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.image('logo', 'images/AtariLogo.png');
    * // and later in your game ...
    * this.add.image(x, y, 'logo');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
    * then you can specify it by providing an array as the `url` where the second element is the normal map:
    * 
    * ```javascript
    * this.load.image('logo', [ 'images/AtariLogo.png', 'images/AtariLogo-n.png' ]);
    * ```
    * 
    * Or, if you are using a config object use the `normalMap` property:
    * 
    * ```javascript
    * this.load.image({
    *     key: 'logo',
    *     url: 'images/AtariLogo.png',
    *     normalMap: 'images/AtariLogo-n.png'
    * });
    * ```
    * 
    * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
    * Normal maps are a WebGL only feature.
    * 
    * Note: The ability to load this type of file will only be available if the Image File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def image(key: String): LoaderPlugin = js.native
  def image(key: String, url: String): LoaderPlugin = js.native
  def image(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def image(key: String, url: js.Array[String]): LoaderPlugin = js.native
  def image(key: String, url: js.Array[String], xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def image(key: js.Array[ImageFileConfig]): LoaderPlugin = js.native
  def image(key: js.Array[ImageFileConfig], url: String): LoaderPlugin = js.native
  def image(key: js.Array[ImageFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def image(key: js.Array[ImageFileConfig], url: js.Array[String]): LoaderPlugin = js.native
  def image(key: js.Array[ImageFileConfig], url: js.Array[String], xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def image(key: ImageFileConfig): LoaderPlugin = js.native
  def image(key: ImageFileConfig, url: String): LoaderPlugin = js.native
  def image(key: ImageFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def image(key: ImageFileConfig, url: js.Array[String]): LoaderPlugin = js.native
  def image(key: ImageFileConfig, url: js.Array[String], xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Is the Loader actively loading, or processing loaded files?
    */
  def isLoading(): Boolean = js.native
  /**
    * Is the Loader ready to start a new load?
    */
  def isReady(): Boolean = js.native
  /**
    * Adds a JSON file, or array of JSON files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.json('wavedata', 'files/AlienWaveData.json');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global JSON Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the JSON Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the JSON Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.json({
    *     key: 'wavedata',
    *     url: 'files/AlienWaveData.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.JSONFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.json('wavedata', 'files/AlienWaveData.json');
    * // and later in your game ...
    * var data = this.cache.json.get('wavedata');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Waves` the final key will be `LEVEL1.Waves` and
    * this is what you would use to retrieve the text from the JSON Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "data"
    * and no URL is given then the Loader will set the URL to be "data.json". It will always add `.json` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * You can also optionally provide a `dataKey` to use. This allows you to extract only a part of the JSON and store it in the Cache,
    * rather than the whole file. For example, if your JSON data had a structure like this:
    * 
    * ```json
    * {
    *     "level1": {
    *         "baddies": {
    *             "aliens": {},
    *             "boss": {}
    *         }
    *     },
    *     "level2": {},
    *     "level3": {}
    * }
    * ```
    * 
    * And you only wanted to store the `boss` data in the Cache, then you could pass `level1.baddies.boss`as the `dataKey`.
    * 
    * Note: The ability to load this type of file will only be available if the JSON File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param dataKey When the JSON file loads only this property will be stored in the Cache.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def json(key: String): LoaderPlugin = js.native
  def json(key: String, url: String): LoaderPlugin = js.native
  def json(key: String, url: String, dataKey: String): LoaderPlugin = js.native
  def json(key: String, url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def json(key: js.Array[JSONFileConfig]): LoaderPlugin = js.native
  def json(key: js.Array[JSONFileConfig], url: String): LoaderPlugin = js.native
  def json(key: js.Array[JSONFileConfig], url: String, dataKey: String): LoaderPlugin = js.native
  def json(key: js.Array[JSONFileConfig], url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def json(key: JSONFileConfig): LoaderPlugin = js.native
  def json(key: JSONFileConfig, url: String): LoaderPlugin = js.native
  def json(key: JSONFileConfig, url: String, dataKey: String): LoaderPlugin = js.native
  def json(key: JSONFileConfig, url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Checks the key and type of the given file to see if it will conflict with anything already
    * in a Cache, the Texture Manager, or the list or inflight queues.
    * @param file The file to check the key of.
    */
  def keyExists(file: File): Boolean = js.native
  /**
    * Called at the end when the load queue is exhausted and all files have either loaded or errored.
    * By this point every loaded file will now be in its associated cache and ready for use.
    * 
    * Also clears down the Sets, puts progress to 1 and clears the deletion queue.
    */
  def loadComplete(): Unit = js.native
  /**
    * Adds a Multi Texture Atlas, or array of multi atlases, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.multiatlas('level1', 'images/Level1.json');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * Phaser expects the atlas data to be provided in a JSON file as exported from the application Texture Packer,
    * version 4.6.3 or above, where you have made sure to use the Phaser 3 Export option.
    * 
    * The way it works internally is that you provide a URL to the JSON file. Phaser then loads this JSON, parses it and
    * extracts which texture files it also needs to load to complete the process. If the JSON also defines normal maps,
    * Phaser will load those as well.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.multiatlas({
    *     key: 'level1',
    *     atlasURL: 'images/Level1.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig` for more details.
    * 
    * Instead of passing a URL for the atlas JSON data you can also pass in a well formed JSON object instead.
    * 
    * Once the atlas has finished loading you can use frames from it as textures for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.multiatlas('level1', 'images/Level1.json');
    * // and later in your game ...
    * this.add.image(x, y, 'level1', 'background');
    * ```
    * 
    * To get a list of all available frames within an atlas please consult your Texture Atlas software.
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Multi Atlas File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param path Optional path to use when loading the textures defined in the atlas data.
    * @param baseURL Optional Base URL to use when loading the textures defined in the atlas data.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
    */
  def multiatlas(key: String): LoaderPlugin = js.native
  def multiatlas(key: String, atlasURL: String): LoaderPlugin = js.native
  def multiatlas(key: String, atlasURL: String, path: String): LoaderPlugin = js.native
  def multiatlas(key: String, atlasURL: String, path: String, baseURL: String): LoaderPlugin = js.native
  def multiatlas(key: String, atlasURL: String, path: String, baseURL: String, atlasXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig]): LoaderPlugin = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: String): LoaderPlugin = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: String, path: String): LoaderPlugin = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: String, path: String, baseURL: String): LoaderPlugin = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def multiatlas(key: MultiAtlasFileConfig): LoaderPlugin = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: String): LoaderPlugin = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: String, path: String): LoaderPlugin = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: String, path: String, baseURL: String): LoaderPlugin = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * An internal method called automatically by the XHRLoader belong to a File.
    * 
    * This method will remove the given file from the inflight Set and update the load progress.
    * If the file was successful its `onProcess` method is called, otherwise it is added to the delete queue.
    * @param file The File that just finished loading, or errored during load.
    * @param success `true` if the file loaded successfully, otherwise `false`.
    */
  def nextFile(file: File, success: Boolean): Unit = js.native
  /**
    * Adds a JSON File Pack, or array of packs, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.pack('level1', 'data/Level1Files.json');
    * }
    * ```
    * 
    * A File Pack is a JSON file (or object) that contains details about other files that should be added into the Loader.
    * Here is a small example:
    * 
    * ```json
    * { 
    *    "test1": {
    *        "files": [
    *            {
    *                "type": "image",
    *                "key": "taikodrummaster",
    *                "url": "assets/pics/taikodrummaster.jpg"
    *            },
    *            {
    *                "type": "image",
    *                "key": "sukasuka-chtholly",
    *                "url": "assets/pics/sukasuka-chtholly.png"
    *            }
    *        ]
    *    },
    *    "meta": {
    *        "generated": "1401380327373",
    *        "app": "Phaser 3 Asset Packer",
    *        "url": "https://phaser.io",
    *        "version": "1.0",
    *        "copyright": "Photon Storm Ltd. 2018"
    *    }
    * }
    * ```
    * 
    * The pack can be split into sections. In the example above you'll see a section called `test1. You can tell
    * the `load.pack` method to parse only a particular section of a pack. The pack is stored in the JSON Cache,
    * so you can pass it to the Loader to process additional sections as needed in your game, or you can just load
    * them all at once without specifying anything.
    * 
    * The pack file can contain an entry for any type of file that Phaser can load. The object structures exactly
    * match that of the file type configs, and all properties available within the file type configs can be used
    * in the pack file too.
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * The key must be a unique String. It is used to add the file to the global JSON Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the JSON Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the JSON Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.pack({
    *     key: 'level1',
    *     url: 'data/Level1Files.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.PackFileConfig` for more details.
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Waves` the final key will be `LEVEL1.Waves` and
    * this is what you would use to retrieve the text from the JSON Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "data"
    * and no URL is given then the Loader will set the URL to be "data.json". It will always add `.json` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * You can also optionally provide a `dataKey` to use. This allows you to extract only a part of the JSON and store it in the Cache,
    * rather than the whole file. For example, if your JSON data had a structure like this:
    * 
    * ```json
    * {
    *     "level1": {
    *         "baddies": {
    *             "aliens": {},
    *             "boss": {}
    *         }
    *     },
    *     "level2": {},
    *     "level3": {}
    * }
    * ```
    * 
    * And you only wanted to store the `boss` data in the Cache, then you could pass `level1.baddies.boss`as the `dataKey`.
    * 
    * Note: The ability to load this type of file will only be available if the Pack File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param dataKey When the JSON file loads only this property will be stored in the Cache.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def pack(key: String): LoaderPlugin = js.native
  def pack(key: String, url: String): LoaderPlugin = js.native
  def pack(key: String, url: String, dataKey: String): LoaderPlugin = js.native
  def pack(key: String, url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def pack(key: js.Array[PackFileConfig]): LoaderPlugin = js.native
  def pack(key: js.Array[PackFileConfig], url: String): LoaderPlugin = js.native
  def pack(key: js.Array[PackFileConfig], url: String, dataKey: String): LoaderPlugin = js.native
  def pack(key: js.Array[PackFileConfig], url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def pack(key: PackFileConfig): LoaderPlugin = js.native
  def pack(key: PackFileConfig, url: String): LoaderPlugin = js.native
  def pack(key: PackFileConfig, url: String, dataKey: String): LoaderPlugin = js.native
  def pack(key: PackFileConfig, url: String, dataKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a Plugin Script file, or array of plugin files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.plugin('modplayer', 'plugins/ModPlayer.js');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String and not already in-use by another file in the Loader.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.plugin({
    *     key: 'modplayer',
    *     url: 'plugins/ModPlayer.js'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.PluginFileConfig` for more details.
    * 
    * Once the file has finished loading it will automatically be converted into a script element
    * via `document.createElement('script')`. It will have its language set to JavaScript, `defer` set to
    * false and then the resulting element will be appended to `document.head`. Any code then in the
    * script will be executed. It will then be passed to the Phaser PluginCache.register method.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.js". It will always add `.js` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Plugin File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js". Or, a plugin function.
    * @param start Automatically start the plugin after loading?
    * @param mapping If this plugin is to be injected into the Scene, this is the property key used.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def plugin(key: String): LoaderPlugin = js.native
  def plugin(key: String, url: String): LoaderPlugin = js.native
  def plugin(key: String, url: String, start: Boolean): LoaderPlugin = js.native
  def plugin(key: String, url: String, start: Boolean, mapping: String): LoaderPlugin = js.native
  def plugin(key: String, url: String, start: Boolean, mapping: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def plugin(key: String, url: js.Function): LoaderPlugin = js.native
  def plugin(key: String, url: js.Function, start: Boolean): LoaderPlugin = js.native
  def plugin(key: String, url: js.Function, start: Boolean, mapping: String): LoaderPlugin = js.native
  def plugin(key: String, url: js.Function, start: Boolean, mapping: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def plugin(key: js.Array[PluginFileConfig]): LoaderPlugin = js.native
  def plugin(key: js.Array[PluginFileConfig], url: String): LoaderPlugin = js.native
  def plugin(key: js.Array[PluginFileConfig], url: String, start: Boolean): LoaderPlugin = js.native
  def plugin(key: js.Array[PluginFileConfig], url: String, start: Boolean, mapping: String): LoaderPlugin = js.native
  def plugin(
    key: js.Array[PluginFileConfig],
    url: String,
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def plugin(key: js.Array[PluginFileConfig], url: js.Function): LoaderPlugin = js.native
  def plugin(key: js.Array[PluginFileConfig], url: js.Function, start: Boolean): LoaderPlugin = js.native
  def plugin(key: js.Array[PluginFileConfig], url: js.Function, start: Boolean, mapping: String): LoaderPlugin = js.native
  def plugin(
    key: js.Array[PluginFileConfig],
    url: js.Function,
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def plugin(key: PluginFileConfig): LoaderPlugin = js.native
  def plugin(key: PluginFileConfig, url: String): LoaderPlugin = js.native
  def plugin(key: PluginFileConfig, url: String, start: Boolean): LoaderPlugin = js.native
  def plugin(key: PluginFileConfig, url: String, start: Boolean, mapping: String): LoaderPlugin = js.native
  def plugin(
    key: PluginFileConfig,
    url: String,
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def plugin(key: PluginFileConfig, url: js.Function): LoaderPlugin = js.native
  def plugin(key: PluginFileConfig, url: js.Function, start: Boolean): LoaderPlugin = js.native
  def plugin(key: PluginFileConfig, url: js.Function, start: Boolean, mapping: String): LoaderPlugin = js.native
  def plugin(
    key: PluginFileConfig,
    url: js.Function,
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Resets the Loader.
    * 
    * This will clear all lists and reset the base URL, path and prefix.
    * 
    * Warning: If the Loader is currently downloading files, or has files in its queue, they will be aborted.
    */
  def reset(): Unit = js.native
  /**
    * Causes the browser to save the given data as a file to its default Downloads folder.
    * 
    * Creates a DOM level anchor link, assigns it as being a `download` anchor, sets the href
    * to be an ObjectURL based on the given data, and then invokes a click event.
    * @param data The data to be saved. Will be passed through URL.createObjectURL.
    * @param filename The filename to save the file as. Default file.json.
    * @param filetype The file type to use when saving the file. Defaults to JSON. Default application/json.
    */
  def save(data: js.Any): LoaderPlugin = js.native
  def save(data: js.Any, filename: String): LoaderPlugin = js.native
  def save(data: js.Any, filename: String, filetype: String): LoaderPlugin = js.native
  /**
    * Converts the given JSON data into a file that the browser then prompts you to download so you can save it locally.
    * 
    * The data must be well formed JSON and ready-parsed, not a JavaScript object.
    * @param data The JSON data, ready parsed.
    * @param filename The name to save the JSON file as. Default file.json.
    */
  def saveJSON(data: js.Any): LoaderPlugin = js.native
  def saveJSON(data: js.Any, filename: String): LoaderPlugin = js.native
  /**
    * Adds an external Scene file, or array of Scene files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.sceneFile('Level1', 'src/Level1.js');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Scene Manager upon a successful load.
    * 
    * For a Scene File it's vitally important that the key matches the class name in the JavaScript file.
    * 
    * For example here is the source file:
    * 
    * ```javascript
    * class ExternalScene extends Phaser.Scene {
    * 
    *     constructor ()
    *     {
    *         super('myScene');
    *     }
    * 
    * }
    * ```
    * 
    * Because the class is called `ExternalScene` that is the exact same key you must use when loading it:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.sceneFile('ExternalScene', 'src/yourScene.js');
    * }
    * ```
    * 
    * The key that is used within the Scene Manager can either be set to the same, or you can override it in the Scene
    * constructor, as we've done in the example above, where the Scene key was changed to `myScene`.
    * 
    * The key should be unique both in terms of files being loaded and Scenes already present in the Scene Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Scene Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.sceneFile({
    *     key: 'Level1',
    *     url: 'src/Level1.js'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.SceneFileConfig` for more details.
    * 
    * Once the file has finished loading it will be added to the Scene Manager.
    * 
    * ```javascript
    * this.load.sceneFile('Level1', 'src/Level1.js');
    * // and later in your game ...
    * this.scene.start('Level1');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `WORLD1.` and the key was `Story` the final key will be `WORLD1.Story` and
    * this is what you would use to retrieve the text from the Scene Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "story"
    * and no URL is given then the Loader will set the URL to be "story.js". It will always add `.js` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Scene File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def sceneFile(key: String): LoaderPlugin = js.native
  def sceneFile(key: String, url: String): LoaderPlugin = js.native
  def sceneFile(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def sceneFile(key: js.Array[SceneFileConfig]): LoaderPlugin = js.native
  def sceneFile(key: js.Array[SceneFileConfig], url: String): LoaderPlugin = js.native
  def sceneFile(key: js.Array[SceneFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def sceneFile(key: SceneFileConfig): LoaderPlugin = js.native
  def sceneFile(key: SceneFileConfig, url: String): LoaderPlugin = js.native
  def sceneFile(key: SceneFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a Scene Plugin Script file, or array of plugin files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.scenePlugin('ModPlayer', 'plugins/ModPlayer.js', 'modPlayer', 'mods');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String and not already in-use by another file in the Loader.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.scenePlugin({
    *     key: 'modplayer',
    *     url: 'plugins/ModPlayer.js'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.ScenePluginFileConfig` for more details.
    * 
    * Once the file has finished loading it will automatically be converted into a script element
    * via `document.createElement('script')`. It will have its language set to JavaScript, `defer` set to
    * false and then the resulting element will be appended to `document.head`. Any code then in the
    * script will be executed. It will then be passed to the Phaser PluginCache.register method.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.js". It will always add `.js` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Script File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js". Or, set to a plugin function.
    * @param systemKey If this plugin is to be added to Scene.Systems, this is the property key for it.
    * @param sceneKey If this plugin is to be added to the Scene, this is the property key for it.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def scenePlugin(key: String): LoaderPlugin = js.native
  def scenePlugin(key: String, url: String): LoaderPlugin = js.native
  def scenePlugin(key: String, url: String, systemKey: String): LoaderPlugin = js.native
  def scenePlugin(key: String, url: String, systemKey: String, sceneKey: String): LoaderPlugin = js.native
  def scenePlugin(key: String, url: String, systemKey: String, sceneKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def scenePlugin(key: String, url: js.Function): LoaderPlugin = js.native
  def scenePlugin(key: String, url: js.Function, systemKey: String): LoaderPlugin = js.native
  def scenePlugin(key: String, url: js.Function, systemKey: String, sceneKey: String): LoaderPlugin = js.native
  def scenePlugin(key: String, url: js.Function, systemKey: String, sceneKey: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def scenePlugin(key: js.Array[ScenePluginFileConfig]): LoaderPlugin = js.native
  def scenePlugin(key: js.Array[ScenePluginFileConfig], url: String): LoaderPlugin = js.native
  def scenePlugin(key: js.Array[ScenePluginFileConfig], url: String, systemKey: String): LoaderPlugin = js.native
  def scenePlugin(key: js.Array[ScenePluginFileConfig], url: String, systemKey: String, sceneKey: String): LoaderPlugin = js.native
  def scenePlugin(
    key: js.Array[ScenePluginFileConfig],
    url: String,
    systemKey: String,
    sceneKey: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def scenePlugin(key: js.Array[ScenePluginFileConfig], url: js.Function): LoaderPlugin = js.native
  def scenePlugin(key: js.Array[ScenePluginFileConfig], url: js.Function, systemKey: String): LoaderPlugin = js.native
  def scenePlugin(key: js.Array[ScenePluginFileConfig], url: js.Function, systemKey: String, sceneKey: String): LoaderPlugin = js.native
  def scenePlugin(
    key: js.Array[ScenePluginFileConfig],
    url: js.Function,
    systemKey: String,
    sceneKey: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def scenePlugin(key: ScenePluginFileConfig): LoaderPlugin = js.native
  def scenePlugin(key: ScenePluginFileConfig, url: String): LoaderPlugin = js.native
  def scenePlugin(key: ScenePluginFileConfig, url: String, systemKey: String): LoaderPlugin = js.native
  def scenePlugin(key: ScenePluginFileConfig, url: String, systemKey: String, sceneKey: String): LoaderPlugin = js.native
  def scenePlugin(
    key: ScenePluginFileConfig,
    url: String,
    systemKey: String,
    sceneKey: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def scenePlugin(key: ScenePluginFileConfig, url: js.Function): LoaderPlugin = js.native
  def scenePlugin(key: ScenePluginFileConfig, url: js.Function, systemKey: String): LoaderPlugin = js.native
  def scenePlugin(key: ScenePluginFileConfig, url: js.Function, systemKey: String, sceneKey: String): LoaderPlugin = js.native
  def scenePlugin(
    key: ScenePluginFileConfig,
    url: js.Function,
    systemKey: String,
    sceneKey: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Adds a Script file, or array of Script files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.script('aliens', 'lib/aliens.js');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String and not already in-use by another file in the Loader.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.script({
    *     key: 'aliens',
    *     url: 'lib/aliens.js'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.ScriptFileConfig` for more details.
    * 
    * Once the file has finished loading it will automatically be converted into a script element
    * via `document.createElement('script')`. It will have its language set to JavaScript, `defer` set to
    * false and then the resulting element will be appended to `document.head`. Any code then in the
    * script will be executed.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.js". It will always add `.js` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Script File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def script(key: String): LoaderPlugin = js.native
  def script(key: String, url: String): LoaderPlugin = js.native
  def script(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def script(key: js.Array[ScriptFileConfig]): LoaderPlugin = js.native
  def script(key: js.Array[ScriptFileConfig], url: String): LoaderPlugin = js.native
  def script(key: js.Array[ScriptFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def script(key: ScriptFileConfig): LoaderPlugin = js.native
  def script(key: ScriptFileConfig, url: String): LoaderPlugin = js.native
  def script(key: ScriptFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds an array of Script files to the current load queue.
    * 
    * The difference between this and the `ScriptFile` file type is that you give an array of scripts to this method,
    * and the scripts are then processed _exactly_ in that order. This allows you to load a bunch of scripts that
    * may have dependancies on each other without worrying about the async nature of traditional script loading.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.scripts('PostProcess', [
    *         'libs/shaders/CopyShader.js',
    *         'libs/postprocessing/EffectComposer.js',
    *         'libs/postprocessing/RenderPass.js',
    *         'libs/postprocessing/MaskPass.js',
    *         'libs/postprocessing/ShaderPass.js',
    *         'libs/postprocessing/AfterimagePass.js'
    *    ]);
    * }
    * ```
    * 
    * In the code above the script files will all be loaded in parallel but only processed (i.e. invoked) in the exact
    * order given in the array.
    * 
    * The files are **not** loaded right away. They are added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the files are queued
    * it means you cannot use the files immediately after calling this method, but must wait for the files to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String and not already in-use by another file in the Loader.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.scripts({
    *     key: 'PostProcess',
    *     url: [
    *         'libs/shaders/CopyShader.js',
    *         'libs/postprocessing/EffectComposer.js',
    *         'libs/postprocessing/RenderPass.js',
    *         'libs/postprocessing/MaskPass.js',
    *         'libs/postprocessing/ShaderPass.js',
    *         'libs/postprocessing/AfterimagePass.js'
    *        ]
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.MultiScriptFileConfig` for more details.
    * 
    * Once all the files have finished loading they will automatically be converted into a script element
    * via `document.createElement('script')`. They will have their language set to JavaScript, `defer` set to
    * false and then the resulting element will be appended to `document.head`. Any code then in the
    * script will be executed. This is done in the exact order the files are specified in the url array.
    * 
    * The URLs can be relative or absolute. If the URLs are relative the `Loader.baseURL` and `Loader.path` values will be prepended to them.
    * 
    * Note: The ability to load this type of file will only be available if the MultiScript File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
    * @param extension The default file extension to use if no url is provided. Default 'js'.
    * @param xhrSettings Extra XHR Settings specifically for these files.
    */
  def scripts(key: String): LoaderPlugin = js.native
  def scripts(key: String, url: js.Array[String]): LoaderPlugin = js.native
  def scripts(key: String, url: js.Array[String], extension: String): LoaderPlugin = js.native
  def scripts(key: String, url: js.Array[String], extension: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def scripts(key: js.Array[MultiScriptFileConfig]): LoaderPlugin = js.native
  def scripts(key: js.Array[MultiScriptFileConfig], url: js.Array[String]): LoaderPlugin = js.native
  def scripts(key: js.Array[MultiScriptFileConfig], url: js.Array[String], extension: String): LoaderPlugin = js.native
  def scripts(
    key: js.Array[MultiScriptFileConfig],
    url: js.Array[String],
    extension: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def scripts(key: MultiScriptFileConfig): LoaderPlugin = js.native
  def scripts(key: MultiScriptFileConfig, url: js.Array[String]): LoaderPlugin = js.native
  def scripts(key: MultiScriptFileConfig, url: js.Array[String], extension: String): LoaderPlugin = js.native
  def scripts(
    key: MultiScriptFileConfig,
    url: js.Array[String],
    extension: String,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * If you want to append a URL before the path of any asset you can set this here.
    * 
    * Useful if allowing the asset base url to be configured outside of the game code.
    * 
    * Once a base URL is set it will affect every file loaded by the Loader from that point on. It does _not_ change any
    * file _already_ being loaded. To reset it, call this method with no arguments.
    * @param url The URL to use. Leave empty to reset.
    */
  def setBaseURL(): LoaderPlugin = js.native
  def setBaseURL(url: String): LoaderPlugin = js.native
  /**
    * Sets the Cross Origin Resource Sharing value used when loading files.
    * 
    * Files can override this value on a per-file basis by specifying an alternative `crossOrigin` value in their file config.
    * 
    * Once CORs is set it will then affect every file loaded by the Loader from that point on, as long as they don't have
    * their own CORs setting. To reset it, call this method with no arguments.
    * 
    * For more details about CORs see https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS
    * @param crossOrigin The value to use for the `crossOrigin` property in the load request.
    */
  def setCORS(): LoaderPlugin = js.native
  def setCORS(crossOrigin: String): LoaderPlugin = js.native
  /**
    * The value of `path`, if set, is placed before any _relative_ file path given. For example:
    * 
    * ```javascript
    * this.load.setPath("images/sprites/");
    * this.load.image("ball", "ball.png");
    * this.load.image("tree", "level1/oaktree.png");
    * this.load.image("boom", "http://server.com/explode.png");
    * ```
    * 
    * Would load the `ball` file from `images/sprites/ball.png` and the tree from
    * `images/sprites/level1/oaktree.png` but the file `boom` would load from the URL
    * given as it's an absolute URL.
    * 
    * Please note that the path is added before the filename but *after* the baseURL (if set.)
    * 
    * Once a path is set it will then affect every file added to the Loader from that point on. It does _not_ change any
    * file _already_ in the load queue. To reset it, call this method with no arguments.
    * @param path The path to use. Leave empty to reset.
    */
  def setPath(): LoaderPlugin = js.native
  def setPath(path: String): LoaderPlugin = js.native
  /**
    * An optional prefix that is automatically prepended to the start of every file key.
    * 
    * If prefix was `MENU.` and you load an image with the key 'Background' the resulting key would be `MENU.Background`.
    * 
    * Once a prefix is set it will then affect every file added to the Loader from that point on. It does _not_ change any
    * file _already_ in the load queue. To reset it, call this method with no arguments.
    * @param prefix The prefix to use. Leave empty to reset.
    */
  def setPrefix(): LoaderPlugin = js.native
  def setPrefix(prefix: String): LoaderPlugin = js.native
  /**
    * Adds a Sprite Sheet Image, or array of Sprite Sheet Images, to the current load queue.
    * 
    * The term 'Sprite Sheet' in Phaser means a fixed-size sheet. Where every frame in the sheet is the exact same size,
    * and you reference those frames using numbers, not frame names. This is not the same thing as a Texture Atlas, where
    * the frames are packed in a way where they take up the least amount of space, and are referenced by their names,
    * not numbers. Some articles and software use the term 'Sprite Sheet' to mean Texture Atlas, so please be aware of
    * what sort of file you're actually trying to load.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.spritesheet('bot', 'images/robot.png', { frameWidth: 32, frameHeight: 38 });
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
    * If you try to load an animated gif only the first frame will be rendered. Browsers do not natively support playback
    * of animated gifs to Canvas elements.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.spritesheet({
    *     key: 'bot',
    *     url: 'images/robot.png',
    *     frameConfig: {
    *         frameWidth: 32,
    *         frameHeight: 38,
    *         startFrame: 0,
    *         endFrame: 8
    *     }
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.SpriteSheetFileConfig` for more details.
    * 
    * Once the file has finished loading you can use it as a texture for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.spritesheet('bot', 'images/robot.png', { frameWidth: 32, frameHeight: 38 });
    * // and later in your game ...
    * this.add.image(x, y, 'bot', 0);
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `PLAYER.` and the key was `Running` the final key will be `PLAYER.Running` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
    * then you can specify it by providing an array as the `url` where the second element is the normal map:
    * 
    * ```javascript
    * this.load.spritesheet('logo', [ 'images/AtariLogo.png', 'images/AtariLogo-n.png' ], { frameWidth: 256, frameHeight: 80 });
    * ```
    * 
    * Or, if you are using a config object use the `normalMap` property:
    * 
    * ```javascript
    * this.load.spritesheet({
    *     key: 'logo',
    *     url: 'images/AtariLogo.png',
    *     normalMap: 'images/AtariLogo-n.png',
    *     frameConfig: {
    *         frameWidth: 256,
    *         frameHeight: 80
    *     }
    * });
    * ```
    * 
    * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
    * Normal maps are a WebGL only feature.
    * 
    * Note: The ability to load this type of file will only be available if the Sprite Sheet File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param frameConfig The frame configuration object. At a minimum it should have a `frameWidth` property.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def spritesheet(key: String): LoaderPlugin = js.native
  def spritesheet(key: String, url: String): LoaderPlugin = js.native
  def spritesheet(key: String, url: String, frameConfig: ImageFrameConfig): LoaderPlugin = js.native
  def spritesheet(key: String, url: String, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig]): LoaderPlugin = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig], url: String): LoaderPlugin = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig], url: String, frameConfig: ImageFrameConfig): LoaderPlugin = js.native
  def spritesheet(
    key: js.Array[SpriteSheetFileConfig],
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spritesheet(key: SpriteSheetFileConfig): LoaderPlugin = js.native
  def spritesheet(key: SpriteSheetFileConfig, url: String): LoaderPlugin = js.native
  def spritesheet(key: SpriteSheetFileConfig, url: String, frameConfig: ImageFrameConfig): LoaderPlugin = js.native
  def spritesheet(
    key: SpriteSheetFileConfig,
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Starts the Loader running. This will reset the progress and totals and then emit a `start` event.
    * If there is nothing in the queue the Loader will immediately complete, otherwise it will start
    * loading the first batch of files.
    * 
    * The Loader is started automatically if the queue is populated within your Scenes `preload` method.
    * 
    * However, outside of this, you need to call this method to start it.
    * 
    * If the Loader is already running this method will simply return.
    */
  def start(): Unit = js.native
  /**
    * Adds an SVG File, or array of SVG Files, to the current load queue. When the files are loaded they
    * will be rendered to bitmap textures and stored in the Texture Manager.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.svg('morty', 'images/Morty.svg');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.svg({
    *     key: 'morty',
    *     url: 'images/Morty.svg'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.SVGFileConfig` for more details.
    * 
    * Once the file has finished loading you can use it as a texture for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.svg('morty', 'images/Morty.svg');
    * // and later in your game ...
    * this.add.image(x, y, 'morty');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.html". It will always add `.html` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * You can optionally pass an SVG Resize Configuration object when you load an SVG file. By default the SVG will be rendered to a texture
    * at the same size defined in the SVG file attributes. However, this isn't always desirable. You may wish to resize the SVG (either down
    * or up) to improve texture clarity, or reduce texture memory consumption. You can either specify an exact width and height to resize
    * the SVG to:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.svg('morty', 'images/Morty.svg', { width: 300, height: 600 });
    * }
    * ```
    * 
    * Or when using a configuration object:
    * 
    * ```javascript
    * this.load.svg({
    *     key: 'morty',
    *     url: 'images/Morty.svg',
    *     svgConfig: {
    *         width: 300,
    *         height: 600
    *     }
    * });
    * ```
    * 
    * Alternatively, you can just provide a scale factor instead:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.svg('morty', 'images/Morty.svg', { scale: 2.5 });
    * }
    * ```
    * 
    * Or when using a configuration object:
    * 
    * ```javascript
    * this.load.svg({
    *     key: 'morty',
    *     url: 'images/Morty.svg',
    *     svgConfig: {
    *         scale: 2.5
    *     }
    * });
    * ```
    * 
    * If scale, width and height values are all given, the scale has priority and the width and height values are ignored.
    * 
    * Note: The ability to load this type of file will only be available if the SVG File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.svg`, i.e. if `key` was "alien" then the URL will be "alien.svg".
    * @param svgConfig The svg size configuration object.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def svg(key: String): LoaderPlugin = js.native
  def svg(key: String, url: String): LoaderPlugin = js.native
  def svg(key: String, url: String, svgConfig: SVGSizeConfig): LoaderPlugin = js.native
  def svg(key: String, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def svg(key: js.Array[SVGFileConfig]): LoaderPlugin = js.native
  def svg(key: js.Array[SVGFileConfig], url: String): LoaderPlugin = js.native
  def svg(key: js.Array[SVGFileConfig], url: String, svgConfig: SVGSizeConfig): LoaderPlugin = js.native
  def svg(
    key: js.Array[SVGFileConfig],
    url: String,
    svgConfig: SVGSizeConfig,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def svg(key: SVGFileConfig): LoaderPlugin = js.native
  def svg(key: SVGFileConfig, url: String): LoaderPlugin = js.native
  def svg(key: SVGFileConfig, url: String, svgConfig: SVGSizeConfig): LoaderPlugin = js.native
  def svg(key: SVGFileConfig, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a Text file, or array of Text files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.text('story', 'files/IntroStory.txt');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Text Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Text Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Text Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.text({
    *     key: 'story',
    *     url: 'files/IntroStory.txt'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.TextFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.text('story', 'files/IntroStory.txt');
    * // and later in your game ...
    * var data = this.cache.text.get('story');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Story` the final key will be `LEVEL1.Story` and
    * this is what you would use to retrieve the text from the Text Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "story"
    * and no URL is given then the Loader will set the URL to be "story.txt". It will always add `.txt` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Text File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def text(key: String): LoaderPlugin = js.native
  def text(key: String, url: String): LoaderPlugin = js.native
  def text(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def text(key: js.Array[TextFileConfig]): LoaderPlugin = js.native
  def text(key: js.Array[TextFileConfig], url: String): LoaderPlugin = js.native
  def text(key: js.Array[TextFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def text(key: TextFileConfig): LoaderPlugin = js.native
  def text(key: TextFileConfig, url: String): LoaderPlugin = js.native
  def text(key: TextFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a CSV Tilemap file, or array of CSV files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.tilemapCSV('level1', 'maps/Level1.csv');
    * }
    * ```
    * 
    * Tilemap CSV data can be created in a text editor, or a 3rd party app that exports as CSV.
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Tilemap Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Tilemap Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Text Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.tilemapCSV({
    *     key: 'level1',
    *     url: 'maps/Level1.csv'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.TilemapCSVFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.tilemapCSV('level1', 'maps/Level1.csv');
    * // and later in your game ...
    * var map = this.make.tilemap({ key: 'level1' });
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Story` the final key will be `LEVEL1.Story` and
    * this is what you would use to retrieve the text from the Tilemap Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "level"
    * and no URL is given then the Loader will set the URL to be "level.csv". It will always add `.csv` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Tilemap CSV File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.csv`, i.e. if `key` was "alien" then the URL will be "alien.csv".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def tilemapCSV(key: String): LoaderPlugin = js.native
  def tilemapCSV(key: String, url: String): LoaderPlugin = js.native
  def tilemapCSV(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def tilemapCSV(key: js.Array[TilemapCSVFileConfig]): LoaderPlugin = js.native
  def tilemapCSV(key: js.Array[TilemapCSVFileConfig], url: String): LoaderPlugin = js.native
  def tilemapCSV(key: js.Array[TilemapCSVFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def tilemapCSV(key: TilemapCSVFileConfig): LoaderPlugin = js.native
  def tilemapCSV(key: TilemapCSVFileConfig, url: String): LoaderPlugin = js.native
  def tilemapCSV(key: TilemapCSVFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds an Impact.js Tilemap file, or array of map files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.tilemapImpact('level1', 'maps/Level1.json');
    * }
    * ```
    * 
    * Impact Tilemap data is created the Impact.js Map Editor called Weltmeister.
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Tilemap Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Tilemap Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Text Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.tilemapImpact({
    *     key: 'level1',
    *     url: 'maps/Level1.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.TilemapImpactFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.tilemapImpact('level1', 'maps/Level1.json');
    * // and later in your game ...
    * var map = this.make.tilemap({ key: 'level1' });
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Story` the final key will be `LEVEL1.Story` and
    * this is what you would use to retrieve the text from the Tilemap Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "level"
    * and no URL is given then the Loader will set the URL to be "level.json". It will always add `.json` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Tilemap Impact File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def tilemapImpact(key: String): LoaderPlugin = js.native
  def tilemapImpact(key: String, url: String): LoaderPlugin = js.native
  def tilemapImpact(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def tilemapImpact(key: js.Array[TilemapImpactFileConfig]): LoaderPlugin = js.native
  def tilemapImpact(key: js.Array[TilemapImpactFileConfig], url: String): LoaderPlugin = js.native
  def tilemapImpact(key: js.Array[TilemapImpactFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def tilemapImpact(key: TilemapImpactFileConfig): LoaderPlugin = js.native
  def tilemapImpact(key: TilemapImpactFileConfig, url: String): LoaderPlugin = js.native
  def tilemapImpact(key: TilemapImpactFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a Tiled JSON Tilemap file, or array of map files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.tilemapTiledJSON('level1', 'maps/Level1.json');
    * }
    * ```
    * 
    * The Tilemap data is created using the Tiled Map Editor and selecting JSON as the export format.
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Tilemap Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Tilemap Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Text Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.tilemapTiledJSON({
    *     key: 'level1',
    *     url: 'maps/Level1.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.TilemapJSONFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.tilemapTiledJSON('level1', 'maps/Level1.json');
    * // and later in your game ...
    * var map = this.make.tilemap({ key: 'level1' });
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Story` the final key will be `LEVEL1.Story` and
    * this is what you would use to retrieve the text from the Tilemap Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "level"
    * and no URL is given then the Loader will set the URL to be "level.json". It will always add `.json` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the Tilemap JSON File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def tilemapTiledJSON(key: String): LoaderPlugin = js.native
  def tilemapTiledJSON(key: String, url: String): LoaderPlugin = js.native
  def tilemapTiledJSON(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig]): LoaderPlugin = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig], url: String): LoaderPlugin = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig): LoaderPlugin = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig, url: String): LoaderPlugin = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  /**
    * Adds a Unity YAML based Texture Atlas, or array of atlases, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.unityAtlas('mainmenu', 'images/MainMenu.png', 'images/MainMenu.txt');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
    * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
    * 
    * Phaser expects the atlas data to be provided in a YAML formatted text file as exported from Unity.
    * 
    * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
    * 
    * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Texture Manager first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.unityAtlas({
    *     key: 'mainmenu',
    *     textureURL: 'images/MainMenu.png',
    *     atlasURL: 'images/MainMenu.txt'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.UnityAtlasFileConfig` for more details.
    * 
    * Once the atlas has finished loading you can use frames from it as textures for a Game Object by referencing its key:
    * 
    * ```javascript
    * this.load.unityAtlas('mainmenu', 'images/MainMenu.png', 'images/MainMenu.json');
    * // and later in your game ...
    * this.add.image(x, y, 'mainmenu', 'background');
    * ```
    * 
    * To get a list of all available frames within an atlas please consult your Texture Atlas software.
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
    * this is what you would use to retrieve the image from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
    * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
    * then you can specify it by providing an array as the `url` where the second element is the normal map:
    * 
    * ```javascript
    * this.load.unityAtlas('mainmenu', [ 'images/MainMenu.png', 'images/MainMenu-n.png' ], 'images/MainMenu.txt');
    * ```
    * 
    * Or, if you are using a config object use the `normalMap` property:
    * 
    * ```javascript
    * this.load.unityAtlas({
    *     key: 'mainmenu',
    *     textureURL: 'images/MainMenu.png',
    *     normalMap: 'images/MainMenu-n.png',
    *     atlasURL: 'images/MainMenu.txt'
    * });
    * ```
    * 
    * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
    * Normal maps are a WebGL only feature.
    * 
    * Note: The ability to load this type of file will only be available if the Unity Atlas File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas data file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas data file. Used in replacement of the Loaders default XHR Settings.
    */
  def unityAtlas(key: String): LoaderPlugin = js.native
  def unityAtlas(key: String, textureURL: String): LoaderPlugin = js.native
  def unityAtlas(key: String, textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def unityAtlas(key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def unityAtlas(
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(key: String, textureURL: js.Array[String]): LoaderPlugin = js.native
  def unityAtlas(key: String, textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def unityAtlas(key: String, textureURL: js.Array[String], atlasURL: String, textureXhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def unityAtlas(
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(key: js.Array[UnityAtlasFileConfig]): LoaderPlugin = js.native
  def unityAtlas(key: js.Array[UnityAtlasFileConfig], textureURL: String): LoaderPlugin = js.native
  def unityAtlas(key: js.Array[UnityAtlasFileConfig], textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def unityAtlas(
    key: js.Array[UnityAtlasFileConfig],
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(
    key: js.Array[UnityAtlasFileConfig],
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(key: js.Array[UnityAtlasFileConfig], textureURL: js.Array[String]): LoaderPlugin = js.native
  def unityAtlas(key: js.Array[UnityAtlasFileConfig], textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def unityAtlas(
    key: js.Array[UnityAtlasFileConfig],
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(
    key: js.Array[UnityAtlasFileConfig],
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(key: UnityAtlasFileConfig): LoaderPlugin = js.native
  def unityAtlas(key: UnityAtlasFileConfig, textureURL: String): LoaderPlugin = js.native
  def unityAtlas(key: UnityAtlasFileConfig, textureURL: String, atlasURL: String): LoaderPlugin = js.native
  def unityAtlas(
    key: UnityAtlasFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(
    key: UnityAtlasFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(key: UnityAtlasFileConfig, textureURL: js.Array[String]): LoaderPlugin = js.native
  def unityAtlas(key: UnityAtlasFileConfig, textureURL: js.Array[String], atlasURL: String): LoaderPlugin = js.native
  def unityAtlas(
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def unityAtlas(
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Called automatically during the load process.
    */
  def update(): Unit = js.native
  /**
    * Called automatically during the load process.
    * It updates the `progress` value and then emits a progress event, which you can use to
    * display a loading bar in your game.
    */
  def updateProgress(): Unit = js.native
  /**
    * Adds a Video file, or array of video files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.video('intro', [ 'video/level1.mp4', 'video/level1.webm', 'video/level1.mov' ]);
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global Video Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the Video Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the Video Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.video({
    *     key: 'intro',
    *     url: [ 'video/level1.mp4', 'video/level1.webm', 'video/level1.mov' ],
    *     asBlob: false,
    *     noAudio: true
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.VideoFileConfig` for more details.
    * 
    * The URLs can be relative or absolute. If the URLs are relative the `Loader.baseURL` and `Loader.path` values will be prepended to them.
    * 
    * Due to different browsers supporting different video file types you should usually provide your video files in a variety of formats.
    * mp4, mov and webm are the most common. If you provide an array of URLs then the Loader will determine which _one_ file to load based on
    * browser support, starting with the first in the array and progressing to the end.
    * 
    * Unlike most asset-types, videos do not _need_ to be preloaded. You can create a Video Game Object and then call its `loadURL` method,
    * to load a video at run-time, rather than in advance.
    * 
    * Note: The ability to load this type of file will only be available if the Video File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param urls The absolute or relative URL to load the video files from.
    * @param loadEvent The load event to listen for when _not_ loading as a blob. Either `loadeddata`, `canplay` or `canplaythrough`. Default 'loadeddata'.
    * @param asBlob Load the video as a data blob, or stream it via the Video element? Default false.
    * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it. Default false.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def video(key: String): LoaderPlugin = js.native
  def video(key: String, urls: String): LoaderPlugin = js.native
  def video(key: String, urls: String, loadEvent: String): LoaderPlugin = js.native
  def video(key: String, urls: String, loadEvent: String, asBlob: Boolean): LoaderPlugin = js.native
  def video(key: String, urls: String, loadEvent: String, asBlob: Boolean, noAudio: Boolean): LoaderPlugin = js.native
  def video(
    key: String,
    urls: String,
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def video(key: String, urls: js.Array[String]): LoaderPlugin = js.native
  def video(key: String, urls: js.Array[String], loadEvent: String): LoaderPlugin = js.native
  def video(key: String, urls: js.Array[String], loadEvent: String, asBlob: Boolean): LoaderPlugin = js.native
  def video(key: String, urls: js.Array[String], loadEvent: String, asBlob: Boolean, noAudio: Boolean): LoaderPlugin = js.native
  def video(
    key: String,
    urls: js.Array[String],
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig]): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig], urls: String): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig], urls: String, loadEvent: String): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig], urls: String, loadEvent: String, asBlob: Boolean): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig], urls: String, loadEvent: String, asBlob: Boolean, noAudio: Boolean): LoaderPlugin = js.native
  def video(
    key: js.Array[VideoFileConfig],
    urls: String,
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig], urls: js.Array[String]): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig], urls: js.Array[String], loadEvent: String): LoaderPlugin = js.native
  def video(key: js.Array[VideoFileConfig], urls: js.Array[String], loadEvent: String, asBlob: Boolean): LoaderPlugin = js.native
  def video(
    key: js.Array[VideoFileConfig],
    urls: js.Array[String],
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean
  ): LoaderPlugin = js.native
  def video(
    key: js.Array[VideoFileConfig],
    urls: js.Array[String],
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def video(key: VideoFileConfig): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: String): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: String, loadEvent: String): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: String, loadEvent: String, asBlob: Boolean): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: String, loadEvent: String, asBlob: Boolean, noAudio: Boolean): LoaderPlugin = js.native
  def video(
    key: VideoFileConfig,
    urls: String,
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: js.Array[String]): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: js.Array[String], loadEvent: String): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: js.Array[String], loadEvent: String, asBlob: Boolean): LoaderPlugin = js.native
  def video(key: VideoFileConfig, urls: js.Array[String], loadEvent: String, asBlob: Boolean, noAudio: Boolean): LoaderPlugin = js.native
  def video(
    key: VideoFileConfig,
    urls: js.Array[String],
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  /**
    * Adds an XML file, or array of XML files, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.xml('wavedata', 'files/AlienWaveData.xml');
    * }
    * ```
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global XML Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the XML Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the XML Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.xml({
    *     key: 'wavedata',
    *     url: 'files/AlienWaveData.xml'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.XMLFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.xml('wavedata', 'files/AlienWaveData.xml');
    * // and later in your game ...
    * var data = this.cache.xml.get('wavedata');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Waves` the final key will be `LEVEL1.Waves` and
    * this is what you would use to retrieve the text from the XML Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "data"
    * and no URL is given then the Loader will set the URL to be "data.xml". It will always add `.xml` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the XML File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def xml(key: String): LoaderPlugin = js.native
  def xml(key: String, url: String): LoaderPlugin = js.native
  def xml(key: String, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def xml(key: js.Array[XMLFileConfig]): LoaderPlugin = js.native
  def xml(key: js.Array[XMLFileConfig], url: String): LoaderPlugin = js.native
  def xml(key: js.Array[XMLFileConfig], url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
  def xml(key: XMLFileConfig): LoaderPlugin = js.native
  def xml(key: XMLFileConfig, url: String): LoaderPlugin = js.native
  def xml(key: XMLFileConfig, url: String, xhrSettings: XHRSettingsObject): LoaderPlugin = js.native
}

