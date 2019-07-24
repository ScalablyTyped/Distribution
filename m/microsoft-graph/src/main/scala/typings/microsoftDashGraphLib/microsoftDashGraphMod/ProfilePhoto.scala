package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilePhoto extends Entity {
  // The height of the photo. Read-only.
  var height: js.UndefOr[scala.Double] = js.undefined
  // The width of the photo. Read-only.
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ProfilePhoto {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ProfilePhoto = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilePhoto]
  }
}

