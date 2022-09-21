package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastForMsgRequest
  extends StObject
     with _MsgRequest {
  
  var last_by_subj: String
}
object LastForMsgRequest {
  
  inline def apply(last_by_subj: String): LastForMsgRequest = {
    val __obj = js.Dynamic.literal(last_by_subj = last_by_subj.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastForMsgRequest]
  }
  
  extension [Self <: LastForMsgRequest](x: Self) {
    
    inline def setLast_by_subj(value: String): Self = StObject.set(x, "last_by_subj", value.asInstanceOf[js.Any])
  }
}
