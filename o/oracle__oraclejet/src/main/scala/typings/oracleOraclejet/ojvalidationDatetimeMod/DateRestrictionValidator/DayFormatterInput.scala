package typings.oracleOraclejet.ojvalidationDatetimeMod.DateRestrictionValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait DayFormatterInput extends js.Object {
  
  var date: Double = js.native
  
  var fullYear: Double = js.native
  
  var month: Double = js.native
}
object DayFormatterInput {
  
  @scala.inline
  def apply(date: Double, fullYear: Double, month: Double): DayFormatterInput = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fullYear = fullYear.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayFormatterInput]
  }
  
  @scala.inline
  implicit class DayFormatterInputOps[Self <: DayFormatterInput] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullYear(value: Double): Self = this.set("fullYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
  }
}
