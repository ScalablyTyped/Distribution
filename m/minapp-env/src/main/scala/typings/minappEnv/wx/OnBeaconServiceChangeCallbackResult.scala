package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeaconServiceChangeCallbackResult extends StObject {
  
  /** 服务目前是否可用 */
  var available: Boolean
  
  /** 目前是否处于搜索状态 */
  var discovering: Boolean
}
object OnBeaconServiceChangeCallbackResult {
  
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): OnBeaconServiceChangeCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeaconServiceChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnBeaconServiceChangeCallbackResultMutableBuilder[Self <: OnBeaconServiceChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
