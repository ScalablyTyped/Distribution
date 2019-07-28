package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.error
import typings.atOracleOraclejet.atOracleOraclejetStrings.fatal
import typings.atOracleOraclejet.atOracleOraclejetStrings.info
import typings.atOracleOraclejet.atOracleOraclejetStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledError extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var messageType: js.UndefOr[info | error | fatal | warning] = js.undefined
  var visited: js.UndefOr[Boolean] = js.undefined
}

object Anon_DisabledError {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    messageType: info | error | fatal | warning = null,
    visited: js.UndefOr[Boolean] = js.undefined
  ): Anon_DisabledError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited)
    __obj.asInstanceOf[Anon_DisabledError]
  }
}

