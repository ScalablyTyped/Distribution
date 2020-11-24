package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppReturnCode extends js.Object {
  
  // Return code.
  var returnCode: js.UndefOr[Double] = js.native
  
  // The type of return code. Possible values are: failed, success, softReboot, hardReboot, retry.
  var `type`: js.UndefOr[Win32LobAppReturnCodeType] = js.native
}
object Win32LobAppReturnCode {
  
  @scala.inline
  def apply(): Win32LobAppReturnCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppReturnCode]
  }
  
  @scala.inline
  implicit class Win32LobAppReturnCodeOps[Self <: Win32LobAppReturnCode] (val x: Self) extends AnyVal {
    
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
    def setReturnCode(value: Double): Self = this.set("returnCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnCode: Self = this.set("returnCode", js.undefined)
    
    @scala.inline
    def setType(value: Win32LobAppReturnCodeType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
