package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
@JSImport("nats/lib/nats-base-client/types", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Events & String] = js.native
  
  @js.native
  sealed trait Disconnect
    extends StObject
       with Events
  /* "disconnect" */ val Disconnect: typings.nats.typesMod.Events.Disconnect & String = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with Events
  /* "error" */ val Error: typings.nats.typesMod.Events.Error & String = js.native
  
  @js.native
  sealed trait LDM
    extends StObject
       with Events
  /* "ldm" */ val LDM: typings.nats.typesMod.Events.LDM & String = js.native
  
  @js.native
  sealed trait Reconnect
    extends StObject
       with Events
  /* "reconnect" */ val Reconnect: typings.nats.typesMod.Events.Reconnect & String = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with Events
  /* "update" */ val Update: typings.nats.typesMod.Events.Update & String = js.native
}
