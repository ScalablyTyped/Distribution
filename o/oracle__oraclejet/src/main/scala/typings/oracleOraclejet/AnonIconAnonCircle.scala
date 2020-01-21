package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconAnonCircle extends js.Object {
  var icon: js.UndefOr[AnonCircle] = js.undefined
}

object AnonIconAnonCircle {
  @scala.inline
  def apply(icon: AnonCircle = null): AnonIconAnonCircle = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIconAnonCircle]
  }
}

