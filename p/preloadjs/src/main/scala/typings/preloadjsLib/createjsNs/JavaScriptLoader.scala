package typings
package preloadjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.JavaScriptLoader")
@js.native
class JavaScriptLoader protected () extends AbstractLoader {
  def this(loadItem: js.Object, preferXHR: scala.Boolean) = this()
}

@JSGlobal("createjs.JavaScriptLoader")
@js.native
object JavaScriptLoader extends js.Object {
  def canLoadItem(item: js.Object): scala.Boolean = js.native
}

