package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLocalServiceFoundCallbackResult extends StObject {
  
  /** 服务的 ip 地址 */
  var ip: String
  
  /** 服务的端口 */
  var port: Double
  
  /** 服务的名称 */
  var serviceName: String
  
  /** 服务的类型 */
  var serviceType: String
}
object OnLocalServiceFoundCallbackResult {
  
  inline def apply(ip: String, port: Double, serviceName: String, serviceType: String): OnLocalServiceFoundCallbackResult = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLocalServiceFoundCallbackResult]
  }
  
  extension [Self <: OnLocalServiceFoundCallbackResult](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
  }
}
