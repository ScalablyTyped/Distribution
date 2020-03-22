package typings.nextNprogress.componentMod

import typings.nextNprogress.PartialNProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NProgressProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[PartialNProgressOptions] = js.undefined
  var showAfterMs: js.UndefOr[Double] = js.undefined
  var spinner: js.UndefOr[Boolean] = js.undefined
}

object NProgressProps {
  @scala.inline
  def apply(
    color: String = null,
    options: PartialNProgressOptions = null,
    showAfterMs: Int | Double = null,
    spinner: js.UndefOr[Boolean] = js.undefined
  ): NProgressProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (showAfterMs != null) __obj.updateDynamic("showAfterMs")(showAfterMs.asInstanceOf[js.Any])
    if (!js.isUndefined(spinner)) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    __obj.asInstanceOf[NProgressProps]
  }
}

