package typings.nats.anon

import typings.nats.headersMod.MsgHdrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: js.UndefOr[MsgHdrs] = js.undefined
  
  var reply: js.UndefOr[String] = js.undefined
}
object Headers {
  
  inline def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setHeaders(value: MsgHdrs): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReply(value: String): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
  }
}
