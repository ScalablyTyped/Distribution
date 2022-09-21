package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditCustomerMatchMembersResponse extends StObject {
  
  /** Required. The ID of the updated Customer Match FirstAndThirdPartyAudience. */
  var firstAndThirdPartyAudienceId: js.UndefOr[String] = js.undefined
}
object EditCustomerMatchMembersResponse {
  
  inline def apply(): EditCustomerMatchMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditCustomerMatchMembersResponse]
  }
  
  extension [Self <: EditCustomerMatchMembersResponse](x: Self) {
    
    inline def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
  }
}
