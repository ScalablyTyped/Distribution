package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectUnauthorized extends js.Object {
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  var requestCert: js.UndefOr[Boolean] = js.native
}
object RejectUnauthorized {
  
  @scala.inline
  def apply(): RejectUnauthorized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectUnauthorized]
  }
  
  @scala.inline
  implicit class RejectUnauthorizedOps[Self <: RejectUnauthorized] (val x: Self) extends AnyVal {
    
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
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestCert(value: Boolean): Self = this.set("requestCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCert: Self = this.set("requestCert", js.undefined)
  }
}
