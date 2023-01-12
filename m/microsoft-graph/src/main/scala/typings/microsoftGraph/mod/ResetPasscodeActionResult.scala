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
  
  inline def apply(): ResetPasscodeActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPasscodeActionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetPasscodeActionResult] (val x: Self) extends AnyVal {
    
    inline def setPasscode(value: NullableOption[String]): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    
    inline def setPasscodeNull: Self = StObject.set(x, "passcode", null)
    
    inline def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
  }
}
