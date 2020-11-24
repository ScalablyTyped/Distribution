package typings.officeUiFabricReact.calendarDayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarDayState extends js.Object {
  
  var activeDescendantId: js.UndefOr[String] = js.native
  
  var weeks: js.UndefOr[js.Array[js.Array[IDayInfo]]] = js.native
}
object ICalendarDayState {
  
  @scala.inline
  def apply(): ICalendarDayState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarDayState]
  }
  
  @scala.inline
  implicit class ICalendarDayStateOps[Self <: ICalendarDayState] (val x: Self) extends AnyVal {
    
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
    def setActiveDescendantId(value: String): Self = this.set("activeDescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDescendantId: Self = this.set("activeDescendantId", js.undefined)
    
    @scala.inline
    def setWeeksVarargs(value: js.Array[IDayInfo]*): Self = this.set("weeks", js.Array(value :_*))
    
    @scala.inline
    def setWeeks(value: js.Array[js.Array[IDayInfo]]): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
  }
}
