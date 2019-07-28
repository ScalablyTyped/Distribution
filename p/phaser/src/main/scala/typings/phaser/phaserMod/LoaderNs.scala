package typings.phaser.phaserMod

import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AtlasJSONFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AtlasXMLFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AudioFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.AudioSpriteFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.BinaryFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.BitmapFontFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.CSSFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.GLSLFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.HTMLFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.HTMLTextureFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.JSONFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.MultiScriptFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.PackFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.PluginFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SVGFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SVGSizeConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SceneFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ScenePluginFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ScriptFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TextFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TilemapCSVFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TilemapImpactFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TilemapJSONFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.UnityAtlasFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.XMLFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import typings.phaser.integer
import typings.std.AudioContext
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Loader")
@js.native
object LoaderNs extends js.Object {
  /**
    * The base File class used by all File Types that the Loader can support.
    * You shouldn't create an instance of a File directly, but should extend it with your own class, setting a custom type and processing methods.
    */
  @js.native
  class File protected ()
    extends typings.phaser.PhaserNs.LoaderNs.File {
    /**
      * 
      * @param loader The Loader that is going to load this File.
      * @param fileConfig The file configuration object, as created by the file type.
      */
    def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, fileConfig: FileConfig) = this()
  }
  
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
  class LoaderPlugin protected ()
    extends typings.phaser.PhaserNs.LoaderNs.LoaderPlugin {
    /**
      * 
      * @param scene The Scene which owns this Loader instance.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
    * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
    * 
    * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
    */
  @js.native
  class MultiFile protected ()
    extends typings.phaser.PhaserNs.LoaderNs.MultiFile {
    /**
      * 
      * @param loader The Loader that is going to load this File.
      * @param type The file type string for sorting within the Loader.
      * @param key The key of the file within the loader.
      * @param files An array of Files that make-up this MultiFile.
      */
    def this(
      loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
      `type`: String,
      key: String,
      files: js.Array[typings.phaser.PhaserNs.LoaderNs.File]
    ) = this()
  }
  
  /**
    * File has finished processing.
    */
  var FILE_COMPLETE: integer = js.native
  /**
    * File has been destroyed
    */
  var FILE_DESTROYED: integer = js.native
  /**
    * The File has errored somehow during processing.
    */
  var FILE_ERRORED: integer = js.native
  /**
    * File failed to load
    */
  var FILE_FAILED: integer = js.native
  /**
    * File has loaded successfully, awaiting processing
    */
  var FILE_LOADED: integer = js.native
  /**
    * File has been started to load by the loader (onLoad called)
    */
  var FILE_LOADING: integer = js.native
  /**
    * File is in the load queue but not yet started
    */
  var FILE_PENDING: integer = js.native
  /**
    * File was populated from local data and doesn't need an HTTP request
    */
  var FILE_POPULATED: integer = js.native
  /**
    * File is being processed (onProcess callback)
    */
  var FILE_PROCESSING: integer = js.native
  /**
    * The Loader has completed loading and processing.
    */
  var LOADER_COMPLETE: integer = js.native
  /**
    * The Loader has been destroyed.
    */
  var LOADER_DESTROYED: integer = js.native
  /**
    * The Loader is idle.
    */
  var LOADER_IDLE: integer = js.native
  /**
    * The Loader is actively loading.
    */
  var LOADER_LOADING: integer = js.native
  /**
    * The Loader is processing files is has loaded.
    */
  var LOADER_PROCESSING: integer = js.native
  /**
    * The Loader is shutting down.
    */
  var LOADER_SHUTDOWN: integer = js.native
  /**
    * Given a File and a baseURL value this returns the URL the File will use to download from.
    * @param file The File object.
    * @param baseURL A default base URL.
    */
  def GetURL(file: typings.phaser.PhaserNs.LoaderNs.File, baseURL: String): String = js.native
  /**
    * Takes two XHRSettings Objects and creates a new XHRSettings object from them.
    * 
    * The new object is seeded by the values given in the global settings, but any setting in
    * the local object overrides the global ones.
    * @param global The global XHRSettings object.
    * @param local The local XHRSettings object.
    */
  def MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject = js.native
  /**
    * Creates a new XMLHttpRequest (xhr) object based on the given File and XHRSettings
    * and starts the download of it. It uses the Files own XHRSettings and merges them
    * with the global XHRSettings object to set the xhr values before download.
    * @param file The File to download.
    * @param globalXHRSettings The global XHRSettings object.
    */
  def XHRLoader(file: typings.phaser.PhaserNs.LoaderNs.File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = js.native
  /**
    * Creates an XHRSettings Object with default values.
    * @param responseType The responseType, such as 'text'. Default ''.
    * @param async Should the XHR request use async or not? Default true.
    * @param user Optional username for the XHR request. Default ''.
    * @param password Optional password for the XHR request. Default ''.
    * @param timeout Optional XHR timeout value. Default 0.
    */
  def XHRSettings(): XHRSettingsObject = js.native
  def XHRSettings(responseType: XMLHttpRequestResponseType): XHRSettingsObject = js.native
  def XHRSettings(responseType: XMLHttpRequestResponseType, async: Boolean): XHRSettingsObject = js.native
  def XHRSettings(responseType: XMLHttpRequestResponseType, async: Boolean, user: String): XHRSettingsObject = js.native
  def XHRSettings(responseType: XMLHttpRequestResponseType, async: Boolean, user: String, password: String): XHRSettingsObject = js.native
  def XHRSettings(
    responseType: XMLHttpRequestResponseType,
    async: Boolean,
    user: String,
    password: String,
    timeout: integer
  ): XHRSettingsObject = js.native
  @JSName("Events")
  @js.native
  object EventsNs extends js.Object {
    /**
      * The Loader Plugin Add File Event.
      * 
      * This event is dispatched when a new file is successfully added to the Loader and placed into the load queue.
      * 
      * Listen to it from a Scene using: `this.load.on('addfile', listener)`.
      * 
      * If you add lots of files to a Loader from a `preload` method, it will dispatch this event for each one of them.
      */
    val ADD: js.Any = js.native
    /**
      * The Loader Plugin Complete Event.
      * 
      * This event is dispatched when the Loader has fully processed everything in the load queue.
      * By this point every loaded file will now be in its associated cache and ready for use.
      * 
      * Listen to it from a Scene using: `this.load.on('complete', listener)`.
      */
    val COMPLETE: js.Any = js.native
    /**
      * The File Load Complete Event.
      * 
      * This event is dispatched by the Loader Plugin when any file in the queue finishes loading.
      * 
      * Listen to it from a Scene using: `this.load.on('filecomplete', listener)`.
      * 
      * You can also listen for the completion of a specific file. See the [FILE_KEY_COMPLETE]{@linkcode Phaser.Loader.Events#event:FILE_KEY_COMPLETE} event.
      */
    val FILE_COMPLETE: js.Any = js.native
    /**
      * The File Load Complete Event.
      * 
      * This event is dispatched by the Loader Plugin when any file in the queue finishes loading.
      * 
      * It uses a special dynamic event name constructed from the key and type of the file.
      * 
      * For example, if you have loaded an `image` with a key of `monster`, you can listen for it
      * using the following:
      * 
      * ```javascript
      * this.load.on('filecomplete-image-monster', function (key, type, data) {
      *     // Your handler code
      * });
      * ```
      * 
      * Or, if you have loaded a texture `atlas` with a key of `Level1`:
      * 
      * ```javascript
      * this.load.on('filecomplete-atlas-Level1', function (key, type, data) {
      *     // Your handler code
      * });
      * ```
      * 
      * Or, if you have loaded a sprite sheet with a key of `Explosion` and a prefix of `GAMEOVER`:
      * 
      * ```javascript
      * this.load.on('filecomplete-spritesheet-GAMEOVERExplosion', function (key, type, data) {
      *     // Your handler code
      * });
      * ```
      * 
      * You can also listen for the generic completion of files. See the [FILE_COMPLETE]{@linkcode Phaser.Loader.Events#event:FILE_COMPLETE} event.
      */
    val FILE_KEY_COMPLETE: js.Any = js.native
    /**
      * The File Load Event.
      * 
      * This event is dispatched by the Loader Plugin when a file finishes loading,
      * but _before_ it is processed and added to the internal Phaser caches.
      * 
      * Listen to it from a Scene using: `this.load.on('load', listener)`.
      */
    val FILE_LOAD: js.Any = js.native
    /**
      * The File Load Error Event.
      * 
      * This event is dispatched by the Loader Plugin when a file fails to load.
      * 
      * Listen to it from a Scene using: `this.load.on('loaderror', listener)`.
      */
    val FILE_LOAD_ERROR: js.Any = js.native
    /**
      * The File Load Progress Event.
      * 
      * This event is dispatched by the Loader Plugin during the load of a file, if the browser receives a DOM ProgressEvent and
      * the `lengthComputable` event property is true. Depending on the size of the file and browser in use, this may, or may not happen.
      * 
      * Listen to it from a Scene using: `this.load.on('fileprogress', listener)`.
      */
    val FILE_PROGRESS: js.Any = js.native
    /**
      * The Loader Plugin Post Process Event.
      * 
      * This event is dispatched by the Loader Plugin when the Loader has finished loading everything in the load queue.
      * It is dispatched before the internal lists are cleared and each File is destroyed.
      * 
      * Use this hook to perform any last minute processing of files that can only happen once the
      * Loader has completed, but prior to it emitting the `complete` event.
      * 
      * Listen to it from a Scene using: `this.load.on('postprocess', listener)`.
      */
    val POST_PROCESS: js.Any = js.native
    /**
      * The Loader Plugin Progress Event.
      * 
      * This event is dispatched when the Loader updates its load progress, typically as a result of a file having completed loading.
      * 
      * Listen to it from a Scene using: `this.load.on('progress', listener)`.
      */
    val PROGRESS: js.Any = js.native
    /**
      * The Loader Plugin Start Event.
      * 
      * This event is dispatched when the Loader starts running. At this point load progress is zero.
      * 
      * This event is dispatched even if there aren't any files in the load queue.
      * 
      * Listen to it from a Scene using: `this.load.on('start', listener)`.
      */
    val START: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object File extends js.Object {
    /**
      * Static method for creating object URL using URL API and setting it as image 'src' attribute.
      * If URL API is not supported (usually on old browsers) it falls back to creating Base64 encoded url using FileReader.
      * @param image Image object which 'src' attribute should be set to object URL.
      * @param blob A Blob object to create an object URL for.
      * @param defaultType Default mime type used if blob type is not available.
      */
    def createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String): Unit = js.native
    /**
      * Static method for releasing an existing object URL which was previously created
      * by calling {@link File#createObjectURL} method.
      * @param image Image object which 'src' attribute should be revoked.
      */
    def revokeObjectURL(image: HTMLImageElement): Unit = js.native
  }
  
  @JSName("FileTypesManager")
  @js.native
  object FileTypesManagerNs extends js.Object {
    /**
      * Removed all associated file types.
      */
    def destroy(): Unit = js.native
    /**
      * Static method called when a LoaderPlugin is created.
      * 
      * Loops through the local types object and injects all of them as
      * properties into the LoaderPlugin instance.
      * @param loader The LoaderPlugin to install the types into.
      */
    def install(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin): Unit = js.native
    /**
      * Static method called directly by the File Types.
      * 
      * The key is a reference to the function used to load the files via the Loader, i.e. `image`.
      * @param key The key that will be used as the method name in the LoaderPlugin.
      * @param factoryFunction The function that will be called when LoaderPlugin.key is invoked.
      */
    def register(key: String, factoryFunction: js.Function): Unit = js.native
  }
  
  @JSName("FileTypes")
  @js.native
  object FileTypesNs extends js.Object {
    /**
      * A single Animation JSON File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#animation method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#animation.
      */
    @js.native
    class AnimationJSONFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.AnimationJSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataKey When the JSON file loads only this property will be stored in the Cache.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: JSONFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: JSONFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
    }
    
    /**
      * A single JSON based Texture Atlas File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#atlas method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#atlas.
      * 
      * https://www.codeandweb.com/texturepacker/tutorials/how-to-create-sprite-sheets-for-phaser3?source=photonstorm
      */
    @js.native
    class AtlasJSONFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.AtlasJSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
        * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AtlasJSONFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single XML based Texture Atlas File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#atlasXML method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#atlasXML.
      */
    @js.native
    class AtlasXMLFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.AtlasXMLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param atlasURL The absolute or relative URL to load the texture atlas xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
        * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
        * @param atlasXhrSettings An XHR Settings configuration object for the atlas xml file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AtlasXMLFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Audio File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
      */
    @js.native
    class AudioFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.AudioFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param urlConfig The absolute or relative URL to load this file from in a config object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param audioContext The AudioContext this file will use to process itself.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AudioFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, urlConfig: js.Any) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AudioFileConfig, urlConfig: js.Any) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
    }
    
    /**
      * An Audio Sprite File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#audioSprite method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audioSprite.
      */
    @js.native
    class AudioSpriteFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.AudioSpriteFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param jsonURL The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
        * @param audioURL The absolute or relative URL to load the audio file from. If empty it will be obtained by parsing the JSON file.
        * @param audioConfig The audio configuration options.
        * @param audioXhrSettings An XHR Settings configuration object for the audio file. Used in replacement of the Loaders default XHR Settings.
        * @param jsonXhrSettings An XHR Settings configuration object for the json file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, jsonURL: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Binary File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#binary method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#binary.
      */
    @js.native
    class BinaryFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.BinaryFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.bin`, i.e. if `key` was "alien" then the URL will be "alien.bin".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataType Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: BinaryFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: BinaryFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BinaryFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BinaryFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
    }
    
    /**
      * A single Bitmap Font based File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#bitmapFont method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#bitmapFont.
      */
    @js.native
    class BitmapFontFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.BitmapFontFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the font image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param fontDataURL The absolute or relative URL to load the font xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
        * @param textureXhrSettings An XHR Settings configuration object for the font image file. Used in replacement of the Loaders default XHR Settings.
        * @param fontDataXhrSettings An XHR Settings configuration object for the font data xml file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: BitmapFontFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single CSS File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#css method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#css.
      */
    @js.native
    class CSSFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.CSSFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: CSSFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: CSSFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: CSSFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single GLSL File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#glsl method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#glsl.
      */
    @js.native
    class GLSLFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.GLSLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
        * @param shaderType The type of shader. Either `fragment` for a fragment shader, or `vertex` for a vertex shader. This is ignored if you load a shader bundle. Default 'fragment'.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: GLSLFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: GLSLFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        shaderType: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: GLSLFileConfig,
        url: String,
        shaderType: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: GLSLFileConfig,
        url: String,
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Audio File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
      */
    @js.native
    class HTML5AudioFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.HTML5AudioFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param urlConfig The absolute or relative URL to load this file from.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AudioFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, urlConfig: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: AudioFileConfig, urlConfig: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        urlConfig: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single HTML File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#html method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#html.
      */
    @js.native
    class HTMLFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.HTMLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.html".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: HTMLFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: HTMLFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: HTMLFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single HTML File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#htmlTexture method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#htmlTexture.
      */
    @js.native
    class HTMLTextureFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.HTMLTextureFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param width The width of the texture the HTML will be rendered to.
        * @param height The height of the texture the HTML will be rendered to.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: HTMLTextureFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: HTMLTextureFileConfig, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String, width: integer) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        width: integer,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Image File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#image method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#image.
      */
    @js.native
    class ImageFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.ImageFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param frameConfig The frame configuration object. Only provided for, and used by, Sprite Sheets.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: ImageFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: js.Array[String]) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: ImageFileConfig, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: ImageFileConfig, url: js.Array[String]) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ImageFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ImageFileConfig,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ImageFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ImageFileConfig,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
    }
    
    /**
      * A single JSON File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#json method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#json.
      */
    @js.native
    class JSONFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.JSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataKey When the JSON file loads only this property will be stored in the Cache.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: JSONFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: JSONFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
    }
    
    /**
      * A single Multi Texture Atlas File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#multiatlas method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#multiatlas.
      */
    @js.native
    class MultiAtlasFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.MultiAtlasFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key of the file. Must be unique within both the Loader and the Texture Manager.
        * @param atlasURL The absolute or relative URL to load the multi atlas json file from.
        * @param path Optional path to use when loading the textures defined in the atlas data.
        * @param baseURL Optional Base URL to use when loading the textures defined in the atlas data.
        * @param atlasXhrSettings Extra XHR Settings specifically for the atlas json file.
        * @param textureXhrSettings Extra XHR Settings specifically for the texture files.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, atlasURL: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, atlasURL: String, path: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        atlasURL: String,
        path: String,
        baseURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        atlasURL: String,
        path: String,
        baseURL: String,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        atlasURL: String,
        path: String,
        baseURL: String,
        atlasXhrSettings: XHRSettingsObject,
        textureXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A Multi Script File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#scripts method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#scripts.
      */
    @js.native
    class MultiScriptFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.MultiScriptFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
        * @param xhrSettings An XHR Settings configuration object for the script files. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: MultiScriptFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: js.Array[String]) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: MultiScriptFileConfig,
        url: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: MultiScriptFileConfig,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single JSON Pack File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#pack method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#pack.
      */
    @js.native
    class PackFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.PackFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataKey When the JSON file loads only this property will be stored in the Cache.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: PackFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: PackFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: PackFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: PackFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
    }
    
    /**
      * A single Plugin Script File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#plugin method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#plugin.
      */
    @js.native
    class PluginFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.PluginFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param start Automatically start the plugin after loading? Default false.
        * @param mapping If this plugin is to be injected into the Scene, this is the property key used.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: PluginFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: PluginFileConfig, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String, start: Boolean) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        start: Boolean,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single SVG File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#svg method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#svg.
      */
    @js.native
    class SVGFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.SVGFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.svg`, i.e. if `key` was "alien" then the URL will be "alien.svg".
        * @param svgConfig The svg size configuration object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: SVGFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: SVGFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SVGFileConfig,
        url: String,
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SVGFileConfig,
        url: String,
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * An external Scene JavaScript File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#sceneFile method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#sceneFile.
      */
    @js.native
    class SceneFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.SceneFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: SceneFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: SceneFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SceneFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Scene Plugin Script File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#scenePlugin method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#scenePlugin.
      */
    @js.native
    class ScenePluginFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.ScenePluginFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param systemKey If this plugin is to be added to Scene.Systems, this is the property key for it.
        * @param sceneKey If this plugin is to be added to the Scene, this is the property key for it.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: ScenePluginFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: ScenePluginFileConfig, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String, systemKey: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        systemKey: String,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Script File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#script method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#script.
      */
    @js.native
    class ScriptFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.ScriptFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: ScriptFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: ScriptFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: ScriptFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Sprite Sheet Image File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#spritesheet method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#spritesheet.
      */
    @js.native
    class SpriteSheetFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.SpriteSheetFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param frameConfig The frame configuration object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: SpriteSheetFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: js.Array[String]) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: SpriteSheetFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: js.Array[String],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.Array[String],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: js.Array[String],
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String,
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.Array[String],
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Text File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#text method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#text.
      */
    @js.native
    class TextFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.TextFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TextFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TextFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: TextFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Tilemap CSV File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#tilemapCSV method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#tilemapCSV.
      */
    @js.native
    class TilemapCSVFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.TilemapCSVFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.csv`, i.e. if `key` was "alien" then the URL will be "alien.csv".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TilemapCSVFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TilemapCSVFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: TilemapCSVFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Impact.js Tilemap JSON File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#tilemapImpact method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#tilemapImpact.
      */
    @js.native
    class TilemapImpactFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.TilemapImpactFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TilemapImpactFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TilemapImpactFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: TilemapImpactFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Tiled Tilemap JSON File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#tilemapTiledJSON method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#tilemapTiledJSON.
      */
    @js.native
    class TilemapJSONFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.TilemapJSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TilemapJSONFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: TilemapJSONFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: TilemapJSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single text file based Unity Texture Atlas File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#unityAtlas method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#unityAtlas.
      */
    @js.native
    class UnityAtlasFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.UnityAtlasFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param atlasURL The absolute or relative URL to load the texture atlas data file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
        * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
        * @param atlasXhrSettings An XHR Settings configuration object for the atlas data file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: UnityAtlasFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single XML File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#xml method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#xml.
      */
    @js.native
    class XMLFile protected ()
      extends typings.phaser.PhaserNs.LoaderNs.FileTypesNs.XMLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: XMLFileConfig) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin, key: XMLFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.PhaserNs.LoaderNs.LoaderPlugin,
        key: XMLFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
  }
  
}

