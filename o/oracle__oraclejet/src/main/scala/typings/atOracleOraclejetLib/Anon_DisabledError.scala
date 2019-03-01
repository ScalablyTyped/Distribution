package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledError extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var messageType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.info | atOracleOraclejetLib.atOracleOraclejetLibStrings.error | atOracleOraclejetLib.atOracleOraclejetLibStrings.fatal | atOracleOraclejetLib.atOracleOraclejetLibStrings.warning
  ] = js.undefined
  var visited: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DisabledError {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    label: java.lang.String = null,
    messageType: atOracleOraclejetLib.atOracleOraclejetLibStrings.info | atOracleOraclejetLib.atOracleOraclejetLibStrings.error | atOracleOraclejetLib.atOracleOraclejetLibStrings.fatal | atOracleOraclejetLib.atOracleOraclejetLibStrings.warning = null,
    visited: js.UndefOr[scala.Boolean] = js.undefined
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

