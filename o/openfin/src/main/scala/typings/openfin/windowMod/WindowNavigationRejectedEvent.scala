package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowNavigationRejectedEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var sourceName: js.UndefOr[String] = js.undefined
  
  var url: String
}
object WindowNavigationRejectedEvent {
  
  @scala.inline
  def apply[Topic, Type](name: String, topic: Topic, `type`: Type, url: String, uuid: String): WindowNavigationRejectedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowNavigationRejectedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowNavigationRejectedEventMutableBuilder[Self <: WindowNavigationRejectedEvent[?, ?], Topic, Type] (val x: Self & (WindowNavigationRejectedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
