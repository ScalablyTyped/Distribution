package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecStep extends js.Object {
  
  /** The ExecStepConfig for all Linux VMs targeted by the PatchJob. */
  var linuxExecStepConfig: js.UndefOr[ExecStepConfig] = js.native
  
  /** The ExecStepConfig for all Windows VMs targeted by the PatchJob. */
  var windowsExecStepConfig: js.UndefOr[ExecStepConfig] = js.native
}
object ExecStep {
  
  @scala.inline
  def apply(): ExecStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecStep]
  }
  
  @scala.inline
  implicit class ExecStepOps[Self <: ExecStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLinuxExecStepConfig(value: ExecStepConfig): Self = this.set("linuxExecStepConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinuxExecStepConfig: Self = this.set("linuxExecStepConfig", js.undefined)
    
    @scala.inline
    def setWindowsExecStepConfig(value: ExecStepConfig): Self = this.set("windowsExecStepConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsExecStepConfig: Self = this.set("windowsExecStepConfig", js.undefined)
  }
}
