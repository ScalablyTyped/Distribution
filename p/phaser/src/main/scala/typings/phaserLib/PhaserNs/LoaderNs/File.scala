package typings
package phaserLib.PhaserNs.LoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base File class used by all File Types that the Loader can support.
  * You shouldn't create an instance of a File directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@JSGlobal("Phaser.Loader.File")
@js.native
class File protected () extends js.Object {
  /**
    * 
    * @param loader The Loader that is going to load this File.
    * @param fileConfig The file configuration object, as created by the file type.
    */
  def this(loader: LoaderPlugin, fileConfig: phaserLib.PhaserNs.TypesNs.LoaderNs.FileConfig) = this()
  /**
    * Updated as the file loads.
    * Only set if loading via XHR.
    */
  var bytesLoaded: scala.Double = js.native
  /**
    * The total size of this file.
    * Set by onProgress and only if loading via XHR.
    */
  var bytesTotal: scala.Double = js.native
  /**
    * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
    */
  var cache: phaserLib.PhaserNs.CacheNs.BaseCache | phaserLib.PhaserNs.TexturesNs.TextureManager = js.native
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: js.Any = js.native
  /**
    * For CORs based loading.
    * If this is undefined then the File will check BaseLoader.crossOrigin and use that (if set)
    */
  var crossOrigin: js.UndefOr[java.lang.String] = js.native
  /**
    * The processed file data, stored here after the file has loaded.
    */
  var data: js.Any = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  var key: java.lang.String = js.native
  /**
    * Does this file have an associated linked file? Such as an image and a normal map.
    * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
    * actually bound by data, where-as a linkFile is.
    */
  var linkFile: File = js.native
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin = js.native
  /**
    * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
    * to the parent MultiFile. Set and used internally by the Loader or specific file types.
    */
  var multiFile: MultiFile = js.native
  /**
    * A percentage value between 0 and 1 indicating how much of this file has loaded.
    * Only set if loading via XHR.
    */
  var percentComplete: scala.Double = js.native
  /**
    * The final URL this file will load from, including baseURL and path.
    * Set automatically when the Loader calls 'load' on this file.
    */
  var src: java.lang.String = js.native
  /**
    * The current state of the file. One of the FILE_CONST values.
    */
  var state: phaserLib.integer = js.native
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: java.lang.String = js.native
  /**
    * The URL of the file, not including baseURL.
    * Automatically has Loader.path prepended to it.
    */
  var url: java.lang.String = js.native
  /**
    * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
    */
  var xhrLoader: stdLib.XMLHttpRequest = js.native
  /**
    * The merged XHRSettings for this file.
    */
  var xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
  /**
    * Adds this file to its target cache upon successful loading and processing.
    * This method is often overridden by specific file types.
    */
  def addToCache(): scala.Unit = js.native
  /**
    * Destroy this File and any references it holds.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Checks if a key matching the one used by this file exists in the target Cache or not.
    * This is called automatically by the LoaderPlugin to decide if the file can be safely
    * loaded or will conflict.
    */
  def hasCacheConflict(): scala.Boolean = js.native
  /**
    * Called by the Loader, starts the actual file downloading.
    * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
    * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
    */
  def load(): scala.Unit = js.native
  /**
    * Called if the file errors while loading, is sent a DOM ProgressEvent.
    * @param xhr The XMLHttpRequest that caused this onload event.
    * @param event The DOM ProgressEvent that resulted from this error.
    */
  def onError(xhr: stdLib.XMLHttpRequest, event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Called when the file finishes loading, is sent a DOM ProgressEvent.
    * @param xhr The XMLHttpRequest that caused this onload event.
    * @param event The DOM ProgressEvent that resulted from this load.
    */
  def onLoad(xhr: stdLib.XMLHttpRequest, event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Usually overridden by the FileTypes and is called by Loader.nextFile.
    * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
    */
  def onProcess(): scala.Unit = js.native
  /**
    * Called when the File has completed processing.
    * Checks on the state of its multifile, if set.
    */
  def onProcessComplete(): scala.Unit = js.native
  /**
    * Called when the File has completed processing but it generated an error.
    * Checks on the state of its multifile, if set.
    */
  def onProcessError(): scala.Unit = js.native
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    * @param event The DOM ProgressEvent.
    */
  def onProgress(event: stdLib.ProgressEvent): scala.Unit = js.native
  /**
    * Called once the file has been added to its cache and is now ready for deletion from the Loader.
    * It will emit a `filecomplete` event from the LoaderPlugin.
    */
  def pendingDestroy(): scala.Unit = js.native
  /**
    * Resets the XHRLoader instance this file is using.
    */
  def resetXHR(): scala.Unit = js.native
  /**
    * Links this File with another, so they depend upon each other for loading and processing.
    * @param fileB The file to link to this one.
    */
  def setLink(fileB: File): scala.Unit = js.native
}

/* static members */
@JSGlobal("Phaser.Loader.File")
@js.native
object File extends js.Object {
  /**
    * Static method for creating object URL using URL API and setting it as image 'src' attribute.
    * If URL API is not supported (usually on old browsers) it falls back to creating Base64 encoded url using FileReader.
    * @param image Image object which 'src' attribute should be set to object URL.
    * @param blob A Blob object to create an object URL for.
    * @param defaultType Default mime type used if blob type is not available.
    */
  def createObjectURL(image: stdLib.HTMLImageElement, blob: stdLib.Blob, defaultType: java.lang.String): scala.Unit = js.native
  /**
    * Static method for releasing an existing object URL which was previously created
    * by calling {@link File#createObjectURL} method.
    * @param image Image object which 'src' attribute should be revoked.
    */
  def revokeObjectURL(image: stdLib.HTMLImageElement): scala.Unit = js.native
}

