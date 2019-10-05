package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsPayload extends js.Object {
  val tags: js.Array[String]
}

object TagsPayload {
  @scala.inline
  def apply(tags: js.Array[String]): TagsPayload = {
    val __obj = js.Dynamic.literal(tags = tags)
  
    __obj.asInstanceOf[TagsPayload]
  }
}

