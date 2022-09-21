package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReplayPolicy extends StObject
@JSImport("nats/lib/nats-base-client/types", "ReplayPolicy")
@js.native
object ReplayPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReplayPolicy & String] = js.native
  
  @js.native
  sealed trait Instant
    extends StObject
       with ReplayPolicy
  /* "instant" */ val Instant: typings.nats.typesMod.ReplayPolicy.Instant & String = js.native
  
  @js.native
  sealed trait Original
    extends StObject
       with ReplayPolicy
  /* "original" */ val Original: typings.nats.typesMod.ReplayPolicy.Original & String = js.native
}
