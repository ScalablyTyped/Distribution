package typings.mergeImg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginOptions extends js.Object {
  /**
    * Margin on bottom side of result image
    * @default 0
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * Margin on left side of result image
    * @default 0
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Margin on right side of result image
    * @default 0
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * Margin on top side of result image
    * @default 0
    */
  var top: js.UndefOr[Double] = js.undefined
}

object MarginOptions {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): MarginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginOptions]
  }
}

