package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeartbeatMessageType extends StObject
@JSImport("node-forge", "tls.HeartbeatMessageType")
@js.native
object HeartbeatMessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeartbeatMessageType with Double] = js.native
  
  @js.native
  sealed trait heartbeat_request extends HeartbeatMessageType
  /* 1 */ val heartbeat_request: typings.nodeForge.mod.tls.HeartbeatMessageType.heartbeat_request with Double = js.native
  
  @js.native
  sealed trait heartbeat_response extends HeartbeatMessageType
  /* 2 */ val heartbeat_response: typings.nodeForge.mod.tls.HeartbeatMessageType.heartbeat_response with Double = js.native
}
