package typings.openapiFactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpMethodOptions extends js.Object {
  
  var rawBody: js.UndefOr[Boolean] = js.native
}
object HttpMethodOptions {
  
  @scala.inline
  def apply(): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpMethodOptions]
  }
  
  @scala.inline
  implicit class HttpMethodOptionsOps[Self <: HttpMethodOptions] (val x: Self) extends AnyVal {
    
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
    def setRawBody(value: Boolean): Self = this.set("rawBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawBody: Self = this.set("rawBody", js.undefined)
  }
}
