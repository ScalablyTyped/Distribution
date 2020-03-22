package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLocalServiceResolveFailCallbackResult extends js.Object {
  /** 服务的名称 */
  var serviceName: String
  /** 服务的类型 */
  var serviceType: String
}

object OnLocalServiceResolveFailCallbackResult {
  @scala.inline
  def apply(serviceName: String, serviceType: String): OnLocalServiceResolveFailCallbackResult = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnLocalServiceResolveFailCallbackResult]
  }
}

