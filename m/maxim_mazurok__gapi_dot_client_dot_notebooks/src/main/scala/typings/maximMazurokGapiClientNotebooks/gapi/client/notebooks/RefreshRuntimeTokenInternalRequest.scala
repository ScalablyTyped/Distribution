package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshRuntimeTokenInternalRequest extends StObject {
  
  /** Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity */
  var vmId: js.UndefOr[String] = js.undefined
}
object RefreshRuntimeTokenInternalRequest {
  
  inline def apply(): RefreshRuntimeTokenInternalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshRuntimeTokenInternalRequest]
  }
  
  extension [Self <: RefreshRuntimeTokenInternalRequest](x: Self) {
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
