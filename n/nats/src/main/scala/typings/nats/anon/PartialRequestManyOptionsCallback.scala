package typings.nats.anon

import typings.nats.headersMod.MsgHdrs
import typings.nats.typesMod.Msg
import typings.nats.typesMod.RequestStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/request.RequestManyOptionsInternal> */
trait PartialRequestManyOptionsCallback extends StObject {
  
  var callback: js.UndefOr[js.Function2[/* err */ js.Error | Null, /* msg */ Msg | Null, Unit]] = js.undefined
  
  var headers: js.UndefOr[MsgHdrs] = js.undefined
  
  var maxMessages: js.UndefOr[Double] = js.undefined
  
  var maxWait: js.UndefOr[Double] = js.undefined
  
  var strategy: js.UndefOr[RequestStrategy] = js.undefined
}
object PartialRequestManyOptionsCallback {
  
  inline def apply(): PartialRequestManyOptionsCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestManyOptionsCallback]
  }
  
  extension [Self <: PartialRequestManyOptionsCallback](x: Self) {
    
    inline def setCallback(value: (/* err */ js.Error | Null, /* msg */ Msg | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setHeaders(value: MsgHdrs): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
    
    inline def setStrategy(value: RequestStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
