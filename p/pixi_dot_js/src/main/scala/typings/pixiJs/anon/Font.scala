package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var font: Name
  var tint: js.UndefOr[Double] = js.undefined
}

object Font {
  @scala.inline
  def apply(font: Name, align: String = null, tint: js.UndefOr[Double] = js.undefined): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

