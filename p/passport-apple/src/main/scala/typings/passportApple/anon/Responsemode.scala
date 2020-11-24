package typings.passportApple.anon

import typings.passportApple.passportAppleStrings.`name email`
import typings.passportApple.passportAppleStrings.form_post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Responsemode extends js.Object {
  
  var response_mode: form_post = js.native
  
  var response_type: `name email` = js.native
  
  var scope: `name email` = js.native
  
  var state: js.UndefOr[String] = js.native
}
object Responsemode {
  
  @scala.inline
  def apply(response_mode: form_post, response_type: `name email`, scope: `name email`): Responsemode = {
    val __obj = js.Dynamic.literal(response_mode = response_mode.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responsemode]
  }
  
  @scala.inline
  implicit class ResponsemodeOps[Self <: Responsemode] (val x: Self) extends AnyVal {
    
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
    def setResponse_mode(value: form_post): Self = this.set("response_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_type(value: `name email`): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: `name email`): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
