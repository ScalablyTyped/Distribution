package typings.nats.typesMod

import typings.nats.anon.PartiallastMsgIDstringstr
import typings.nats.headersMod.MsgHdrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JetStreamPublishOptions extends StObject {
  
  var ackWait: Nanos
  
  var expect: PartiallastMsgIDstringstr
  
  var headers: MsgHdrs
  
  var msgID: String
  
  var timeout: Double
}
object JetStreamPublishOptions {
  
  inline def apply(
    ackWait: Nanos,
    expect: PartiallastMsgIDstringstr,
    headers: MsgHdrs,
    msgID: String,
    timeout: Double
  ): JetStreamPublishOptions = {
    val __obj = js.Dynamic.literal(ackWait = ackWait.asInstanceOf[js.Any], expect = expect.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], msgID = msgID.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JetStreamPublishOptions]
  }
  
  extension [Self <: JetStreamPublishOptions](x: Self) {
    
    inline def setAckWait(value: Nanos): Self = StObject.set(x, "ackWait", value.asInstanceOf[js.Any])
    
    inline def setExpect(value: PartiallastMsgIDstringstr): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: MsgHdrs): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMsgID(value: String): Self = StObject.set(x, "msgID", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
