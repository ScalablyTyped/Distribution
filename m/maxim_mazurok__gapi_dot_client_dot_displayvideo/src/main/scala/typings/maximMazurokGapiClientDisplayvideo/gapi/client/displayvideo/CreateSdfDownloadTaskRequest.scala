package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSdfDownloadTaskRequest extends StObject {
  
  /** The ID of the advertiser to download SDF for. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Filters on entities by their entity IDs. */
  var idFilter: js.UndefOr[IdFilter] = js.native
  
  /** Filters on Inventory Sources by their IDs. */
  var inventorySourceFilter: js.UndefOr[InventorySourceFilter] = js.native
  
  /**
    * Filters on selected file types. The entities in each file are filtered by a chosen set of filter entities. The filter entities must be the same type as, or a parent type of, the
    * selected file types.
    */
  var parentEntityFilter: js.UndefOr[ParentEntityFilter] = js.native
  
  /** The ID of the partner to download SDF for. */
  var partnerId: js.UndefOr[String] = js.native
  
  /**
    * Required. The SDF version of the downloaded file. If set to `SDF_VERSION_UNSPECIFIED`, this will default to the version specified by the advertiser or partner identified by
    * `root_id`. An advertiser inherits its SDF version from its partner unless configured otherwise.
    */
  var version: js.UndefOr[String] = js.native
}
object CreateSdfDownloadTaskRequest {
  
  @scala.inline
  def apply(): CreateSdfDownloadTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSdfDownloadTaskRequest]
  }
  
  @scala.inline
  implicit class CreateSdfDownloadTaskRequestMutableBuilder[Self <: CreateSdfDownloadTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setIdFilter(value: IdFilter): Self = StObject.set(x, "idFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdFilterUndefined: Self = StObject.set(x, "idFilter", js.undefined)
    
    @scala.inline
    def setInventorySourceFilter(value: InventorySourceFilter): Self = StObject.set(x, "inventorySourceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceFilterUndefined: Self = StObject.set(x, "inventorySourceFilter", js.undefined)
    
    @scala.inline
    def setParentEntityFilter(value: ParentEntityFilter): Self = StObject.set(x, "parentEntityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentEntityFilterUndefined: Self = StObject.set(x, "parentEntityFilter", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
