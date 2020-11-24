package typings.microsoftGraph.mod

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
  implicit class RemoteLockActionResultOps[Self <: RemoteLockActionResult] (val x: Self) extends AnyVal {
    
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
    def setUnlockPin(value: NullableOption[String]): Self = this.set("unlockPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlockPin: Self = this.set("unlockPin", js.undefined)
    
    @scala.inline
    def setUnlockPinNull: Self = this.set("unlockPin", null)
  }
}
