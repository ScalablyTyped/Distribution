package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListForwardingAddressesResponse extends StObject {
  
  /** List of addresses that may be used for forwarding. */
  var forwardingAddresses: js.UndefOr[js.Array[ForwardingAddress]] = js.native
}
object ListForwardingAddressesResponse {
  
  @scala.inline
  def apply(): ListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForwardingAddressesResponse]
  }
  
  @scala.inline
  implicit class ListForwardingAddressesResponseMutableBuilder[Self <: ListForwardingAddressesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardingAddresses(value: js.Array[ForwardingAddress]): Self = StObject.set(x, "forwardingAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingAddressesUndefined: Self = StObject.set(x, "forwardingAddresses", js.undefined)
    
    @scala.inline
    def setForwardingAddressesVarargs(value: ForwardingAddress*): Self = StObject.set(x, "forwardingAddresses", js.Array(value :_*))
  }
}
