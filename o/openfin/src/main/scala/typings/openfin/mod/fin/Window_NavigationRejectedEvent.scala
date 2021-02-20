package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`navigation-rejected`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window_NavigationRejectedEvent extends StObject {
  
  var name: String = js.native
  
  /**
    * source of navigation window name
    */
  var sourceName: String = js.native
  
  var topic: `navigation-rejected` = js.native
  
  /**
    * Url that was not reached "http://blocked-content.url"
    */
  var url: String = js.native
  
  /**
    * the UUID of the application the window belongs to.
    */
  var uuid: String = js.native
}
object Window_NavigationRejectedEvent {
  
  @scala.inline
  def apply(name: String, sourceName: String, topic: `navigation-rejected`, url: String, uuid: String): Window_NavigationRejectedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window_NavigationRejectedEvent]
  }
  
  @scala.inline
  implicit class Window_NavigationRejectedEventMutableBuilder[Self <: Window_NavigationRejectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: `navigation-rejected`): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
