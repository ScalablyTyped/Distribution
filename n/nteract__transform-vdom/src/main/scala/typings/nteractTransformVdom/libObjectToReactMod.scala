package typings.nteractTransformVdom

import org.scalablytyped.runtime.StringDictionary
import typings.nteractTransformVdom.libEventToObjectMod.SerializedEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectToReactMod {
  
  @JSImport("@nteract/transform-vdom/lib/object-to-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def objectToReactElement(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[Any], Unit]
  ): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToReactElement")(obj.asInstanceOf[js.Any], onVDOMEvent.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  type Attributes = StringDictionary[Any]
  
  type EventHandlers = StringDictionary[String]
  
  trait VDOMEl extends StObject {
    
    var attributes: Attributes
    
    var children: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl])
    
    var eventHandlers: js.UndefOr[EventHandlers] = js.undefined
    
    var key: Double | String | Null
    
    var tagName: String
  }
  object VDOMEl {
    
    inline def apply(attributes: Attributes, tagName: String): VDOMEl = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], key = null)
      __obj.asInstanceOf[VDOMEl]
    }
    
    extension [Self <: VDOMEl](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (ReactNode | VDOMEl)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setEventHandlers(value: EventHandlers): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
      
      inline def setKey(value: Double | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
