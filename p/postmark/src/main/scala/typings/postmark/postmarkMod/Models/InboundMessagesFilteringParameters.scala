package typings.postmark.postmarkMod.Models

import typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.InboundMessagesFilteringParameters")
@js.native
class InboundMessagesFilteringParameters protected ()
  extends typings.postmark.distClientModelsMod.InboundMessagesFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    mailboxHash: js.UndefOr[String],
    recipient: js.UndefOr[String],
    fromEmail: js.UndefOr[String],
    tag: js.UndefOr[String],
    status: js.UndefOr[InboundMessageStatus],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    subject: js.UndefOr[String]
  ) = this()
}

