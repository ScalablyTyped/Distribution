package typings.mergeImg.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDescriptor extends js.Object {
  /**
    * x offset to affect this image
    * @default 0
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * y offset to affect this image
    * @default 0
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * A single image source to concat
    */
  var src: String | Buffer
}

object ImageDescriptor {
  @scala.inline
  def apply(
    src: String | Buffer,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined
  ): ImageDescriptor = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDescriptor]
  }
}

