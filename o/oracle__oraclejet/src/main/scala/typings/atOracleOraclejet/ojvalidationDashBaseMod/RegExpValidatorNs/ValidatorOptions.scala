package typings.atOracleOraclejet.ojvalidationDashBaseMod.RegExpValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var messageDetail: js.UndefOr[String] = js.undefined
  var messageSummary: js.UndefOr[String] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    hint: String = null,
    messageDetail: String = null,
    messageSummary: String = null,
    pattern: String = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[ValidatorOptions]
  }
}

