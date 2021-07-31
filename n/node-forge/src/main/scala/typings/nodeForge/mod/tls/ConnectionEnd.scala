package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionEnd extends StObject
@JSImport("node-forge", "tls.ConnectionEnd")
@js.native
object ConnectionEnd extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionEnd & Double] = js.native
  
  @js.native
  sealed trait client
    extends StObject
       with ConnectionEnd
  /* 1 */ val client: typings.nodeForge.mod.tls.ConnectionEnd.client & Double = js.native
  
  @js.native
  sealed trait server
    extends StObject
       with ConnectionEnd
  /* 0 */ val server: typings.nodeForge.mod.tls.ConnectionEnd.server & Double = js.native
}
