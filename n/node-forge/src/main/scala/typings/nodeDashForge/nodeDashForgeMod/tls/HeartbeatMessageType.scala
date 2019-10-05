package typings.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeartbeatMessageType extends js.Object

@JSImport("node-forge", "tls.HeartbeatMessageType")
@js.native
object HeartbeatMessageType extends js.Object {
  @js.native
  sealed trait heartbeat_request extends HeartbeatMessageType
  
  @js.native
  sealed trait heartbeat_response extends HeartbeatMessageType
  
  /* 1 */ val heartbeat_request: typings.nodeDashForge.nodeDashForgeMod.tls.HeartbeatMessageType.heartbeat_request with Double = js.native
  /* 2 */ val heartbeat_response: typings.nodeDashForge.nodeDashForgeMod.tls.HeartbeatMessageType.heartbeat_response with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeartbeatMessageType with Double] = js.native
}

