package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadLineItemsRequest extends js.Object {
  
  /** File specification (column names, types, order) in which the line items will be returned. Default to EWF. */
  var fileSpec: js.UndefOr[String] = js.native
  
  /** Ids of the specified filter type used to filter line items to fetch. If omitted, all the line items will be returned. */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Filter type used to filter line items to fetch. */
  var filterType: js.UndefOr[String] = js.native
  
  /** Format in which the line items will be returned. Default to CSV. */
  var format: js.UndefOr[String] = js.native
}
object DownloadLineItemsRequest {
  
  @scala.inline
  def apply(): DownloadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadLineItemsRequest]
  }
  
  @scala.inline
  implicit class DownloadLineItemsRequestOps[Self <: DownloadLineItemsRequest] (val x: Self) extends AnyVal {
    
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
    def setFileSpec(value: String): Self = this.set("fileSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSpec: Self = this.set("fileSpec", js.undefined)
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
