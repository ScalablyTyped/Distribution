package typings.openui5.anon

import typings.openui5.sapUiCoreMessageMod.default
import typings.openui5.sapUiUx3NotifierMod.Notifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The message that was selected
    */
  var message: js.UndefOr[default] = js.undefined
  
  /**
    * The notifier that contains the selected message
    */
  var notifier: js.UndefOr[Notifier] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: default): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNotifier(value: Notifier): Self = StObject.set(x, "notifier", value.asInstanceOf[js.Any])
    
    inline def setNotifierUndefined: Self = StObject.set(x, "notifier", js.undefined)
  }
}
