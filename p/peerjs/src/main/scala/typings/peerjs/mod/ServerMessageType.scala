package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServerMessageType extends StObject
@JSImport("peerjs", "ServerMessageType")
@js.native
object ServerMessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ServerMessageType & String] = js.native
  
  @js.native
  sealed trait Answer
    extends StObject
       with ServerMessageType
  /* "ANSWER" */ val Answer: typings.peerjs.mod.ServerMessageType.Answer & String = js.native
  
  @js.native
  sealed trait Candidate
    extends StObject
       with ServerMessageType
  /* "CANDIDATE" */ val Candidate: typings.peerjs.mod.ServerMessageType.Candidate & String = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with ServerMessageType
  /* "ERROR" */ val Error: typings.peerjs.mod.ServerMessageType.Error & String = js.native
  
  @js.native
  sealed trait Expire
    extends StObject
       with ServerMessageType
  /* "EXPIRE" */ val Expire: typings.peerjs.mod.ServerMessageType.Expire & String = js.native
  
  @js.native
  sealed trait Heartbeat
    extends StObject
       with ServerMessageType
  /* "HEARTBEAT" */ val Heartbeat: typings.peerjs.mod.ServerMessageType.Heartbeat & String = js.native
  
  @js.native
  sealed trait IdTaken
    extends StObject
       with ServerMessageType
  /* "ID-TAKEN" */ val IdTaken: typings.peerjs.mod.ServerMessageType.IdTaken & String = js.native
  
  @js.native
  sealed trait InvalidKey
    extends StObject
       with ServerMessageType
  /* "INVALID-KEY" */ val InvalidKey: typings.peerjs.mod.ServerMessageType.InvalidKey & String = js.native
  
  @js.native
  sealed trait Leave
    extends StObject
       with ServerMessageType
  /* "LEAVE" */ val Leave: typings.peerjs.mod.ServerMessageType.Leave & String = js.native
  
  @js.native
  sealed trait Offer
    extends StObject
       with ServerMessageType
  /* "OFFER" */ val Offer: typings.peerjs.mod.ServerMessageType.Offer & String = js.native
  
  @js.native
  sealed trait Open
    extends StObject
       with ServerMessageType
  /* "OPEN" */ val Open: typings.peerjs.mod.ServerMessageType.Open & String = js.native
}
