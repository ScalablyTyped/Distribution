package typings.podium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CriteriaFilterOptionsObject extends js.Object {
  /** if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag). */
  var all: js.UndefOr[Boolean] = js.native
  /** a tag string or array of tag strings. */
  var tags: js.UndefOr[String | js.Array[String]] = js.native
}

object CriteriaFilterOptionsObject {
  @scala.inline
  def apply(): CriteriaFilterOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriteriaFilterOptionsObject]
  }
  @scala.inline
  implicit class CriteriaFilterOptionsObjectOps[Self <: CriteriaFilterOptionsObject] (val x: Self) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: String | js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

