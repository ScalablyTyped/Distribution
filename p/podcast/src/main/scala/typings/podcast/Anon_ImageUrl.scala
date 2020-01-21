package typings.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImageUrl extends js.Object {
  var imageUrl: js.UndefOr[String] = js.undefined
}

object Anon_ImageUrl {
  @scala.inline
  def apply(imageUrl: String = null): Anon_ImageUrl = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImageUrl]
  }
}

