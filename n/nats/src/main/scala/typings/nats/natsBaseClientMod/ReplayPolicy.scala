package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "ReplayPolicy")
@js.native
object ReplayPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.ReplayPolicy & String] = js.native
  
  /* "instant" */ val Instant: typings.nats.typesMod.ReplayPolicy.Instant & String = js.native
  
  /* "original" */ val Original: typings.nats.typesMod.ReplayPolicy.Original & String = js.native
}
