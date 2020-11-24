package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionEnd extends js.Object
@JSImport("node-forge", "tls.ConnectionEnd")
@js.native
object ConnectionEnd extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionEnd with Double] = js.native
  
  @js.native
  sealed trait client extends ConnectionEnd
  /* 1 */ @js.native
  object client extends TopLevel[client with Double]
  
  @js.native
  sealed trait server extends ConnectionEnd
  /* 0 */ @js.native
  object server extends TopLevel[server with Double]
}
