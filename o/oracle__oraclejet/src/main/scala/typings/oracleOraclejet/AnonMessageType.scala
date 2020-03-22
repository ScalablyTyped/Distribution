package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.error
import typings.oracleOraclejet.oracleOraclejetStrings.fatal
import typings.oracleOraclejet.oracleOraclejetStrings.info
import typings.oracleOraclejet.oracleOraclejetStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var messageType: js.UndefOr[info | error | fatal | warning] = js.undefined
  var visited: js.UndefOr[Boolean] = js.undefined
}

object AnonMessageType {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    messageType: info | error | fatal | warning = null,
    visited: js.UndefOr[Boolean] = js.undefined
  ): AnonMessageType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageType]
  }
}

