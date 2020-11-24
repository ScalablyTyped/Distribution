package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSdfDownloadTaskRequest extends js.Object {
  
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
  implicit class CreateSdfDownloadTaskRequestOps[Self <: CreateSdfDownloadTaskRequest] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setIdFilter(value: IdFilter): Self = this.set("idFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdFilter: Self = this.set("idFilter", js.undefined)
    
    @scala.inline
    def setInventorySourceFilter(value: InventorySourceFilter): Self = this.set("inventorySourceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceFilter: Self = this.set("inventorySourceFilter", js.undefined)
    
    @scala.inline
    def setParentEntityFilter(value: ParentEntityFilter): Self = this.set("parentEntityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentEntityFilter: Self = this.set("parentEntityFilter", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
