package typings.openui5.anon

import typings.openui5.sapUiCoreMessageMessageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewMessages extends StObject {
  
  /**
    * New messages added by the trigger of the `messageChange` event.
    */
  var newMessages: default
  
  /**
    * Messages already existing before the `messageChange` event was fired.
    */
  var oldMessages: default
}
object NewMessages {
  
  inline def apply(newMessages: default, oldMessages: default): NewMessages = {
    val __obj = js.Dynamic.literal(newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMessages]
  }
  
  extension [Self <: NewMessages](x: Self) {
    
    inline def setNewMessages(value: default): Self = StObject.set(x, "newMessages", value.asInstanceOf[js.Any])
    
    inline def setOldMessages(value: default): Self = StObject.set(x, "oldMessages", value.asInstanceOf[js.Any])
  }
}
