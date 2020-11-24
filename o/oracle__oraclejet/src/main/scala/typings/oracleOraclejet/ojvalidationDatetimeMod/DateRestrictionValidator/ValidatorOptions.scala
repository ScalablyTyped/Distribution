package typings.oracleOraclejet.ojvalidationDatetimeMod.DateRestrictionValidator

import typings.oracleOraclejet.oracleOraclejetStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ValidatorOptions extends js.Object {
  
  var dayFormatter: js.UndefOr[js.Function1[/* param0 */ DayFormatterInput, DayFormatterOutput | Null | all]] = js.native
  
  var messageDetail: js.UndefOr[String] = js.native
  
  var messageSummary: js.UndefOr[String] = js.native
}
object ValidatorOptions {
  
  @scala.inline
  def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  
  @scala.inline
  implicit class ValidatorOptionsOps[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    
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
    def setDayFormatter(value: /* param0 */ DayFormatterInput => DayFormatterOutput | Null | all): Self = this.set("dayFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDayFormatter: Self = this.set("dayFormatter", js.undefined)
    
    @scala.inline
    def setMessageDetail(value: String): Self = this.set("messageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDetail: Self = this.set("messageDetail", js.undefined)
    
    @scala.inline
    def setMessageSummary(value: String): Self = this.set("messageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageSummary: Self = this.set("messageSummary", js.undefined)
  }
}
