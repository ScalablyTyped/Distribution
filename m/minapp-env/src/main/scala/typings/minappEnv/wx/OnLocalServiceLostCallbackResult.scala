package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnLocalServiceLostCallbackResult extends js.Object {
  
  /** 服务的名称 */
  var serviceName: String = js.native
  
  /** 服务的类型 */
  var serviceType: String = js.native
}
object OnLocalServiceLostCallbackResult {
  
  @scala.inline
  def apply(serviceName: String, serviceType: String): OnLocalServiceLostCallbackResult = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLocalServiceLostCallbackResult]
  }
  
  @scala.inline
  implicit class OnLocalServiceLostCallbackResultOps[Self <: OnLocalServiceLostCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
  }
}
