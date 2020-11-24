package typings.playable.logoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILogoViewStyles extends js.Object {
  
  var hidden: String = js.native
  
  var logoButton: String = js.native
  
  var logoImage: String = js.native
  
  var logoWrapper: String = js.native
}
object ILogoViewStyles {
  
  @scala.inline
  def apply(hidden: String, logoButton: String, logoImage: String, logoWrapper: String): ILogoViewStyles = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], logoButton = logoButton.asInstanceOf[js.Any], logoImage = logoImage.asInstanceOf[js.Any], logoWrapper = logoWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogoViewStyles]
  }
  
  @scala.inline
  implicit class ILogoViewStylesOps[Self <: ILogoViewStyles] (val x: Self) extends AnyVal {
    
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
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoButton(value: String): Self = this.set("logoButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoImage(value: String): Self = this.set("logoImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoWrapper(value: String): Self = this.set("logoWrapper", value.asInstanceOf[js.Any])
  }
}
