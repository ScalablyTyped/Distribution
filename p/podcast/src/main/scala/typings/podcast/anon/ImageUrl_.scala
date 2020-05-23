package typings.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageUrl_ extends js.Object {
  var imageUrl: js.UndefOr[String] = js.undefined
}

object ImageUrl_ {
  @scala.inline
  def apply(imageUrl: String = null): ImageUrl_ = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl_]
  }
}

