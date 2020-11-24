package typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis

import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Converters extends js.Object {
  
  var days: js.UndefOr[Converter[String]] = js.native
  
  var default: js.UndefOr[Converter[String]] = js.native
  
  var hours: js.UndefOr[Converter[String]] = js.native
  
  var minutes: js.UndefOr[Converter[String]] = js.native
  
  var months: js.UndefOr[Converter[String]] = js.native
  
  var quarters: js.UndefOr[Converter[String]] = js.native
  
  var seconds: js.UndefOr[Converter[String]] = js.native
  
  var weeks: js.UndefOr[Converter[String]] = js.native
  
  var years: js.UndefOr[Converter[String]] = js.native
}
object Converters {
  
  @scala.inline
  def apply(): Converters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Converters]
  }
  
  @scala.inline
  implicit class ConvertersOps[Self <: Converters] (val x: Self) extends AnyVal {
    
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
    def setDays(value: Converter[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setDefault(value: Converter[String]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setHours(value: Converter[String]): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMinutes(value: Converter[String]): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setMonths(value: Converter[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setQuarters(value: Converter[String]): Self = this.set("quarters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarters: Self = this.set("quarters", js.undefined)
    
    @scala.inline
    def setSeconds(value: Converter[String]): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setWeeks(value: Converter[String]): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
    
    @scala.inline
    def setYears(value: Converter[String]): Self = this.set("years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
}
