package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object execMod {
  
  @JSImport("node-os-utils/lib/exec", "exec")
  @js.native
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  
  @JSImport("node-os-utils/lib/exec", "wrapExec")
  @js.native
  def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = js.native
}
