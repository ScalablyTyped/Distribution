package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestStrategy extends StObject
@JSImport("nats/lib/nats-base-client/types", "RequestStrategy")
@js.native
object RequestStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RequestStrategy & String] = js.native
  
  @js.native
  sealed trait Count
    extends StObject
       with RequestStrategy
  /* "count" */ val Count: typings.nats.typesMod.RequestStrategy.Count & String = js.native
  
  @js.native
  sealed trait JitterTimer
    extends StObject
       with RequestStrategy
  /* "jitterTimer" */ val JitterTimer: typings.nats.typesMod.RequestStrategy.JitterTimer & String = js.native
  
  @js.native
  sealed trait SentinelMsg
    extends StObject
       with RequestStrategy
  /* "sentinelMsg" */ val SentinelMsg: typings.nats.typesMod.RequestStrategy.SentinelMsg & String = js.native
  
  @js.native
  sealed trait Timer
    extends StObject
       with RequestStrategy
  /* "timer" */ val Timer: typings.nats.typesMod.RequestStrategy.Timer & String = js.native
}
