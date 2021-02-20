package typings.phaser.global.Phaser

import typings.phaser.Phaser.Loader.FileTypes.SpineFileConfig
import typings.phaser.Phaser.Types.Loader.FileConfig
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
import typings.std.AudioContext
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Loader {
  
  @JSGlobal("Phaser.Loader")
  @js.native
  val ^ : js.Any = js.native
  
  object Events {
    
    /**
      * The Loader Plugin Add File Event.
      * 
      * This event is dispatched when a new file is successfully added to the Loader and placed into the load queue.
      * 
      * Listen to it from a Scene using: `this.load.on('addfile', listener)`.
      * 
      * If you add lots of files to a Loader from a `preload` method, it will dispatch this event for each one of them.
      */
    @JSGlobal("Phaser.Loader.Events.ADD")
    @js.native
    val ADD: js.Any = js.native
    
    /**
      * The Loader Plugin Complete Event.
      * 
      * This event is dispatched when the Loader has fully processed everything in the load queue.
      * By this point every loaded file will now be in its associated cache and ready for use.
      * 
      * Listen to it from a Scene using: `this.load.on('complete', listener)`.
      */
    @JSGlobal("Phaser.Loader.Events.COMPLETE")
    @js.native
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
    @JSGlobal("Phaser.Loader.Events.FILE_COMPLETE")
    @js.native
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
    @JSGlobal("Phaser.Loader.Events.FILE_KEY_COMPLETE")
    @js.native
    val FILE_KEY_COMPLETE: js.Any = js.native
    
    /**
      * The File Load Event.
      * 
      * This event is dispatched by the Loader Plugin when a file finishes loading,
      * but _before_ it is processed and added to the internal Phaser caches.
      * 
      * Listen to it from a Scene using: `this.load.on('load', listener)`.
      */
    @JSGlobal("Phaser.Loader.Events.FILE_LOAD")
    @js.native
    val FILE_LOAD: js.Any = js.native
    
    /**
      * The File Load Error Event.
      * 
      * This event is dispatched by the Loader Plugin when a file fails to load.
      * 
      * Listen to it from a Scene using: `this.load.on('loaderror', listener)`.
      */
    @JSGlobal("Phaser.Loader.Events.FILE_LOAD_ERROR")
    @js.native
    val FILE_LOAD_ERROR: js.Any = js.native
    
    /**
      * The File Load Progress Event.
      * 
      * This event is dispatched by the Loader Plugin during the load of a file, if the browser receives a DOM ProgressEvent and
      * the `lengthComputable` event property is true. Depending on the size of the file and browser in use, this may, or may not happen.
      * 
      * Listen to it from a Scene using: `this.load.on('fileprogress', listener)`.
      */
    @JSGlobal("Phaser.Loader.Events.FILE_PROGRESS")
    @js.native
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
    @JSGlobal("Phaser.Loader.Events.POST_PROCESS")
    @js.native
    val POST_PROCESS: js.Any = js.native
    
    /**
      * The Loader Plugin Progress Event.
      * 
      * This event is dispatched when the Loader updates its load progress, typically as a result of a file having completed loading.
      * 
      * Listen to it from a Scene using: `this.load.on('progress', listener)`.
      */
    @JSGlobal("Phaser.Loader.Events.PROGRESS")
    @js.native
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
    @JSGlobal("Phaser.Loader.Events.START")
    @js.native
    val START: js.Any = js.native
  }
  
  /**
    * File has finished processing.
    */
  @JSGlobal("Phaser.Loader.FILE_COMPLETE")
  @js.native
  def FILE_COMPLETE: integer = js.native
  @scala.inline
  def FILE_COMPLETE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_COMPLETE")(x.asInstanceOf[js.Any])
  
  /**
    * File has been destroyed
    */
  @JSGlobal("Phaser.Loader.FILE_DESTROYED")
  @js.native
  def FILE_DESTROYED: integer = js.native
  @scala.inline
  def FILE_DESTROYED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_DESTROYED")(x.asInstanceOf[js.Any])
  
  /**
    * The File has errored somehow during processing.
    */
  @JSGlobal("Phaser.Loader.FILE_ERRORED")
  @js.native
  def FILE_ERRORED: integer = js.native
  @scala.inline
  def FILE_ERRORED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_ERRORED")(x.asInstanceOf[js.Any])
  
  /**
    * File failed to load
    */
  @JSGlobal("Phaser.Loader.FILE_FAILED")
  @js.native
  def FILE_FAILED: integer = js.native
  @scala.inline
  def FILE_FAILED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_FAILED")(x.asInstanceOf[js.Any])
  
  /**
    * File has loaded successfully, awaiting processing
    */
  @JSGlobal("Phaser.Loader.FILE_LOADED")
  @js.native
  def FILE_LOADED: integer = js.native
  @scala.inline
  def FILE_LOADED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_LOADED")(x.asInstanceOf[js.Any])
  
  /**
    * File has been started to load by the loader (onLoad called)
    */
  @JSGlobal("Phaser.Loader.FILE_LOADING")
  @js.native
  def FILE_LOADING: integer = js.native
  @scala.inline
  def FILE_LOADING_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * File is in the load queue but not yet started
    */
  @JSGlobal("Phaser.Loader.FILE_PENDING")
  @js.native
  def FILE_PENDING: integer = js.native
  @scala.inline
  def FILE_PENDING_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_PENDING")(x.asInstanceOf[js.Any])
  
  /**
    * File was populated from local data and doesn't need an HTTP request
    */
  @JSGlobal("Phaser.Loader.FILE_POPULATED")
  @js.native
  def FILE_POPULATED: integer = js.native
  @scala.inline
  def FILE_POPULATED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_POPULATED")(x.asInstanceOf[js.Any])
  
  /**
    * File is being processed (onProcess callback)
    */
  @JSGlobal("Phaser.Loader.FILE_PROCESSING")
  @js.native
  def FILE_PROCESSING: integer = js.native
  @scala.inline
  def FILE_PROCESSING_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_PROCESSING")(x.asInstanceOf[js.Any])
  
  /**
    * The base File class used by all File Types that the Loader can support.
    * You shouldn't create an instance of a File directly, but should extend it with your own class, setting a custom type and processing methods.
    */
  @JSGlobal("Phaser.Loader.File")
  @js.native
  class File protected ()
    extends typings.phaser.Phaser.Loader.File {
    /**
      * 
      * @param loader The Loader that is going to load this File.
      * @param fileConfig The file configuration object, as created by the file type.
      */
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, fileConfig: FileConfig) = this()
  }
  object File {
    
    /**
      * Static method for creating object URL using URL API and setting it as image 'src' attribute.
      * If URL API is not supported (usually on old browsers) it falls back to creating Base64 encoded url using FileReader.
      * @param image Image object which 'src' attribute should be set to object URL.
      * @param blob A Blob object to create an object URL for.
      * @param defaultType Default mime type used if blob type is not available.
      */
    /* static member */
    @JSGlobal("Phaser.Loader.File.createObjectURL")
    @js.native
    def createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String): Unit = js.native
    
    /**
      * Static method for releasing an existing object URL which was previously created
      * by calling {@link File#createObjectURL} method.
      * @param image Image object which 'src' attribute should be revoked.
      */
    /* static member */
    @JSGlobal("Phaser.Loader.File.revokeObjectURL")
    @js.native
    def revokeObjectURL(image: HTMLImageElement): Unit = js.native
  }
  
  object FileTypes {
    
    /**
      * A single Animation JSON File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#animation method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#animation.
      */
    @JSGlobal("Phaser.Loader.FileTypes.AnimationJSONFile")
    @js.native
    class AnimationJSONFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.AnimationJSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataKey When the JSON file loads only this property will be stored in the Cache.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: JSONFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: JSONFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.AtlasJSONFile")
    @js.native
    class AtlasJSONFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.AtlasJSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
        * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
        * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String | AtlasJSONFileConfig,
        textureURL: js.UndefOr[String | js.Array[String]],
        atlasURL: js.UndefOr[js.Object | String],
        textureXhrSettings: js.UndefOr[XHRSettingsObject],
        atlasXhrSettings: js.UndefOr[XHRSettingsObject]
      ) = this()
    }
    
    /**
      * A single XML based Texture Atlas File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#atlasXML method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#atlasXML.
      */
    @JSGlobal("Phaser.Loader.FileTypes.AtlasXMLFile")
    @js.native
    class AtlasXMLFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.AtlasXMLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param atlasURL The absolute or relative URL to load the texture atlas xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
        * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
        * @param atlasXhrSettings An XHR Settings configuration object for the atlas xml file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AtlasXMLFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.AudioFile")
    @js.native
    class AudioFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.AudioFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param urlConfig The absolute or relative URL to load this file from in a config object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param audioContext The AudioContext this file will use to process itself.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AudioFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urlConfig: js.Any) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AudioFileConfig, urlConfig: js.Any) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.Any,
        xhrSettings: js.UndefOr[scala.Nothing],
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.Any,
        xhrSettings: js.UndefOr[scala.Nothing],
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.AudioSpriteFile")
    @js.native
    class AudioSpriteFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.AudioSpriteFile {
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
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, jsonURL: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any,
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any,
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.UndefOr[scala.Nothing],
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.UndefOr[scala.Nothing],
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: js.UndefOr[scala.Nothing],
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.BinaryFile")
    @js.native
    class BinaryFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.BinaryFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.bin`, i.e. if `key` was "alien" then the URL will be "alien.bin".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataType Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: BinaryFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: BinaryFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.BitmapFontFile")
    @js.native
    class BitmapFontFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.BitmapFontFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the font image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param fontDataURL The absolute or relative URL to load the font xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
        * @param textureXhrSettings An XHR Settings configuration object for the font image file. Used in replacement of the Loaders default XHR Settings.
        * @param fontDataXhrSettings An XHR Settings configuration object for the font data xml file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: BitmapFontFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: BitmapFontFileConfig, textureURL: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.CSSFile")
    @js.native
    class CSSFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.CSSFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: CSSFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: CSSFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: CSSFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.GLSLFile")
    @js.native
    class GLSLFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.GLSLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
        * @param shaderType The type of shader. Either `fragment` for a fragment shader, or `vertex` for a vertex shader. This is ignored if you load a shader bundle. Default 'fragment'.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: GLSLFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: GLSLFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        shaderType: String
      ) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, shaderType: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: js.UndefOr[scala.Nothing],
        shaderType: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: String,
        shaderType: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        shaderType: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        shaderType: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: js.UndefOr[scala.Nothing],
        shaderType: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: js.UndefOr[scala.Nothing],
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: String,
        shaderType: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.HTML5AudioFile")
    @js.native
    class HTML5AudioFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.HTML5AudioFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param urlConfig The absolute or relative URL to load this file from.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AudioFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urlConfig: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AudioFileConfig, urlConfig: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.HTMLFile")
    @js.native
    class HTMLFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.HTMLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.html".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: HTMLFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: HTMLFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.HTMLTextureFile")
    @js.native
    class HTMLTextureFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.HTMLTextureFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param width The width of the texture the HTML will be rendered to.
        * @param height The height of the texture the HTML will be rendered to.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: HTMLTextureFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: HTMLTextureFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        width: integer
      ) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, width: integer) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: js.UndefOr[scala.Nothing],
        width: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        width: js.UndefOr[scala.Nothing],
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: js.UndefOr[scala.Nothing],
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: js.UndefOr[scala.Nothing],
        width: js.UndefOr[scala.Nothing],
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: js.UndefOr[scala.Nothing],
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: js.UndefOr[scala.Nothing],
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        width: js.UndefOr[scala.Nothing],
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        width: js.UndefOr[scala.Nothing],
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        width: integer,
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        width: integer,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: js.UndefOr[scala.Nothing],
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: js.UndefOr[scala.Nothing],
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: integer,
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: integer,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: js.UndefOr[scala.Nothing],
        width: js.UndefOr[scala.Nothing],
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: js.UndefOr[scala.Nothing],
        width: js.UndefOr[scala.Nothing],
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: js.UndefOr[scala.Nothing],
        width: integer,
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: js.UndefOr[scala.Nothing],
        width: integer,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: js.UndefOr[scala.Nothing],
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: js.UndefOr[scala.Nothing],
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer,
        height: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.ImageFile")
    @js.native
    class ImageFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.ImageFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param frameConfig The frame configuration object. Only provided for, and used by, Sprite Sheets.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ImageFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: js.Array[String]) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ImageFileConfig, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ImageFileConfig, url: js.Array[String]) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Array[String],
        xhrSettings: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: js.Array[String],
        xhrSettings: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.JSONFile")
    @js.native
    class JSONFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.JSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, can be a fully formed JSON Object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataKey When the JSON file loads only this property will be stored in the Cache.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: JSONFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: js.Object) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: JSONFileConfig, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: JSONFileConfig, url: js.Object) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Object,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.Object,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Object,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Object,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.Object,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.Object,
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
    @JSGlobal("Phaser.Loader.FileTypes.MultiAtlasFile")
    @js.native
    class MultiAtlasFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.MultiAtlasFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key of the file. Must be unique within both the Loader and the Texture Manager. Or a config object.
        * @param atlasURL The absolute or relative URL to load the multi atlas json file from.
        * @param path Optional path to use when loading the textures defined in the atlas data.
        * @param baseURL Optional Base URL to use when loading the textures defined in the atlas data.
        * @param atlasXhrSettings Extra XHR Settings specifically for the atlas json file.
        * @param textureXhrSettings Extra XHR Settings specifically for the texture files.
        */
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String | MultiAtlasFileConfig,
        atlasURL: js.UndefOr[String],
        path: js.UndefOr[String],
        baseURL: js.UndefOr[String],
        atlasXhrSettings: js.UndefOr[XHRSettingsObject],
        textureXhrSettings: js.UndefOr[XHRSettingsObject]
      ) = this()
    }
    
    /**
      * A Multi Script File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#scripts method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#scripts.
      */
    @JSGlobal("Phaser.Loader.FileTypes.MultiScriptFile")
    @js.native
    class MultiScriptFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.MultiScriptFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
        * @param xhrSettings An XHR Settings configuration object for the script files. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: MultiScriptFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: js.Array[String]) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: MultiScriptFileConfig,
        url: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: MultiScriptFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.PackFile")
    @js.native
    class PackFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.PackFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        * @param dataKey When the JSON file loads only this property will be stored in the Cache.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: PackFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: PackFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: String,
        xhrSettings: js.UndefOr[scala.Nothing],
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.PluginFile")
    @js.native
    class PluginFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.PluginFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param start Automatically start the plugin after loading? Default false.
        * @param mapping If this plugin is to be injected into the Scene, this is the property key used.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: PluginFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: PluginFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        start: Boolean
      ) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, start: Boolean) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        start: Boolean
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        start: js.UndefOr[scala.Nothing],
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: js.UndefOr[scala.Nothing],
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        start: js.UndefOr[scala.Nothing],
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: js.UndefOr[scala.Nothing],
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        start: js.UndefOr[scala.Nothing],
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        start: js.UndefOr[scala.Nothing],
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        start: Boolean,
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        start: Boolean,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: js.UndefOr[scala.Nothing],
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: js.UndefOr[scala.Nothing],
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: Boolean,
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: Boolean,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        start: js.UndefOr[scala.Nothing],
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        start: js.UndefOr[scala.Nothing],
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        start: Boolean,
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        start: Boolean,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: js.UndefOr[scala.Nothing],
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: js.UndefOr[scala.Nothing],
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean,
        mapping: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.SVGFile")
    @js.native
    class SVGFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.SVGFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.svg`, i.e. if `key` was "alien" then the URL will be "alien.svg".
        * @param svgConfig The svg size configuration object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: SVGFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: SVGFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: js.UndefOr[scala.Nothing],
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: String,
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        svgConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        svgConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: js.UndefOr[scala.Nothing],
        svgConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: js.UndefOr[scala.Nothing],
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: String,
        svgConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.SceneFile")
    @js.native
    class SceneFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.SceneFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: SceneFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: SceneFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SceneFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.ScenePluginFile")
    @js.native
    class ScenePluginFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.ScenePluginFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param systemKey If this plugin is to be added to Scene.Systems, this is the property key for it.
        * @param sceneKey If this plugin is to be added to the Scene, this is the property key for it.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ScenePluginFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ScenePluginFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        systemKey: String
      ) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, systemKey: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        systemKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        systemKey: String,
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        systemKey: String,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: String,
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: String,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        systemKey: String,
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: js.UndefOr[scala.Nothing],
        systemKey: String,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: js.UndefOr[scala.Nothing],
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String,
        sceneKey: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.ScriptFile")
    @js.native
    class ScriptFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.ScriptFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ScriptFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ScriptFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScriptFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScriptFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
    
    @JSGlobal("Phaser.Loader.FileTypes.SpineFile")
    @js.native
    class SpineFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.SpineFile {
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        atlasURL: String,
        preMultipliedAlpha: Boolean,
        jsonXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: js.Array[String],
        atlasURL: String,
        preMultipliedAlpha: Boolean,
        jsonXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpineFileConfig,
        jsonURL: String,
        atlasURL: String,
        preMultipliedAlpha: Boolean,
        jsonXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpineFileConfig,
        jsonURL: js.Array[String],
        atlasURL: String,
        preMultipliedAlpha: Boolean,
        jsonXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Sprite Sheet Image File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#spritesheet method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#spritesheet.
      */
    @JSGlobal("Phaser.Loader.FileTypes.SpriteSheetFile")
    @js.native
    class SpriteSheetFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.SpriteSheetFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param frameConfig The frame configuration object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: SpriteSheetFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: js.Array[String]) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: SpriteSheetFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Array[String],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.Array[String],
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        frameConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        frameConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Array[String],
        frameConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Array[String],
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.UndefOr[scala.Nothing],
        frameConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.UndefOr[scala.Nothing],
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String,
        frameConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String,
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.Array[String],
        frameConfig: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.TextFile")
    @js.native
    class TextFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.TextFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TextFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TextFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TextFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.TilemapCSVFile")
    @js.native
    class TilemapCSVFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.TilemapCSVFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.csv`, i.e. if `key` was "alien" then the URL will be "alien.csv".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TilemapCSVFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TilemapCSVFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapCSVFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.TilemapImpactFile")
    @js.native
    class TilemapImpactFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.TilemapImpactFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TilemapImpactFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TilemapImpactFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapImpactFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
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
    @JSGlobal("Phaser.Loader.FileTypes.TilemapJSONFile")
    @js.native
    class TilemapJSONFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.TilemapJSONFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TilemapJSONFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: js.Object) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TilemapJSONFileConfig, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: TilemapJSONFileConfig, url: js.Object) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.Object,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapJSONFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapJSONFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapJSONFileConfig,
        url: js.Object,
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
    @JSGlobal("Phaser.Loader.FileTypes.UnityAtlasFile")
    @js.native
    class UnityAtlasFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.UnityAtlasFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
        * @param atlasURL The absolute or relative URL to load the texture atlas data file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
        * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
        * @param atlasXhrSettings An XHR Settings configuration object for the atlas data file. Used in replacement of the Loaders default XHR Settings.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: UnityAtlasFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String]
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.UndefOr[scala.Nothing],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: js.UndefOr[scala.Nothing],
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: js.UndefOr[scala.Nothing],
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
    }
    
    /**
      * A single Video File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#video method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#video.
      */
    @JSGlobal("Phaser.Loader.FileTypes.VideoFile")
    @js.native
    class VideoFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.VideoFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param urlConfig The absolute or relative URL to load this file from in a config object.
        * @param loadEvent The load event to listen for when _not_ loading as a blob. Either 'loadeddata', 'canplay' or 'canplaythrough'.
        * @param asBlob Load the video as a data blob, or via the Video element?
        * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it.
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String | VideoFileConfig,
        urlConfig: js.UndefOr[js.Any],
        loadEvent: js.UndefOr[String],
        asBlob: js.UndefOr[Boolean],
        noAudio: js.UndefOr[Boolean],
        xhrSettings: js.UndefOr[XHRSettingsObject]
      ) = this()
    }
    
    /**
      * A single XML File suitable for loading by the Loader.
      * 
      * These are created when you use the Phaser.Loader.LoaderPlugin#xml method and are not typically created directly.
      * 
      * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#xml.
      */
    @JSGlobal("Phaser.Loader.FileTypes.XMLFile")
    @js.native
    class XMLFile protected ()
      extends typings.phaser.Phaser.Loader.FileTypes.XMLFile {
      /**
        * 
        * @param loader A reference to the Loader that is responsible for this file.
        * @param key The key to use for this file, or a file configuration object.
        * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
        * @param xhrSettings Extra XHR Settings specifically for this file.
        */
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: XMLFileConfig) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: XMLFileConfig, url: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: XMLFileConfig,
        url: js.UndefOr[scala.Nothing],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: XMLFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
    }
  }
  
  object FileTypesManager {
    
    /**
      * Removed all associated file types.
      */
    @JSGlobal("Phaser.Loader.FileTypesManager.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /**
      * Static method called when a LoaderPlugin is created.
      * 
      * Loops through the local types object and injects all of them as
      * properties into the LoaderPlugin instance.
      * @param loader The LoaderPlugin to install the types into.
      */
    @JSGlobal("Phaser.Loader.FileTypesManager.install")
    @js.native
    def install(loader: typings.phaser.Phaser.Loader.LoaderPlugin): Unit = js.native
    
    /**
      * Static method called directly by the File Types.
      * 
      * The key is a reference to the function used to load the files via the Loader, i.e. `image`.
      * @param key The key that will be used as the method name in the LoaderPlugin.
      * @param factoryFunction The function that will be called when LoaderPlugin.key is invoked.
      */
    @JSGlobal("Phaser.Loader.FileTypesManager.register")
    @js.native
    def register(key: String, factoryFunction: js.Function): Unit = js.native
  }
  
  /**
    * Given a File and a baseURL value this returns the URL the File will use to download from.
    * @param file The File object.
    * @param baseURL A default base URL.
    */
  @JSGlobal("Phaser.Loader.GetURL")
  @js.native
  def GetURL(file: typings.phaser.Phaser.Loader.File, baseURL: String): String = js.native
  
  /**
    * The Loader has completed loading and processing.
    */
  @JSGlobal("Phaser.Loader.LOADER_COMPLETE")
  @js.native
  def LOADER_COMPLETE: integer = js.native
  @scala.inline
  def LOADER_COMPLETE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_COMPLETE")(x.asInstanceOf[js.Any])
  
  /**
    * The Loader has been destroyed.
    */
  @JSGlobal("Phaser.Loader.LOADER_DESTROYED")
  @js.native
  def LOADER_DESTROYED: integer = js.native
  @scala.inline
  def LOADER_DESTROYED_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_DESTROYED")(x.asInstanceOf[js.Any])
  
  /**
    * The Loader is idle.
    */
  @JSGlobal("Phaser.Loader.LOADER_IDLE")
  @js.native
  def LOADER_IDLE: integer = js.native
  @scala.inline
  def LOADER_IDLE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_IDLE")(x.asInstanceOf[js.Any])
  
  /**
    * The Loader is actively loading.
    */
  @JSGlobal("Phaser.Loader.LOADER_LOADING")
  @js.native
  def LOADER_LOADING: integer = js.native
  @scala.inline
  def LOADER_LOADING_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * The Loader is processing files is has loaded.
    */
  @JSGlobal("Phaser.Loader.LOADER_PROCESSING")
  @js.native
  def LOADER_PROCESSING: integer = js.native
  @scala.inline
  def LOADER_PROCESSING_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_PROCESSING")(x.asInstanceOf[js.Any])
  
  /**
    * The Loader is shutting down.
    */
  @JSGlobal("Phaser.Loader.LOADER_SHUTDOWN")
  @js.native
  def LOADER_SHUTDOWN: integer = js.native
  @scala.inline
  def LOADER_SHUTDOWN_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_SHUTDOWN")(x.asInstanceOf[js.Any])
  
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
  class LoaderPlugin protected ()
    extends typings.phaser.Phaser.Loader.LoaderPlugin {
    /**
      * 
      * @param scene The Scene which owns this Loader instance.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
  
  /**
    * Takes two XHRSettings Objects and creates a new XHRSettings object from them.
    * 
    * The new object is seeded by the values given in the global settings, but any setting in
    * the local object overrides the global ones.
    * @param global The global XHRSettings object.
    * @param local The local XHRSettings object.
    */
  @JSGlobal("Phaser.Loader.MergeXHRSettings")
  @js.native
  def MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject = js.native
  
  /**
    * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
    * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
    * 
    * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
    */
  @JSGlobal("Phaser.Loader.MultiFile")
  @js.native
  class MultiFile protected ()
    extends typings.phaser.Phaser.Loader.MultiFile {
    /**
      * 
      * @param loader The Loader that is going to load this File.
      * @param type The file type string for sorting within the Loader.
      * @param key The key of the file within the loader.
      * @param files An array of Files that make-up this MultiFile.
      */
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      `type`: String,
      key: String,
      files: js.Array[typings.phaser.Phaser.Loader.File]
    ) = this()
  }
  
  /**
    * Creates a new XMLHttpRequest (xhr) object based on the given File and XHRSettings
    * and starts the download of it. It uses the Files own XHRSettings and merges them
    * with the global XHRSettings object to set the xhr values before download.
    * @param file The File to download.
    * @param globalXHRSettings The global XHRSettings object.
    */
  @JSGlobal("Phaser.Loader.XHRLoader")
  @js.native
  def XHRLoader(file: typings.phaser.Phaser.Loader.File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = js.native
  
  /**
    * Creates an XHRSettings Object with default values.
    * @param responseType The responseType, such as 'text'. Default ''.
    * @param async Should the XHR request use async or not? Default true.
    * @param user Optional username for the XHR request. Default ''.
    * @param password Optional password for the XHR request. Default ''.
    * @param timeout Optional XHR timeout value. Default 0.
    * @param withCredentials Optional XHR withCredentials value. Default false.
    */
  @JSGlobal("Phaser.Loader.XHRSettings")
  @js.native
  def XHRSettings(
    responseType: js.UndefOr[XMLHttpRequestResponseType],
    async: js.UndefOr[Boolean],
    user: js.UndefOr[String],
    password: js.UndefOr[String],
    timeout: js.UndefOr[integer],
    withCredentials: js.UndefOr[Boolean]
  ): XHRSettingsObject = js.native
}
