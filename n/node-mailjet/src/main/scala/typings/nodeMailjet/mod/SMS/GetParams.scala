package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// request params
@js.native
trait GetParams extends js.Object {
  
  var FromTS: js.UndefOr[Double] = js.native
  
  var Limit: js.UndefOr[Double] = js.native
  
  var Offset: js.UndefOr[Double] = js.native
  
  var StatusCode: js.UndefOr[js.Array[Double]] = js.native
  
  var To: js.UndefOr[String] = js.native
  
  var ToTS: js.UndefOr[Double] = js.native
}
object GetParams {
  
  @scala.inline
  def apply(): GetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParams]
  }
  
  @scala.inline
  implicit class GetParamsOps[Self <: GetParams] (val x: Self) extends AnyVal {
    
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
    def setFromTS(value: Double): Self = this.set("FromTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromTS: Self = this.set("FromTS", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("Offset", js.undefined)
    
    @scala.inline
    def setStatusCodeVarargs(value: Double*): Self = this.set("StatusCode", js.Array(value :_*))
    
    @scala.inline
    def setStatusCode(value: js.Array[Double]): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("StatusCode", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("To", js.undefined)
    
    @scala.inline
    def setToTS(value: Double): Self = this.set("ToTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToTS: Self = this.set("ToTS", js.undefined)
  }
}
