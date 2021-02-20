package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSoterEnrolledInDeviceSuccessCallbackResult extends StObject {
  
  /** 错误信息 */
  var errMs: String = js.native
  
  /** 是否已录入信息 */
  var isEnrolled: Boolean = js.native
}
object CheckIsSoterEnrolledInDeviceSuccessCallbackResult {
  
  @scala.inline
  def apply(errMs: String, isEnrolled: Boolean): CheckIsSoterEnrolledInDeviceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMs = errMs.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceSuccessCallbackResultMutableBuilder[Self <: CheckIsSoterEnrolledInDeviceSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMs(value: String): Self = StObject.set(x, "errMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnrolled(value: Boolean): Self = StObject.set(x, "isEnrolled", value.asInstanceOf[js.Any])
  }
}
