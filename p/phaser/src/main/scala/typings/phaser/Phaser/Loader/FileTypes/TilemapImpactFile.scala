package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Impact.js Tilemap JSON File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#tilemapImpact method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#tilemapImpact.
  */
trait TilemapImpactFile
  extends StObject
     with File
object TilemapImpactFile {
  
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
    state: Double,
    `type`: String,
    url: js.Object | String,
    xhrSettings: XHRSettingsObject
  ): TilemapImpactFile = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hasCacheConflict = js.Any.fromFunction0(hasCacheConflict), key = key.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loader = loader.asInstanceOf[js.Any], onError = js.Any.fromFunction2(onError), onLoad = js.Any.fromFunction2(onLoad), onProcess = js.Any.fromFunction0(onProcess), onProcessComplete = js.Any.fromFunction0(onProcessComplete), onProcessError = js.Any.fromFunction0(onProcessError), onProgress = js.Any.fromFunction1(onProgress), pendingDestroy = js.Any.fromFunction0(pendingDestroy), percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = js.Any.fromFunction0(resetXHR), setLink = js.Any.fromFunction1(setLink), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any], linkFile = null, multiFile = null, xhrLoader = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TilemapImpactFile]
  }
}
