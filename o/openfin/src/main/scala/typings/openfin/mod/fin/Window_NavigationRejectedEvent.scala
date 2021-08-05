package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`navigation-rejected`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window_NavigationRejectedEvent extends StObject {
  
  var name: String
  
  /**
    * source of navigation window name
    */
  var sourceName: String
  
  var topic: `navigation-rejected`
  
  /**
    * Url that was not reached "http://blocked-content.url"
    */
  var url: String
  
  /**
    * the UUID of the application the window belongs to.
    */
  var uuid: String
}
object Window_NavigationRejectedEvent {
  
  inline def apply(name: String, sourceName: String, url: String, uuid: String): Window_NavigationRejectedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], topic = "navigation-rejected", url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window_NavigationRejectedEvent]
  }
  
  extension [Self <: Window_NavigationRejectedEvent](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: `navigation-rejected`): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
