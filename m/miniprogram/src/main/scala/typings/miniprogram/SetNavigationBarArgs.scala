package typings.miniprogram

import org.scalablytyped.runtime.StObject
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
  implicit class SetNavigationBarArgsMutableBuilder[Self <: SetNavigationBarArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
