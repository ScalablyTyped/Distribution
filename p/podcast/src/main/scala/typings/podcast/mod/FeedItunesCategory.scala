package typings.podcast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedItunesCategory extends js.Object {
  var subcats: js.UndefOr[js.Array[FeedItunesCategory]] = js.undefined
  var text: String
}

object FeedItunesCategory {
  @scala.inline
  def apply(text: String, subcats: js.Array[FeedItunesCategory] = null): FeedItunesCategory = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (subcats != null) __obj.updateDynamic("subcats")(subcats.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedItunesCategory]
  }
}

