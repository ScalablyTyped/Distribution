package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomPopmotionConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dragBounds: js.UndefOr[DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])] = js.undefined
  
  var draggable: js.UndefOr[Draggable] = js.undefined
  
  var hoverable: js.UndefOr[Boolean] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, Any]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, Any]] = js.undefined
  
  var onPressEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, Any]] = js.undefined
  
  var onPressStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, Any]] = js.undefined
  
  var props: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object DomPopmotionConfig {
  
  inline def apply(): DomPopmotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomPopmotionConfig]
  }
  
  extension [Self <: DomPopmotionConfig](x: Self) {
    
    inline def setDragBounds(value: DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])): Self = StObject.set(x, "dragBounds", value.asInstanceOf[js.Any])
    
    inline def setDragBoundsFunction1(value: /* props */ ResolverProps => DragBounds): Self = StObject.set(x, "dragBounds", js.Any.fromFunction1(value))
    
    inline def setDragBoundsUndefined: Self = StObject.set(x, "dragBounds", js.undefined)
    
    inline def setDraggable(value: Draggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    
    inline def setOnDragEnd(value: /* e */ MouseEvent | TouchEvent => Any): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragStart(value: /* e */ MouseEvent | TouchEvent => Any): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnPressEnd(value: /* e */ MouseEvent | TouchEvent => Any): Self = StObject.set(x, "onPressEnd", js.Any.fromFunction1(value))
    
    inline def setOnPressEndUndefined: Self = StObject.set(x, "onPressEnd", js.undefined)
    
    inline def setOnPressStart(value: /* e */ MouseEvent | TouchEvent => Any): Self = StObject.set(x, "onPressStart", js.Any.fromFunction1(value))
    
    inline def setOnPressStartUndefined: Self = StObject.set(x, "onPressStart", js.undefined)
    
    inline def setProps(value: StringDictionary[Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
