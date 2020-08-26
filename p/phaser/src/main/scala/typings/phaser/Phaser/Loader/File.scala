package typings.phaser.Phaser.Loader

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base File class used by all File Types that the Loader can support.
  * You shouldn't create an instance of a File directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@js.native
trait File extends js.Object {
  /**
    * Updated as the file loads.
    * Only set if loading via XHR.
    */
  var bytesLoaded: Double = js.native
  /**
    * The total size of this file.
    * Set by onProgress and only if loading via XHR.
    */
  var bytesTotal: Double = js.native
  /**
    * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
    */
  var cache: BaseCache | TextureManager = js.native
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: js.Any = js.native
  /**
    * For CORs based loading.
    * If this is undefined then the File will check BaseLoader.crossOrigin and use that (if set)
    */
  var crossOrigin: js.UndefOr[String] = js.native
  /**
    * The processed file data, stored here after the file has loaded.
    */
  var data: js.Any = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String = js.native
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
  var percentComplete: Double = js.native
  /**
    * The final URL this file will load from, including baseURL and path.
    * Set automatically when the Loader calls 'load' on this file.
    */
  var src: String = js.native
  /**
    * The current state of the file. One of the FILE_CONST values.
    */
  var state: integer = js.native
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: String = js.native
  /**
    * The URL of the file, not including baseURL.
    * 
    * Automatically has Loader.path prepended to it if a string.
    * 
    * Can also be a JavaScript Object, such as the results of parsing JSON data.
    */
  var url: js.Object | String = js.native
  /**
    * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
    */
  var xhrLoader: XMLHttpRequest = js.native
  /**
    * The merged XHRSettings for this file.
    */
  var xhrSettings: XHRSettingsObject = js.native
  /**
    * Adds this file to its target cache upon successful loading and processing.
    * This method is often overridden by specific file types.
    */
  def addToCache(): Unit = js.native
  /**
    * Destroy this File and any references it holds.
    */
  def destroy(): Unit = js.native
  /**
    * Checks if a key matching the one used by this file exists in the target Cache or not.
    * This is called automatically by the LoaderPlugin to decide if the file can be safely
    * loaded or will conflict.
    */
  def hasCacheConflict(): Boolean = js.native
  /**
    * Called by the Loader, starts the actual file downloading.
    * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
    * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
    */
  def load(): Unit = js.native
  /**
    * Called if the file errors while loading, is sent a DOM ProgressEvent.
    * @param xhr The XMLHttpRequest that caused this onload event.
    * @param event The DOM ProgressEvent that resulted from this error.
    */
  def onError(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
  /**
    * Called when the file finishes loading, is sent a DOM ProgressEvent.
    * @param xhr The XMLHttpRequest that caused this onload event.
    * @param event The DOM ProgressEvent that resulted from this load.
    */
  def onLoad(xhr: XMLHttpRequest, event: ProgressEvent[EventTarget]): Unit = js.native
  /**
    * Usually overridden by the FileTypes and is called by Loader.nextFile.
    * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
    */
  def onProcess(): Unit = js.native
  /**
    * Called when the File has completed processing.
    * Checks on the state of its multifile, if set.
    */
  def onProcessComplete(): Unit = js.native
  /**
    * Called when the File has completed processing but it generated an error.
    * Checks on the state of its multifile, if set.
    */
  def onProcessError(): Unit = js.native
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    * @param event The DOM ProgressEvent.
    */
  def onProgress(event: ProgressEvent[EventTarget]): Unit = js.native
  /**
    * Called once the file has been added to its cache and is now ready for deletion from the Loader.
    * It will emit a `filecomplete` event from the LoaderPlugin.
    */
  def pendingDestroy(): Unit = js.native
  /**
    * Resets the XHRLoader instance this file is using.
    */
  def resetXHR(): Unit = js.native
  /**
    * Links this File with another, so they depend upon each other for loading and processing.
    * @param fileB The file to link to this one.
    */
  def setLink(fileB: File): Unit = js.native
}

object File {
  @scala.inline
  def apply(
    addToCache: () => Unit,
    bytesLoaded: Double,
    bytesTotal: Double,
    cache: BaseCache | TextureManager,
    config: js.Any,
    data: js.Any,
    destroy: () => Unit,
    hasCacheConflict: () => Boolean,
    key: String,
    linkFile: File,
    load: () => Unit,
    loader: LoaderPlugin,
    multiFile: MultiFile,
    onError: (XMLHttpRequest, ProgressEvent[EventTarget]) => Unit,
    onLoad: (XMLHttpRequest, ProgressEvent[EventTarget]) => Unit,
    onProcess: () => Unit,
    onProcessComplete: () => Unit,
    onProcessError: () => Unit,
    onProgress: ProgressEvent[EventTarget] => Unit,
    pendingDestroy: () => Unit,
    percentComplete: Double,
    resetXHR: () => Unit,
    setLink: File => Unit,
    src: String,
    state: integer,
    `type`: String,
    url: js.Object | String,
    xhrLoader: XMLHttpRequest,
    xhrSettings: XHRSettingsObject
  ): File = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hasCacheConflict = js.Any.fromFunction0(hasCacheConflict), key = key.asInstanceOf[js.Any], linkFile = linkFile.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loader = loader.asInstanceOf[js.Any], multiFile = multiFile.asInstanceOf[js.Any], onError = js.Any.fromFunction2(onError), onLoad = js.Any.fromFunction2(onLoad), onProcess = js.Any.fromFunction0(onProcess), onProcessComplete = js.Any.fromFunction0(onProcessComplete), onProcessError = js.Any.fromFunction0(onProcessError), onProgress = js.Any.fromFunction1(onProgress), pendingDestroy = js.Any.fromFunction0(pendingDestroy), percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = js.Any.fromFunction0(resetXHR), setLink = js.Any.fromFunction1(setLink), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrLoader = xhrLoader.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddToCache(value: () => Unit): Self = this.set("addToCache", js.Any.fromFunction0(value))
    @scala.inline
    def setBytesLoaded(value: Double): Self = this.set("bytesLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesTotal(value: Double): Self = this.set("bytesTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: BaseCache | TextureManager): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setHasCacheConflict(value: () => Boolean): Self = this.set("hasCacheConflict", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkFile(value: File): Self = this.set("linkFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: () => Unit): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setLoader(value: LoaderPlugin): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiFile(value: MultiFile): Self = this.set("multiFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: (XMLHttpRequest, ProgressEvent[EventTarget]) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    @scala.inline
    def setOnLoad(value: (XMLHttpRequest, ProgressEvent[EventTarget]) => Unit): Self = this.set("onLoad", js.Any.fromFunction2(value))
    @scala.inline
    def setOnProcess(value: () => Unit): Self = this.set("onProcess", js.Any.fromFunction0(value))
    @scala.inline
    def setOnProcessComplete(value: () => Unit): Self = this.set("onProcessComplete", js.Any.fromFunction0(value))
    @scala.inline
    def setOnProcessError(value: () => Unit): Self = this.set("onProcessError", js.Any.fromFunction0(value))
    @scala.inline
    def setOnProgress(value: ProgressEvent[EventTarget] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def setPendingDestroy(value: () => Unit): Self = this.set("pendingDestroy", js.Any.fromFunction0(value))
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetXHR(value: () => Unit): Self = this.set("resetXHR", js.Any.fromFunction0(value))
    @scala.inline
    def setSetLink(value: File => Unit): Self = this.set("setLink", js.Any.fromFunction1(value))
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: integer): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: js.Object | String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhrLoader(value: XMLHttpRequest): Self = this.set("xhrLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = this.set("xhrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
  }
  
}

