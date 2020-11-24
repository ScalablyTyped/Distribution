package typings.naja.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsHardRedirect extends js.Object {
  
  var isHardRedirect: Boolean = js.native
  
  var options: typings.naja.najaMod.Options = js.native
  
  def setHardRedirect(value: Boolean): Unit = js.native
  
  var url: String = js.native
}
object IsHardRedirect {
  
  @scala.inline
  def apply(
    isHardRedirect: Boolean,
    options: typings.naja.najaMod.Options,
    setHardRedirect: Boolean => Unit,
    url: String
  ): IsHardRedirect = {
    val __obj = js.Dynamic.literal(isHardRedirect = isHardRedirect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setHardRedirect = js.Any.fromFunction1(setHardRedirect), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHardRedirect]
  }
  
  @scala.inline
  implicit class IsHardRedirectOps[Self <: IsHardRedirect] (val x: Self) extends AnyVal {
    
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
    def setIsHardRedirect(value: Boolean): Self = this.set("isHardRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.naja.najaMod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHardRedirect(value: Boolean => Unit): Self = this.set("setHardRedirect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
