package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  // Optional. Height of the image, in pixels. Read-only.
  var height: js.UndefOr[Double] = js.undefined
  // Optional. Width of the image, in pixels. Read-only.
  var width: js.UndefOr[Double] = js.undefined
}

object Image {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): Image = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

