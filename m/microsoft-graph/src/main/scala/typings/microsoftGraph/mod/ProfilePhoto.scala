package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilePhoto extends Entity {
  // The height of the photo. Read-only.
  var height: js.UndefOr[Double] = js.undefined
  // The width of the photo. Read-only.
  var width: js.UndefOr[Double] = js.undefined
}

object ProfilePhoto {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ProfilePhoto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilePhoto]
  }
}

