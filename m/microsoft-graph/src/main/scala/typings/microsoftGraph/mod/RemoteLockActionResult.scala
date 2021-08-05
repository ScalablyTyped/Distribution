package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteLockActionResult
  extends StObject
     with DeviceActionResult {
  
  // Pin to unlock the client
  var unlockPin: js.UndefOr[NullableOption[String]] = js.undefined
}
object RemoteLockActionResult {
  
  inline def apply(): RemoteLockActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteLockActionResult]
  }
  
  extension [Self <: RemoteLockActionResult](x: Self) {
    
    inline def setUnlockPin(value: NullableOption[String]): Self = StObject.set(x, "unlockPin", value.asInstanceOf[js.Any])
    
    inline def setUnlockPinNull: Self = StObject.set(x, "unlockPin", null)
    
    inline def setUnlockPinUndefined: Self = StObject.set(x, "unlockPin", js.undefined)
  }
}
