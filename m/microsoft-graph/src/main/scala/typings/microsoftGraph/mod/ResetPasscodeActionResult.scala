package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetPasscodeActionResult
  extends StObject
     with DeviceActionResult {
  
  // Newly generated passcode for the device
  var passcode: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResetPasscodeActionResult {
  
  @scala.inline
  def apply(): ResetPasscodeActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPasscodeActionResult]
  }
  
  @scala.inline
  implicit class ResetPasscodeActionResultMutableBuilder[Self <: ResetPasscodeActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasscode(value: NullableOption[String]): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeNull: Self = StObject.set(x, "passcode", null)
    
    @scala.inline
    def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
  }
}
