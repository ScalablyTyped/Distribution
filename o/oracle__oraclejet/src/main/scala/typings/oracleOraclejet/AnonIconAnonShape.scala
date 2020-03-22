package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconAnonShape extends js.Object {
  var icon: js.UndefOr[AnonShape] = js.undefined
}

object AnonIconAnonShape {
  @scala.inline
  def apply(icon: AnonShape = null): AnonIconAnonShape = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIconAnonShape]
  }
}

