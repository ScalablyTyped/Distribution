package typings.pinoHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAttributeKeys extends js.Object {
  
  var err: js.UndefOr[String] = js.native
  
  var req: js.UndefOr[String] = js.native
  
  var res: js.UndefOr[String] = js.native
  
  var responseTime: js.UndefOr[String] = js.native
}
object CustomAttributeKeys {
  
  @scala.inline
  def apply(): CustomAttributeKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttributeKeys]
  }
  
  @scala.inline
  implicit class CustomAttributeKeysOps[Self <: CustomAttributeKeys] (val x: Self) extends AnyVal {
    
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
    def setErr(value: String): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    
    @scala.inline
    def setReq(value: String): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setRes(value: String): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
    
    @scala.inline
    def setResponseTime(value: String): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTime: Self = this.set("responseTime", js.undefined)
  }
}
