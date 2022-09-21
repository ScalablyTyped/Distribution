package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditGuaranteedOrderReadAccessorsRequest extends StObject {
  
  /** The advertisers to add as read accessors to the guaranteed order. */
  var addedAdvertisers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The partner context in which the change is being made. */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /** Whether to give all advertisers of the read/write accessor partner read access to the guaranteed order. Only applicable if read_write_partner_id is set in the guaranteed order. */
  var readAccessInherited: js.UndefOr[Boolean] = js.undefined
  
  /** The advertisers to remove as read accessors to the guaranteed order. */
  var removedAdvertisers: js.UndefOr[js.Array[String]] = js.undefined
}
object EditGuaranteedOrderReadAccessorsRequest {
  
  inline def apply(): EditGuaranteedOrderReadAccessorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditGuaranteedOrderReadAccessorsRequest]
  }
  
  extension [Self <: EditGuaranteedOrderReadAccessorsRequest](x: Self) {
    
    inline def setAddedAdvertisers(value: js.Array[String]): Self = StObject.set(x, "addedAdvertisers", value.asInstanceOf[js.Any])
    
    inline def setAddedAdvertisersUndefined: Self = StObject.set(x, "addedAdvertisers", js.undefined)
    
    inline def setAddedAdvertisersVarargs(value: String*): Self = StObject.set(x, "addedAdvertisers", js.Array(value*))
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setReadAccessInherited(value: Boolean): Self = StObject.set(x, "readAccessInherited", value.asInstanceOf[js.Any])
    
    inline def setReadAccessInheritedUndefined: Self = StObject.set(x, "readAccessInherited", js.undefined)
    
    inline def setRemovedAdvertisers(value: js.Array[String]): Self = StObject.set(x, "removedAdvertisers", value.asInstanceOf[js.Any])
    
    inline def setRemovedAdvertisersUndefined: Self = StObject.set(x, "removedAdvertisers", js.undefined)
    
    inline def setRemovedAdvertisersVarargs(value: String*): Self = StObject.set(x, "removedAdvertisers", js.Array(value*))
  }
}
