package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceFilter extends js.Object {
  
  /**
    * Inventory Sources to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. Leave empty to download all Inventory Sources
    * for the selected Advertiser or Partner.
    */
  var inventorySourceIds: js.UndefOr[js.Array[String]] = js.native
}
object InventorySourceFilter {
  
  @scala.inline
  def apply(): InventorySourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceFilter]
  }
  
  @scala.inline
  implicit class InventorySourceFilterOps[Self <: InventorySourceFilter] (val x: Self) extends AnyVal {
    
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
    def setInventorySourceIdsVarargs(value: String*): Self = this.set("inventorySourceIds", js.Array(value :_*))
    
    @scala.inline
    def setInventorySourceIds(value: js.Array[String]): Self = this.set("inventorySourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceIds: Self = this.set("inventorySourceIds", js.undefined)
  }
}
