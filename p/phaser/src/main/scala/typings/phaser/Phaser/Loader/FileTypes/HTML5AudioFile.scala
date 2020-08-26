package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Audio File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
  */
@js.native
trait HTML5AudioFile extends File {
  /**
    * Called if the file errors while loading.
    */
  def onError(): Unit = js.native
  /**
    * Called when the file finishes loading.
    */
  def onLoad(): Unit = js.native
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    */
  def onProgress(): Unit = js.native
}

object HTML5AudioFile {
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
    onError: () => Unit,
    onLoad: () => Unit,
    onProcess: () => Unit,
    onProcessComplete: () => Unit,
    onProcessError: () => Unit,
    onProgress: () => Unit,
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
  ): HTML5AudioFile = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hasCacheConflict = js.Any.fromFunction0(hasCacheConflict), key = key.asInstanceOf[js.Any], linkFile = linkFile.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loader = loader.asInstanceOf[js.Any], multiFile = multiFile.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onLoad = js.Any.fromFunction0(onLoad), onProcess = js.Any.fromFunction0(onProcess), onProcessComplete = js.Any.fromFunction0(onProcessComplete), onProcessError = js.Any.fromFunction0(onProcessError), onProgress = js.Any.fromFunction0(onProgress), pendingDestroy = js.Any.fromFunction0(pendingDestroy), percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = js.Any.fromFunction0(resetXHR), setLink = js.Any.fromFunction1(setLink), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrLoader = xhrLoader.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML5AudioFile]
  }
  @scala.inline
  implicit class HTML5AudioFileOps[Self <: HTML5AudioFile] (val x: Self) extends AnyVal {
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
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def setOnProgress(value: () => Unit): Self = this.set("onProgress", js.Any.fromFunction0(value))
  }
  
}

