package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.Events & String] = js.native
  
  /* "disconnect" */ val Disconnect: typings.nats.typesMod.Events.Disconnect & String = js.native
  
  /* "error" */ val Error: typings.nats.typesMod.Events.Error & String = js.native
  
  /* "ldm" */ val LDM: typings.nats.typesMod.Events.LDM & String = js.native
  
  /* "reconnect" */ val Reconnect: typings.nats.typesMod.Events.Reconnect & String = js.native
  
  /* "update" */ val Update: typings.nats.typesMod.Events.Update & String = js.native
}
