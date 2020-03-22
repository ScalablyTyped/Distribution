package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFont extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var font: AnonName
  var tint: js.UndefOr[Double] = js.undefined
}

object AnonFont {
  @scala.inline
  def apply(font: AnonName, align: String = null, tint: Int | Double = null): AnonFont = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (tint != null) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFont]
  }
}

