package typings.nextAuth.anon

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-auth.next-auth/client.NextContext & {  triggerEvent :boolean | undefined} */
trait NextContexttriggerEventbo extends StObject {
  
  var ctx: js.UndefOr[Req] = js.undefined
  
  var req: js.UndefOr[IncomingMessage] = js.undefined
  
  var triggerEvent: js.UndefOr[Boolean] = js.undefined
}
object NextContexttriggerEventbo {
  
  inline def apply(): NextContexttriggerEventbo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextContexttriggerEventbo]
  }
  
  extension [Self <: NextContexttriggerEventbo](x: Self) {
    
    inline def setCtx(value: Req): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setTriggerEvent(value: Boolean): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
  }
}
