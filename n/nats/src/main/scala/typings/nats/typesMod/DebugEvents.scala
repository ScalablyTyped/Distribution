package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DebugEvents extends StObject
@JSImport("nats/lib/nats-base-client/types", "DebugEvents")
@js.native
object DebugEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DebugEvents & String] = js.native
  
  @js.native
  sealed trait PingTimer
    extends StObject
       with DebugEvents
  /* "pingTimer" */ val PingTimer: typings.nats.typesMod.DebugEvents.PingTimer & String = js.native
  
  @js.native
  sealed trait Reconnecting
    extends StObject
       with DebugEvents
  /* "reconnecting" */ val Reconnecting: typings.nats.typesMod.DebugEvents.Reconnecting & String = js.native
  
  @js.native
  sealed trait StaleConnection
    extends StObject
       with DebugEvents
  /* "staleConnection" */ val StaleConnection: typings.nats.typesMod.DebugEvents.StaleConnection & String = js.native
}
