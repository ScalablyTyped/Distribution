package typings.postmark.postmarkMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.OutboundMessageStatus")
@js.native
object OutboundMessageStatus extends js.Object {
  /* "processed" */ val Processed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Processed with String = js.native
  /* "queued" */ val Queued: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Queued with String = js.native
  /* "sent" */ val Sent: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Sent with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus with String
  ] = js.native
}

