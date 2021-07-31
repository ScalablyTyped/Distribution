package typings.postmark.modelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "OutboundMessageStatus")
@js.native
object OutboundMessageStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.postmark.messageFilteringParametersMod.OutboundMessageStatus & String] = js.native
  
  /* "processed" */ val Processed: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Processed & String = js.native
  
  /* "queued" */ val Queued: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Queued & String = js.native
  
  /* "sent" */ val Sent: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Sent & String = js.native
}
