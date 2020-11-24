package typings.paypalPayoutsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBatchPayoutResponse extends js.Object {
  
  var batch_header: js.UndefOr[PayoutHeader] = js.native
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.native
}
object CreateBatchPayoutResponse {
  
  @scala.inline
  def apply(): CreateBatchPayoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchPayoutResponse]
  }
  
  @scala.inline
  implicit class CreateBatchPayoutResponseOps[Self <: CreateBatchPayoutResponse] (val x: Self) extends AnyVal {
    
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
    def setBatch_header(value: PayoutHeader): Self = this.set("batch_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch_header: Self = this.set("batch_header", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkDescription*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[LinkDescription]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
  }
}
