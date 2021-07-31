package typings.phaser.global.Phaser

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Loader.FileTypes.SpineFileConfig
import typings.phaser.Phaser.Textures.TextureManager
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
import typings.std.EventTarget
import typings.std.HTMLImageElement
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    extends StObject
       with typings.phaser.Phaser.Loader.File {
    /**
      * 
      * @param loader The Loader that is going to load this File.
      * @param fileConfig The file configuration object, as created by the file type.
      */
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, fileConfig: FileConfig) = this()
    
    /**
      * Adds this file to its target cache upon successful loading and processing.
      * This method is often overridden by specific file types.
      */
    /* CompleteClass */
    override def addToCache(): Unit = js.native
    
    /**
      * Updated as the file loads.
      * Only set if loading via XHR.
      */
    /* CompleteClass */
    var bytesLoaded: Double = js.native
    
    /**
      * The total size of this file.
      * Set by onProgress and only if loading via XHR.
      */
    /* CompleteClass */
    var bytesTotal: Double = js.native
    
    /**
      * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
      */
    /* CompleteClass */
    var cache: BaseCache | TextureManager = js.native
    
    /**
      * A config object that can be used by file types to store transitional data.
      */
    /* CompleteClass */
    var config: js.Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: js.Any = js.native
    
    /**
      * Destroy this File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Checks if a key matching the one used by this file exists in the target Cache or not.
      * This is called automatically by the LoaderPlugin to decide if the file can be safely
      * loaded or will conflict.
      */
    /* CompleteClass */
    override def hasCacheConflict(): Boolean = js.native
    
    /**
      * Unique cache key (unique within its file type)
      */
    /* CompleteClass */
    var key: String = js.native
    
    /**
      * Does this file have an associated linked file? Such as an image and a normal map.
      * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
      * actually bound by data, where-as a linkFile is.
      */
    /* CompleteClass */
    var linkFile: typings.phaser.Phaser.Loader.File = js.native
    
    /**
      * Called by the Loader, starts the actual file downloading.
      * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
      * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
      */
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /**
      * A reference to the Loader that is going to load this file.
      */
    /* CompleteClass */
    var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
    
    /**
      * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
      * to the parent MultiFile. Set and used internally by the Loader or specific file types.
      */
    /* CompleteClass */
    var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
    
    /**
      * Called if the file errors while loading, is sent a DOM ProgressEvent.
      * @param xhr The XMLHttpRequest that caused this onload event.
      * @param event The DOM ProgressEvent that resulted from this error.
      */
    /* CompleteClass */
    override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
    
    /**
      * Called when the file finishes loading, is sent a DOM ProgressEvent.
      * @param xhr The XMLHttpRequest that caused this onload event.
      * @param event The DOM ProgressEvent that resulted from this load.
      */
    /* CompleteClass */
    override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
    
    /**
      * Usually overridden by the FileTypes and is called by Loader.nextFile.
      * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
      */
    /* CompleteClass */
    override def onProcess(): Unit = js.native
    
    /**
      * Called when the File has completed processing.
      * Checks on the state of its multifile, if set.
      */
    /* CompleteClass */
    override def onProcessComplete(): Unit = js.native
    
    /**
      * Called when the File has completed processing but it generated an error.
      * Checks on the state of its multifile, if set.
      */
    /* CompleteClass */
    override def onProcessError(): Unit = js.native
    
    /**
      * Called during the file load progress. Is sent a DOM ProgressEvent.
      * @param event The DOM ProgressEvent.
      */
    /* CompleteClass */
    override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
    
    /**
      * Called once the file has been added to its cache and is now ready for deletion from the Loader.
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A percentage value between 0 and 1 indicating how much of this file has loaded.
      * Only set if loading via XHR.
      */
    /* CompleteClass */
    var percentComplete: Double = js.native
    
    /**
      * Resets the XHRLoader instance this file is using.
      */
    /* CompleteClass */
    override def resetXHR(): Unit = js.native
    
    /**
      * Links this File with another, so they depend upon each other for loading and processing.
      * @param fileB The file to link to this one.
      */
    /* CompleteClass */
    override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
    
    /**
      * The final URL this file will load from, including baseURL and path.
      * Set automatically when the Loader calls 'load' on this file.
      */
    /* CompleteClass */
    var src: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: integer = js.native
    
    /**
      * The file type string (image, json, etc) for sorting within the Loader.
      */
    /* CompleteClass */
    var `type`: String = js.native
    
    /**
      * The URL of the file, not including baseURL.
      * 
      * Automatically has Loader.path prepended to it if a string.
      * 
      * Can also be a JavaScript Object, such as the results of parsing JSON data.
      */
    /* CompleteClass */
    var url: js.Object | String = js.native
    
    /**
      * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
      */
    /* CompleteClass */
    var xhrLoader: XMLHttpRequest = js.native
    
    /**
      * The merged XHRSettings for this file.
      */
    /* CompleteClass */
    var xhrSettings: XHRSettingsObject = js.native
  }
  object File {
    
    @JSGlobal("Phaser.Loader.File")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Static method for creating object URL using URL API and setting it as image 'src' attribute.
      * If URL API is not supported (usually on old browsers) it falls back to creating Base64 encoded url using FileReader.
      * @param image Image object which 'src' attribute should be set to object URL.
      * @param blob A Blob object to create an object URL for.
      * @param defaultType Default mime type used if blob type is not available.
      */
    /* static member */
    @scala.inline
    def createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(image.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Static method for releasing an existing object URL which was previously created
      * by calling {@link File#createObjectURL} method.
      * @param image Image object which 'src' attribute should be revoked.
      */
    /* static member */
    @scala.inline
    def revokeObjectURL(image: HTMLImageElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(image.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.AnimationJSONFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
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
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: Unit,
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
        url: Unit,
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: Unit,
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
        url: Unit,
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called at the end of the load process, after the Loader has finished all files in its queue.
        */
      /* CompleteClass */
      override def onLoadComplete(): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.AtlasJSONFile {
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
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.AtlasXMLFile {
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
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: Unit, atlasURL: String) = this()
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
        key: AtlasXMLFileConfig,
        textureURL: Unit,
        atlasURL: String
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
        textureURL: String,
        atlasURL: Unit,
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
        key: String,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: Unit,
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
        textureURL: String,
        atlasURL: Unit,
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
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: Unit,
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
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: Unit,
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
        key: String,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: Unit,
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
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.AudioFile {
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
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: Unit,
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
        key: AudioFileConfig,
        urlConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: js.Any,
        xhrSettings: Unit,
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
        key: String,
        urlConfig: Unit,
        xhrSettings: Unit,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: Unit,
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.Any,
        xhrSettings: Unit,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: js.Any,
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: Unit,
        xhrSettings: Unit,
        audioContext: AudioContext
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: Unit,
        xhrSettings: XHRSettingsObject,
        audioContext: AudioContext
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.AudioSpriteFile {
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
        audioURL: js.Object,
        audioConfig: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Unit,
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
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: js.Any
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
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: Unit,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: Unit,
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
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: Unit,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: Unit,
        audioXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: Unit,
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
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: Unit,
        audioXhrSettings: Unit,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: Unit,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: js.Any,
        audioXhrSettings: Unit,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: Unit,
        audioXhrSettings: Unit,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: Unit,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: js.Any,
        audioXhrSettings: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: Unit,
        audioXhrSettings: Unit,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: js.Object,
        audioConfig: Unit,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: js.Any,
        audioXhrSettings: Unit,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: js.Any,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: Unit,
        audioXhrSettings: Unit,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Unit,
        audioConfig: Unit,
        audioXhrSettings: XHRSettingsObject,
        jsonXhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.BinaryFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
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
        key: BinaryFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: Unit,
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
        key: String,
        url: Unit,
        xhrSettings: Unit,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: String,
        xhrSettings: Unit,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: Unit,
        xhrSettings: Unit,
        dataType: js.Any
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BinaryFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataType: js.Any
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.BitmapFontFile {
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
        key: String,
        textureURL: Unit,
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
        key: BitmapFontFileConfig,
        textureURL: Unit,
        fontDataURL: String
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
        textureURL: String,
        fontDataURL: Unit,
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
        key: String,
        textureURL: js.Array[String],
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        fontDataURL: Unit,
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
        textureURL: String,
        fontDataURL: Unit,
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
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Unit,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Unit,
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: Unit,
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
        textureURL: String,
        fontDataURL: Unit,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: Unit,
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
        key: String,
        textureURL: js.Array[String],
        fontDataURL: Unit,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        fontDataURL: String,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        fontDataURL: Unit,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: String,
        textureXhrSettings: Unit,
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
        textureURL: String,
        fontDataURL: Unit,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String,
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: String,
        textureXhrSettings: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: Unit,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: js.Array[String],
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Unit,
        fontDataURL: String,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Unit,
        fontDataURL: String,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Unit,
        fontDataURL: Unit,
        textureXhrSettings: Unit,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Unit,
        fontDataURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        fontDataXhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.CSSFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: CSSFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: CSSFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.GLSLFile {
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
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, shaderType: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: Unit, shaderType: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: String,
        shaderType: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: Unit,
        shaderType: String
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
        key: String,
        url: String,
        shaderType: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        shaderType: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: String,
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: String,
        shaderType: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: Unit,
        shaderType: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: GLSLFileConfig,
        url: Unit,
        shaderType: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Returns the name of the shader from the header block.
        * @param headerSource The header data.
        */
      /* CompleteClass */
      override def getShaderName(headerSource: js.Array[String]): String = js.native
      
      /**
        * Returns the type of the shader from the header block.
        * @param headerSource The header data.
        */
      /* CompleteClass */
      override def getShaderType(headerSource: js.Array[String]): String = js.native
      
      /**
        * Returns the shader uniforms from the header block.
        * @param headerSource The header data.
        */
      /* CompleteClass */
      override def getShaderUniforms(headerSource: js.Array[String]): js.Any = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.HTML5AudioFile {
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
        urlConfig: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        urlConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading.
        */
      /* CompleteClass */
      override def onError(): Unit = js.native
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading.
        */
      /* CompleteClass */
      override def onLoad(): Unit = js.native
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(): Unit = js.native
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.HTMLFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.HTMLTextureFile {
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
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, width: integer) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: Unit, width: integer) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: Unit,
        width: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: Unit,
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
        key: String,
        url: Unit,
        width: Unit,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: Unit,
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
        key: HTMLTextureFileConfig,
        url: Unit,
        width: Unit,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: Unit,
        width: integer,
        height: integer
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: Unit,
        height: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: Unit,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        width: integer,
        height: Unit,
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
        key: String,
        url: Unit,
        width: Unit,
        height: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        width: Unit,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        width: integer,
        height: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        width: integer,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: Unit,
        height: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: Unit,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String,
        width: integer,
        height: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: Unit,
        width: Unit,
        height: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: Unit,
        width: Unit,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: Unit,
        width: integer,
        height: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: Unit,
        width: integer,
        height: integer,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.ImageFile {
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
        key: String,
        url: Unit,
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
        key: ImageFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: Unit,
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
        xhrSettings: Unit,
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
        key: String,
        url: Unit,
        xhrSettings: Unit,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: String,
        xhrSettings: Unit,
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
        xhrSettings: Unit,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: Unit,
        xhrSettings: Unit,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ImageFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        frameConfig: ImageFrameConfig
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.JSONFile {
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
        key: String,
        url: Unit,
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
        key: JSONFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: Unit,
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
        xhrSettings: Unit,
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
        key: String,
        url: Unit,
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: String,
        xhrSettings: Unit,
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
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: js.Object,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: Unit,
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: JSONFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.MultiAtlasFile {
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
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.MultiScriptFile {
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
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: MultiScriptFileConfig,
        url: js.Array[String],
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: MultiScriptFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.PackFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
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
        key: PackFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        xhrSettings: Unit,
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
        url: Unit,
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: String,
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: Unit,
        xhrSettings: Unit,
        dataKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PackFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject,
        dataKey: String
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.PluginFile {
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
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, start: Boolean) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: Unit, start: Boolean) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: Unit,
        start: Boolean
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
        key: String,
        url: String,
        start: Unit,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        start: Unit,
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
        key: PluginFileConfig,
        url: String,
        start: Unit,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: Unit,
        start: Boolean,
        mapping: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: Unit,
        start: Unit,
        mapping: String
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
        key: String,
        url: String,
        start: Boolean,
        mapping: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: Unit,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        start: Unit,
        mapping: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        start: Boolean,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        start: Boolean,
        mapping: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        start: Unit,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        start: Unit,
        mapping: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Boolean,
        mapping: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Unit,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: String,
        start: Unit,
        mapping: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: Unit,
        start: Boolean,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: Unit,
        start: Boolean,
        mapping: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: Unit,
        start: Unit,
        mapping: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: PluginFileConfig,
        url: Unit,
        start: Unit,
        mapping: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.SVGFile {
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
        url: String,
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
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
        key: SVGFileConfig,
        url: Unit,
        svgConfig: SVGSizeConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        svgConfig: Unit,
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
        key: String,
        url: Unit,
        svgConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: String,
        svgConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: String,
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: Unit,
        svgConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SVGFileConfig,
        url: Unit,
        svgConfig: SVGSizeConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.SceneFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SceneFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SceneFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.ScenePluginFile {
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
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, systemKey: String) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: Unit, systemKey: String) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: Unit,
        systemKey: String
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
        key: String,
        url: String,
        systemKey: Unit,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        systemKey: Unit,
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
        key: ScenePluginFileConfig,
        url: String,
        systemKey: Unit,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: Unit,
        systemKey: String,
        sceneKey: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: Unit,
        systemKey: Unit,
        sceneKey: String
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
        key: String,
        url: String,
        systemKey: String,
        sceneKey: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: Unit,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        systemKey: Unit,
        sceneKey: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        systemKey: String,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        systemKey: String,
        sceneKey: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        systemKey: Unit,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        systemKey: Unit,
        sceneKey: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: String,
        sceneKey: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: Unit,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String,
        systemKey: Unit,
        sceneKey: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: Unit,
        systemKey: String,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: Unit,
        systemKey: String,
        sceneKey: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: Unit,
        systemKey: Unit,
        sceneKey: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScenePluginFileConfig,
        url: Unit,
        systemKey: Unit,
        sceneKey: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.ScriptFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScriptFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: ScriptFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
    }
    
    @JSGlobal("Phaser.Loader.FileTypes.SpineFile")
    @js.native
    class SpineFile protected ()
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.SpineFile {
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
      
      /* CompleteClass */
      override def addToCache(): js.Any = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.SpriteSheetFile {
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
        key: String,
        url: Unit,
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
        key: SpriteSheetFileConfig,
        url: Unit,
        frameConfig: ImageFrameConfig
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: String,
        frameConfig: Unit,
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
        frameConfig: Unit,
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
        key: String,
        url: Unit,
        frameConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String,
        frameConfig: Unit,
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
        frameConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: js.Array[String],
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: Unit,
        frameConfig: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: Unit,
        frameConfig: ImageFrameConfig,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.TextFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TextFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TextFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.TilemapCSVFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapCSVFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapCSVFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.TilemapImpactFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapImpactFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapImpactFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.TilemapJSONFile {
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
        key: String,
        url: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: TilemapJSONFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.UnityAtlasFile {
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
        textureURL: String,
        atlasURL: String
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String
      ) = this()
      def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: Unit, atlasURL: String) = this()
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
        key: UnityAtlasFileConfig,
        textureURL: Unit,
        atlasURL: String
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
        textureURL: String,
        atlasURL: Unit,
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
        key: String,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: Unit,
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
        textureURL: String,
        atlasURL: Unit,
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
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: Unit,
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
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: Unit,
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
        key: String,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: String,
        textureXhrSettings: Unit,
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
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: String,
        textureXhrSettings: Unit,
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
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: js.Array[String],
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Unit,
        atlasURL: String,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: Unit,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Unit,
        atlasURL: Unit,
        textureXhrSettings: XHRSettingsObject,
        atlasXhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Adds another child to this MultiFile, increases the pending count and resets the completion status.
        * @param files The File to add to this MultiFile.
        */
      /* CompleteClass */
      override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * A reference to the Loaders baseURL at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var baseURL: String = js.native
      
      /**
        * The completion status of this MultiFile.
        */
      /* CompleteClass */
      var complete: Boolean = js.native
      
      /**
        * A storage container for transient data that the loading files need.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The number of files that failed to load.
        */
      /* CompleteClass */
      var failed: integer = js.native
      
      /**
        * Array of files that make up this MultiFile.
        */
      /* CompleteClass */
      var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
      
      /**
        * Checks if this MultiFile is ready to process its children or not.
        */
      /* CompleteClass */
      override def isReadyToProcess(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * Called by each File when it finishes loading.
        * @param file The File that has completed processing.
        */
      /* CompleteClass */
      override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * Called by each File that fails to load.
        * @param file The File that has failed to load.
        */
      /* CompleteClass */
      override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * A reference to the Loaders path at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * The number of files to load.
        */
      /* CompleteClass */
      var pending: integer = js.native
      
      /**
        * A reference to the Loaders prefix at the time this MultiFile was created.
        * Used to populate child-files.
        */
      /* CompleteClass */
      var prefix: String = js.native
      
      /**
        * The file type string for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.VideoFile {
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
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
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
      extends StObject
         with typings.phaser.Phaser.Loader.FileTypes.XMLFile {
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
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: String,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: XMLFileConfig,
        url: String,
        xhrSettings: XHRSettingsObject
      ) = this()
      def this(
        loader: typings.phaser.Phaser.Loader.LoaderPlugin,
        key: XMLFileConfig,
        url: Unit,
        xhrSettings: XHRSettingsObject
      ) = this()
      
      /**
        * Adds this file to its target cache upon successful loading and processing.
        * This method is often overridden by specific file types.
        */
      /* CompleteClass */
      override def addToCache(): Unit = js.native
      
      /**
        * Updated as the file loads.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var bytesLoaded: Double = js.native
      
      /**
        * The total size of this file.
        * Set by onProgress and only if loading via XHR.
        */
      /* CompleteClass */
      var bytesTotal: Double = js.native
      
      /**
        * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
        */
      /* CompleteClass */
      var cache: BaseCache | TextureManager = js.native
      
      /**
        * A config object that can be used by file types to store transitional data.
        */
      /* CompleteClass */
      var config: js.Any = js.native
      
      /**
        * The processed file data, stored here after the file has loaded.
        */
      /* CompleteClass */
      var data: js.Any = js.native
      
      /**
        * Destroy this File and any references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Checks if a key matching the one used by this file exists in the target Cache or not.
        * This is called automatically by the LoaderPlugin to decide if the file can be safely
        * loaded or will conflict.
        */
      /* CompleteClass */
      override def hasCacheConflict(): Boolean = js.native
      
      /**
        * Unique cache key (unique within its file type)
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Does this file have an associated linked file? Such as an image and a normal map.
        * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
        * actually bound by data, where-as a linkFile is.
        */
      /* CompleteClass */
      var linkFile: typings.phaser.Phaser.Loader.File = js.native
      
      /**
        * Called by the Loader, starts the actual file downloading.
        * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
        * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
        */
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /**
        * A reference to the Loader that is going to load this file.
        */
      /* CompleteClass */
      var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
      
      /**
        * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
        * to the parent MultiFile. Set and used internally by the Loader or specific file types.
        */
      /* CompleteClass */
      var multiFile: typings.phaser.Phaser.Loader.MultiFile = js.native
      
      /**
        * Called if the file errors while loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this error.
        */
      /* CompleteClass */
      override def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called when the file finishes loading, is sent a DOM ProgressEvent.
        * @param xhr The XMLHttpRequest that caused this onload event.
        * @param event The DOM ProgressEvent that resulted from this load.
        */
      /* CompleteClass */
      override def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Usually overridden by the FileTypes and is called by Loader.nextFile.
        * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
        */
      /* CompleteClass */
      override def onProcess(): Unit = js.native
      
      /**
        * Called when the File has completed processing.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessComplete(): Unit = js.native
      
      /**
        * Called when the File has completed processing but it generated an error.
        * Checks on the state of its multifile, if set.
        */
      /* CompleteClass */
      override def onProcessError(): Unit = js.native
      
      /**
        * Called during the file load progress. Is sent a DOM ProgressEvent.
        * @param event The DOM ProgressEvent.
        */
      /* CompleteClass */
      override def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
      
      /**
        * Called once the file has been added to its cache and is now ready for deletion from the Loader.
        * It will emit a `filecomplete` event from the LoaderPlugin.
        */
      /* CompleteClass */
      override def pendingDestroy(): Unit = js.native
      
      /**
        * A percentage value between 0 and 1 indicating how much of this file has loaded.
        * Only set if loading via XHR.
        */
      /* CompleteClass */
      var percentComplete: Double = js.native
      
      /**
        * Resets the XHRLoader instance this file is using.
        */
      /* CompleteClass */
      override def resetXHR(): Unit = js.native
      
      /**
        * Links this File with another, so they depend upon each other for loading and processing.
        * @param fileB The file to link to this one.
        */
      /* CompleteClass */
      override def setLink(fileB: typings.phaser.Phaser.Loader.File): Unit = js.native
      
      /**
        * The final URL this file will load from, including baseURL and path.
        * Set automatically when the Loader calls 'load' on this file.
        */
      /* CompleteClass */
      var src: String = js.native
      
      /**
        * The current state of the file. One of the FILE_CONST values.
        */
      /* CompleteClass */
      var state: integer = js.native
      
      /**
        * The file type string (image, json, etc) for sorting within the Loader.
        */
      /* CompleteClass */
      var `type`: String = js.native
      
      /**
        * The URL of the file, not including baseURL.
        * 
        * Automatically has Loader.path prepended to it if a string.
        * 
        * Can also be a JavaScript Object, such as the results of parsing JSON data.
        */
      /* CompleteClass */
      var url: js.Object | String = js.native
      
      /**
        * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
        */
      /* CompleteClass */
      var xhrLoader: XMLHttpRequest = js.native
      
      /**
        * The merged XHRSettings for this file.
        */
      /* CompleteClass */
      var xhrSettings: XHRSettingsObject = js.native
    }
  }
  
  object FileTypesManager {
    
    @JSGlobal("Phaser.Loader.FileTypesManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Removed all associated file types.
      */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /**
      * Static method called when a LoaderPlugin is created.
      * 
      * Loops through the local types object and injects all of them as
      * properties into the LoaderPlugin instance.
      * @param loader The LoaderPlugin to install the types into.
      */
    @scala.inline
    def install(loader: typings.phaser.Phaser.Loader.LoaderPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(loader.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Static method called directly by the File Types.
      * 
      * The key is a reference to the function used to load the files via the Loader, i.e. `image`.
      * @param key The key that will be used as the method name in the LoaderPlugin.
      * @param factoryFunction The function that will be called when LoaderPlugin.key is invoked.
      */
    @scala.inline
    def register(key: String, factoryFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(key.asInstanceOf[js.Any], factoryFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Given a File and a baseURL value this returns the URL the File will use to download from.
    * @param file The File object.
    * @param baseURL A default base URL.
    */
  @scala.inline
  def GetURL(file: typings.phaser.Phaser.Loader.File, baseURL: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetURL")(file.asInstanceOf[js.Any], baseURL.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
    extends StObject
       with typings.phaser.Phaser.Loader.LoaderPlugin {
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
  @scala.inline
  def MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeXHRSettings")(global.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[XHRSettingsObject]
  
  /**
    * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
    * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
    * 
    * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
    */
  @JSGlobal("Phaser.Loader.MultiFile")
  @js.native
  class MultiFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.MultiFile {
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
    
    /**
      * Adds another child to this MultiFile, increases the pending count and resets the completion status.
      * @param files The File to add to this MultiFile.
      */
    /* CompleteClass */
    override def addToMultiFile(files: typings.phaser.Phaser.Loader.File): typings.phaser.Phaser.Loader.MultiFile = js.native
    
    /**
      * A reference to the Loaders baseURL at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var baseURL: String = js.native
    
    /**
      * The completion status of this MultiFile.
      */
    /* CompleteClass */
    var complete: Boolean = js.native
    
    /**
      * A storage container for transient data that the loading files need.
      */
    /* CompleteClass */
    var config: js.Any = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: integer = js.native
    
    /**
      * Array of files that make up this MultiFile.
      */
    /* CompleteClass */
    var files: js.Array[typings.phaser.Phaser.Loader.File] = js.native
    
    /**
      * Checks if this MultiFile is ready to process its children or not.
      */
    /* CompleteClass */
    override def isReadyToProcess(): Boolean = js.native
    
    /**
      * Unique cache key (unique within its file type)
      */
    /* CompleteClass */
    var key: String = js.native
    
    /**
      * A reference to the Loader that is going to load this file.
      */
    /* CompleteClass */
    var loader: typings.phaser.Phaser.Loader.LoaderPlugin = js.native
    
    /**
      * Called by each File when it finishes loading.
      * @param file The File that has completed processing.
      */
    /* CompleteClass */
    override def onFileComplete(file: typings.phaser.Phaser.Loader.File): Unit = js.native
    
    /**
      * Called by each File that fails to load.
      * @param file The File that has failed to load.
      */
    /* CompleteClass */
    override def onFileFailed(file: typings.phaser.Phaser.Loader.File): Unit = js.native
    
    /**
      * A reference to the Loaders path at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var path: String = js.native
    
    /**
      * The number of files to load.
      */
    /* CompleteClass */
    var pending: integer = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The file type string for sorting within the Loader.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * Creates a new XMLHttpRequest (xhr) object based on the given File and XHRSettings
    * and starts the download of it. It uses the Files own XHRSettings and merges them
    * with the global XHRSettings object to set the xhr values before download.
    * @param file The File to download.
    * @param globalXHRSettings The global XHRSettings object.
    */
  @scala.inline
  def XHRLoader(file: typings.phaser.Phaser.Loader.File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("XHRLoader")(file.asInstanceOf[js.Any], globalXHRSettings.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
  
  /**
    * Creates an XHRSettings Object with default values.
    * @param responseType The responseType, such as 'text'. Default ''.
    * @param async Should the XHR request use async or not? Default true.
    * @param user Optional username for the XHR request. Default ''.
    * @param password Optional password for the XHR request. Default ''.
    * @param timeout Optional XHR timeout value. Default 0.
    * @param withCredentials Optional XHR withCredentials value. Default false.
    */
  @scala.inline
  def XHRSettings(
    responseType: js.UndefOr[XMLHttpRequestResponseType],
    async: js.UndefOr[Boolean],
    user: js.UndefOr[String],
    password: js.UndefOr[String],
    timeout: js.UndefOr[integer],
    withCredentials: js.UndefOr[Boolean]
  ): XHRSettingsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("XHRSettings")(responseType.asInstanceOf[js.Any], async.asInstanceOf[js.Any], user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any])).asInstanceOf[XHRSettingsObject]
}
