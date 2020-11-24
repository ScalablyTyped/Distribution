package typings.nextAuth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackUrl extends js.Object {
  
  var callbackUrl: js.UndefOr[String] = js.native
}
object CallbackUrl {
  
  @scala.inline
  def apply(): CallbackUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackUrl]
  }
  
  @scala.inline
  implicit class CallbackUrlOps[Self <: CallbackUrl] (val x: Self) extends AnyVal {
    
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
    def setCallbackUrl(value: String): Self = this.set("callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackUrl: Self = this.set("callbackUrl", js.undefined)
  }
}
