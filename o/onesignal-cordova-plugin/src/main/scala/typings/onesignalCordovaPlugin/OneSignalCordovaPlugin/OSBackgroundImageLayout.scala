package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSBackgroundImageLayout extends StObject {
  
  var bodyTextColor: String = js.native
  
  var image: String = js.native
  
  var titleTextColor: String = js.native
}
object OSBackgroundImageLayout {
  
  @scala.inline
  def apply(bodyTextColor: String, image: String, titleTextColor: String): OSBackgroundImageLayout = {
    val __obj = js.Dynamic.literal(bodyTextColor = bodyTextColor.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], titleTextColor = titleTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSBackgroundImageLayout]
  }
  
  @scala.inline
  implicit class OSBackgroundImageLayoutMutableBuilder[Self <: OSBackgroundImageLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyTextColor(value: String): Self = StObject.set(x, "bodyTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextColor(value: String): Self = StObject.set(x, "titleTextColor", value.asInstanceOf[js.Any])
  }
}
