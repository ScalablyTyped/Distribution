package typings.nodeOsUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-os-utils/lib/exec", JSImport.Namespace)
@js.native
object execMod extends js.Object {
  
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  
  def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = js.native
}
