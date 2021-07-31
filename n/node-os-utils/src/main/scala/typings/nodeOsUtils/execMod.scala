package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object execMod {
  
  @JSImport("node-os-utils/lib/exec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def exec(command: String): js.Function0[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[String]]]
  
  @scala.inline
  def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapExec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Function0[js.Promise[String]]]]
}
