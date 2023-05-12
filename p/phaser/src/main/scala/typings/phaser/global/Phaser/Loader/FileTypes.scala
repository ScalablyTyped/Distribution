package typings.phaser.global.Phaser.Loader

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Loader.FileTypes.SpineFileConfig
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
import typings.phaser.Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry
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
import typings.std.AudioContext
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  open class AnimationJSONFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  @JSGlobal("Phaser.Loader.FileTypes.AsepriteFile")
  @js.native
  open class AsepriteFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.FileTypes.AsepriteFile {
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
      key: String | AsepriteFileConfig,
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
    /**
      * The file type string for sorting within the Loader.
      */
    /* CompleteClass */
    var `type`: String = js.native
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
  open class AtlasJSONFile protected ()
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class AtlasXMLFile protected ()
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class AudioFile protected ()
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
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urlConfig: AudioFileURLConfig) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: AudioFileConfig,
      urlConfig: AudioFileURLConfig
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      urlConfig: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      urlConfig: AudioFileURLConfig,
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
      key: AudioFileConfig,
      urlConfig: AudioFileURLConfig,
      xhrSettings: XHRSettingsObject
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
      key: String,
      urlConfig: AudioFileURLConfig,
      xhrSettings: Unit,
      audioContext: AudioContext
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      urlConfig: AudioFileURLConfig,
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
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: AudioFileConfig,
      urlConfig: AudioFileURLConfig,
      xhrSettings: Unit,
      audioContext: AudioContext
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: AudioFileConfig,
      urlConfig: AudioFileURLConfig,
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class AudioSpriteFile protected ()
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
      audioConfig: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      jsonURL: String,
      audioURL: Unit,
      audioConfig: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: AudioSpriteFileConfig,
      jsonURL: String,
      audioURL: js.Object,
      audioConfig: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: AudioSpriteFileConfig,
      jsonURL: String,
      audioURL: Unit,
      audioConfig: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      jsonURL: String,
      audioURL: js.Object,
      audioConfig: Any,
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
      audioConfig: Any,
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
      audioConfig: Any,
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
      audioConfig: Any,
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
      audioConfig: Any,
      audioXhrSettings: Unit,
      jsonXhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      jsonURL: String,
      audioURL: js.Object,
      audioConfig: Any,
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
      audioConfig: Any,
      audioXhrSettings: Unit,
      jsonXhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      jsonURL: String,
      audioURL: Unit,
      audioConfig: Any,
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
      audioConfig: Any,
      audioXhrSettings: Unit,
      jsonXhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: AudioSpriteFileConfig,
      jsonURL: String,
      audioURL: js.Object,
      audioConfig: Any,
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
      audioConfig: Any,
      audioXhrSettings: Unit,
      jsonXhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: AudioSpriteFileConfig,
      jsonURL: String,
      audioURL: Unit,
      audioConfig: Any,
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class BinaryFile protected ()
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
      dataType: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      xhrSettings: XHRSettingsObject,
      dataType: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      xhrSettings: Unit,
      dataType: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      xhrSettings: XHRSettingsObject,
      dataType: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: BinaryFileConfig,
      url: String,
      xhrSettings: Unit,
      dataType: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: BinaryFileConfig,
      url: String,
      xhrSettings: XHRSettingsObject,
      dataType: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: BinaryFileConfig,
      url: Unit,
      xhrSettings: Unit,
      dataType: Any
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: BinaryFileConfig,
      url: Unit,
      xhrSettings: XHRSettingsObject,
      dataType: Any
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class BitmapFontFile protected ()
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class CSSFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
    /**
      * The merged XHRSettings for this file.
      */
    /* CompleteClass */
    var xhrSettings: XHRSettingsObject = js.native
  }
  
  /**
    * A Compressed Texture File suitable for loading by the Loader.
    * 
    * These are created when you use the Phaser.Loader.LoaderPlugin#texture method and are not typically created directly.
    * 
    * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#texture.
    */
  @JSGlobal("Phaser.Loader.FileTypes.CompressedTextureFile")
  @js.native
  open class CompressedTextureFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.FileTypes.CompressedTextureFile {
    /**
      * 
      * @param loader A reference to the Loader that is responsible for this file.
      * @param key The key to use for this file.
      * @param entry The compressed texture file entry to load.
      * @param xhrSettings Extra XHR Settings specifically for this file.
      */
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, entry: CompressedTextureFileEntry) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      entry: CompressedTextureFileEntry,
      xhrSettings: XHRSettingsObject
    ) = this()
    
    /**
      * Adds all of the multi-file entties to their target caches upon successful loading and processing.
      */
    /* CompleteClass */
    override def addMultiToCache(): Unit = js.native
    
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
    /**
      * The file type string for sorting within the Loader.
      */
    /* CompleteClass */
    var `type`: String = js.native
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
  open class GLSLFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    override def getShaderUniforms(headerSource: js.Array[String]): Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class HTML5AudioFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class HTMLFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.FileTypes.HTMLFile {
    /**
      * 
      * @param loader A reference to the Loader that is responsible for this file.
      * @param key The key to use for this file, or a file configuration object.
      * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.html`, i.e. if `key` was "alien" then the URL will be "alien.html".
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class HTMLTextureFile protected ()
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
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, width: Double) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: Unit, width: Double) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: String,
      width: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: Unit,
      width: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      width: Double,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      width: Unit,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      width: Double,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      width: Unit,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: String,
      width: Double,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: String,
      width: Unit,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: Unit,
      width: Double,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: Unit,
      width: Unit,
      height: Double
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      width: Double,
      height: Double,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      width: Double,
      height: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      width: Unit,
      height: Double,
      xhrSettings: XHRSettingsObject
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
      url: Unit,
      width: Double,
      height: Double,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      width: Double,
      height: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      width: Unit,
      height: Double,
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
      key: HTMLTextureFileConfig,
      url: String,
      width: Double,
      height: Double,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: String,
      width: Double,
      height: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: String,
      width: Unit,
      height: Double,
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
      url: Unit,
      width: Double,
      height: Double,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: Unit,
      width: Double,
      height: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: HTMLTextureFileConfig,
      url: Unit,
      width: Unit,
      height: Double,
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class ImageFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class JSONFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class MultiAtlasFile protected ()
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class MultiScriptFile protected ()
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
    /**
      * The file type string for sorting within the Loader.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * A single Wavefront OBJ File suitable for loading by the Loader.
    * 
    * These are created when you use the Phaser.Loader.LoaderPlugin#obj method and are not typically created directly.
    * 
    * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#obj.
    */
  @JSGlobal("Phaser.Loader.FileTypes.OBJFile")
  @js.native
  open class OBJFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.FileTypes.OBJFile {
    /**
      * 
      * @param loader A reference to the Loader that is responsible for this file.
      * @param key The key to use for this file, or a file configuration object.
      * @param objURL The absolute or relative URL to load the obj file from. If undefined or `null` it will be set to `<key>.obj`, i.e. if `key` was "alien" then the URL will be "alien.obj".
      * @param matURL The absolute or relative URL to load the material file from. If undefined or `null` it will be set to `<key>.mat`, i.e. if `key` was "alien" then the URL will be "alien.mat".
      * @param flipUV Flip the UV coordinates stored in the model data?
      * @param xhrSettings Extra XHR Settings specifically for these files.
      */
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: OBJFileConfig) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, objURL: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: OBJFileConfig, objURL: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, objURL: String, matURL: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, objURL: Unit, matURL: String) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: String,
      matURL: String
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: Unit,
      matURL: String
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: String,
      matURL: String,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: String,
      matURL: Unit,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: Unit,
      matURL: String,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: Unit,
      matURL: Unit,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: String,
      matURL: String,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: String,
      matURL: Unit,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: Unit,
      matURL: String,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: Unit,
      matURL: Unit,
      flipUV: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: String,
      matURL: String,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: String,
      matURL: String,
      flipUV: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: String,
      matURL: Unit,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: String,
      matURL: Unit,
      flipUV: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: Unit,
      matURL: String,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: Unit,
      matURL: String,
      flipUV: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: Unit,
      matURL: Unit,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      objURL: Unit,
      matURL: Unit,
      flipUV: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: String,
      matURL: String,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: String,
      matURL: String,
      flipUV: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: String,
      matURL: Unit,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: String,
      matURL: Unit,
      flipUV: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: Unit,
      matURL: String,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: Unit,
      matURL: String,
      flipUV: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: Unit,
      matURL: Unit,
      flipUV: Boolean,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: OBJFileConfig,
      objURL: Unit,
      matURL: Unit,
      flipUV: Unit,
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class PackFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.FileTypes.PackFile {
    /**
      * 
      * @param loader A reference to the Loader that is responsible for this file.
      * @param key The key to use for this file, or a file configuration object.
      * @param url The absolute or relative URL to load this file from or a ready formed JSON object. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
      * @param xhrSettings Extra XHR Settings specifically for this file.
      * @param dataKey When the JSON file loads only this property will be stored in the Cache.
      */
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: PackFileConfig) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: Any) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: PackFileConfig, url: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: PackFileConfig, url: Any) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Any,
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
      url: Any,
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
      url: Any,
      xhrSettings: Unit,
      dataKey: String
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Any,
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
      url: Any,
      xhrSettings: Unit,
      dataKey: String
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: PackFileConfig,
      url: Any,
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class PluginFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class SVGFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class SceneFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class ScenePluginFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class ScriptFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.FileTypes.ScriptFile {
    /**
      * 
      * @param loader A reference to the Loader that is responsible for this file.
      * @param key The key to use for this file, or a file configuration object.
      * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
      * @param type The script type. Should be either 'script' for classic JavaScript, or 'module' if the file contains an exported module. Default 'script'.
      * @param xhrSettings Extra XHR Settings specifically for this file.
      */
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ScriptFileConfig) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: ScriptFileConfig, url: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String, `type`: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: Unit, `type`: String) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: ScriptFileConfig,
      url: String,
      `type`: String
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: ScriptFileConfig,
      url: Unit,
      `type`: String
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      `type`: String,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: String,
      `type`: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      `type`: String,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      url: Unit,
      `type`: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: ScriptFileConfig,
      url: String,
      `type`: String,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: ScriptFileConfig,
      url: String,
      `type`: Unit,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: ScriptFileConfig,
      url: Unit,
      `type`: String,
      xhrSettings: XHRSettingsObject
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: ScriptFileConfig,
      url: Unit,
      `type`: Unit,
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
    /**
      * The merged XHRSettings for this file.
      */
    /* CompleteClass */
    var xhrSettings: XHRSettingsObject = js.native
  }
  
  @JSGlobal("Phaser.Loader.FileTypes.SpineFile")
  @js.native
  open class SpineFile protected ()
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
    override def addToCache(): Any = js.native
    
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class SpriteSheetFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class TextFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class TilemapCSVFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class TilemapImpactFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class TilemapJSONFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class UnityAtlasFile protected ()
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
    var config: Any = js.native
    
    /**
      * Destroy this Multi File and any references it holds.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The number of files that failed to load.
      */
    /* CompleteClass */
    var failed: Double = js.native
    
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
    var pending: Double = js.native
    
    /**
      * Called once all children of this multi file have been added to their caches and is now
      * ready for deletion from the Loader.
      * 
      * It will emit a `filecomplete` event from the LoaderPlugin.
      */
    /* CompleteClass */
    override def pendingDestroy(): Unit = js.native
    
    /**
      * A reference to the Loaders prefix at the time this MultiFile was created.
      * Used to populate child-files.
      */
    /* CompleteClass */
    var prefix: String = js.native
    
    /**
      * The current state of the file. One of the FILE_CONST values.
      */
    /* CompleteClass */
    var state: Double = js.native
    
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
  open class VideoFile protected ()
    extends StObject
       with typings.phaser.Phaser.Loader.FileTypes.VideoFile {
    /**
      * 
      * @param loader A reference to the Loader that is responsible for this file.
      * @param key The key to use for this file, or a file configuration object.
      * @param urls The absolute or relative URL to load the video files from.
      * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it. Default false.
      */
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: VideoFileConfig) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urls: String) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      urls: js.Array[String | VideoFileURLConfig]
    ) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urls: VideoFileURLConfig) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: VideoFileConfig, urls: String) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: VideoFileConfig,
      urls: js.Array[String | VideoFileURLConfig]
    ) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: VideoFileConfig, urls: VideoFileURLConfig) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urls: String, noAudio: Boolean) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      urls: js.Array[String | VideoFileURLConfig],
      noAudio: Boolean
    ) = this()
    def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urls: Unit, noAudio: Boolean) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: String,
      urls: VideoFileURLConfig,
      noAudio: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: VideoFileConfig,
      urls: String,
      noAudio: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: VideoFileConfig,
      urls: js.Array[String | VideoFileURLConfig],
      noAudio: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: VideoFileConfig,
      urls: Unit,
      noAudio: Boolean
    ) = this()
    def this(
      loader: typings.phaser.Phaser.Loader.LoaderPlugin,
      key: VideoFileConfig,
      urls: VideoFileURLConfig,
      noAudio: Boolean
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
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
  open class XMLFile protected ()
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
    var config: Any = js.native
    
    /**
      * The processed file data, stored here after the file has loaded.
      */
    /* CompleteClass */
    var data: Any = js.native
    
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
    var linkFile: typings.phaser.Phaser.Loader.File | Null = js.native
    
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
    var multiFile: typings.phaser.Phaser.Loader.MultiFile | Null = js.native
    
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
    var state: Double = js.native
    
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
    var xhrLoader: XMLHttpRequest | Null = js.native
    
    /**
      * The merged XHRSettings for this file.
      */
    /* CompleteClass */
    var xhrSettings: XHRSettingsObject = js.native
  }
}
