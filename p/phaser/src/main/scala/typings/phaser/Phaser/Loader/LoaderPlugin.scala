package typings.phaser.Phaser.Loader

import typings.phaser.Phaser.Cache.CacheManager
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Loader.FileTypes.SpineFileConfig
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.SceneManager
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Structs.Set
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Loader.FileTypes.AsepriteFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioFileURLConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.BinaryFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.BitmapFontFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.CSSFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.CompressedTextureFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.GLSLFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.HTMLFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.HTMLTextureFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.ImageFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.ImageFrameConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.JSONFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.MultiScriptFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.OBJFileConfig
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
import typings.phaser.Phaser.Types.Loader.FileTypes.VideoFileURLConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.XMLFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait LoaderPlugin
  extends StObject
     with EventEmitter {
  
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
    * @param pack The Pack File data to be parsed and each entry of it to added to the load queue.
    * @param packKey An optional key to use from the pack file data.
    */
  def addPack(pack: Any): Boolean = js.native
  def addPack(pack: Any, packKey: String): Boolean = js.native
  
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
  def animation(key: String): this.type = js.native
  def animation(key: String, url: String): this.type = js.native
  def animation(key: String, url: String, dataKey: String): this.type = js.native
  def animation(key: String, url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: String, url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: String, url: Unit, dataKey: String): this.type = js.native
  def animation(key: String, url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: String, url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: js.Array[JSONFileConfig]): this.type = js.native
  def animation(key: js.Array[JSONFileConfig], url: String): this.type = js.native
  def animation(key: js.Array[JSONFileConfig], url: String, dataKey: String): this.type = js.native
  def animation(key: js.Array[JSONFileConfig], url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: js.Array[JSONFileConfig], url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: js.Array[JSONFileConfig], url: Unit, dataKey: String): this.type = js.native
  def animation(key: js.Array[JSONFileConfig], url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: js.Array[JSONFileConfig], url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: JSONFileConfig): this.type = js.native
  def animation(key: JSONFileConfig, url: String): this.type = js.native
  def animation(key: JSONFileConfig, url: String, dataKey: String): this.type = js.native
  def animation(key: JSONFileConfig, url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: JSONFileConfig, url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: JSONFileConfig, url: Unit, dataKey: String): this.type = js.native
  def animation(key: JSONFileConfig, url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def animation(key: JSONFileConfig, url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * Aseprite is a powerful animated sprite editor and pixel art tool.
    * 
    * You can find more details at https://www.aseprite.org/
    * 
    * Adds a JSON based Aseprite Animation, or array of animations, to the current load queue.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.aseprite('gladiator', 'images/Gladiator.png', 'images/Gladiator.json');
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
    * To export a compatible JSON file in Aseprite, please do the following:
    * 
    * 1. Go to "File - Export Sprite Sheet"
    * 
    * 2. On the **Layout** tab:
    * 2a. Set the "Sheet type" to "Packed"
    * 2b. Set the "Constraints" to "None"
    * 2c. Check the "Merge Duplicates" checkbox
    * 
    * 3. On the **Sprite** tab:
    * 3a. Set "Layers" to "Visible layers"
    * 3b. Set "Frames" to "All frames", unless you only wish to export a sub-set of tags
    * 
    * 4. On the **Borders** tab:
    * 4a. Check the "Trim Sprite" and "Trim Cells" options
    * 4b. Ensure "Border Padding", "Spacing" and "Inner Padding" are all > 0 (1 is usually enough)
    * 
    * 5. On the **Output** tab:
    * 5a. Check "Output File", give your image a name and make sure you choose "png files" as the file type
    * 5b. Check "JSON Data" and give your json file a name
    * 5c. The JSON Data type can be either a Hash or Array, Phaser doesn't mind.
    * 5d. Make sure "Tags" is checked in the Meta options
    * 5e. In the "Item Filename" input box, make sure it says just "{frame}" and nothing more.
    * 
    * 6. Click export
    * 
    * This was tested with Aseprite 1.2.25.
    * 
    * This will export a png and json file which you can load using the Aseprite Loader, i.e.:
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
    * this.load.aseprite({
    *     key: 'gladiator',
    *     textureURL: 'images/Gladiator.png',
    *     atlasURL: 'images/Gladiator.json'
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.AsepriteFileConfig` for more details.
    * 
    * Instead of passing a URL for the JSON data you can also pass in a well formed JSON object instead.
    * 
    * Once loaded, you can call this method from within a Scene with the 'atlas' key:
    * 
    * ```javascript
    * this.anims.createFromAseprite('paladin');
    * ```
    * 
    * Any animations defined in the JSON will now be available to use in Phaser and you play them
    * via their Tag name. For example, if you have an animation called 'War Cry' on your Aseprite timeline,
    * you can play it in Phaser using that Tag name:
    * 
    * ```javascript
    * this.add.sprite(400, 300).play('War Cry');
    * ```
    * 
    * When calling this method you can optionally provide an array of tag names, and only those animations
    * will be created. For example:
    * 
    * ```javascript
    * this.anims.createFromAseprite('paladin', [ 'step', 'War Cry', 'Magnum Break' ]);
    * ```
    * 
    * This will only create the 3 animations defined. Note that the tag names are case-sensitive.
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
    * Note: The ability to load this type of file will only be available if the Aseprite File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
    */
  def aseprite(
    key: String | AsepriteFileConfig | js.Array[AsepriteFileConfig],
    textureURL: js.UndefOr[String | js.Array[String]],
    atlasURL: js.UndefOr[js.Object | String],
    textureXhrSettings: js.UndefOr[XHRSettingsObject],
    atlasXhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
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
    * 
    * These files are created by software such as:
    * 
    * * [Texture Packer](https://www.codeandweb.com/texturepacker/tutorials/how-to-create-sprite-sheets-for-phaser3?source=photonstorm)
    * * [Shoebox](https://renderhjs.net/shoebox/)
    * * [Gamma Texture Packer](https://gammafp.com/tool/atlas-packer/)
    * * [Adobe Flash / Animate](https://www.adobe.com/uk/products/animate.html)
    * * [Free Texture Packer](http://free-tex-packer.com/)
    * * [Leshy SpriteSheet Tool](https://www.leshylabs.com/apps/sstool/)
    * 
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
    * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
    */
  def atlas(
    key: String | AtlasJSONFileConfig | js.Array[AtlasJSONFileConfig],
    textureURL: js.UndefOr[String | js.Array[String]],
    atlasURL: js.UndefOr[js.Object | String],
    textureXhrSettings: js.UndefOr[XHRSettingsObject],
    atlasXhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
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
  def atlasXML(
    key: String | AtlasXMLFileConfig | js.Array[AtlasXMLFileConfig],
    textureURL: js.UndefOr[String | js.Array[String]],
    atlasURL: js.UndefOr[String],
    textureXhrSettings: js.UndefOr[XHRSettingsObject],
    atlasXhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
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
  def audio(
    key: String | AudioFileConfig | js.Array[AudioFileConfig],
    urls: js.UndefOr[String | (js.Array[AudioFileURLConfig | String]) | AudioFileURLConfig],
    config: js.UndefOr[Any],
    xhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
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
  def audioSprite(
    key: String | AudioSpriteFileConfig | js.Array[AudioSpriteFileConfig],
    jsonURL: String,
    audioURL: js.UndefOr[String | js.Array[String]],
    audioConfig: js.UndefOr[Any],
    audioXhrSettings: js.UndefOr[XHRSettingsObject],
    jsonXhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
  /**
    * If you want to append a URL before the path of any asset you can set this here.
    * 
    * Useful if allowing the asset base url to be configured outside of the game code.
    * 
    * If you set this property directly then it _must_ end with a "/". Alternatively, call `setBaseURL()` and it'll do it for you.
    */
  var baseURL: String = js.native
  
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
  def binary(key: String): this.type = js.native
  def binary(key: String, url: String): this.type = js.native
  def binary(key: String, url: String, dataType: Any): this.type = js.native
  def binary(key: String, url: String, dataType: Any, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: String, url: String, dataType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: String, url: Unit, dataType: Any): this.type = js.native
  def binary(key: String, url: Unit, dataType: Any, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: String, url: Unit, dataType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig]): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig], url: String): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig], url: String, dataType: Any): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig], url: String, dataType: Any, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig], url: String, dataType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig], url: Unit, dataType: Any): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig], url: Unit, dataType: Any, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: js.Array[BinaryFileConfig], url: Unit, dataType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: BinaryFileConfig): this.type = js.native
  def binary(key: BinaryFileConfig, url: String): this.type = js.native
  def binary(key: BinaryFileConfig, url: String, dataType: Any): this.type = js.native
  def binary(key: BinaryFileConfig, url: String, dataType: Any, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: BinaryFileConfig, url: String, dataType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: BinaryFileConfig, url: Unit, dataType: Any): this.type = js.native
  def binary(key: BinaryFileConfig, url: Unit, dataType: Any, xhrSettings: XHRSettingsObject): this.type = js.native
  def binary(key: BinaryFileConfig, url: Unit, dataType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
  def bitmapFont(
    key: String | BitmapFontFileConfig | js.Array[BitmapFontFileConfig],
    textureURL: js.UndefOr[String | js.Array[String]],
    fontDataURL: js.UndefOr[String],
    textureXhrSettings: js.UndefOr[XHRSettingsObject],
    fontDataXhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
  /**
    * A reference to the global Cache Manager.
    */
  var cacheManager: CacheManager = js.native
  
  /**
    * The crossOrigin value applied to loaded images. Very often this needs to be set to 'anonymous'.
    */
  var crossOrigin: String = js.native
  
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
  def css(key: String): this.type = js.native
  def css(key: String, url: String): this.type = js.native
  def css(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def css(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def css(key: js.Array[CSSFileConfig]): this.type = js.native
  def css(key: js.Array[CSSFileConfig], url: String): this.type = js.native
  def css(key: js.Array[CSSFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def css(key: js.Array[CSSFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def css(key: CSSFileConfig): this.type = js.native
  def css(key: CSSFileConfig, url: String): this.type = js.native
  def css(key: CSSFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def css(key: CSSFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
  def glsl(key: String): this.type = js.native
  def glsl(key: String, url: String): this.type = js.native
  def glsl(key: String, url: String, shaderType: String): this.type = js.native
  def glsl(key: String, url: String, shaderType: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: String, url: String, shaderType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: String, url: Unit, shaderType: String): this.type = js.native
  def glsl(key: String, url: Unit, shaderType: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: String, url: Unit, shaderType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig]): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: String): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: String, shaderType: String): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: String, shaderType: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: String, shaderType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: Unit, shaderType: String): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: Unit, shaderType: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: js.Array[GLSLFileConfig], url: Unit, shaderType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: GLSLFileConfig): this.type = js.native
  def glsl(key: GLSLFileConfig, url: String): this.type = js.native
  def glsl(key: GLSLFileConfig, url: String, shaderType: String): this.type = js.native
  def glsl(key: GLSLFileConfig, url: String, shaderType: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: GLSLFileConfig, url: String, shaderType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: GLSLFileConfig, url: Unit, shaderType: String): this.type = js.native
  def glsl(key: GLSLFileConfig, url: Unit, shaderType: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def glsl(key: GLSLFileConfig, url: Unit, shaderType: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
  def html(key: String): this.type = js.native
  def html(key: String, url: String): this.type = js.native
  def html(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def html(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def html(key: js.Array[HTMLFileConfig]): this.type = js.native
  def html(key: js.Array[HTMLFileConfig], url: String): this.type = js.native
  def html(key: js.Array[HTMLFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def html(key: js.Array[HTMLFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def html(key: HTMLFileConfig): this.type = js.native
  def html(key: HTMLFileConfig, url: String): this.type = js.native
  def html(key: HTMLFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def html(key: HTMLFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
  def htmlTexture(key: String): this.type = js.native
  def htmlTexture(key: String, url: String): this.type = js.native
  def htmlTexture(key: String, url: String, width: Double): this.type = js.native
  def htmlTexture(key: String, url: String, width: Double, height: Double): this.type = js.native
  def htmlTexture(key: String, url: String, width: Double, height: Double, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: String, url: String, width: Double, height: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: String, url: String, width: Unit, height: Double): this.type = js.native
  def htmlTexture(key: String, url: String, width: Unit, height: Double, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: String, url: String, width: Unit, height: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: String, url: Unit, width: Double): this.type = js.native
  def htmlTexture(key: String, url: Unit, width: Double, height: Double): this.type = js.native
  def htmlTexture(key: String, url: Unit, width: Double, height: Double, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: String, url: Unit, width: Double, height: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: String, url: Unit, width: Unit, height: Double): this.type = js.native
  def htmlTexture(key: String, url: Unit, width: Unit, height: Double, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: String, url: Unit, width: Unit, height: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig]): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: String): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: String, width: Double): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: String, width: Double, height: Double): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: String,
    width: Double,
    height: Double,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: String,
    width: Double,
    height: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: String, width: Unit, height: Double): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: String,
    width: Unit,
    height: Double,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: String,
    width: Unit,
    height: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: Unit, width: Double): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: Unit, width: Double, height: Double): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: Unit,
    width: Double,
    height: Double,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: Unit,
    width: Double,
    height: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(key: js.Array[HTMLTextureFileConfig], url: Unit, width: Unit, height: Double): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: Unit,
    width: Unit,
    height: Double,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(
    key: js.Array[HTMLTextureFileConfig],
    url: Unit,
    width: Unit,
    height: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String, width: Double): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String, width: Double, height: Double): this.type = js.native
  def htmlTexture(
    key: HTMLTextureFileConfig,
    url: String,
    width: Double,
    height: Double,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(
    key: HTMLTextureFileConfig,
    url: String,
    width: Double,
    height: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String, width: Unit, height: Double): this.type = js.native
  def htmlTexture(
    key: HTMLTextureFileConfig,
    url: String,
    width: Unit,
    height: Double,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: String, width: Unit, height: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: Unit, width: Double): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: Unit, width: Double, height: Double): this.type = js.native
  def htmlTexture(
    key: HTMLTextureFileConfig,
    url: Unit,
    width: Double,
    height: Double,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: Unit, width: Double, height: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: Unit, width: Unit, height: Double): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: Unit, width: Unit, height: Double, xhrSettings: XHRSettingsObject): this.type = js.native
  def htmlTexture(key: HTMLTextureFileConfig, url: Unit, width: Unit, height: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
    * In Phaser 3.60 a new property was added that allows you to control how images are loaded. By default, images are loaded via XHR as Blobs.
    * However, you can set `loader.imageLoadType: "HTMLImageElement"` in the Game Configuration and instead, the Loader will load all images
    * via the Image tag instead.
    * 
    * Note: The ability to load this type of file will only be available if the Image File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def image(key: String): this.type = js.native
  def image(key: String, url: String): this.type = js.native
  def image(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: String, url: js.Array[String]): this.type = js.native
  def image(key: String, url: js.Array[String], xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: js.Array[ImageFileConfig]): this.type = js.native
  def image(key: js.Array[ImageFileConfig], url: String): this.type = js.native
  def image(key: js.Array[ImageFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: js.Array[ImageFileConfig], url: js.Array[String]): this.type = js.native
  def image(key: js.Array[ImageFileConfig], url: js.Array[String], xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: js.Array[ImageFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: ImageFileConfig): this.type = js.native
  def image(key: ImageFileConfig, url: String): this.type = js.native
  def image(key: ImageFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: ImageFileConfig, url: js.Array[String]): this.type = js.native
  def image(key: ImageFileConfig, url: js.Array[String], xhrSettings: XHRSettingsObject): this.type = js.native
  def image(key: ImageFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * Optional load type for image files. `XHR` is the default. Set to `HTMLImageElement` to load images using the Image tag instead.
    */
  var imageLoadType: String = js.native
  
  /**
    * Files are stored in this Set while they're in the process of being loaded.
    * 
    * Upon a successful load they are moved to the `queue` Set.
    * 
    * By the end of the load process this Set will be empty.
    */
  var inflight: Set[File] = js.native
  
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
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, can be a fully formed JSON Object.
    * @param dataKey When the JSON file loads only this property will be stored in the Cache.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def json(key: String): this.type = js.native
  def json(key: String, url: String): this.type = js.native
  def json(key: String, url: String, dataKey: String): this.type = js.native
  def json(key: String, url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: String, url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: String, url: js.Object): this.type = js.native
  def json(key: String, url: js.Object, dataKey: String): this.type = js.native
  def json(key: String, url: js.Object, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: String, url: js.Object, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: String, url: Unit, dataKey: String): this.type = js.native
  def json(key: String, url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: String, url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: js.Array[JSONFileConfig]): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: String): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: String, dataKey: String): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: js.Object): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: js.Object, dataKey: String): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: js.Object, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: js.Object, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: Unit, dataKey: String): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: js.Array[JSONFileConfig], url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: JSONFileConfig): this.type = js.native
  def json(key: JSONFileConfig, url: String): this.type = js.native
  def json(key: JSONFileConfig, url: String, dataKey: String): this.type = js.native
  def json(key: JSONFileConfig, url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: JSONFileConfig, url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: JSONFileConfig, url: js.Object): this.type = js.native
  def json(key: JSONFileConfig, url: js.Object, dataKey: String): this.type = js.native
  def json(key: JSONFileConfig, url: js.Object, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: JSONFileConfig, url: js.Object, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: JSONFileConfig, url: Unit, dataKey: String): this.type = js.native
  def json(key: JSONFileConfig, url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def json(key: JSONFileConfig, url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * Checks the key and type of the given file to see if it will conflict with anything already
    * in a Cache, the Texture Manager, or the list or inflight queues.
    * @param file The file to check the key of.
    */
  def keyExists(file: File): Boolean = js.native
  
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
    * Called at the end when the load queue is exhausted and all files have either loaded or errored.
    * By this point every loaded file will now be in its associated cache and ready for use.
    * 
    * Also clears down the Sets, puts progress to 1 and clears the deletion queue.
    */
  def loadComplete(): Unit = js.native
  
  /**
    * An array of all schemes that the Loader considers as being 'local'.
    * 
    * This is populated by the `Phaser.Core.Config#loaderLocalScheme` game configuration setting and defaults to
    * `[ 'file://', 'capacitor://' ]`. Additional local schemes can be added to this array as needed.
    */
  var localSchemes: js.Array[String] = js.native
  
  /**
    * The number of concurrent / parallel resources to try and fetch at once.
    * 
    * Old browsers limit 6 requests per domain; modern ones, especially those with HTTP/2 don't limit it at all.
    * 
    * The default is 32 but you can change this in your Game Config, or by changing this property before the Loader starts.
    */
  var maxParallelDownloads: Double = js.native
  
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
  def multiatlas(key: String): this.type = js.native
  def multiatlas(key: String, atlasURL: String): this.type = js.native
  def multiatlas(key: String, atlasURL: String, path: String): this.type = js.native
  def multiatlas(key: String, atlasURL: String, path: String, baseURL: String): this.type = js.native
  def multiatlas(key: String, atlasURL: String, path: String, baseURL: String, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: String, atlasURL: String, path: String, baseURL: Unit, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: String, atlasURL: String, path: Unit, baseURL: String): this.type = js.native
  def multiatlas(key: String, atlasURL: String, path: Unit, baseURL: String, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: String, atlasURL: String, path: Unit, baseURL: Unit, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: String, atlasURL: Unit, path: String): this.type = js.native
  def multiatlas(key: String, atlasURL: Unit, path: String, baseURL: String): this.type = js.native
  def multiatlas(key: String, atlasURL: Unit, path: String, baseURL: String, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: String, atlasURL: Unit, path: String, baseURL: Unit, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: String, atlasURL: Unit, path: Unit, baseURL: String): this.type = js.native
  def multiatlas(key: String, atlasURL: Unit, path: Unit, baseURL: String, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: String, atlasURL: Unit, path: Unit, baseURL: Unit, atlasXhrSettings: XHRSettingsObject): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig]): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: String): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: String, path: String): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: String, path: String, baseURL: String): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: String,
    path: String,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: String, path: Unit, baseURL: String): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: String,
    path: Unit,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: String,
    path: Unit,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: Unit, path: String): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: Unit, path: String, baseURL: String): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: Unit,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: Unit,
    path: String,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(key: js.Array[MultiAtlasFileConfig], atlasURL: Unit, path: Unit, baseURL: String): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: Unit,
    path: Unit,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: js.Array[MultiAtlasFileConfig],
    atlasURL: Unit,
    path: Unit,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: String): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: String, path: String): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: String, path: String, baseURL: String): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: String,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: String,
    path: String,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: String, path: Unit, baseURL: String): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: String,
    path: Unit,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: String,
    path: Unit,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: Unit, path: String): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: Unit, path: String, baseURL: String): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: Unit,
    path: String,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: Unit,
    path: String,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(key: MultiAtlasFileConfig, atlasURL: Unit, path: Unit, baseURL: String): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: Unit,
    path: Unit,
    baseURL: String,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  def multiatlas(
    key: MultiAtlasFileConfig,
    atlasURL: Unit,
    path: Unit,
    baseURL: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): this.type = js.native
  
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
    * Adds a Wavefront OBJ file, or array of OBJ files, to the current load queue.
    * 
    * Note: You should ensure your 3D package has triangulated the OBJ file prior to export.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.obj('ufo', 'files/spaceship.obj');
    * }
    * ```
    * 
    * You can optionally also load a Wavefront Material file as well, by providing the 3rd parameter:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.obj('ufo', 'files/spaceship.obj', 'files/spaceship.mtl');
    * }
    * ```
    * 
    * If given, the material will be parsed and stored along with the obj data in the cache.
    * 
    * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
    * or if it's already running, when the next free load slot becomes available. This happens automatically if you
    * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
    * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
    * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
    * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
    * loaded.
    * 
    * The key must be a unique String. It is used to add the file to the global OBJ Cache upon a successful load.
    * The key should be unique both in terms of files being loaded and files already present in the OBJ Cache.
    * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
    * then remove it from the OBJ Cache first, before loading a new one.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.obj({
    *     key: 'ufo',
    *     url: 'files/spaceship.obj',
    *     matURL: 'files/spaceship.mtl',
    *     flipUV: true
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.OBJFileConfig` for more details.
    * 
    * Once the file has finished loading you can access it from its Cache using its key:
    * 
    * ```javascript
    * this.load.obj('ufo', 'files/spaceship.obj');
    * // and later in your game ...
    * var data = this.cache.obj.get('ufo');
    * ```
    * 
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Story` the final key will be `LEVEL1.Story` and
    * this is what you would use to retrieve the obj from the OBJ Cache.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "story"
    * and no URL is given then the Loader will set the URL to be "story.obj". It will always add `.obj` as the extension, although
    * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
    * 
    * Note: The ability to load this type of file will only be available if the OBJ File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param objURL The absolute or relative URL to load the obj file from. If undefined or `null` it will be set to `<key>.obj`, i.e. if `key` was "alien" then the URL will be "alien.obj".
    * @param matURL Optional absolute or relative URL to load the obj material file from.
    * @param flipUV Flip the UV coordinates stored in the model data?
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def obj(key: String): this.type = js.native
  def obj(key: String, objURL: String): this.type = js.native
  def obj(key: String, objURL: String, matURL: String): this.type = js.native
  def obj(key: String, objURL: String, matURL: String, flipUV: Boolean): this.type = js.native
  def obj(key: String, objURL: String, matURL: String, flipUV: Boolean, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: String, objURL: String, matURL: String, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: String, objURL: String, matURL: Unit, flipUV: Boolean): this.type = js.native
  def obj(key: String, objURL: String, matURL: Unit, flipUV: Boolean, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: String, objURL: String, matURL: Unit, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: String, objURL: Unit, matURL: String): this.type = js.native
  def obj(key: String, objURL: Unit, matURL: String, flipUV: Boolean): this.type = js.native
  def obj(key: String, objURL: Unit, matURL: String, flipUV: Boolean, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: String, objURL: Unit, matURL: String, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: String, objURL: Unit, matURL: Unit, flipUV: Boolean): this.type = js.native
  def obj(key: String, objURL: Unit, matURL: Unit, flipUV: Boolean, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: String, objURL: Unit, matURL: Unit, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: js.Array[OBJFileConfig]): this.type = js.native
  def obj(key: js.Array[OBJFileConfig], objURL: String): this.type = js.native
  def obj(key: js.Array[OBJFileConfig], objURL: String, matURL: String): this.type = js.native
  def obj(key: js.Array[OBJFileConfig], objURL: String, matURL: String, flipUV: Boolean): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: String,
    matURL: String,
    flipUV: Boolean,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: String,
    matURL: String,
    flipUV: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(key: js.Array[OBJFileConfig], objURL: String, matURL: Unit, flipUV: Boolean): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: String,
    matURL: Unit,
    flipUV: Boolean,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: String,
    matURL: Unit,
    flipUV: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(key: js.Array[OBJFileConfig], objURL: Unit, matURL: String): this.type = js.native
  def obj(key: js.Array[OBJFileConfig], objURL: Unit, matURL: String, flipUV: Boolean): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: Unit,
    matURL: String,
    flipUV: Boolean,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: Unit,
    matURL: String,
    flipUV: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(key: js.Array[OBJFileConfig], objURL: Unit, matURL: Unit, flipUV: Boolean): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: Unit,
    matURL: Unit,
    flipUV: Boolean,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(
    key: js.Array[OBJFileConfig],
    objURL: Unit,
    matURL: Unit,
    flipUV: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(key: OBJFileConfig): this.type = js.native
  def obj(key: OBJFileConfig, objURL: String): this.type = js.native
  def obj(key: OBJFileConfig, objURL: String, matURL: String): this.type = js.native
  def obj(key: OBJFileConfig, objURL: String, matURL: String, flipUV: Boolean): this.type = js.native
  def obj(
    key: OBJFileConfig,
    objURL: String,
    matURL: String,
    flipUV: Boolean,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def obj(key: OBJFileConfig, objURL: String, matURL: String, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: OBJFileConfig, objURL: String, matURL: Unit, flipUV: Boolean): this.type = js.native
  def obj(key: OBJFileConfig, objURL: String, matURL: Unit, flipUV: Boolean, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: OBJFileConfig, objURL: String, matURL: Unit, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: OBJFileConfig, objURL: Unit, matURL: String): this.type = js.native
  def obj(key: OBJFileConfig, objURL: Unit, matURL: String, flipUV: Boolean): this.type = js.native
  def obj(key: OBJFileConfig, objURL: Unit, matURL: String, flipUV: Boolean, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: OBJFileConfig, objURL: Unit, matURL: String, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: OBJFileConfig, objURL: Unit, matURL: Unit, flipUV: Boolean): this.type = js.native
  def obj(key: OBJFileConfig, objURL: Unit, matURL: Unit, flipUV: Boolean, xhrSettings: XHRSettingsObject): this.type = js.native
  def obj(key: OBJFileConfig, objURL: Unit, matURL: Unit, flipUV: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
  def pack(key: String): this.type = js.native
  def pack(key: String, url: String): this.type = js.native
  def pack(key: String, url: String, dataKey: String): this.type = js.native
  def pack(key: String, url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: String, url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: String, url: Unit, dataKey: String): this.type = js.native
  def pack(key: String, url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: String, url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: js.Array[PackFileConfig]): this.type = js.native
  def pack(key: js.Array[PackFileConfig], url: String): this.type = js.native
  def pack(key: js.Array[PackFileConfig], url: String, dataKey: String): this.type = js.native
  def pack(key: js.Array[PackFileConfig], url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: js.Array[PackFileConfig], url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: js.Array[PackFileConfig], url: Unit, dataKey: String): this.type = js.native
  def pack(key: js.Array[PackFileConfig], url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: js.Array[PackFileConfig], url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: PackFileConfig): this.type = js.native
  def pack(key: PackFileConfig, url: String): this.type = js.native
  def pack(key: PackFileConfig, url: String, dataKey: String): this.type = js.native
  def pack(key: PackFileConfig, url: String, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: PackFileConfig, url: String, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: PackFileConfig, url: Unit, dataKey: String): this.type = js.native
  def pack(key: PackFileConfig, url: Unit, dataKey: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def pack(key: PackFileConfig, url: Unit, dataKey: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
  def plugin(
    key: String | PluginFileConfig | js.Array[PluginFileConfig],
    url: js.UndefOr[String | js.Function],
    start: js.UndefOr[Boolean],
    mapping: js.UndefOr[String],
    xhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
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
  def save(data: Any): this.type = js.native
  def save(data: Any, filename: String): this.type = js.native
  def save(data: Any, filename: String, filetype: String): this.type = js.native
  def save(data: Any, filename: Unit, filetype: String): this.type = js.native
  
  /**
    * Converts the given JSON data into a file that the browser then prompts you to download so you can save it locally.
    * 
    * The data must be well formed JSON and ready-parsed, not a JavaScript object.
    * @param data The JSON data, ready parsed.
    * @param filename The name to save the JSON file as. Default file.json.
    */
  def saveJSON(data: Any): this.type = js.native
  def saveJSON(data: Any, filename: String): this.type = js.native
  
  /**
    * The Scene which owns this Loader instance.
    */
  var scene: Scene = js.native
  
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
  def sceneFile(key: String): this.type = js.native
  def sceneFile(key: String, url: String): this.type = js.native
  def sceneFile(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def sceneFile(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def sceneFile(key: js.Array[SceneFileConfig]): this.type = js.native
  def sceneFile(key: js.Array[SceneFileConfig], url: String): this.type = js.native
  def sceneFile(key: js.Array[SceneFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def sceneFile(key: js.Array[SceneFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def sceneFile(key: SceneFileConfig): this.type = js.native
  def sceneFile(key: SceneFileConfig, url: String): this.type = js.native
  def sceneFile(key: SceneFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def sceneFile(key: SceneFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * A reference to the global Scene Manager.
    */
  /* protected */ var sceneManager: SceneManager = js.native
  
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
  def scenePlugin(
    key: String | ScenePluginFileConfig | js.Array[ScenePluginFileConfig],
    url: js.UndefOr[String | js.Function],
    systemKey: js.UndefOr[String],
    sceneKey: js.UndefOr[String],
    xhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
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
    * If the script file contains a module, then you should specify that using the 'type' parameter:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.script('aliens', 'lib/aliens.js', 'module');
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
    *     url: 'lib/aliens.js',
    *     type: 'script' // or 'module'
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
    * @param type The script type. Should be either 'script' for classic JavaScript, or 'module' if the file contains an exported module. Default 'script'.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def script(key: String): this.type = js.native
  def script(key: String, url: String): this.type = js.native
  def script(key: String, url: String, `type`: String): this.type = js.native
  def script(key: String, url: String, `type`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: String, url: String, `type`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: String, url: Unit, `type`: String): this.type = js.native
  def script(key: String, url: Unit, `type`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: String, url: Unit, `type`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: js.Array[ScriptFileConfig]): this.type = js.native
  def script(key: js.Array[ScriptFileConfig], url: String): this.type = js.native
  def script(key: js.Array[ScriptFileConfig], url: String, `type`: String): this.type = js.native
  def script(key: js.Array[ScriptFileConfig], url: String, `type`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: js.Array[ScriptFileConfig], url: String, `type`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: js.Array[ScriptFileConfig], url: Unit, `type`: String): this.type = js.native
  def script(key: js.Array[ScriptFileConfig], url: Unit, `type`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: js.Array[ScriptFileConfig], url: Unit, `type`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: ScriptFileConfig): this.type = js.native
  def script(key: ScriptFileConfig, url: String): this.type = js.native
  def script(key: ScriptFileConfig, url: String, `type`: String): this.type = js.native
  def script(key: ScriptFileConfig, url: String, `type`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: ScriptFileConfig, url: String, `type`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: ScriptFileConfig, url: Unit, `type`: String): this.type = js.native
  def script(key: ScriptFileConfig, url: Unit, `type`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def script(key: ScriptFileConfig, url: Unit, `type`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * Adds an array of Script files to the current load queue.
    * 
    * The difference between this and the `ScriptFile` file type is that you give an array of scripts to this method,
    * and the scripts are then processed _exactly_ in that order. This allows you to load a bunch of scripts that
    * may have dependencies on each other without worrying about the async nature of traditional script loading.
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
  def scripts(key: String): this.type = js.native
  def scripts(key: String, url: js.Array[String]): this.type = js.native
  def scripts(key: String, url: js.Array[String], `extension`: String): this.type = js.native
  def scripts(key: String, url: js.Array[String], `extension`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def scripts(key: String, url: js.Array[String], `extension`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def scripts(key: String, url: Unit, `extension`: String): this.type = js.native
  def scripts(key: String, url: Unit, `extension`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def scripts(key: String, url: Unit, `extension`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def scripts(key: js.Array[MultiScriptFileConfig]): this.type = js.native
  def scripts(key: js.Array[MultiScriptFileConfig], url: js.Array[String]): this.type = js.native
  def scripts(key: js.Array[MultiScriptFileConfig], url: js.Array[String], `extension`: String): this.type = js.native
  def scripts(
    key: js.Array[MultiScriptFileConfig],
    url: js.Array[String],
    `extension`: String,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def scripts(
    key: js.Array[MultiScriptFileConfig],
    url: js.Array[String],
    `extension`: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def scripts(key: js.Array[MultiScriptFileConfig], url: Unit, `extension`: String): this.type = js.native
  def scripts(
    key: js.Array[MultiScriptFileConfig],
    url: Unit,
    `extension`: String,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def scripts(key: js.Array[MultiScriptFileConfig], url: Unit, `extension`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def scripts(key: MultiScriptFileConfig): this.type = js.native
  def scripts(key: MultiScriptFileConfig, url: js.Array[String]): this.type = js.native
  def scripts(key: MultiScriptFileConfig, url: js.Array[String], `extension`: String): this.type = js.native
  def scripts(
    key: MultiScriptFileConfig,
    url: js.Array[String],
    `extension`: String,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def scripts(
    key: MultiScriptFileConfig,
    url: js.Array[String],
    `extension`: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def scripts(key: MultiScriptFileConfig, url: Unit, `extension`: String): this.type = js.native
  def scripts(key: MultiScriptFileConfig, url: Unit, `extension`: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def scripts(key: MultiScriptFileConfig, url: Unit, `extension`: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * If you want to append a URL before the path of any asset you can set this here.
    * 
    * Useful if allowing the asset base url to be configured outside of the game code.
    * 
    * Once a base URL is set it will affect every file loaded by the Loader from that point on. It does _not_ change any
    * file _already_ being loaded. To reset it, call this method with no arguments.
    * @param url The URL to use. Leave empty to reset.
    */
  def setBaseURL(): this.type = js.native
  def setBaseURL(url: String): this.type = js.native
  
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
  def setCORS(): this.type = js.native
  def setCORS(crossOrigin: String): this.type = js.native
  
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
  def setPath(): this.type = js.native
  def setPath(path: String): this.type = js.native
  
  /**
    * An optional prefix that is automatically prepended to the start of every file key.
    * 
    * If prefix was `MENU.` and you load an image with the key 'Background' the resulting key would be `MENU.Background`.
    * 
    * Once a prefix is set it will then affect every file added to the Loader from that point on. It does _not_ change any
    * file _already_ in the load queue. To reset it, call this method with no arguments.
    * @param prefix The prefix to use. Leave empty to reset.
    */
  def setPrefix(): this.type = js.native
  def setPrefix(prefix: String): this.type = js.native
  
  def spine(key: String, jsonURL: String, atlasURL: String): LoaderPlugin = js.native
  def spine(key: String, jsonURL: String, atlasURL: String, preMultipliedAlpha: Boolean): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(key: String, jsonURL: String, atlasURL: js.Array[String]): LoaderPlugin = js.native
  def spine(key: String, jsonURL: String, atlasURL: js.Array[String], preMultipliedAlpha: Boolean): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: String,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(key: js.Array[SpineFileConfig], jsonURL: String, atlasURL: String): LoaderPlugin = js.native
  def spine(key: js.Array[SpineFileConfig], jsonURL: String, atlasURL: String, preMultipliedAlpha: Boolean): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(key: js.Array[SpineFileConfig], jsonURL: String, atlasURL: js.Array[String]): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: js.Array[SpineFileConfig],
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(key: SpineFileConfig, jsonURL: String, atlasURL: String): LoaderPlugin = js.native
  def spine(key: SpineFileConfig, jsonURL: String, atlasURL: String, preMultipliedAlpha: Boolean): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(key: SpineFileConfig, jsonURL: String, atlasURL: js.Array[String]): LoaderPlugin = js.native
  def spine(key: SpineFileConfig, jsonURL: String, atlasURL: js.Array[String], preMultipliedAlpha: Boolean): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Boolean,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: Unit,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  def spine(
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: js.Array[String],
    preMultipliedAlpha: Unit,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ): LoaderPlugin = js.native
  
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
  def spritesheet(key: String): this.type = js.native
  def spritesheet(key: String, url: String): this.type = js.native
  def spritesheet(key: String, url: String, frameConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def spritesheet(key: String, url: String, frameConfig: ImageFrameConfig): this.type = js.native
  def spritesheet(key: String, url: String, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  def spritesheet(key: String, url: Unit, frameConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def spritesheet(key: String, url: Unit, frameConfig: ImageFrameConfig): this.type = js.native
  def spritesheet(key: String, url: Unit, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig]): this.type = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig], url: String): this.type = js.native
  def spritesheet(
    key: js.Array[SpriteSheetFileConfig],
    url: String,
    frameConfig: Unit,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig], url: String, frameConfig: ImageFrameConfig): this.type = js.native
  def spritesheet(
    key: js.Array[SpriteSheetFileConfig],
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig], url: Unit, frameConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def spritesheet(key: js.Array[SpriteSheetFileConfig], url: Unit, frameConfig: ImageFrameConfig): this.type = js.native
  def spritesheet(
    key: js.Array[SpriteSheetFileConfig],
    url: Unit,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def spritesheet(key: SpriteSheetFileConfig): this.type = js.native
  def spritesheet(key: SpriteSheetFileConfig, url: String): this.type = js.native
  def spritesheet(key: SpriteSheetFileConfig, url: String, frameConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def spritesheet(key: SpriteSheetFileConfig, url: String, frameConfig: ImageFrameConfig): this.type = js.native
  def spritesheet(
    key: SpriteSheetFileConfig,
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def spritesheet(key: SpriteSheetFileConfig, url: Unit, frameConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def spritesheet(key: SpriteSheetFileConfig, url: Unit, frameConfig: ImageFrameConfig): this.type = js.native
  def spritesheet(
    key: SpriteSheetFileConfig,
    url: Unit,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  
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
    * The current state of the Loader.
    */
  val state: Double = js.native
  
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
  def svg(key: String): this.type = js.native
  def svg(key: String, url: String): this.type = js.native
  def svg(key: String, url: String, svgConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: String, url: String, svgConfig: SVGSizeConfig): this.type = js.native
  def svg(key: String, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: String, url: Unit, svgConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: String, url: Unit, svgConfig: SVGSizeConfig): this.type = js.native
  def svg(key: String, url: Unit, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: js.Array[SVGFileConfig]): this.type = js.native
  def svg(key: js.Array[SVGFileConfig], url: String): this.type = js.native
  def svg(key: js.Array[SVGFileConfig], url: String, svgConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: js.Array[SVGFileConfig], url: String, svgConfig: SVGSizeConfig): this.type = js.native
  def svg(
    key: js.Array[SVGFileConfig],
    url: String,
    svgConfig: SVGSizeConfig,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def svg(key: js.Array[SVGFileConfig], url: Unit, svgConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: js.Array[SVGFileConfig], url: Unit, svgConfig: SVGSizeConfig): this.type = js.native
  def svg(key: js.Array[SVGFileConfig], url: Unit, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: SVGFileConfig): this.type = js.native
  def svg(key: SVGFileConfig, url: String): this.type = js.native
  def svg(key: SVGFileConfig, url: String, svgConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: SVGFileConfig, url: String, svgConfig: SVGSizeConfig): this.type = js.native
  def svg(key: SVGFileConfig, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: SVGFileConfig, url: Unit, svgConfig: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def svg(key: SVGFileConfig, url: Unit, svgConfig: SVGSizeConfig): this.type = js.native
  def svg(key: SVGFileConfig, url: Unit, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * A reference to the Scene Systems.
    */
  var systems: Systems = js.native
  
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
  def text(key: String): this.type = js.native
  def text(key: String, url: String): this.type = js.native
  def text(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def text(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def text(key: js.Array[TextFileConfig]): this.type = js.native
  def text(key: js.Array[TextFileConfig], url: String): this.type = js.native
  def text(key: js.Array[TextFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def text(key: js.Array[TextFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def text(key: TextFileConfig): this.type = js.native
  def text(key: TextFileConfig, url: String): this.type = js.native
  def text(key: TextFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def text(key: TextFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * Adds a Compressed Texture file to the current load queue. This feature is WebGL only.
    * 
    * This method takes a key and a configuration object, which lists the different formats
    * and files associated with them.
    * 
    * The texture format object should be ordered in GPU priority order, with IMG as the last entry.
    * 
    * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
    * 
    * ```javascript
    * preload ()
    * {
    *     this.load.texture('yourPic', {
    *         ASTC: { type: 'PVR', textureURL: 'pic-astc-4x4.pvr' },
    *         PVRTC: { type: 'PVR', textureURL: 'pic-pvrtc-4bpp-rgba.pvr' },
    *         S3TC: { type: 'PVR', textureURL: 'pic-dxt5.pvr' },
    *         IMG: { textureURL: 'pic.png' }
    *     });
    * ```
    * 
    * If you wish to load a texture atlas, provide the `atlasURL` property:
    * 
    * ```javascript
    * preload ()
    * {
    *     const path = 'assets/compressed';
    * 
    *     this.load.texture('yourAtlas', {
    *         'ASTC': { type: 'PVR', textureURL: `${path}/textures-astc-4x4.pvr`, atlasURL: `${path}/textures.json` },
    *         'PVRTC': { type: 'PVR', textureURL: `${path}/textures-pvrtc-4bpp-rgba.pvr`, atlasURL: `${path}/textures-pvrtc-4bpp-rgba.json` },
    *         'S3TC': { type: 'PVR', textureURL: `${path}/textures-dxt5.pvr`, atlasURL: `${path}/textures-dxt5.json` },
    *         'IMG': { textureURL: `${path}/textures.png`, atlasURL: `${path}/textures.json` }
    *     });
    * }
    * ```
    * 
    * If you wish to load a Multi Atlas, as exported from Texture Packer Pro, use the `multiAtlasURL` property instead:
    * 
    * ```javascript
    * preload ()
    * {
    *     const path = 'assets/compressed';
    * 
    *     this.load.texture('yourAtlas', {
    *         'ASTC': { type: 'PVR', atlasURL: `${path}/textures.json` },
    *         'PVRTC': { type: 'PVR', atlasURL: `${path}/textures-pvrtc-4bpp-rgba.json` },
    *         'S3TC': { type: 'PVR', atlasURL: `${path}/textures-dxt5.json` },
    *         'IMG': { atlasURL: `${path}/textures.json` }
    *     });
    * }
    * ```
    * 
    * When loading a Multi Atlas you do not need to specify the `textureURL` property as it will be read from the JSON file.
    * 
    * Instead of passing arguments you can pass a configuration object, such as:
    * 
    * ```javascript
    * this.load.texture({
    *     key: 'yourPic',
    *     url: {
    *         ASTC: { type: 'PVR', textureURL: 'pic-astc-4x4.pvr' },
    *         PVRTC: { type: 'PVR', textureURL: 'pic-pvrtc-4bpp-rgba.pvr' },
    *         S3TC: { type: 'PVR', textureURL: 'pic-dxt5.pvr' },
    *         IMG: { textureURL: 'pic.png' }
    *    }
    * });
    * ```
    * 
    * See the documentation for `Phaser.Types.Loader.FileTypes.CompressedTextureFileConfig` for more details.
    * 
    * The number of formats you provide to this function is up to you, but you should ensure you
    * cover the primary platforms where appropriate.
    * 
    * The 'IMG' entry is a fallback to a JPG or PNG, should the browser be unable to load any of the other
    * formats presented to this function. You should really always include this, although it is optional.
    * 
    * Phaser supports loading both the PVR and KTX container formats. Within those, it can parse
    * the following texture compression formats:
    * 
    * ETC
    * ETC1
    * ATC
    * ASTC
    * BPTC
    * RGTC
    * PVRTC
    * S3TC
    * S3TCSRGB
    * 
    * For more information about the benefits of compressed textures please see the
    * following articles:
    * 
    * Texture Compression in 2020 (https://aras-p.info/blog/2020/12/08/Texture-Compression-in-2020/)
    * Compressed GPU Texture Formats (https://themaister.net/blog/2020/08/12/compressed-gpu-texture-formats-a-review-and-compute-shader-decoders-part-1/)
    * 
    * To create compressed texture files use a 3rd party application such as:
    * 
    * Texture Packer (https://www.codeandweb.com/texturepacker/tutorials/how-to-create-sprite-sheets-for-phaser3?utm_source=ad&utm_medium=banner&utm_campaign=phaser-2018-10-16)
    * PVRTexTool (https://developer.imaginationtech.com/pvrtextool/) - available for Windows, macOS and Linux.
    * Mali Texture Compression Tool (https://developer.arm.com/tools-and-software/graphics-and-gaming/mali-texture-compression-tool)
    * ASTC Encoder (https://github.com/ARM-software/astc-encoder)
    * 
    * ASTCs must have a Channel Type of Unsigned Normalized Bytes (UNorm) and a Linear RGB Color Space.
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
    * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
    * key. For example, if the prefix was `LEVEL1.` and the key was `Data` the final key will be `LEVEL1.Data` and
    * this is what you would use to retrieve the text from the Texture Manager.
    * 
    * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
    * 
    * Unlike other file loaders in Phaser, the URLs must include the file extension.
    * 
    * Note: The ability to load this type of file will only be available if the Compressed Texture File type has been built into Phaser.
    * It is available in the default build but can be excluded from custom builds.
    * @param key The key to use for this file, or a file configuration object, or array of them.
    * @param url The compressed texture configuration object. Not required if passing a config object as the `key` parameter.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def texture(key: String): this.type = js.native
  def texture(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def texture(key: String, url: CompressedTextureFileConfig): this.type = js.native
  def texture(key: String, url: CompressedTextureFileConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  def texture(key: js.Array[CompressedTextureFileConfig]): this.type = js.native
  def texture(key: js.Array[CompressedTextureFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def texture(key: js.Array[CompressedTextureFileConfig], url: CompressedTextureFileConfig): this.type = js.native
  def texture(
    key: js.Array[CompressedTextureFileConfig],
    url: CompressedTextureFileConfig,
    xhrSettings: XHRSettingsObject
  ): this.type = js.native
  def texture(key: CompressedTextureFileConfig): this.type = js.native
  def texture(key: CompressedTextureFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def texture(key: CompressedTextureFileConfig, url: CompressedTextureFileConfig): this.type = js.native
  def texture(key: CompressedTextureFileConfig, url: CompressedTextureFileConfig, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * A reference to the global Texture Manager.
    */
  var textureManager: TextureManager = js.native
  
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
  def tilemapCSV(key: String): this.type = js.native
  def tilemapCSV(key: String, url: String): this.type = js.native
  def tilemapCSV(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapCSV(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapCSV(key: js.Array[TilemapCSVFileConfig]): this.type = js.native
  def tilemapCSV(key: js.Array[TilemapCSVFileConfig], url: String): this.type = js.native
  def tilemapCSV(key: js.Array[TilemapCSVFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapCSV(key: js.Array[TilemapCSVFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapCSV(key: TilemapCSVFileConfig): this.type = js.native
  def tilemapCSV(key: TilemapCSVFileConfig, url: String): this.type = js.native
  def tilemapCSV(key: TilemapCSVFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapCSV(key: TilemapCSVFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
  def tilemapImpact(key: String): this.type = js.native
  def tilemapImpact(key: String, url: String): this.type = js.native
  def tilemapImpact(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapImpact(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapImpact(key: js.Array[TilemapImpactFileConfig]): this.type = js.native
  def tilemapImpact(key: js.Array[TilemapImpactFileConfig], url: String): this.type = js.native
  def tilemapImpact(key: js.Array[TilemapImpactFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapImpact(key: js.Array[TilemapImpactFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapImpact(key: TilemapImpactFileConfig): this.type = js.native
  def tilemapImpact(key: TilemapImpactFileConfig, url: String): this.type = js.native
  def tilemapImpact(key: TilemapImpactFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapImpact(key: TilemapImpactFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
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
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
    * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
    */
  def tilemapTiledJSON(key: String): this.type = js.native
  def tilemapTiledJSON(key: String, url: String): this.type = js.native
  def tilemapTiledJSON(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: String, url: js.Object): this.type = js.native
  def tilemapTiledJSON(key: String, url: js.Object, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig]): this.type = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig], url: String): this.type = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig], url: js.Object): this.type = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig], url: js.Object, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: js.Array[TilemapJSONFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig): this.type = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig, url: String): this.type = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig, url: js.Object): this.type = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig, url: js.Object, xhrSettings: XHRSettingsObject): this.type = js.native
  def tilemapTiledJSON(key: TilemapJSONFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  
  /**
    * The total number of files that successfully loaded during the most recent load.
    * This value is reset when you call `Loader.start`.
    */
  var totalComplete: Double = js.native
  
  /**
    * The total number of files that failed to load during the most recent load.
    * This value is reset when you call `Loader.start`.
    */
  var totalFailed: Double = js.native
  
  /**
    * The total number of files to load. It may not always be accurate because you may add to the Loader during the process
    * of loading, especially if you load a Pack File. Therefore this value can change, but in most cases remains static.
    */
  var totalToLoad: Double = js.native
  
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
  def unityAtlas(
    key: String | UnityAtlasFileConfig | js.Array[UnityAtlasFileConfig],
    textureURL: js.UndefOr[String | js.Array[String]],
    atlasURL: js.UndefOr[String],
    textureXhrSettings: js.UndefOr[XHRSettingsObject],
    atlasXhrSettings: js.UndefOr[XHRSettingsObject]
  ): this.type = js.native
  
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
    * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it. Default false.
    */
  def video(key: String): this.type = js.native
  def video(key: String, urls: String): this.type = js.native
  def video(key: String, urls: String, noAudio: Boolean): this.type = js.native
  def video(key: String, urls: js.Array[String | VideoFileURLConfig]): this.type = js.native
  def video(key: String, urls: js.Array[String | VideoFileURLConfig], noAudio: Boolean): this.type = js.native
  def video(key: String, urls: Unit, noAudio: Boolean): this.type = js.native
  def video(key: String, urls: VideoFileURLConfig): this.type = js.native
  def video(key: String, urls: VideoFileURLConfig, noAudio: Boolean): this.type = js.native
  def video(key: js.Array[VideoFileConfig]): this.type = js.native
  def video(key: js.Array[VideoFileConfig], urls: String): this.type = js.native
  def video(key: js.Array[VideoFileConfig], urls: String, noAudio: Boolean): this.type = js.native
  def video(key: js.Array[VideoFileConfig], urls: js.Array[String | VideoFileURLConfig]): this.type = js.native
  def video(key: js.Array[VideoFileConfig], urls: js.Array[String | VideoFileURLConfig], noAudio: Boolean): this.type = js.native
  def video(key: js.Array[VideoFileConfig], urls: Unit, noAudio: Boolean): this.type = js.native
  def video(key: js.Array[VideoFileConfig], urls: VideoFileURLConfig): this.type = js.native
  def video(key: js.Array[VideoFileConfig], urls: VideoFileURLConfig, noAudio: Boolean): this.type = js.native
  def video(key: VideoFileConfig): this.type = js.native
  def video(key: VideoFileConfig, urls: String): this.type = js.native
  def video(key: VideoFileConfig, urls: String, noAudio: Boolean): this.type = js.native
  def video(key: VideoFileConfig, urls: js.Array[String | VideoFileURLConfig]): this.type = js.native
  def video(key: VideoFileConfig, urls: js.Array[String | VideoFileURLConfig], noAudio: Boolean): this.type = js.native
  def video(key: VideoFileConfig, urls: Unit, noAudio: Boolean): this.type = js.native
  def video(key: VideoFileConfig, urls: VideoFileURLConfig): this.type = js.native
  def video(key: VideoFileConfig, urls: VideoFileURLConfig, noAudio: Boolean): this.type = js.native
  
  /**
    * xhr specific global settings (can be overridden on a per-file basis)
    */
  var xhr: XHRSettingsObject = js.native
  
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
  def xml(key: String): this.type = js.native
  def xml(key: String, url: String): this.type = js.native
  def xml(key: String, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def xml(key: String, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def xml(key: js.Array[XMLFileConfig]): this.type = js.native
  def xml(key: js.Array[XMLFileConfig], url: String): this.type = js.native
  def xml(key: js.Array[XMLFileConfig], url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def xml(key: js.Array[XMLFileConfig], url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
  def xml(key: XMLFileConfig): this.type = js.native
  def xml(key: XMLFileConfig, url: String): this.type = js.native
  def xml(key: XMLFileConfig, url: String, xhrSettings: XHRSettingsObject): this.type = js.native
  def xml(key: XMLFileConfig, url: Unit, xhrSettings: XHRSettingsObject): this.type = js.native
}
