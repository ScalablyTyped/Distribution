package typings.openui5.anon

import typings.openui5.sapMAvatarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar extends StObject {
  
  /**
    * Reference to the button that has been pressed
    */
  var avatar: js.UndefOr[default] = js.undefined
}
object Avatar {
  
  inline def apply(): Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
    
    inline def setAvatar(value: default): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
  }
}
