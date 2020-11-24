package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig extends js.Object {
  
  /** The number of guest accelerator cards exposed to each VM. */
  var acceleratorCount: js.UndefOr[String] = js.native
  
  /** The type of accelerator to attach to each VM, e.g. "nvidia-tesla-k80" for nVidia Tesla K80. */
  var acceleratorType: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigOps[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorCount(value: String): Self = this.set("acceleratorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorCount: Self = this.set("acceleratorCount", js.undefined)
    
    @scala.inline
    def setAcceleratorType(value: String): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
  }
}
