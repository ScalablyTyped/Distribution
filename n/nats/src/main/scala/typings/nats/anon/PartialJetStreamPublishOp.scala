package typings.nats.anon

import typings.nats.headersMod.MsgHdrs
import typings.nats.typesMod.Nanos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.JetStreamPublishOptions> */
trait PartialJetStreamPublishOp extends StObject {
  
  var ackWait: js.UndefOr[Nanos] = js.undefined
  
  var expect: js.UndefOr[PartiallastMsgIDstringstr] = js.undefined
  
  var headers: js.UndefOr[MsgHdrs] = js.undefined
  
  var msgID: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialJetStreamPublishOp {
  
  inline def apply(): PartialJetStreamPublishOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJetStreamPublishOp]
  }
  
  extension [Self <: PartialJetStreamPublishOp](x: Self) {
    
    inline def setAckWait(value: Nanos): Self = StObject.set(x, "ackWait", value.asInstanceOf[js.Any])
    
    inline def setAckWaitUndefined: Self = StObject.set(x, "ackWait", js.undefined)
    
    inline def setExpect(value: PartiallastMsgIDstringstr): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    
    inline def setExpectUndefined: Self = StObject.set(x, "expect", js.undefined)
    
    inline def setHeaders(value: MsgHdrs): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMsgID(value: String): Self = StObject.set(x, "msgID", value.asInstanceOf[js.Any])
    
    inline def setMsgIDUndefined: Self = StObject.set(x, "msgID", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
