package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar extends StObject {
  
  var avatar: Any
  
  var endIcon: Any
  
  var icon: Any
  
  var text: Any
}
object Avatar {
  
  inline def apply(avatar: Any, endIcon: Any, icon: Any, text: Any): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], endIcon = endIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
    
    inline def setAvatar(value: Any): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setEndIcon(value: Any): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
