package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationFromKeyboard extends StObject {
  
  var navigationFromKeyboard: js.UndefOr[String] = js.undefined
  
  var navigationToKeyboard: js.UndefOr[String] = js.undefined
  
  var navigationToTouch: js.UndefOr[String] = js.undefined
  
  var newMessage: js.UndefOr[String] = js.undefined
}
object NavigationFromKeyboard {
  
  inline def apply(): NavigationFromKeyboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationFromKeyboard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationFromKeyboard] (val x: Self) extends AnyVal {
    
    inline def setNavigationFromKeyboard(value: String): Self = StObject.set(x, "navigationFromKeyboard", value.asInstanceOf[js.Any])
    
    inline def setNavigationFromKeyboardUndefined: Self = StObject.set(x, "navigationFromKeyboard", js.undefined)
    
    inline def setNavigationToKeyboard(value: String): Self = StObject.set(x, "navigationToKeyboard", value.asInstanceOf[js.Any])
    
    inline def setNavigationToKeyboardUndefined: Self = StObject.set(x, "navigationToKeyboard", js.undefined)
    
    inline def setNavigationToTouch(value: String): Self = StObject.set(x, "navigationToTouch", value.asInstanceOf[js.Any])
    
    inline def setNavigationToTouchUndefined: Self = StObject.set(x, "navigationToTouch", js.undefined)
    
    inline def setNewMessage(value: String): Self = StObject.set(x, "newMessage", value.asInstanceOf[js.Any])
    
    inline def setNewMessageUndefined: Self = StObject.set(x, "newMessage", js.undefined)
  }
}
