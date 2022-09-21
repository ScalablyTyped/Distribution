package typings.nats.anon

import typings.nats.headersMod.MsgHdrs
import typings.nats.typesMod.RequestStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.RequestManyOptions> */
trait PartialRequestManyOptions extends StObject {
  
  var headers: js.UndefOr[MsgHdrs] = js.undefined
  
  var maxMessages: js.UndefOr[Double] = js.undefined
  
  var maxWait: js.UndefOr[Double] = js.undefined
  
  var strategy: js.UndefOr[RequestStrategy] = js.undefined
}
object PartialRequestManyOptions {
  
  inline def apply(): PartialRequestManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestManyOptions]
  }
  
  extension [Self <: PartialRequestManyOptions](x: Self) {
    
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
