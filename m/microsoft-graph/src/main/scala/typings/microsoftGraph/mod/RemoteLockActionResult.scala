package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteLockActionResult extends DeviceActionResult {
  
  // Pin to unlock the client
  var unlockPin: js.UndefOr[NullableOption[String]] = js.native
}
object RemoteLockActionResult {
  
  @scala.inline
  def apply(): RemoteLockActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteLockActionResult]
  }
  
  @scala.inline
  implicit class RemoteLockActionResultMutableBuilder[Self <: RemoteLockActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnlockPin(value: NullableOption[String]): Self = StObject.set(x, "unlockPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockPinNull: Self = StObject.set(x, "unlockPin", null)
    
    @scala.inline
    def setUnlockPinUndefined: Self = StObject.set(x, "unlockPin", js.undefined)
  }
}
