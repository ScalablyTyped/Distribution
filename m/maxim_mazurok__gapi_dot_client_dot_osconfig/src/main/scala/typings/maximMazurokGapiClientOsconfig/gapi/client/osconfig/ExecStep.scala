package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecStep extends StObject {
  
  /** The ExecStepConfig for all Linux VMs targeted by the PatchJob. */
  var linuxExecStepConfig: js.UndefOr[ExecStepConfig] = js.undefined
  
  /** The ExecStepConfig for all Windows VMs targeted by the PatchJob. */
  var windowsExecStepConfig: js.UndefOr[ExecStepConfig] = js.undefined
}
object ExecStep {
  
  inline def apply(): ExecStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecStep]
  }
  
  extension [Self <: ExecStep](x: Self) {
    
    inline def setLinuxExecStepConfig(value: ExecStepConfig): Self = StObject.set(x, "linuxExecStepConfig", value.asInstanceOf[js.Any])
    
    inline def setLinuxExecStepConfigUndefined: Self = StObject.set(x, "linuxExecStepConfig", js.undefined)
    
    inline def setWindowsExecStepConfig(value: ExecStepConfig): Self = StObject.set(x, "windowsExecStepConfig", value.asInstanceOf[js.Any])
    
    inline def setWindowsExecStepConfigUndefined: Self = StObject.set(x, "windowsExecStepConfig", js.undefined)
  }
}
