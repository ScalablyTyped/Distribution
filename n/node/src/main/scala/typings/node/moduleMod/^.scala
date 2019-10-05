package typings.node.moduleMod

import typings.node.Anon_BuiltinModules
import typings.node.NodeJS.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module", JSImport.Namespace)
@js.native
class ^ protected () extends Module {
  def this(id: java.lang.String) = this()
  def this(id: java.lang.String, parent: Module) = this()
}

@JSImport("module", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Module: Anon_BuiltinModules = js.native
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequireFromPath(path: java.lang.String): js.Function1[/* path */ java.lang.String, _] = js.native
  def runMain(): Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

