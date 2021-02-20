package typings.postmark.modelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "OutboundMessageStatus")
@js.native
object OutboundMessageStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.postmark.messageFilteringParametersMod.OutboundMessageStatus with String] = js.native
  
  /* "processed" */ val Processed: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Processed with String = js.native
  
  /* "queued" */ val Queued: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Queued with String = js.native
  
  /* "sent" */ val Sent: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Sent with String = js.native
}
