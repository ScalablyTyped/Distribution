package typings
package atOracleOraclejetLib.ojmessageMod.ojMessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Message extends js.Object {
  var autoTimeout: js.UndefOr[scala.Double] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var closeAffordance: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.defaults
  ] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var severity: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.error | atOracleOraclejetLib.atOracleOraclejetLibStrings.warning | atOracleOraclejetLib.atOracleOraclejetLibStrings.confirmation | atOracleOraclejetLib.atOracleOraclejetLibStrings.info | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    autoTimeout: scala.Int | scala.Double = null,
    category: java.lang.String = null,
    closeAffordance: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.defaults = null,
    detail: java.lang.String = null,
    icon: java.lang.String = null,
    severity: atOracleOraclejetLib.atOracleOraclejetLibStrings.error | atOracleOraclejetLib.atOracleOraclejetLibStrings.warning | atOracleOraclejetLib.atOracleOraclejetLibStrings.confirmation | atOracleOraclejetLib.atOracleOraclejetLibStrings.info | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = null,
    sound: java.lang.String = null,
    summary: java.lang.String = null,
    timestamp: java.lang.String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (autoTimeout != null) __obj.updateDynamic("autoTimeout")(autoTimeout.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (closeAffordance != null) __obj.updateDynamic("closeAffordance")(closeAffordance.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Message]
  }
}

