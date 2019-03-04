package typings
package atOracleOraclejetLib.ojtrainMod.ojTrainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Step extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var label: java.lang.String
  var messageType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.info | atOracleOraclejetLib.atOracleOraclejetLibStrings.error | atOracleOraclejetLib.atOracleOraclejetLibStrings.fatal | atOracleOraclejetLib.atOracleOraclejetLibStrings.warning
  ] = js.undefined
  var visited: js.UndefOr[scala.Boolean] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    id: java.lang.String,
    label: java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    messageType: atOracleOraclejetLib.atOracleOraclejetLibStrings.info | atOracleOraclejetLib.atOracleOraclejetLibStrings.error | atOracleOraclejetLib.atOracleOraclejetLibStrings.fatal | atOracleOraclejetLib.atOracleOraclejetLibStrings.warning = null,
    visited: js.UndefOr[scala.Boolean] = js.undefined
  ): Step = {
    val __obj = js.Dynamic.literal(id = id, label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited)
    __obj.asInstanceOf[Step]
  }
}

