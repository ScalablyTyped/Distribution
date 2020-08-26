package typings.oracleOraclejet.ojvalidationNumberMod.NumberRangeValidator

import typings.oracleOraclejet.anon.ExactRangeOverflow
import typings.oracleOraclejet.anon.Max
import typings.oracleOraclejet.anon.RangeOverflowRangeUnderflow
import typings.oracleOraclejet.ojvalidationNumberMod.NumberConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ValidatorOptions extends js.Object {
  var converter: js.UndefOr[NumberConverter] = js.native
  var hint: js.UndefOr[Max] = js.native
  var max: js.UndefOr[Double] = js.native
  var messageDetail: js.UndefOr[ExactRangeOverflow] = js.native
  var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
  var min: js.UndefOr[Double] = js.native
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
    def setConverter(value: NumberConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setHint(value: Max): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMessageDetail(value: ExactRangeOverflow): Self = this.set("messageDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageDetail: Self = this.set("messageDetail", js.undefined)
    @scala.inline
    def setMessageSummary(value: RangeOverflowRangeUnderflow): Self = this.set("messageSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageSummary: Self = this.set("messageSummary", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

