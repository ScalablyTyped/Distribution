package typings
package podcastLib.podcastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedItunesCategory extends js.Object {
  var subcats: js.UndefOr[js.Array[FeedItunesCategory]] = js.undefined
  var text: java.lang.String
}

object FeedItunesCategory {
  @scala.inline
  def apply(text: java.lang.String, subcats: js.Array[FeedItunesCategory] = null): FeedItunesCategory = {
    val __obj = js.Dynamic.literal(text = text)
    if (subcats != null) __obj.updateDynamic("subcats")(subcats)
    __obj.asInstanceOf[FeedItunesCategory]
  }
}

