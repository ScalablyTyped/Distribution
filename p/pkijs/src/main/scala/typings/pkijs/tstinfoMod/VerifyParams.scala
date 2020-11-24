package typings.pkijs.tstinfoMod

import typings.std.BufferSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyParams extends js.Object {
  
  var data: BufferSource = js.native
  
  var notAfter: js.UndefOr[Date] = js.native
  
  var notBefore: js.UndefOr[Date] = js.native
}
object VerifyParams {
  
  @scala.inline
  def apply(data: BufferSource): VerifyParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyParams]
  }
  
  @scala.inline
  implicit class VerifyParamsOps[Self <: VerifyParams] (val x: Self) extends AnyVal {
    
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
    def setData(value: BufferSource): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfter(value: Date): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: Date): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
  }
}
