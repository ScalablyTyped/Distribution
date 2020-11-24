package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Day
import typings.officeJsPreview.officeJsPreviewStrings.Hour
import typings.officeJsPreview.officeJsPreviewStrings.Minute
import typings.officeJsPreview.officeJsPreviewStrings.Month
import typings.officeJsPreview.officeJsPreviewStrings.Second
import typings.officeJsPreview.officeJsPreviewStrings.Year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents how to filter a date when filtering on values.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FilterDatetime extends js.Object {
  
  /**
    *
    * The date in ISO8601 format used to filter data.
    *
    * [Api set: ExcelApi 1.2]
    */
  var date: String = js.native
  
  /**
    *
    * How specific the date should be used to keep data. For example, if the date is 2005-04-02 and the specifity is set to "month", the filter operation will keep all rows with a date in the month of april 2009.
    *
    * [Api set: ExcelApi 1.2]
    */
  var specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second = js.native
}
object FilterDatetime {
  
  @scala.inline
  def apply(date: String, specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): FilterDatetime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDatetime]
  }
  
  @scala.inline
  implicit class FilterDatetimeOps[Self <: FilterDatetime] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificity(value: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): Self = this.set("specificity", value.asInstanceOf[js.Any])
  }
}
