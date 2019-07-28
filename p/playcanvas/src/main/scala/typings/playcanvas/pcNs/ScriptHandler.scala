package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ScriptHandler
  * @class ResourceHandler for loading JavaScript files dynamically
  * Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
  * or regular JavaScript files, such as third-party libraries.
  * @param {pc.Application} app The running {pc.Application}
  */
@JSGlobal("pc.ScriptHandler")
@js.native
class ScriptHandler protected () extends js.Object {
  def this(app: Application) = this()
  def load(url: String, callback: js.Function): Unit = js.native
  def open(url: String, data: js.Any): js.Any = js.native
  def patch(asset: Asset, assets: AssetRegistry): Unit = js.native
}

/* static members */
@JSGlobal("pc.ScriptHandler")
@js.native
object ScriptHandler extends js.Object {
  def _push(Type: typings.playcanvas.pcNs.ScriptType): Unit = js.native
}

