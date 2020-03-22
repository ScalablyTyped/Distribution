package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.GaugeLine> */
trait PartialGaugeLine extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialGaugeLine {
  @scala.inline
  def apply(color: Color = null, width: Int | Double = null): PartialGaugeLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGaugeLine]
  }
}

