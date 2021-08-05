package typings.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessengerOptions extends StObject {
  
  /**
    * Extra classes to be appended to the container.
    */
  var extraClasses: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of messages to show at once.
    */
  var maxMessages: js.UndefOr[Double] = js.undefined
  
  /**
    * Default options for created messages.
    */
  var messageDefaults: js.UndefOr[MessageOptions] = js.undefined
  
  /**
    * Which locations should be tried when inserting the message container into the page.
    * The default is ['body']. It accepts a list to allow you to try a variety of places
    * when deciding what the optimal location is on any given page. This should generally
    * not need to be changed unless you are inserting the messages into the flow of the
    * document, rather than using messenger-fixed.
    */
  var parentLocations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * What theme are you using? Some themes have associated javascript, specifing this allows that js to run.
    */
  var theme: js.UndefOr[String] = js.undefined
}
object MessengerOptions {
  
  inline def apply(): MessengerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessengerOptions]
  }
  
  extension [Self <: MessengerOptions](x: Self) {
    
    inline def setExtraClasses(value: String): Self = StObject.set(x, "extraClasses", value.asInstanceOf[js.Any])
    
    inline def setExtraClassesUndefined: Self = StObject.set(x, "extraClasses", js.undefined)
    
    inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    inline def setMessageDefaults(value: MessageOptions): Self = StObject.set(x, "messageDefaults", value.asInstanceOf[js.Any])
    
    inline def setMessageDefaultsUndefined: Self = StObject.set(x, "messageDefaults", js.undefined)
    
    inline def setParentLocations(value: js.Array[String]): Self = StObject.set(x, "parentLocations", value.asInstanceOf[js.Any])
    
    inline def setParentLocationsUndefined: Self = StObject.set(x, "parentLocations", js.undefined)
    
    inline def setParentLocationsVarargs(value: String*): Self = StObject.set(x, "parentLocations", js.Array(value :_*))
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
