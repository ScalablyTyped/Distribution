package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionEnd with Double] = js.native
  /* 1 */ @js.native
  object client extends TopLevel[client with Double]
  
  /* 0 */ @js.native
  object server extends TopLevel[server with Double]
  
}

