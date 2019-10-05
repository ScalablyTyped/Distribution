package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePayload extends js.Object {
  val ids: js.Array[ZendeskID]
  val source_comment: js.UndefOr[String | Null] = js.undefined
  val target_comment: js.UndefOr[String | Null] = js.undefined
}

object MergePayload {
  @scala.inline
  def apply(ids: js.Array[ZendeskID], source_comment: String = null, target_comment: String = null): MergePayload = {
    val __obj = js.Dynamic.literal(ids = ids)
    if (source_comment != null) __obj.updateDynamic("source_comment")(source_comment)
    if (target_comment != null) __obj.updateDynamic("target_comment")(target_comment)
    __obj.asInstanceOf[MergePayload]
  }
}

