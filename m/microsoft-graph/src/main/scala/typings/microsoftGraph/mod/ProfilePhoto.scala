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
  def apply(height: Int | Double = null, id: String = null, width: Int | Double = null): ProfilePhoto = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilePhoto]
  }
}

