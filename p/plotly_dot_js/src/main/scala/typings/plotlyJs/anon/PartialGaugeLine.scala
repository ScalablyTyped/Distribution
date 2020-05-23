package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.GaugeLine> */
trait PartialGaugeLine extends js.Object {
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialGaugeLine {
  @scala.inline
  def apply(color: typings.plotlyJs.mod.Color = null, width: js.UndefOr[Double] = js.undefined): PartialGaugeLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGaugeLine]
  }
}

