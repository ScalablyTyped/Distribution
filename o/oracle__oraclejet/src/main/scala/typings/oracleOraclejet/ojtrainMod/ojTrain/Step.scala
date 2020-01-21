package typings.oracleOraclejet.ojtrainMod.ojTrain

import typings.oracleOraclejet.oracleOraclejetStrings.error
import typings.oracleOraclejet.oracleOraclejetStrings.fatal
import typings.oracleOraclejet.oracleOraclejetStrings.info
import typings.oracleOraclejet.oracleOraclejetStrings.warning
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

