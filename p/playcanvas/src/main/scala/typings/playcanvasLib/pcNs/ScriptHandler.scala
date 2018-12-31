package typings
package playcanvasLib.pcNs

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
  def load(url: java.lang.String, callback: js.Function): scala.Unit = js.native
  def open(url: java.lang.String, data: js.Any): js.Any = js.native
  def patch(asset: Asset, assets: AssetRegistry): scala.Unit = js.native
}

/**
  * @name pc.ScriptHandler
  * @class ResourceHandler for loading JavaScript files dynamically
  * Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
  * or regular JavaScript files, such as third-party libraries.
  * @param {pc.Application} app The running {pc.Application}
  */
@JSGlobal("pc.ScriptHandler")
@js.native
object ScriptHandler extends js.Object {
  def _push(Type: playcanvasLib.pcNs.ScriptType): scala.Unit = js.native
}

