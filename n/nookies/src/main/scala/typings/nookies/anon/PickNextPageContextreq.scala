package typings.nookies.anon

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next.NextPageContext, 'req'> */
@js.native
trait PickNextPageContextreq extends js.Object {
  
  var req: js.UndefOr[IncomingMessage] = js.native
}
object PickNextPageContextreq {
  
  @scala.inline
  def apply(): PickNextPageContextreq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNextPageContextreq]
  }
  
  @scala.inline
  implicit class PickNextPageContextreqOps[Self <: PickNextPageContextreq] (val x: Self) extends AnyVal {
    
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
    def setReq(value: IncomingMessage): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
  }
}
