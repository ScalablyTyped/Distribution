package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconShape extends js.Object {
  var icon: js.UndefOr[Shape] = js.undefined
}

object IconShape {
  @scala.inline
  def apply(icon: Shape = null): IconShape = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconShape]
  }
}

