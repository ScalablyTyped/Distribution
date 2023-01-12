package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSdfDownloadTaskRequest extends StObject {
  
  /** The ID of the advertiser to download SDF for. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Filters on entities by their entity IDs. */
  var idFilter: js.UndefOr[IdFilter] = js.undefined
  
  /** Filters on Inventory Sources by their IDs. */
  var inventorySourceFilter: js.UndefOr[InventorySourceFilter] = js.undefined
  
  /**
    * Filters on selected file types. The entities in each file are filtered by a chosen set of filter entities. The filter entities must be the same type as, or a parent type of, the
    * selected file types.
    */
  var parentEntityFilter: js.UndefOr[ParentEntityFilter] = js.undefined
  
  /** The ID of the partner to download SDF for. */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The SDF version of the downloaded file. If set to `SDF_VERSION_UNSPECIFIED`, this will default to the version specified by the advertiser or partner identified by
    * `root_id`. An advertiser inherits its SDF version from its partner unless configured otherwise.
    */
  var version: js.UndefOr[String] = js.undefined
}
object CreateSdfDownloadTaskRequest {
  
  inline def apply(): CreateSdfDownloadTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSdfDownloadTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSdfDownloadTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setIdFilter(value: IdFilter): Self = StObject.set(x, "idFilter", value.asInstanceOf[js.Any])
    
    inline def setIdFilterUndefined: Self = StObject.set(x, "idFilter", js.undefined)
    
    inline def setInventorySourceFilter(value: InventorySourceFilter): Self = StObject.set(x, "inventorySourceFilter", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceFilterUndefined: Self = StObject.set(x, "inventorySourceFilter", js.undefined)
    
    inline def setParentEntityFilter(value: ParentEntityFilter): Self = StObject.set(x, "parentEntityFilter", value.asInstanceOf[js.Any])
    
    inline def setParentEntityFilterUndefined: Self = StObject.set(x, "parentEntityFilter", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
