package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelNone extends js.Object {
  var labelNone: js.UndefOr[String] = js.undefined
}

object AnonLabelNone {
  @scala.inline
  def apply(labelNone: String = null): AnonLabelNone = {
    val __obj = js.Dynamic.literal()
    if (labelNone != null) __obj.updateDynamic("labelNone")(labelNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelNone]
  }
}

