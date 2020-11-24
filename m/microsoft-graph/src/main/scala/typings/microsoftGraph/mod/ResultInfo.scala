package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultInfo extends js.Object {
  
  // The result code.
  var code: js.UndefOr[Double] = js.native
  
  // The message.
  var message: js.UndefOr[NullableOption[String]] = js.native
  
  // The result sub-code.
  var subcode: js.UndefOr[Double] = js.native
}
object ResultInfo {
  
  @scala.inline
  def apply(): ResultInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultInfo]
  }
  
  @scala.inline
  implicit class ResultInfoOps[Self <: ResultInfo] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setSubcode(value: Double): Self = this.set("subcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubcode: Self = this.set("subcode", js.undefined)
  }
}
