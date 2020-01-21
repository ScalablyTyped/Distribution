package typings.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "InboundMessagesFilteringParameters")
@js.native
class InboundMessagesFilteringParameters protected ()
  extends typings.postmark.messageFilteringParametersMod.InboundMessagesFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    mailboxHash: js.UndefOr[String],
    recipient: js.UndefOr[String],
    fromEmail: js.UndefOr[String],
    tag: js.UndefOr[String],
    status: js.UndefOr[typings.postmark.messageFilteringParametersMod.InboundMessageStatus],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    subject: js.UndefOr[String]
  ) = this()
}

