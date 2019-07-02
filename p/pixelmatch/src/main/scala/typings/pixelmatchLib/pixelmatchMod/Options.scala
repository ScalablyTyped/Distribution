package typings
package pixelmatchLib.pixelmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /* The color of anti-aliased pixels in the diff output. [255, 255, 0] by default. */
  var aaColor: js.UndefOr[RGBTuple] = js.undefined
  /* Blending factor of unchanged pixels in the diff output. Ranges from 0 for pure white to 1 for original brightness. 0.1 by default. */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /* The color of differing pixels in the diff output. [255, 0, 0] by default. */
  var diffColor: js.UndefOr[RGBTuple] = js.undefined
  /** If true, disables detecting and ignoring anti-aliased pixels. false by default. */
  val includeAA: js.UndefOr[scala.Boolean] = js.undefined
  /** Matching threshold, ranges from 0 to 1. Smaller values make the comparison more sensitive. 0.1 by default. */
  val threshold: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    aaColor: RGBTuple = null,
    alpha: scala.Int | scala.Double = null,
    diffColor: RGBTuple = null,
    includeAA: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (aaColor != null) __obj.updateDynamic("aaColor")(aaColor)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (diffColor != null) __obj.updateDynamic("diffColor")(diffColor)
    if (!js.isUndefined(includeAA)) __obj.updateDynamic("includeAA")(includeAA)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

