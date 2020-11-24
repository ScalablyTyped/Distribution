package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionDesktopApp extends WindowsInformationProtectionApp {
  
  // The binary name.
  var binaryName: js.UndefOr[String] = js.native
  
  // The high binary version.
  var binaryVersionHigh: js.UndefOr[NullableOption[String]] = js.native
  
  // The lower binary version.
  var binaryVersionLow: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsInformationProtectionDesktopApp {
  
  @scala.inline
  def apply(): WindowsInformationProtectionDesktopApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionDesktopApp]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionDesktopAppOps[Self <: WindowsInformationProtectionDesktopApp] (val x: Self) extends AnyVal {
    
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
    def setBinaryName(value: String): Self = this.set("binaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryName: Self = this.set("binaryName", js.undefined)
    
    @scala.inline
    def setBinaryVersionHigh(value: NullableOption[String]): Self = this.set("binaryVersionHigh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryVersionHigh: Self = this.set("binaryVersionHigh", js.undefined)
    
    @scala.inline
    def setBinaryVersionHighNull: Self = this.set("binaryVersionHigh", null)
    
    @scala.inline
    def setBinaryVersionLow(value: NullableOption[String]): Self = this.set("binaryVersionLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryVersionLow: Self = this.set("binaryVersionLow", js.undefined)
    
    @scala.inline
    def setBinaryVersionLowNull: Self = this.set("binaryVersionLow", null)
  }
}
