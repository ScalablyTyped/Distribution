package typings.oracleOraclejet.ojvalidationDatetimeMod.IntlDateTimeConverter

import typings.oracleOraclejet.oracleOraclejetStrings.`2-digit`
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.date
import typings.oracleOraclejet.oracleOraclejetStrings.datetime
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.local
import typings.oracleOraclejet.oracleOraclejetStrings.long
import typings.oracleOraclejet.oracleOraclejetStrings.medium
import typings.oracleOraclejet.oracleOraclejetStrings.narrow
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.numeric
import typings.oracleOraclejet.oracleOraclejetStrings.offset
import typings.oracleOraclejet.oracleOraclejetStrings.short
import typings.oracleOraclejet.oracleOraclejetStrings.time
import typings.oracleOraclejet.oracleOraclejetStrings.zulu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ConverterOptions extends js.Object {
  
  var dateFormat: js.UndefOr[short | medium | long | full] = js.native
  
  var day: js.UndefOr[`2-digit` | numeric] = js.native
  
  var dst: js.UndefOr[Boolean] = js.native
  
  var era: js.UndefOr[narrow | short | long] = js.native
  
  var formatType: js.UndefOr[date | time | datetime] = js.native
  
  var hour: js.UndefOr[`2-digit` | numeric] = js.native
  
  var hour12: js.UndefOr[Boolean] = js.native
  
  var isoStrFormat: js.UndefOr[offset | zulu | local | auto] = js.native
  
  var lenientParse: js.UndefOr[full | none] = js.native
  
  var millisecond: js.UndefOr[numeric] = js.native
  
  var minute: js.UndefOr[`2-digit` | numeric] = js.native
  
  var month: js.UndefOr[`2-digit` | numeric | narrow | short | long] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  var second: js.UndefOr[`2-digit` | numeric] = js.native
  
  var timeFormat: js.UndefOr[short | medium | long | full] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var timeZoneName: js.UndefOr[short | long] = js.native
  
  var `two-digit-year-start`: js.UndefOr[Double] = js.native
  
  var weekday: js.UndefOr[narrow | short | long] = js.native
  
  var year: js.UndefOr[`2-digit` | numeric] = js.native
}
object ConverterOptions {
  
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
    
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
    def setDateFormat(value: short | medium | long | full): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDay(value: `2-digit` | numeric): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setDst(value: Boolean): Self = this.set("dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDst: Self = this.set("dst", js.undefined)
    
    @scala.inline
    def setEra(value: narrow | short | long): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEra: Self = this.set("era", js.undefined)
    
    @scala.inline
    def setFormatType(value: date | time | datetime): Self = this.set("formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatType: Self = this.set("formatType", js.undefined)
    
    @scala.inline
    def setHour(value: `2-digit` | numeric): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setHour12(value: Boolean): Self = this.set("hour12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour12: Self = this.set("hour12", js.undefined)
    
    @scala.inline
    def setIsoStrFormat(value: offset | zulu | local | auto): Self = this.set("isoStrFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsoStrFormat: Self = this.set("isoStrFormat", js.undefined)
    
    @scala.inline
    def setLenientParse(value: full | none): Self = this.set("lenientParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLenientParse: Self = this.set("lenientParse", js.undefined)
    
    @scala.inline
    def setMillisecond(value: numeric): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    
    @scala.inline
    def setMinute(value: `2-digit` | numeric): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setSecond(value: `2-digit` | numeric): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: short | medium | long | full): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneName(value: short | long): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneName: Self = this.set("timeZoneName", js.undefined)
    
    @scala.inline
    def `setTwo-digit-year-start`(value: Double): Self = this.set("two-digit-year-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTwo-digit-year-start`: Self = this.set("two-digit-year-start", js.undefined)
    
    @scala.inline
    def setWeekday(value: narrow | short | long): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    
    @scala.inline
    def setYear(value: `2-digit` | numeric): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
