package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "DebugEvents")
@js.native
object DebugEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.DebugEvents & String] = js.native
  
  /* "pingTimer" */ val PingTimer: typings.nats.typesMod.DebugEvents.PingTimer & String = js.native
  
  /* "reconnecting" */ val Reconnecting: typings.nats.typesMod.DebugEvents.Reconnecting & String = js.native
  
  /* "staleConnection" */ val StaleConnection: typings.nats.typesMod.DebugEvents.StaleConnection & String = js.native
}
