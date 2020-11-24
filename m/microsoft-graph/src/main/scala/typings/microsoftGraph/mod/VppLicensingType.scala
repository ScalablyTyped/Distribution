package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VppLicensingType extends js.Object {
  
  // Whether the program supports the device licensing type.
  var supportsDeviceLicensing: js.UndefOr[Boolean] = js.native
  
  // Whether the program supports the user licensing type.
  var supportsUserLicensing: js.UndefOr[Boolean] = js.native
}
object VppLicensingType {
  
  @scala.inline
  def apply(): VppLicensingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VppLicensingType]
  }
  
  @scala.inline
  implicit class VppLicensingTypeOps[Self <: VppLicensingType] (val x: Self) extends AnyVal {
    
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
    def setSupportsDeviceLicensing(value: Boolean): Self = this.set("supportsDeviceLicensing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsDeviceLicensing: Self = this.set("supportsDeviceLicensing", js.undefined)
    
    @scala.inline
    def setSupportsUserLicensing(value: Boolean): Self = this.set("supportsUserLicensing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsUserLicensing: Self = this.set("supportsUserLicensing", js.undefined)
  }
}
