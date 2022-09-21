package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionType extends StObject
@JSImport("peerjs", "ConnectionType")
@js.native
object ConnectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionType & String] = js.native
  
  @js.native
  sealed trait Data
    extends StObject
       with ConnectionType
  /* "data" */ val Data: typings.peerjs.mod.ConnectionType.Data & String = js.native
  
  @js.native
  sealed trait Media
    extends StObject
       with ConnectionType
  /* "media" */ val Media: typings.peerjs.mod.ConnectionType.Media & String = js.native
}
