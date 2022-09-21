package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecSyncOptions
  extends StObject
     with CommonExecOptions {
  
  var shell: js.UndefOr[String] = js.undefined
}
object ExecSyncOptions {
  
  inline def apply(): ExecSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecSyncOptions]
  }
  
  extension [Self <: ExecSyncOptions](x: Self) {
    
    inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}
