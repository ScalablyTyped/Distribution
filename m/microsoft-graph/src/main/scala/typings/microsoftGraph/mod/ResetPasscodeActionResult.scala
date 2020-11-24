package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetPasscodeActionResult extends DeviceActionResult {
  
  // Newly generated passcode for the device
  var passcode: js.UndefOr[NullableOption[String]] = js.native
}
object ResetPasscodeActionResult {
  
  @scala.inline
  def apply(): ResetPasscodeActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPasscodeActionResult]
  }
  
  @scala.inline
  implicit class ResetPasscodeActionResultOps[Self <: ResetPasscodeActionResult] (val x: Self) extends AnyVal {
    
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
    def setPasscode(value: NullableOption[String]): Self = this.set("passcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasscode: Self = this.set("passcode", js.undefined)
    
    @scala.inline
    def setPasscodeNull: Self = this.set("passcode", null)
  }
}
