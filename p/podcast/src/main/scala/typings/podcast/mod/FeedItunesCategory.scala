package typings.podcast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedItunesCategory extends js.Object {
  var subcats: js.UndefOr[js.Array[FeedItunesCategory]] = js.native
  var text: String = js.native
}

object FeedItunesCategory {
  @scala.inline
  def apply(text: String): FeedItunesCategory = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedItunesCategory]
  }
  @scala.inline
  implicit class FeedItunesCategoryOps[Self <: FeedItunesCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubcatsVarargs(value: FeedItunesCategory*): Self = this.set("subcats", js.Array(value :_*))
    @scala.inline
    def setSubcats(value: js.Array[FeedItunesCategory]): Self = this.set("subcats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubcats: Self = this.set("subcats", js.undefined)
  }
  
}

