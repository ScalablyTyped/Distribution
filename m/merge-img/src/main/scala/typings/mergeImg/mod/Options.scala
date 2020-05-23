package typings.mergeImg.mod

import typings.mergeImg.mergeImgStrings.center
import typings.mergeImg.mergeImgStrings.end
import typings.mergeImg.mergeImgStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Aligning of given images. If the images are not all the same size, images will be sorted to largest image
    * @default 'start'
    */
  var align: js.UndefOr[start | center | end] = js.undefined
  /**
    * Default background color represented by RGBA hex value.
    * @default 0x00000000
    */
  var color: js.UndefOr[Double] = js.undefined
  /**
    * Direction of the merged image. If this value is true, the images will be merged vertically (column).
    * Otherwise, the images will be merged horizontally (row)
    * @default false
    */
  var direction: js.UndefOr[Boolean] = js.undefined
  /**
    * Margin of the result image.
    * If `number` or `string` is passed, it will be considered as standard
    * css shorthand properties (e.g. '40 40 0 10')
    */
  var margin: js.UndefOr[Double | String | MarginOptions] = js.undefined
  /**
    * Offset in pixels between each image
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: start | center | end = null,
    color: js.UndefOr[Double] = js.undefined,
    direction: js.UndefOr[Boolean] = js.undefined,
    margin: Double | String | MarginOptions = null,
    offset: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

