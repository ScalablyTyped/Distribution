package typings.preloadjs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.LoadQueue")
@js.native
class LoadQueue () extends AbstractLoader {
  def this(preferXHR: Boolean) = this()
  def this(preferXHR: Boolean, basePath: String) = this()
  def this(preferXHR: Boolean, basePath: String, crossOrigin: String) = this()
  def this(preferXHR: Boolean, basePath: String, crossOrigin: Boolean) = this()
  // properties
  var maintainScriptOrder: Boolean = js.native
  var next: LoadQueue = js.native
  var stopOnError: Boolean = js.native
  // methods
  def close(): Unit = js.native
  def getItems(loaded: Boolean): js.Array[js.Object] = js.native
  def installPlugin(plugin: js.Any): Unit = js.native
  def loadFile(file: String): Unit = js.native
  def loadFile(file: String, loadNow: Boolean): Unit = js.native
  def loadFile(file: String, loadNow: Boolean, basePath: String): Unit = js.native
  def loadFile(file: js.Object): Unit = js.native
  def loadFile(file: js.Object, loadNow: Boolean): Unit = js.native
  def loadFile(file: js.Object, loadNow: Boolean, basePath: String): Unit = js.native
  def loadManifest(manifest: String): Unit = js.native
  def loadManifest(manifest: String, loadNow: Boolean): Unit = js.native
  def loadManifest(manifest: String, loadNow: Boolean, basePath: String): Unit = js.native
  def loadManifest(manifest: js.Array[_]): Unit = js.native
  def loadManifest(manifest: js.Array[_], loadNow: Boolean): Unit = js.native
  def loadManifest(manifest: js.Array[_], loadNow: Boolean, basePath: String): Unit = js.native
  def loadManifest(manifest: js.Object): Unit = js.native
  def loadManifest(manifest: js.Object, loadNow: Boolean): Unit = js.native
  def loadManifest(manifest: js.Object, loadNow: Boolean, basePath: String): Unit = js.native
  def registerLoader(loader: AbstractLoader): Unit = js.native
  def remove(idsOrUrls: String): Unit = js.native
  def remove(idsOrUrls: js.Array[_]): Unit = js.native
  def removeAll(): Unit = js.native
  def reset(): Unit = js.native
  def setMaxConnections(value: Double): Unit = js.native
  def setPaused(value: Boolean): Unit = js.native
  def setPreferXHR(value: Boolean): Boolean = js.native
  /**
    * @deprecated - use 'preferXHR' property instead (or setUseXHR())
    */
  def setUseXHR(value: Boolean): Unit = js.native
  def unregisterLoader(loader: AbstractLoader): Unit = js.native
}

