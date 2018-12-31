package typings
package preloadjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.LoadQueue")
@js.native
class LoadQueue () extends AbstractLoader {
  def this(preferXHR: scala.Boolean) = this()
  def this(preferXHR: scala.Boolean, basePath: java.lang.String) = this()
  def this(preferXHR: scala.Boolean, basePath: java.lang.String, crossOrigin: java.lang.String) = this()
  def this(preferXHR: scala.Boolean, basePath: java.lang.String, crossOrigin: scala.Boolean) = this()
  // properties
  var maintainScriptOrder: scala.Boolean = js.native
  var next: LoadQueue = js.native
  var stopOnError: scala.Boolean = js.native
  // methods
  def close(): scala.Unit = js.native
  def getItems(loaded: scala.Boolean): js.Array[js.Object] = js.native
  def installPlugin(plugin: js.Any): scala.Unit = js.native
  def loadFile(file: java.lang.String): scala.Unit = js.native
  def loadFile(file: java.lang.String, loadNow: scala.Boolean): scala.Unit = js.native
  def loadFile(file: java.lang.String, loadNow: scala.Boolean, basePath: java.lang.String): scala.Unit = js.native
  def loadFile(file: js.Object): scala.Unit = js.native
  def loadFile(file: js.Object, loadNow: scala.Boolean): scala.Unit = js.native
  def loadFile(file: js.Object, loadNow: scala.Boolean, basePath: java.lang.String): scala.Unit = js.native
  def loadManifest(manifest: java.lang.String): scala.Unit = js.native
  def loadManifest(manifest: java.lang.String, loadNow: scala.Boolean): scala.Unit = js.native
  def loadManifest(manifest: java.lang.String, loadNow: scala.Boolean, basePath: java.lang.String): scala.Unit = js.native
  def loadManifest(manifest: js.Array[_]): scala.Unit = js.native
  def loadManifest(manifest: js.Array[_], loadNow: scala.Boolean): scala.Unit = js.native
  def loadManifest(manifest: js.Array[_], loadNow: scala.Boolean, basePath: java.lang.String): scala.Unit = js.native
  def loadManifest(manifest: js.Object): scala.Unit = js.native
  def loadManifest(manifest: js.Object, loadNow: scala.Boolean): scala.Unit = js.native
  def loadManifest(manifest: js.Object, loadNow: scala.Boolean, basePath: java.lang.String): scala.Unit = js.native
  def registerLoader(loader: AbstractLoader): scala.Unit = js.native
  def remove(idsOrUrls: java.lang.String): scala.Unit = js.native
  def remove(idsOrUrls: js.Array[_]): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setMaxConnections(value: scala.Double): scala.Unit = js.native
  def setPaused(value: scala.Boolean): scala.Unit = js.native
  def setPreferXHR(value: scala.Boolean): scala.Boolean = js.native
  /**
    * @deprecated - use 'preferXHR' property instead (or setUseXHR())
    */
  def setUseXHR(value: scala.Boolean): scala.Unit = js.native
  def unregisterLoader(loader: AbstractLoader): scala.Unit = js.native
}

