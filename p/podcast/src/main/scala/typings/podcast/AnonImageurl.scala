package typings.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageurl extends js.Object {
  var image_url: js.UndefOr[String] = js.undefined
}

object AnonImageurl {
  @scala.inline
  def apply(image_url: String = null): AnonImageurl = {
    val __obj = js.Dynamic.literal()
    if (image_url != null) __obj.updateDynamic("image_url")(image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImageurl]
  }
}

