package typings.postmark.postmarkMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.InboundMessageStatus")
@js.native
object InboundMessageStatus extends js.Object {
  /* "blocked" */ val Blocked: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Blocked with String = js.native
  /* "failed" */ val Failed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Failed with String = js.native
  /* "processed" */ val Processed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Processed with String = js.native
  /* "queued" */ val Queued: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Queued with String = js.native
  /* "scheduled" */ val Scheduled: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Scheduled with String = js.native
  /* "sent" */ val Sent: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Sent with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus with String
  ] = js.native
}

