package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsPayload extends js.Object {
  val tags: js.Array[String] = js.native
}

object TagsPayload {
  @scala.inline
  def apply(tags: js.Array[String]): TagsPayload = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsPayload]
  }
  @scala.inline
  implicit class TagsPayloadOps[Self <: TagsPayload] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

