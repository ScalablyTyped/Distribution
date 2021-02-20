package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnLocalServiceResolveFailCallbackResult extends StObject {
  
  /** 服务的名称 */
  var serviceName: String = js.native
  
  /** 服务的类型 */
  var serviceType: String = js.native
}
object OnLocalServiceResolveFailCallbackResult {
  
  @scala.inline
  def apply(serviceName: String, serviceType: String): OnLocalServiceResolveFailCallbackResult = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLocalServiceResolveFailCallbackResult]
  }
  
  @scala.inline
  implicit class OnLocalServiceResolveFailCallbackResultMutableBuilder[Self <: OnLocalServiceResolveFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
  }
}
