package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateKlassOptions extends KlassOptions {
  
   // default 'picker__footer'
  // Today & close buttons
  var buttonClose: js.UndefOr[String] = js.native
  
   // default 'picker__button--close'
  var buttonToday: js.UndefOr[String] = js.native
  
   // default 'picker__weekday'
  // Day states
  var day: js.UndefOr[String] = js.native
  
   // default 'picker__day--outfocus'
  // The picker footer
  var footer: js.UndefOr[String] = js.native
  
  // The picker header
  var header: js.UndefOr[String] = js.native
  
   // default 'picker__day'
  var infocus: js.UndefOr[String] = js.native
  
   // default 'picker__nav--disabled'
  // Month & year labels
  var month: js.UndefOr[String] = js.native
  
   // default 'picker__nav--next'
  var navDisabled: js.UndefOr[String] = js.native
  
   // default 'picker__nav--prev'
  var navNext: js.UndefOr[String] = js.native
  
   // default 'picker__header'
  // Month navigation
  var navPrev: js.UndefOr[String] = js.native
  
   // default 'picker__day--infocus'
  var outfocus: js.UndefOr[String] = js.native
  
   // default 'picker__year'
  // Month & year dropdowns
  var selectMonth: js.UndefOr[String] = js.native
  
   // default 'picker__select--month'
  var selectYear: js.UndefOr[String] = js.native
  
   // default 'picker__select--year'
  // Table of dates
  var table: js.UndefOr[String] = js.native
  
   // default 'picker__table'
  // Weekday labels
  var weekdays: js.UndefOr[String] = js.native
  
   // default 'picker__month'
  var year: js.UndefOr[String] = js.native
}
object DateKlassOptions {
  
  @scala.inline
  def apply(): DateKlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateKlassOptions]
  }
  
  @scala.inline
  implicit class DateKlassOptionsOps[Self <: DateKlassOptions] (val x: Self) extends AnyVal {
    
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
    def setButtonClose(value: String): Self = this.set("buttonClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonClose: Self = this.set("buttonClose", js.undefined)
    
    @scala.inline
    def setButtonToday(value: String): Self = this.set("buttonToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonToday: Self = this.set("buttonToday", js.undefined)
    
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setInfocus(value: String): Self = this.set("infocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfocus: Self = this.set("infocus", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setNavDisabled(value: String): Self = this.set("navDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavDisabled: Self = this.set("navDisabled", js.undefined)
    
    @scala.inline
    def setNavNext(value: String): Self = this.set("navNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavNext: Self = this.set("navNext", js.undefined)
    
    @scala.inline
    def setNavPrev(value: String): Self = this.set("navPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavPrev: Self = this.set("navPrev", js.undefined)
    
    @scala.inline
    def setOutfocus(value: String): Self = this.set("outfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutfocus: Self = this.set("outfocus", js.undefined)
    
    @scala.inline
    def setSelectMonth(value: String): Self = this.set("selectMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMonth: Self = this.set("selectMonth", js.undefined)
    
    @scala.inline
    def setSelectYear(value: String): Self = this.set("selectYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectYear: Self = this.set("selectYear", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setWeekdays(value: String): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
