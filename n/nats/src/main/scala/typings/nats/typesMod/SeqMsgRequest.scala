package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeqMsgRequest
  extends StObject
     with _MsgRequest {
  
  var seq: Double
}
object SeqMsgRequest {
  
  inline def apply(seq: Double): SeqMsgRequest = {
    val __obj = js.Dynamic.literal(seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqMsgRequest]
  }
  
  extension [Self <: SeqMsgRequest](x: Self) {
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
  }
}
