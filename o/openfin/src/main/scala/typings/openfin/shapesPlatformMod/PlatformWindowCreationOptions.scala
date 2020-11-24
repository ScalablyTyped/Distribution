package typings.openfin.shapesPlatformMod

import typings.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformWindowCreationOptions extends WindowOption {
  
  var reason: js.UndefOr[WindowCreationReason] = js.native
}
object PlatformWindowCreationOptions {
  
  @scala.inline
  def apply(): PlatformWindowCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformWindowCreationOptions]
  }
  
  @scala.inline
  implicit class PlatformWindowCreationOptionsOps[Self <: PlatformWindowCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setReason(value: WindowCreationReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
