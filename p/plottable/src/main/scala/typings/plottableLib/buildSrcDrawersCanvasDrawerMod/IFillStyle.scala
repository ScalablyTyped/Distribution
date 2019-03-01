package typings
package plottableLib.buildSrcDrawersCanvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFillStyle extends js.Object {
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var `fill-opacity`: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object IFillStyle {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    `fill-opacity`: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null
  ): IFillStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFillStyle]
  }
}

