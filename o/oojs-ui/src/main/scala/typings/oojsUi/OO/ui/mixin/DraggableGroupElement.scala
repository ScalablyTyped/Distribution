package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojs.OO.EventEmitter
import typings.oojsUi.OO.ui.Element
import typings.oojsUi.OO.ui.mixin.DraggableGroupElement.Prototype
import typings.oojsUi.OO.ui.mixin.GroupElement.Props
import typings.oojsUi.oojsUiStrings.horizontal
import typings.oojsUi.oojsUiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DraggableGroupElement is a mixin class used to create a group element to
  * contain draggable elements, which are items that can be clicked and dragged by a mouse.
  * The class is used with {@link OO.ui.mixin.DraggableElement}.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.DraggableGroupElement
  */
@js.native
trait DraggableGroupElement
  extends StObject
     with Prototype
     with Props
object DraggableGroupElement {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.mixin.GroupElement.ConfigOptions {
    
    /**
      * The items are draggable. This can change with
      * {@link DraggableGroupElement.toggleDraggable toggleDraggable}
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var items: js.UndefOr[js.Array[DraggableElement]] = js.undefined
    
    /**
      * Item orientation: 'horizontal' or 'vertical'.
      * The orientation should match the layout of the items. Items displayed in a single row
      * or in several rows should use horizontal orientation. The vertical orientation should
      * only be used when the items are displayed in a single column.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setItems(value: js.Array[DraggableElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: DraggableElement*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[DraggableGroupElement]
       with Instantiable1[/* config */ ConfigOptions, DraggableGroupElement]
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.mixin.GroupElement.EventMap {
    
    var drag: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]
    
    var draggable: js.Array[/* draggable */ js.UndefOr[Boolean]]
    
    var reorder: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]
  }
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      clear: js.Array[Any],
      drag: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]],
      draggable: js.Array[/* draggable */ js.UndefOr[Boolean]],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      remove: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      reorder: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setDrag(value: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDraggable(value: js.Array[/* draggable */ js.UndefOr[Boolean]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableVarargs(value: (/* draggable */ js.UndefOr[Boolean])*): Self = StObject.set(x, "draggable", js.Array(value*))
      
      inline def setReorder(value: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
    }
  }
  
  type Props = typings.oojsUi.OO.ui.mixin.GroupElement.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.mixin.GroupElement.Prototype {
    
    /**
      * Get the item that is currently being dragged.
      *
      * @return The currently dragged item, or `null` if no item is being dragged
      */
    def getDragItem(): DraggableElement | Null = js.native
    
    /**
      * Check the draggable state of this widget
      *
      * @return Widget supports draggable operations
      */
    def isDraggable(): Boolean = js.native
    
    /**
      * Reorder the items in the group
      *
      * @param item Reordered item
      * @param newIndex New index
      */
    def reorder(item: DraggableElement, newIndex: Double): Unit = js.native
    
    /**
      * Set a dragged item
      *
      * @param item Dragged item
      */
    def setDragItem(item: DraggableElement): Unit = js.native
    
    /**
      * Change the draggable state of this widget.
      * This allows users to temporarily halt the dragging operations.
      *
      * @param isDraggable Widget supports draggable operations
      */
    def toggleDraggable(isDraggable: Boolean): Unit = js.native
    
    /**
      * Unset the current dragged item
      */
    def unsetDragItem(): Unit = js.native
    
    /**
      * Update the index properties of the items
      */
    def updateIndexes(): Unit = js.native
  }
}
