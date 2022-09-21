package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketEventType extends StObject
@JSImport("peerjs", "SocketEventType")
@js.native
object SocketEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SocketEventType & String] = js.native
  
  @js.native
  sealed trait Close
    extends StObject
       with SocketEventType
  /* "close" */ val Close: typings.peerjs.mod.SocketEventType.Close & String = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with SocketEventType
  /* "disconnected" */ val Disconnected: typings.peerjs.mod.SocketEventType.Disconnected & String = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with SocketEventType
  /* "error" */ val Error: typings.peerjs.mod.SocketEventType.Error & String = js.native
  
  @js.native
  sealed trait Message
    extends StObject
       with SocketEventType
  /* "message" */ val Message: typings.peerjs.mod.SocketEventType.Message & String = js.native
}
