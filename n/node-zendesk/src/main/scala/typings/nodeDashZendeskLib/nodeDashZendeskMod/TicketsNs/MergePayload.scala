package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePayload extends js.Object {
  val ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID]
  val source_comment: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val target_comment: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object MergePayload {
  @scala.inline
  def apply(
    ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID],
    source_comment: java.lang.String = null,
    target_comment: java.lang.String = null
  ): MergePayload = {
    val __obj = js.Dynamic.literal(ids = ids)
    if (source_comment != null) __obj.updateDynamic("source_comment")(source_comment)
    if (target_comment != null) __obj.updateDynamic("target_comment")(target_comment)
    __obj.asInstanceOf[MergePayload]
  }
}

