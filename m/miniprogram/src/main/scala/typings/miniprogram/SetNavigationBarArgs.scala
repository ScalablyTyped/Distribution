package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNavigationBarArgs extends AsyncCallback[Unit] {
  
  /**
    * Navigation bar background color, supporting hex color value.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Navigation bar bottom border color, supporting hex color value If the backgroundColor is set, the borderBottomColor does not take effect. The backgroundColor is used by default.
    */
  var borderBottomColor: js.UndefOr[String] = js.native
  
  /**
    * Picture link address, must be https. Use 3x high-definition pictures. If the image is set, the title parameter is inactive.
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * If the navigation bar is reset to the default color scheme of Alipay, false by default.
    */
  var reset: js.UndefOr[Boolean] = js.native
  
  /**
    * Navigation bar title.
    */
  var title: js.UndefOr[String] = js.native
}
object SetNavigationBarArgs {
  
  @scala.inline
  def apply(): SetNavigationBarArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNavigationBarArgs]
  }
  
  @scala.inline
  implicit class SetNavigationBarArgsOps[Self <: SetNavigationBarArgs] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderBottomColor(value: String): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
