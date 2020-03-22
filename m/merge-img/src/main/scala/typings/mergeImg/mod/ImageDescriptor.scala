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
  def apply(src: String | Buffer, offsetX: Int | Double = null, offsetY: Int | Double = null): ImageDescriptor = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDescriptor]
  }
}

