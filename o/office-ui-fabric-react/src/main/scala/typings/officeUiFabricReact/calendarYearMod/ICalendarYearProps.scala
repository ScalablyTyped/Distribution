package typings.officeUiFabricReact.calendarYearMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarYearProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var maxYear: js.UndefOr[Double] = js.native
  
  var minYear: js.UndefOr[Double] = js.native
  
  var navigatedYear: js.UndefOr[Double] = js.native
  
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.native
  
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.native
  
  var onRenderTitle: js.UndefOr[js.Function1[/* props */ ICalendarYearHeaderProps, ReactNode]] = js.native
  
  var onRenderYear: js.UndefOr[js.Function1[/* year */ Double, ReactNode]] = js.native
  
  var onSelectYear: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.native
  
  var selectedYear: js.UndefOr[Double] = js.native
  
  var strings: js.UndefOr[ICalendarYearStrings] = js.native
}
object ICalendarYearProps {
  
  @scala.inline
  def apply(): ICalendarYearProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarYearProps]
  }
  
  @scala.inline
  implicit class ICalendarYearPropsOps[Self <: ICalendarYearProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setMaxYear(value: Double): Self = this.set("maxYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxYear: Self = this.set("maxYear", js.undefined)
    
    @scala.inline
    def setMinYear(value: Double): Self = this.set("minYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinYear: Self = this.set("minYear", js.undefined)
    
    @scala.inline
    def setNavigatedYear(value: Double): Self = this.set("navigatedYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatedYear: Self = this.set("navigatedYear", js.undefined)
    
    @scala.inline
    def setNavigationIcons(value: ICalendarIconStrings): Self = this.set("navigationIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationIcons: Self = this.set("navigationIcons", js.undefined)
    
    @scala.inline
    def setOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = this.set("onHeaderSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHeaderSelect: Self = this.set("onHeaderSelect", js.undefined)
    
    @scala.inline
    def setOnRenderTitle(value: /* props */ ICalendarYearHeaderProps => ReactNode): Self = this.set("onRenderTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRenderTitle: Self = this.set("onRenderTitle", js.undefined)
    
    @scala.inline
    def setOnRenderYear(value: /* year */ Double => ReactNode): Self = this.set("onRenderYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRenderYear: Self = this.set("onRenderYear", js.undefined)
    
    @scala.inline
    def setOnSelectYear(value: /* year */ Double => Unit): Self = this.set("onSelectYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectYear: Self = this.set("onSelectYear", js.undefined)
    
    @scala.inline
    def setSelectedYear(value: Double): Self = this.set("selectedYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedYear: Self = this.set("selectedYear", js.undefined)
    
    @scala.inline
    def setStrings(value: ICalendarYearStrings): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
}
