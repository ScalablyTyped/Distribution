package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
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
  def apply(
    ids: js.Array[ZendeskID],
    source_comment: js.UndefOr[Null | String] = js.undefined,
    target_comment: js.UndefOr[Null | String] = js.undefined
  ): MergePayload = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (!js.isUndefined(source_comment)) __obj.updateDynamic("source_comment")(source_comment.asInstanceOf[js.Any])
    if (!js.isUndefined(target_comment)) __obj.updateDynamic("target_comment")(target_comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePayload]
  }
}

