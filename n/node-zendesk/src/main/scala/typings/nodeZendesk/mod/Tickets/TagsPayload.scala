package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsPayload extends js.Object {
  val tags: js.Array[String]
}

object TagsPayload {
  @scala.inline
  def apply(tags: js.Array[String]): TagsPayload = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsPayload]
  }
}

