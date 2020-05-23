package typings.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imageurl extends js.Object {
  var image_url: js.UndefOr[String] = js.undefined
}

object Imageurl {
  @scala.inline
  def apply(image_url: String = null): Imageurl = {
    val __obj = js.Dynamic.literal()
    if (image_url != null) __obj.updateDynamic("image_url")(image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imageurl]
  }
}

