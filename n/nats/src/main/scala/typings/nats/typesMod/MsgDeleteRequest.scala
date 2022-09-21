package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsgDeleteRequest
  extends StObject
     with SeqMsgRequest {
  
  var no_erase: js.UndefOr[Boolean] = js.undefined
}
object MsgDeleteRequest {
  
  inline def apply(seq: Double): MsgDeleteRequest = {
    val __obj = js.Dynamic.literal(seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgDeleteRequest]
  }
  
  extension [Self <: MsgDeleteRequest](x: Self) {
    
    inline def setNo_erase(value: Boolean): Self = StObject.set(x, "no_erase", value.asInstanceOf[js.Any])
    
    inline def setNo_eraseUndefined: Self = StObject.set(x, "no_erase", js.undefined)
  }
}
