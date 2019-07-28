package typings.atOracleOraclejet.ojtrainMod.ojTrainNs

import typings.atOracleOraclejet.atOracleOraclejetStrings.error
import typings.atOracleOraclejet.atOracleOraclejetStrings.fatal
import typings.atOracleOraclejet.atOracleOraclejetStrings.info
import typings.atOracleOraclejet.atOracleOraclejetStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Step extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: String
  var label: String
  var messageType: js.UndefOr[info | error | fatal | warning] = js.undefined
  var visited: js.UndefOr[Boolean] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    id: String,
    label: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    messageType: info | error | fatal | warning = null,
    visited: js.UndefOr[Boolean] = js.undefined
  ): Step = {
    val __obj = js.Dynamic.literal(id = id, label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited)
    __obj.asInstanceOf[Step]
  }
}

