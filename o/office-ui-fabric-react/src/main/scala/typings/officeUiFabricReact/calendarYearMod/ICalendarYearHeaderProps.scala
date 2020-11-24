package typings.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarYearHeaderProps
  extends ICalendarYearProps
     with ICalendarYearRange {
  
  var onSelectNext: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSelectPrev: js.UndefOr[js.Function0[Unit]] = js.native
}
object ICalendarYearHeaderProps {
  
  @scala.inline
  def apply(fromYear: Double, toYear: Double): ICalendarYearHeaderProps = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearHeaderProps]
  }
  
  @scala.inline
  implicit class ICalendarYearHeaderPropsOps[Self <: ICalendarYearHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setOnSelectNext(value: () => Unit): Self = this.set("onSelectNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSelectNext: Self = this.set("onSelectNext", js.undefined)
    
    @scala.inline
    def setOnSelectPrev(value: () => Unit): Self = this.set("onSelectPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSelectPrev: Self = this.set("onSelectPrev", js.undefined)
  }
}
