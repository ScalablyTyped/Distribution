package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonText {
  @scala.inline
  def apply(style: js.Object = null, text: String = null): AnonText = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

