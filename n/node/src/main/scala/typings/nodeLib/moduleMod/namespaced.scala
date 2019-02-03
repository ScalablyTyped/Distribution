package typings
package nodeLib.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module", JSImport.Namespace)
@js.native
class namespaced protected ()
  extends nodeLib.NodeJSNs.Module {
  def this(id: java.lang.String) = this()
  def this(id: java.lang.String, parent: nodeLib.NodeJSNs.Module) = this()
}

/* static members */
@JSImport("module", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var Module: nodeLib.Anon_BuiltinModules = js.native
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequireFromPath(path: java.lang.String): js.Function1[/* path */ java.lang.String, _] = js.native
  def runMain(): scala.Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

