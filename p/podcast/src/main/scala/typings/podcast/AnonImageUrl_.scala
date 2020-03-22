package typings.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageUrl_ extends js.Object {
  var imageUrl: js.UndefOr[String] = js.undefined
}

object AnonImageUrl_ {
  @scala.inline
  def apply(imageUrl: String = null): AnonImageUrl_ = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImageUrl_]
  }
}

