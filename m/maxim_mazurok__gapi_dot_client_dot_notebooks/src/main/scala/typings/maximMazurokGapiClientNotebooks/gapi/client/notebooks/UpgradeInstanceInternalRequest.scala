package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeInstanceInternalRequest extends js.Object {
  
  /** Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity */
  var vmId: js.UndefOr[String] = js.native
}
object UpgradeInstanceInternalRequest {
  
  @scala.inline
  def apply(): UpgradeInstanceInternalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInstanceInternalRequest]
  }
  
  @scala.inline
  implicit class UpgradeInstanceInternalRequestOps[Self <: UpgradeInstanceInternalRequest] (val x: Self) extends AnyVal {
    
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
    def setVmId(value: String): Self = this.set("vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmId: Self = this.set("vmId", js.undefined)
  }
}
