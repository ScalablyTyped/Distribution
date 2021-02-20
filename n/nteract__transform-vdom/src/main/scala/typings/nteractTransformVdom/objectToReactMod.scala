package typings.nteractTransformVdom

import org.scalablytyped.runtime.StringDictionary
import typings.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectToReactMod {
  
  @JSImport("@nteract/transform-vdom/lib/object-to-react", "objectToReactElement")
  @js.native
  def objectToReactElement(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): ReactElement = js.native
  
  type Attributes = StringDictionary[js.Any]
  
  type EventHandlers = StringDictionary[String]
  
  @js.native
  trait VDOMEl extends StObject {
    
    var attributes: Attributes = js.native
    
    var children: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl]) = js.native
    
    var eventHandlers: js.UndefOr[EventHandlers] = js.native
    
    var key: Double | String | Null = js.native
    
    var tagName: String = js.native
  }
  object VDOMEl {
    
    @scala.inline
    def apply(attributes: Attributes, tagName: String): VDOMEl = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[VDOMEl]
    }
    
    @scala.inline
    implicit class VDOMElMutableBuilder[Self <: VDOMEl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: (ReactNode | VDOMEl)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setEventHandlers(value: EventHandlers): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
      
      @scala.inline
      def setKey(value: Double | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
