package typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator

import typings.oracleOraclejet.anon.Min
import typings.oracleOraclejet.anon.RangeOverflowRangeUnderflow
import typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ValidatorOptions extends js.Object {
  
  var converter: DateTimeConverter = js.native
  
  var hint: js.UndefOr[Min] = js.native
  
  var max: js.UndefOr[String] = js.native
  
  var messageDetail: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
  
  var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
  
  var min: js.UndefOr[String] = js.native
  
  var translationKey: js.UndefOr[String] = js.native
}
object ValidatorOptions {
  
  @scala.inline
  def apply(converter: DateTimeConverter): ValidatorOptions = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any])
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
    def setConverter(value: DateTimeConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: Min): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessageDetail(value: RangeOverflowRangeUnderflow): Self = this.set("messageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDetail: Self = this.set("messageDetail", js.undefined)
    
    @scala.inline
    def setMessageSummary(value: RangeOverflowRangeUnderflow): Self = this.set("messageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageSummary: Self = this.set("messageSummary", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setTranslationKey(value: String): Self = this.set("translationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslationKey: Self = this.set("translationKey", js.undefined)
  }
}
