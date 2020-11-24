package typings.nextAuth.anon

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-auth.next-auth/client.NextContext & {  triggerEvent :boolean | undefined} */
@js.native
trait NextContexttriggerEventbo extends js.Object {
  
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
  implicit class NextContexttriggerEventboOps[Self <: NextContexttriggerEventbo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCtx(value: Req): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtx: Self = this.set("ctx", js.undefined)
    
    @scala.inline
    def setReq(value: IncomingMessage): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: Boolean): Self = this.set("triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerEvent: Self = this.set("triggerEvent", js.undefined)
  }
}
