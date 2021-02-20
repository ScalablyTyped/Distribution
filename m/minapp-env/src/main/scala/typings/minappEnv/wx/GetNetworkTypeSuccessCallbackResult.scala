package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.`2g`
import typings.minappEnv.minappEnvStrings.`3g`
import typings.minappEnv.minappEnvStrings.`4g`
import typings.minappEnv.minappEnvStrings.none
import typings.minappEnv.minappEnvStrings.unknown
import typings.minappEnv.minappEnvStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkTypeSuccessCallbackResult extends StObject {
  
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | unknown | none = js.native
}
object GetNetworkTypeSuccessCallbackResult {
  
  @scala.inline
  def apply(networkType: wifi | `2g` | `3g` | `4g` | unknown | none): GetNetworkTypeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTypeSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetNetworkTypeSuccessCallbackResultMutableBuilder[Self <: GetNetworkTypeSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: wifi | `2g` | `3g` | `4g` | unknown | none): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
