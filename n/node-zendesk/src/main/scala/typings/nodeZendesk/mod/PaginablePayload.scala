package typings.nodeZendesk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginablePayload extends js.Object {
  
  var count: Double = js.native
  
  var next_page: Double | Null = js.native
  
  var previous_page: Double | Null = js.native
}
object PaginablePayload {
  
  @scala.inline
  def apply(count: Double): PaginablePayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginablePayload]
  }
  
  @scala.inline
  implicit class PaginablePayloadOps[Self <: PaginablePayload] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_page(value: Double): Self = this.set("next_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_pageNull: Self = this.set("next_page", null)
    
    @scala.inline
    def setPrevious_page(value: Double): Self = this.set("previous_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious_pageNull: Self = this.set("previous_page", null)
  }
}
