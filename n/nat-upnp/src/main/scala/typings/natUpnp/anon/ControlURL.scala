package typings.natUpnp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlURL extends js.Object {
  
  var SCPDURL: String = js.native
  
  var controlURL: String = js.native
  
  var service: String = js.native
}
object ControlURL {
  
  @scala.inline
  def apply(SCPDURL: String, controlURL: String, service: String): ControlURL = {
    val __obj = js.Dynamic.literal(SCPDURL = SCPDURL.asInstanceOf[js.Any], controlURL = controlURL.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlURL]
  }
  
  @scala.inline
  implicit class ControlURLOps[Self <: ControlURL] (val x: Self) extends AnyVal {
    
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
    def setSCPDURL(value: String): Self = this.set("SCPDURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlURL(value: String): Self = this.set("controlURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
  }
}
