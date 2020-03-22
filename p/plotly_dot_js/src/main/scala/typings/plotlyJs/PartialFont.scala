package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Font> */
trait PartialFont extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object PartialFont {
  @scala.inline
  def apply(color: Color = null, family: String = null, size: Int | Double = null): PartialFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFont]
  }
}

