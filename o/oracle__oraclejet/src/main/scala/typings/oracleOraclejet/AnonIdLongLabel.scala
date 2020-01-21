package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdLongLabel extends js.Object {
  var id: String
  var longLabel: js.UndefOr[String] = js.undefined
  var shortLabel: js.UndefOr[String] = js.undefined
}

object AnonIdLongLabel {
  @scala.inline
  def apply(id: String, longLabel: String = null, shortLabel: String = null): AnonIdLongLabel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (longLabel != null) __obj.updateDynamic("longLabel")(longLabel.asInstanceOf[js.Any])
    if (shortLabel != null) __obj.updateDynamic("shortLabel")(shortLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdLongLabel]
  }
}

