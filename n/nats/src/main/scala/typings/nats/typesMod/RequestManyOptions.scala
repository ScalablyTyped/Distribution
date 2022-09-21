package typings.nats.typesMod

import typings.nats.headersMod.MsgHdrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestManyOptions extends StObject {
  
  var headers: js.UndefOr[MsgHdrs] = js.undefined
  
  var maxMessages: js.UndefOr[Double] = js.undefined
  
  var maxWait: Double
  
  var strategy: RequestStrategy
}
object RequestManyOptions {
  
  inline def apply(maxWait: Double, strategy: RequestStrategy): RequestManyOptions = {
    val __obj = js.Dynamic.literal(maxWait = maxWait.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestManyOptions]
  }
  
  extension [Self <: RequestManyOptions](x: Self) {
    
    inline def setHeaders(value: MsgHdrs): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: RequestStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
