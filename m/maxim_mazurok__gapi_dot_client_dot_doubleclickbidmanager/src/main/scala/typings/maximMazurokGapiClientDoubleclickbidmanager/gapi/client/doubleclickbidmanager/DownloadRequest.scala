package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadRequest extends js.Object {
  
  /**
    * File types that will be returned. If INVENTORY_SOURCE is requested, no other file types may be requested. Acceptable values are: - "AD" - "AD_GROUP" - "CAMPAIGN" - "INSERTION_ORDER"
    * - "INVENTORY_SOURCE" - "LINE_ITEM"
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID must be specified. */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Filter type used to filter entities to fetch. PARTNER_ID and INVENTORY_SOURCE_ID may only be used when downloading inventory sources. */
  var filterType: js.UndefOr[String] = js.native
  
  /** SDF Version (column names, types, order) in which the entities will be returned. Default to 5. */
  var version: js.UndefOr[String] = js.native
}
object DownloadRequest {
  
  @scala.inline
  def apply(): DownloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadRequest]
  }
  
  @scala.inline
  implicit class DownloadRequestOps[Self <: DownloadRequest] (val x: Self) extends AnyVal {
    
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
    def setFileTypesVarargs(value: String*): Self = this.set("fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    
    @scala.inline
    def setFilterIdsVarargs(value: String*): Self = this.set("filterIds", js.Array(value :_*))
    
    @scala.inline
    def setFilterIds(value: js.Array[String]): Self = this.set("filterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterIds: Self = this.set("filterIds", js.undefined)
    
    @scala.inline
    def setFilterType(value: String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
