package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeInstanceInternalRequest extends StObject {
  
  /** Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity */
  var vmId: js.UndefOr[String] = js.undefined
}
object UpgradeInstanceInternalRequest {
  
  @scala.inline
  def apply(): UpgradeInstanceInternalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInstanceInternalRequest]
  }
  
  @scala.inline
  implicit class UpgradeInstanceInternalRequestMutableBuilder[Self <: UpgradeInstanceInternalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
