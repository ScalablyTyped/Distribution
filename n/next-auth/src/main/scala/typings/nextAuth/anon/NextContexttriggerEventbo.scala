package typings.nextAuth.anon

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-auth.next-auth/client.NextContext & {  triggerEvent :boolean | undefined} */
@js.native
trait NextContexttriggerEventbo extends StObject {
  
  var ctx: js.UndefOr[Req] = js.native
  
  var req: js.UndefOr[IncomingMessage] = js.native
  
  var triggerEvent: js.UndefOr[Boolean] = js.native
}
object NextContexttriggerEventbo {
  
  @scala.inline
  def apply(): NextContexttriggerEventbo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextContexttriggerEventbo]
  }
  
  @scala.inline
  implicit class NextContexttriggerEventboMutableBuilder[Self <: NextContexttriggerEventbo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Req): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    @scala.inline
    def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: Boolean): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
  }
}
