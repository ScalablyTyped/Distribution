package typings.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionEnd extends js.Object

@JSImport("node-forge", "tls.ConnectionEnd")
@js.native
object ConnectionEnd extends js.Object {
  @js.native
  sealed trait client extends ConnectionEnd
  
  @js.native
  sealed trait server extends ConnectionEnd
  
  /* 1 */ val client: typings.nodeDashForge.nodeDashForgeMod.tls.ConnectionEnd.client with Double = js.native
  /* 0 */ val server: typings.nodeDashForge.nodeDashForgeMod.tls.ConnectionEnd.server with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionEnd with Double] = js.native
}

