package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Audio File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
  */
trait HTML5AudioFile
  extends StObject
     with File {
  
  /**
    * Called if the file errors while loading.
    */
  def onError(): Unit
  
  /**
    * Called when the file finishes loading.
    */
  def onLoad(): Unit
  
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    */
  def onProgress(): Unit
}
object HTML5AudioFile {
  
  inline def apply(
    addToCache: () => Unit,
    bytesLoaded: Double,
    bytesTotal: Double,
    cache: BaseCache | TextureManager,
    config: Any,
    data: Any,
    destroy: () => Unit,
    hasCacheConflict: () => Boolean,
    key: String,
    load: () => Unit,
    loader: LoaderPlugin,
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
    state: Double,
    `type`: String,
    url: js.Object | String,
    xhrSettings: XHRSettingsObject
  ): HTML5AudioFile = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hasCacheConflict = js.Any.fromFunction0(hasCacheConflict), key = key.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loader = loader.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onLoad = js.Any.fromFunction0(onLoad), onProcess = js.Any.fromFunction0(onProcess), onProcessComplete = js.Any.fromFunction0(onProcessComplete), onProcessError = js.Any.fromFunction0(onProcessError), onProgress = js.Any.fromFunction0(onProgress), pendingDestroy = js.Any.fromFunction0(pendingDestroy), percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = js.Any.fromFunction0(resetXHR), setLink = js.Any.fromFunction1(setLink), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any], linkFile = null, multiFile = null, xhrLoader = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML5AudioFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTML5AudioFile] (val x: Self) extends AnyVal {
    
    inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnProgress(value: () => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction0(value))
  }
}
