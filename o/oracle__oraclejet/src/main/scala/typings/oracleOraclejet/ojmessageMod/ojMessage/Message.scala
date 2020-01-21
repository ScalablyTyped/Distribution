package typings.oracleOraclejet.ojmessageMod.ojMessage

import typings.oracleOraclejet.oracleOraclejetStrings.confirmation
import typings.oracleOraclejet.oracleOraclejetStrings.defaults
import typings.oracleOraclejet.oracleOraclejetStrings.error
import typings.oracleOraclejet.oracleOraclejetStrings.info
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Message extends js.Object {
  var autoTimeout: js.UndefOr[Double] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var closeAffordance: js.UndefOr[none | defaults] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var severity: js.UndefOr[error | warning | confirmation | info | none] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    autoTimeout: Int | Double = null,
    category: String = null,
    closeAffordance: none | defaults = null,
    detail: String = null,
    icon: String = null,
    severity: error | warning | confirmation | info | none = null,
    sound: String = null,
    summary: String = null,
    timestamp: String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (autoTimeout != null) __obj.updateDynamic("autoTimeout")(autoTimeout.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (closeAffordance != null) __obj.updateDynamic("closeAffordance")(closeAffordance.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

