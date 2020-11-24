package typings.officeUiFabricReact.withResponsiveModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWithResponsiveModeState extends js.Object {
  
  var responsiveMode: js.UndefOr[ResponsiveMode] = js.native
}
object IWithResponsiveModeState {
  
  @scala.inline
  def apply(): IWithResponsiveModeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWithResponsiveModeState]
  }
  
  @scala.inline
  implicit class IWithResponsiveModeStateOps[Self <: IWithResponsiveModeState] (val x: Self) extends AnyVal {
    
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
    def setResponsiveMode(value: ResponsiveMode): Self = this.set("responsiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveMode: Self = this.set("responsiveMode", js.undefined)
  }
}
