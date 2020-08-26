package typings.oracleOraclejet.ojvalidationBaseMod.LengthValidator

import typings.oracleOraclejet.anon.Max
import typings.oracleOraclejet.anon.TooLong
import typings.oracleOraclejet.oracleOraclejetStrings.codePoint
import typings.oracleOraclejet.oracleOraclejetStrings.codeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ValidatorOptions extends js.Object {
  var countBy: js.UndefOr[codeUnit | codePoint] = js.native
  var hint: js.UndefOr[Max] = js.native
  var max: js.UndefOr[Double] = js.native
  var messageDetail: js.UndefOr[TooLong] = js.native
  var messageSummary: js.UndefOr[TooLong] = js.native
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
    def setCountBy(value: codeUnit | codePoint): Self = this.set("countBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountBy: Self = this.set("countBy", js.undefined)
    @scala.inline
    def setHint(value: Max): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMessageDetail(value: TooLong): Self = this.set("messageDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageDetail: Self = this.set("messageDetail", js.undefined)
    @scala.inline
    def setMessageSummary(value: TooLong): Self = this.set("messageSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageSummary: Self = this.set("messageSummary", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

