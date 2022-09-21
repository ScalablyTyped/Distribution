package typings.nats.typesMod

import typings.nats.headersMod.MsgHdrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  var headers: js.UndefOr[MsgHdrs] = js.undefined
  
  var noMux: js.UndefOr[Boolean] = js.undefined
  
  var reply: js.UndefOr[String] = js.undefined
  
  var timeout: Double
}
object RequestOptions {
  
  inline def apply(timeout: Double): RequestOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setHeaders(value: MsgHdrs): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setNoMux(value: Boolean): Self = StObject.set(x, "noMux", value.asInstanceOf[js.Any])
    
    inline def setNoMuxUndefined: Self = StObject.set(x, "noMux", js.undefined)
    
    inline def setReply(value: String): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
