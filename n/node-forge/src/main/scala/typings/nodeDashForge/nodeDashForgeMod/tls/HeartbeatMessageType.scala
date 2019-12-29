package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeartbeatMessageType with Double] = js.native
  /* 1 */ @js.native
  object heartbeat_request extends TopLevel[heartbeat_request with Double]
  
  /* 2 */ @js.native
  object heartbeat_response extends TopLevel[heartbeat_response with Double]
  
}

