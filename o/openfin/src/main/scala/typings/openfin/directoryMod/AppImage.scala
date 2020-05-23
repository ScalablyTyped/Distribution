package typings.openfin.directoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppImage extends js.Object {
  /**
    * Additional text description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Alt text to be displayed with the image.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * A URL that points to an image.
    */
  var url: String
}

object AppImage {
  @scala.inline
  def apply(url: String, description: String = null, tooltip: String = null): AppImage = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppImage]
  }
}

