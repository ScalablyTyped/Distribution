package typings.nodeZendesk.mod.Tickets.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinutesObject extends js.Object {
  
  var business: Double = js.native
  
  var calendar: Double = js.native
}
object MinutesObject {
  
  @scala.inline
  def apply(business: Double, calendar: Double): MinutesObject = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinutesObject]
  }
  
  @scala.inline
  implicit class MinutesObjectOps[Self <: MinutesObject] (val x: Self) extends AnyVal {
    
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
    def setBusiness(value: Double): Self = this.set("business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar(value: Double): Self = this.set("calendar", value.asInstanceOf[js.Any])
  }
}
