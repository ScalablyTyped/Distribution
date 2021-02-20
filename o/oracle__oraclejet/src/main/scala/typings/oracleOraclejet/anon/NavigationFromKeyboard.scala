package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationFromKeyboard extends StObject {
  
  var navigationFromKeyboard: js.UndefOr[String] = js.native
  
  var navigationToKeyboard: js.UndefOr[String] = js.native
  
  var navigationToTouch: js.UndefOr[String] = js.native
  
  var newMessage: js.UndefOr[String] = js.native
}
object NavigationFromKeyboard {
  
  @scala.inline
  def apply(): NavigationFromKeyboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationFromKeyboard]
  }
  
  @scala.inline
  implicit class NavigationFromKeyboardMutableBuilder[Self <: NavigationFromKeyboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigationFromKeyboard(value: String): Self = StObject.set(x, "navigationFromKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationFromKeyboardUndefined: Self = StObject.set(x, "navigationFromKeyboard", js.undefined)
    
    @scala.inline
    def setNavigationToKeyboard(value: String): Self = StObject.set(x, "navigationToKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationToKeyboardUndefined: Self = StObject.set(x, "navigationToKeyboard", js.undefined)
    
    @scala.inline
    def setNavigationToTouch(value: String): Self = StObject.set(x, "navigationToTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationToTouchUndefined: Self = StObject.set(x, "navigationToTouch", js.undefined)
    
    @scala.inline
    def setNewMessage(value: String): Self = StObject.set(x, "newMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewMessageUndefined: Self = StObject.set(x, "newMessage", js.undefined)
  }
}
