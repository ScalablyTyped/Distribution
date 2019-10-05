package typings.pixiDotJs.PIXI.extras

import typings.pixiDotJs.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapTextStyle extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String | Anon_Name] = js.undefined
  var tint: js.UndefOr[Double] = js.undefined
}

object BitmapTextStyle {
  @scala.inline
  def apply(align: String = null, font: String | Anon_Name = null, tint: Int | Double = null): BitmapTextStyle = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (tint != null) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextStyle]
  }
}

