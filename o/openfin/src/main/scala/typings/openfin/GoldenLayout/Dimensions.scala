package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  /**
    * The width of the borders between the layout items in pixel. Please note: The actual draggable area is wider
    * than the visible one, making it safe to set this to small values without affecting usability.
    * Default: 5
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * The height of the element that appears when an item is dragged (in pixel).
    * Default: 200
    */
  var dragProxyHeight: js.UndefOr[Double] = js.undefined
  /**
    * The width of the element that appears when an item is dragged (in pixel).
    * Default: 300
    */
  var dragProxyWidth: js.UndefOr[Double] = js.undefined
  /**
    * The height of the header elements in pixel. This can be changed, but your theme's header css needs to be
    * adjusted accordingly.
    * Default: 20
    */
  var headerHeight: js.UndefOr[Double] = js.undefined
  /**
    * The minimum height an item can be resized to (in pixel).
    * Default: 10
    */
  var minItemHeight: js.UndefOr[Double] = js.undefined
  /**
    * The minimum width an item can be resized to (in pixel).
    * Default: 10
    */
  var minItemWidth: js.UndefOr[Double] = js.undefined
}

object Dimensions {
  @scala.inline
  def apply(
    borderWidth: js.UndefOr[Double] = js.undefined,
    dragProxyHeight: js.UndefOr[Double] = js.undefined,
    dragProxyWidth: js.UndefOr[Double] = js.undefined,
    headerHeight: js.UndefOr[Double] = js.undefined,
    minItemHeight: js.UndefOr[Double] = js.undefined,
    minItemWidth: js.UndefOr[Double] = js.undefined
  ): Dimensions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragProxyHeight)) __obj.updateDynamic("dragProxyHeight")(dragProxyHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragProxyWidth)) __obj.updateDynamic("dragProxyWidth")(dragProxyWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItemHeight)) __obj.updateDynamic("minItemHeight")(minItemHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItemWidth)) __obj.updateDynamic("minItemWidth")(minItemWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

