package typings
package nextDashNprogressLib.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NProgressProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[stdLib.Partial[nprogressLib.nprogressMod.NProgressOptions]] = js.undefined
  var showAfterMs: js.UndefOr[scala.Double] = js.undefined
  var spinner: js.UndefOr[scala.Boolean] = js.undefined
}

object NProgressProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    options: stdLib.Partial[nprogressLib.nprogressMod.NProgressOptions] = null,
    showAfterMs: scala.Int | scala.Double = null,
    spinner: js.UndefOr[scala.Boolean] = js.undefined
  ): NProgressProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (options != null) __obj.updateDynamic("options")(options)
    if (showAfterMs != null) __obj.updateDynamic("showAfterMs")(showAfterMs.asInstanceOf[js.Any])
    if (!js.isUndefined(spinner)) __obj.updateDynamic("spinner")(spinner)
    __obj.asInstanceOf[NProgressProps]
  }
}

