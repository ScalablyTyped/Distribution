package typings.postmark.modelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "InboundMessageStatus")
@js.native
object InboundMessageStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.postmark.messageFilteringParametersMod.InboundMessageStatus & String] = js.native
  
  /* "blocked" */ val Blocked: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Blocked & String = js.native
  
  /* "failed" */ val Failed: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Failed & String = js.native
  
  /* "processed" */ val Processed: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Processed & String = js.native
  
  /* "queued" */ val Queued: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Queued & String = js.native
  
  /* "scheduled" */ val Scheduled: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Scheduled & String = js.native
  
  /* "sent" */ val Sent: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Sent & String = js.native
}
