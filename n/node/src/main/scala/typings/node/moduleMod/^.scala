package typings.node.moduleMod

import typings.node.NodeJS.Module
import typings.node.NodeRequire
import typings.node.TypeofClassModule
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
  var Module: TypeofClassModule = js.native
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequire(path: java.lang.String): NodeRequire = js.native
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  def createRequireFromPath(path: java.lang.String): NodeRequire = js.native
  def runMain(): Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

