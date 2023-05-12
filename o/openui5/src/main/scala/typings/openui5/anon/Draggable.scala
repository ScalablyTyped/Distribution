package typings.openui5.anon

import typings.openui5.openui5Strings.Vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draggable extends StObject {
  
  /**
    * Defines whether elements from this aggregation are draggable or not. The default value is `false`.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the element is droppable (it allows being dropped on by a draggable element) or not.
    * The default value is `false`.
    */
  var droppable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The arrangement of the items in this aggregation. This setting is recommended for the aggregation with
    * multiplicity 0..n (`multiple: true`). Possible values are `Vertical` (e.g. rows in a table) and `Horizontal`
    * (e.g. columns in a table). It is recommended to use `Horizontal` layout if the visual arrangement of
    * the aggregation is two-dimensional.
    */
  var layout: js.UndefOr[Vertical | typings.openui5.openui5Strings.Horizontal] = js.undefined
}
object Draggable {
  
  inline def apply(): Draggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Draggable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Draggable] (val x: Self) extends AnyVal {
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
    
    inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
    
    inline def setLayout(value: Vertical | typings.openui5.openui5Strings.Horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
