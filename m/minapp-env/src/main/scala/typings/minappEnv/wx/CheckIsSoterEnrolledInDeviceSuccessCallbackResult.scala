package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSoterEnrolledInDeviceSuccessCallbackResult extends StObject {
  
  /** 错误信息 */
  var errMs: String
  
  /** 是否已录入信息 */
  var isEnrolled: Boolean
}
object CheckIsSoterEnrolledInDeviceSuccessCallbackResult {
  
  inline def apply(errMs: String, isEnrolled: Boolean): CheckIsSoterEnrolledInDeviceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMs = errMs.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckIsSoterEnrolledInDeviceSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMs(value: String): Self = StObject.set(x, "errMs", value.asInstanceOf[js.Any])
    
    inline def setIsEnrolled(value: Boolean): Self = StObject.set(x, "isEnrolled", value.asInstanceOf[js.Any])
  }
}
