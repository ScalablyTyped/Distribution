package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnLocalServiceFoundCallbackResult extends js.Object {
  /** 服务的 ip 地址 */
  var ip: String = js.native
  /** 服务的端口 */
  var port: Double = js.native
  /** 服务的名称 */
  var serviceName: String = js.native
  /** 服务的类型 */
  var serviceType: String = js.native
}

object OnLocalServiceFoundCallbackResult {
  @scala.inline
  def apply(ip: String, port: Double, serviceName: String, serviceType: String): OnLocalServiceFoundCallbackResult = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLocalServiceFoundCallbackResult]
  }
  @scala.inline
  implicit class OnLocalServiceFoundCallbackResultOps[Self <: OnLocalServiceFoundCallbackResult] (val x: Self) extends AnyVal {
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
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceType(value: String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
  }
  
}

