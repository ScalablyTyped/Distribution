package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditInventorySourceReadWriteAccessorsRequest extends StObject {
  
  /** The advertisers to add or remove from the list of advertisers that have read/write access to the inventory source. This change will remove an existing partner read/write accessor. */
  var advertisersUpdate: js.UndefOr[EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate] = js.undefined
  
  /** Set the partner context as read/write accessor of the inventory source. This will remove all other current read/write advertiser accessors. */
  var assignPartner: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The partner context by which the accessors change is being made. */
  var partnerId: js.UndefOr[String] = js.undefined
}
object EditInventorySourceReadWriteAccessorsRequest {
  
  inline def apply(): EditInventorySourceReadWriteAccessorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditInventorySourceReadWriteAccessorsRequest]
  }
  
  extension [Self <: EditInventorySourceReadWriteAccessorsRequest](x: Self) {
    
    inline def setAdvertisersUpdate(value: EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate): Self = StObject.set(x, "advertisersUpdate", value.asInstanceOf[js.Any])
    
    inline def setAdvertisersUpdateUndefined: Self = StObject.set(x, "advertisersUpdate", js.undefined)
    
    inline def setAssignPartner(value: Boolean): Self = StObject.set(x, "assignPartner", value.asInstanceOf[js.Any])
    
    inline def setAssignPartnerUndefined: Self = StObject.set(x, "assignPartner", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
