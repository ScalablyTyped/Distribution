package typings.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImageUrl extends js.Object {
  var imageUrl: js.UndefOr[String] = js.undefined
}

trait Anon_Imageurl extends js.Object {
  var image_url: js.UndefOr[String] = js.undefined
}

object Anon_ImageUrl {
  @scala.inline
  def apply(imageUrl: String = null): Anon_ImageUrl = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    __obj.asInstanceOf[Anon_ImageUrl]
  }
}

object Anon_Imageurl {
  @scala.inline
  def apply(image_url: String = null): Anon_Imageurl = {
    val __obj = js.Dynamic.literal()
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    __obj.asInstanceOf[Anon_Imageurl]
  }
}

