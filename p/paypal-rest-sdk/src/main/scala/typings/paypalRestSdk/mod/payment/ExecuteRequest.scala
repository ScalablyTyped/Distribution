package typings.paypalRestSdk.mod.payment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteRequest extends js.Object {
  
  var payer_id: String = js.native
}
object ExecuteRequest {
  
  @scala.inline
  def apply(payer_id: String): ExecuteRequest = {
    val __obj = js.Dynamic.literal(payer_id = payer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteRequest]
  }
  
  @scala.inline
  implicit class ExecuteRequestOps[Self <: ExecuteRequest] (val x: Self) extends AnyVal {
    
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
    def setPayer_id(value: String): Self = this.set("payer_id", value.asInstanceOf[js.Any])
  }
}
