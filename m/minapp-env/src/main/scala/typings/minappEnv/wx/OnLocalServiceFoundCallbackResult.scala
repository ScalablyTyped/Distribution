package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLocalServiceFoundCallbackResult extends js.Object {
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
  @scala.inline
  def apply(ip: String, port: Double, serviceName: String, serviceType: String): OnLocalServiceFoundCallbackResult = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLocalServiceFoundCallbackResult]
  }
}

