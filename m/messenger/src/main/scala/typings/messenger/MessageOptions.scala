package typings.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOptions extends StObject {
  
  /**
    * Hide the message after the provided number of seconds.
    */
  var hideAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * Hide the message if Backbone client-side navigation occurs.
    */
  var hideOnNavigate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A unique id. If supplied, only one message with that ID will be shown at a time.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The text of the message.
    */
  var message: String
  
  /**
    * Should a close button be added to the message?
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hide the newer message if there is an id collision, as opposed to the older message.
    */
  var singleton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
    */
  var theme: js.UndefOr[String] = js.undefined
  
  /**
    * "info", "error" or "success" are understood by the provided themes. You can also pass your own string, and that class will be added.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object MessageOptions {
  
  inline def apply(message: String): MessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
  
  extension [Self <: MessageOptions](x: Self) {
    
    inline def setHideAfter(value: Double): Self = StObject.set(x, "hideAfter", value.asInstanceOf[js.Any])
    
    inline def setHideAfterUndefined: Self = StObject.set(x, "hideAfter", js.undefined)
    
    inline def setHideOnNavigate(value: Boolean): Self = StObject.set(x, "hideOnNavigate", value.asInstanceOf[js.Any])
    
    inline def setHideOnNavigateUndefined: Self = StObject.set(x, "hideOnNavigate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
