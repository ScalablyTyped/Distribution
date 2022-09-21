package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditCustomerMatchMembersRequest extends StObject {
  
  /** Input only. A list of contact information to define the members to be added. */
  var addedContactInfoList: js.UndefOr[ContactInfoList] = js.undefined
  
  /** Input only. A list of mobile device IDs to define the members to be added. */
  var addedMobileDeviceIdList: js.UndefOr[MobileDeviceIdList] = js.undefined
  
  /** Required. The ID of the owner advertiser of the updated Customer Match FirstAndThirdPartyAudience. */
  var advertiserId: js.UndefOr[String] = js.undefined
}
object EditCustomerMatchMembersRequest {
  
  inline def apply(): EditCustomerMatchMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditCustomerMatchMembersRequest]
  }
  
  extension [Self <: EditCustomerMatchMembersRequest](x: Self) {
    
    inline def setAddedContactInfoList(value: ContactInfoList): Self = StObject.set(x, "addedContactInfoList", value.asInstanceOf[js.Any])
    
    inline def setAddedContactInfoListUndefined: Self = StObject.set(x, "addedContactInfoList", js.undefined)
    
    inline def setAddedMobileDeviceIdList(value: MobileDeviceIdList): Self = StObject.set(x, "addedMobileDeviceIdList", value.asInstanceOf[js.Any])
    
    inline def setAddedMobileDeviceIdListUndefined: Self = StObject.set(x, "addedMobileDeviceIdList", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
  }
}
