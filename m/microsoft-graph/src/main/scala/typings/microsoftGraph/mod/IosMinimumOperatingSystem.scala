package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosMinimumOperatingSystem extends js.Object {
  
  // Version 10.0 or later.
  var v10_0: js.UndefOr[Boolean] = js.native
  
  // Version 11.0 or later.
  var v11_0: js.UndefOr[Boolean] = js.native
  
  // Version 12.0 or later.
  var v12_0: js.UndefOr[Boolean] = js.native
  
  // Version 13.0 or later.
  var v13_0: js.UndefOr[Boolean] = js.native
  
  // Version 8.0 or later.
  var v8_0: js.UndefOr[Boolean] = js.native
  
  // Version 9.0 or later.
  var v9_0: js.UndefOr[Boolean] = js.native
}
object IosMinimumOperatingSystem {
  
  @scala.inline
  def apply(): IosMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMinimumOperatingSystem]
  }
  
  @scala.inline
  implicit class IosMinimumOperatingSystemOps[Self <: IosMinimumOperatingSystem] (val x: Self) extends AnyVal {
    
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
    def setV10_0(value: Boolean): Self = this.set("v10_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV10_0: Self = this.set("v10_0", js.undefined)
    
    @scala.inline
    def setV11_0(value: Boolean): Self = this.set("v11_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV11_0: Self = this.set("v11_0", js.undefined)
    
    @scala.inline
    def setV12_0(value: Boolean): Self = this.set("v12_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV12_0: Self = this.set("v12_0", js.undefined)
    
    @scala.inline
    def setV13_0(value: Boolean): Self = this.set("v13_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV13_0: Self = this.set("v13_0", js.undefined)
    
    @scala.inline
    def setV8_0(value: Boolean): Self = this.set("v8_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV8_0: Self = this.set("v8_0", js.undefined)
    
    @scala.inline
    def setV9_0(value: Boolean): Self = this.set("v9_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV9_0: Self = this.set("v9_0", js.undefined)
  }
}
