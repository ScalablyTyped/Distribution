package typings.playmusic.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtRef extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object ArtRef {
  @scala.inline
  def apply(url: String = null): ArtRef = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtRef]
  }
}

