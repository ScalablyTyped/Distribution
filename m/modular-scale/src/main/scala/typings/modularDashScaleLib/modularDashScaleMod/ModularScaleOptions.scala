package typings
package modularDashScaleLib.modularDashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModularScaleOptions extends js.Object {
  /** The base font size (in pixels) to use for the type scale. Defaults to 16 */
  var base: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** The ratio to use in the generated type scale function. Defaults to ModularScaleRatio.goldenSection */
  var ratio: js.UndefOr[scala.Double] = js.undefined
}

object ModularScaleOptions {
  @scala.inline
  def apply(base: scala.Double | java.lang.String = null, ratio: scala.Int | scala.Double = null): ModularScaleOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModularScaleOptions]
  }
}

