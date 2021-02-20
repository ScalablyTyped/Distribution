package typings.postmark.modelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "InboundMessageStatus")
@js.native
object InboundMessageStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.postmark.messageFilteringParametersMod.InboundMessageStatus with String] = js.native
  
  /* "blocked" */ val Blocked: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Blocked with String = js.native
  
  /* "failed" */ val Failed: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Failed with String = js.native
  
  /* "processed" */ val Processed: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Processed with String = js.native
  
  /* "queued" */ val Queued: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Queued with String = js.native
  
  /* "scheduled" */ val Scheduled: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Scheduled with String = js.native
  
  /* "sent" */ val Sent: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Sent with String = js.native
}
