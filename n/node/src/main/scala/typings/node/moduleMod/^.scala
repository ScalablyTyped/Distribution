package typings.node.moduleMod

import typings.node.NodeRequire
import typings.node.TypeofClassModule
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module", JSImport.Namespace)
@js.native
class ^ protected ()
  extends typings.node.NodeJS.Module {
  def this(id: String) = this()
  def this(id: String, parent: Module) = this()
}

@JSImport("module", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Module: TypeofClassModule = js.native
  var builtinModules: js.Array[String] = js.native
  def createRequire(path: String): NodeRequire = js.native
  def createRequire(path: URL_): NodeRequire = js.native
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  def createRequireFromPath(path: String): NodeRequire = js.native
  def runMain(): Unit = js.native
  def wrap(code: String): String = js.native
}

