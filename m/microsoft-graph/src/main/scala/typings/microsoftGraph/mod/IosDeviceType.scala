package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosDeviceType extends js.Object {
  
  // Whether the app should run on iPads.
  var iPad: js.UndefOr[Boolean] = js.native
  
  // Whether the app should run on iPhones and iPods.
  var iPhoneAndIPod: js.UndefOr[Boolean] = js.native
}
object IosDeviceType {
  
  @scala.inline
  def apply(): IosDeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceType]
  }
  
  @scala.inline
  implicit class IosDeviceTypeOps[Self <: IosDeviceType] (val x: Self) extends AnyVal {
    
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
    def setIPad(value: Boolean): Self = this.set("iPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPad: Self = this.set("iPad", js.undefined)
    
    @scala.inline
    def setIPhoneAndIPod(value: Boolean): Self = this.set("iPhoneAndIPod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPhoneAndIPod: Self = this.set("iPhoneAndIPod", js.undefined)
  }
}
