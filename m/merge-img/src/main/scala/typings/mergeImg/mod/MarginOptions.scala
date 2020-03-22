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
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): MarginOptions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginOptions]
  }
}

