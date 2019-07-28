package typings.node.NodeJSNs

import typings.node.NodeRequireFunction
import typings.node.TypeofClassModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("NodeJS.Module")
@js.native
class Module protected () extends js.Object {
  def this(id: java.lang.String) = this()
  def this(id: java.lang.String, parent: Module) = this()
  var children: js.Array[Module] = js.native
  var exports: js.Any = js.native
  var filename: java.lang.String = js.native
  var id: java.lang.String = js.native
  var loaded: Boolean = js.native
  var parent: Module | Null = js.native
  var paths: js.Array[java.lang.String] = js.native
  @JSName("require")
  var require_Original: NodeRequireFunction = js.native
  def require(id: java.lang.String): js.Any = js.native
}

/* static members */
@JSGlobal("NodeJS.Module")
@js.native
object Module extends js.Object {
  var Module: TypeofClassModule = js.native
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequireFromPath(path: java.lang.String): js.Function1[/* path */ java.lang.String, _] = js.native
  def runMain(): Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

