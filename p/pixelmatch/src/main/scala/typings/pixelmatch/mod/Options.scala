package typings.pixelmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The color of anti-aliased pixels in the diff output.
    * @default [255, 255, 0]
    */
  var aaColor: js.UndefOr[RGBTuple] = js.undefined
  /**
    * Blending factor of unchanged pixels in the diff output.
    * Ranges from 0 for pure white to 1 for original brightness
    * @default 0.1
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * The color of differing pixels in the diff output.
    * @default [255, 0, 0]
    */
  var diffColor: js.UndefOr[RGBTuple] = js.undefined
  /**
    * An alternative color to use for dark on light differences to differentiate between "added" and "removed" parts.
    * If not provided, all differing pixels use the color specified by `diffColor`.
    * @default null
    */
  var diffColorAlt: js.UndefOr[RGBTuple] = js.undefined
  /**
    * Draw the diff over a transparent background (a mask), rather than over the original image.
    * Will not draw anti-aliased pixels (if detected)
    * @default false
    */
  var diffMask: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, disables detecting and ignoring anti-aliased pixels.
    * @default false
    */
  val includeAA: js.UndefOr[Boolean] = js.undefined
  /**
    * Matching threshold, ranges from 0 to 1. Smaller values make the comparison more sensitive.
    * @default 0.1
    */
  val threshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    aaColor: RGBTuple = null,
    alpha: js.UndefOr[Double] = js.undefined,
    diffColor: RGBTuple = null,
    diffColorAlt: RGBTuple = null,
    diffMask: js.UndefOr[Boolean] = js.undefined,
    includeAA: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (aaColor != null) __obj.updateDynamic("aaColor")(aaColor.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (diffColor != null) __obj.updateDynamic("diffColor")(diffColor.asInstanceOf[js.Any])
    if (diffColorAlt != null) __obj.updateDynamic("diffColorAlt")(diffColorAlt.asInstanceOf[js.Any])
    if (!js.isUndefined(diffMask)) __obj.updateDynamic("diffMask")(diffMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAA)) __obj.updateDynamic("includeAA")(includeAA.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

