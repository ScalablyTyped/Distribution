package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveMode extends js.Object {
  
  var responsiveMode: js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.native
}
object ResponsiveMode {
  
  @scala.inline
  def apply(): ResponsiveMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveMode]
  }
  
  @scala.inline
  implicit class ResponsiveModeOps[Self <: ResponsiveMode] (val x: Self) extends AnyVal {
    
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
    def setResponsiveMode(value: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode): Self = this.set("responsiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveMode: Self = this.set("responsiveMode", js.undefined)
  }
}
