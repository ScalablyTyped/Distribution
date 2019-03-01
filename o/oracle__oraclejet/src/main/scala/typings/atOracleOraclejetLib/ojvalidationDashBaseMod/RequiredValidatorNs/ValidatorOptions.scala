package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod.RequiredValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var messageDetail: js.UndefOr[java.lang.String] = js.undefined
  var messageSummary: js.UndefOr[java.lang.String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    hint: java.lang.String = null,
    messageDetail: java.lang.String = null,
    messageSummary: java.lang.String = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    __obj.asInstanceOf[ValidatorOptions]
  }
}

