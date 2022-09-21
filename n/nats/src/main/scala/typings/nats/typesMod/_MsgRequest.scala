package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MsgRequest extends StObject
object _MsgRequest {
  
  inline def LastForMsgRequest(last_by_subj: String): typings.nats.typesMod.LastForMsgRequest = {
    val __obj = js.Dynamic.literal(last_by_subj = last_by_subj.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nats.typesMod.LastForMsgRequest]
  }
  
  inline def SeqMsgRequest(seq: Double): typings.nats.typesMod.SeqMsgRequest = {
    val __obj = js.Dynamic.literal(seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nats.typesMod.SeqMsgRequest]
  }
}
