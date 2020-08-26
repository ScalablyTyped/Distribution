package typings.oracleOraclejet.ojvalidationBaseMod.RequiredValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ValidatorOptions extends js.Object {
  var hint: js.UndefOr[String] = js.native
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
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
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

