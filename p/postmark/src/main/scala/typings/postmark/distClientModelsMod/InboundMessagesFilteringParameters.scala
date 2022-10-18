package typings.postmark.distClientModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "InboundMessagesFilteringParameters")
@js.native
open class InboundMessagesFilteringParameters protected ()
  extends typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessagesFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    mailboxHash: js.UndefOr[String],
    recipient: js.UndefOr[String],
    fromEmail: js.UndefOr[String],
    tag: js.UndefOr[String],
    status: js.UndefOr[
        typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus
      ],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    subject: js.UndefOr[String]
  ) = this()
}
