package typings.modularScale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModularScaleOptions extends js.Object {
  /** The base font size (in pixels) to use for the type scale. Defaults to 16 */
  var base: js.UndefOr[Double | String] = js.undefined
  /** The ratio to use in the generated type scale function. Defaults to ModularScaleRatio.goldenSection */
  var ratio: js.UndefOr[Double] = js.undefined
}

object ModularScaleOptions {
  @scala.inline
  def apply(base: Double | String = null, ratio: js.UndefOr[Double] = js.undefined): ModularScaleOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModularScaleOptions]
  }
}

