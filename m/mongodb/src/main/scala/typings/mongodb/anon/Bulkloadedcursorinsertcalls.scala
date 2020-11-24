package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bulkloadedcursorinsertcalls extends js.Object {
  
  var `bulk-loaded cursor-insert calls`: Double = js.native
  
  var `create calls`: Double = js.native
  
  var `cursor-insert key and value bytes inserted`: Double = js.native
  
  var `cursor-remove key bytes removed`: Double = js.native
  
  var `cursor-update value bytes updated`: Double = js.native
  
  var `insert calls`: Double = js.native
  
  var `next calls`: Double = js.native
  
  var `prev calls`: Double = js.native
  
  var `remove calls`: Double = js.native
  
  var `reset calls`: Double = js.native
  
  var `restarted searches`: Double = js.native
  
  var `search calls`: Double = js.native
  
  var `search near calls`: Double = js.native
  
  var `truncate calls`: Double = js.native
  
  var `update calls`: Double = js.native
}
object Bulkloadedcursorinsertcalls {
  
  @scala.inline
  def apply(
    `bulk-loaded cursor-insert calls`: Double,
    `create calls`: Double,
    `cursor-insert key and value bytes inserted`: Double,
    `cursor-remove key bytes removed`: Double,
    `cursor-update value bytes updated`: Double,
    `insert calls`: Double,
    `next calls`: Double,
    `prev calls`: Double,
    `remove calls`: Double,
    `reset calls`: Double,
    `restarted searches`: Double,
    `search calls`: Double,
    `search near calls`: Double,
    `truncate calls`: Double,
    `update calls`: Double
  ): Bulkloadedcursorinsertcalls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bulk-loaded cursor-insert calls")((`bulk-loaded cursor-insert calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("create calls")((`create calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("cursor-insert key and value bytes inserted")((`cursor-insert key and value bytes inserted`).asInstanceOf[js.Any])
    __obj.updateDynamic("cursor-remove key bytes removed")((`cursor-remove key bytes removed`).asInstanceOf[js.Any])
    __obj.updateDynamic("cursor-update value bytes updated")((`cursor-update value bytes updated`).asInstanceOf[js.Any])
    __obj.updateDynamic("insert calls")((`insert calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("next calls")((`next calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("prev calls")((`prev calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("remove calls")((`remove calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("reset calls")((`reset calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("restarted searches")((`restarted searches`).asInstanceOf[js.Any])
    __obj.updateDynamic("search calls")((`search calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("search near calls")((`search near calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("truncate calls")((`truncate calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("update calls")((`update calls`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Bulkloadedcursorinsertcalls]
  }
  
  @scala.inline
  implicit class BulkloadedcursorinsertcallsOps[Self <: Bulkloadedcursorinsertcalls] (val x: Self) extends AnyVal {
    
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
    def `setBulk-loaded cursor-insert calls`(value: Double): Self = this.set("bulk-loaded cursor-insert calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCreate calls`(value: Double): Self = this.set("create calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCursor-insert key and value bytes inserted`(value: Double): Self = this.set("cursor-insert key and value bytes inserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCursor-remove key bytes removed`(value: Double): Self = this.set("cursor-remove key bytes removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCursor-update value bytes updated`(value: Double): Self = this.set("cursor-update value bytes updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInsert calls`(value: Double): Self = this.set("insert calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNext calls`(value: Double): Self = this.set("next calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrev calls`(value: Double): Self = this.set("prev calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRemove calls`(value: Double): Self = this.set("remove calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setReset calls`(value: Double): Self = this.set("reset calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRestarted searches`(value: Double): Self = this.set("restarted searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSearch calls`(value: Double): Self = this.set("search calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSearch near calls`(value: Double): Self = this.set("search near calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTruncate calls`(value: Double): Self = this.set("truncate calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUpdate calls`(value: Double): Self = this.set("update calls", value.asInstanceOf[js.Any])
  }
}
