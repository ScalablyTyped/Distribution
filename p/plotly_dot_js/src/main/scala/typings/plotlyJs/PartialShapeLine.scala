package typings.plotlyJs

import typings.plotlyJs.mod.Dash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ShapeLine> */
trait PartialShapeLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dash: js.UndefOr[Dash] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialShapeLine {
  @scala.inline
  def apply(color: String = null, dash: Dash = null, width: Int | Double = null): PartialShapeLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialShapeLine]
  }
}

