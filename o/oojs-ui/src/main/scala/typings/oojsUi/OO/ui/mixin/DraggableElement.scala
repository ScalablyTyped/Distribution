package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.mixin.DraggableElement.Props
import typings.oojsUi.OO.ui.mixin.DraggableElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DraggableElement is a mixin class used to create elements that can be clicked
  * and dragged by a mouse to a new position within a group. This class must be used
  * in conjunction with {@link OO.ui.mixin.DraggableGroupElement}, which provides a container for
  * the draggable elements.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.DraggableElement
  */
trait DraggableElement
  extends StObject
     with Props
     with Prototype
object DraggableElement {
  
  inline def apply($handle: JQuery[HTMLElement], isDraggable: () => Boolean, toggleDraggable: Boolean => Unit): DraggableElement = {
    val __obj = js.Dynamic.literal($handle = $handle.asInstanceOf[js.Any], isDraggable = js.Any.fromFunction0(isDraggable), toggleDraggable = js.Any.fromFunction1(toggleDraggable))
    __obj.asInstanceOf[DraggableElement]
  }
  
  trait ConfigOptions extends StObject {
    
    /** The part of the element which can be used for dragging, defaults to the whole element */
    @JSName("$handle")
    var $handle: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * The items are draggable. This can change with {@link DraggableElement.toggleDraggable toggleDraggable}
      * but the draggable state should be called from the {@link DraggableGroupElement},
      * which updates the whole group
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$handle(value: JQuery[HTMLElement]): Self = StObject.set(x, "$handle", value.asInstanceOf[js.Any])
      
      inline def set$handleUndefined: Self = StObject.set(x, "$handle", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[DraggableElement]
       with Instantiable1[/* config */ ConfigOptions, DraggableElement] {
    
    var static: Static = js.native
  }
  
  trait EventMap extends StObject {
    
    var dragend: js.Array[Any]
    
    var dragstart: js.Array[/* item */ DraggableElement]
    
    var drop: js.Array[Any]
  }
  object EventMap {
    
    inline def apply(dragend: js.Array[Any], dragstart: js.Array[/* item */ DraggableElement], drop: js.Array[Any]): EventMap = {
      val __obj = js.Dynamic.literal(dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setDragend(value: js.Array[Any]): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      inline def setDragendVarargs(value: Any*): Self = StObject.set(x, "dragend", js.Array(value*))
      
      inline def setDragstart(value: js.Array[/* item */ DraggableElement]): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      inline def setDragstartVarargs(value: (/* item */ DraggableElement)*): Self = StObject.set(x, "dragstart", js.Array(value*))
      
      inline def setDrop(value: js.Array[Any]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropVarargs(value: Any*): Self = StObject.set(x, "drop", js.Array(value*))
    }
  }
  
  trait Props extends StObject {
    
    @JSName("$handle")
    var $handle: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($handle: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($handle = $handle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$handle(value: JQuery[HTMLElement]): Self = StObject.set(x, "$handle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prototype extends StObject {
    
    /**
      * Check the draggable state of this widget.
      *
      * @return Widget supports draggable operations
      */
    def isDraggable(): Boolean
    
    /**
      * Change the draggable state of this widget.
      * This allows users to temporarily halt the dragging operations.
      *
      * @param isDraggable Widget supports draggable operations
      */
    def toggleDraggable(isDraggable: Boolean): Unit
  }
  object Prototype {
    
    inline def apply(isDraggable: () => Boolean, toggleDraggable: Boolean => Unit): Prototype = {
      val __obj = js.Dynamic.literal(isDraggable = js.Any.fromFunction0(isDraggable), toggleDraggable = js.Any.fromFunction1(toggleDraggable))
      __obj.asInstanceOf[Prototype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prototype] (val x: Self) extends AnyVal {
      
      inline def setIsDraggable(value: () => Boolean): Self = StObject.set(x, "isDraggable", js.Any.fromFunction0(value))
      
      inline def setToggleDraggable(value: Boolean => Unit): Self = StObject.set(x, "toggleDraggable", js.Any.fromFunction1(value))
    }
  }
  
  trait Static extends StObject {
    
    /**
      * Cancel mouse down events.
      *
      * This property is usually set to `true` to prevent the focus from changing when the
      * button is clicked.
      * Classes such as {@link OO.ui.mixin.DraggableElement DraggableElement} and
      * {@link OO.ui.ButtonOptionWidget ButtonOptionWidget} use a value of `false` so that
      * dragging behavior is possible and mousedown events can be handled by a parent widget.
      */
    var cancelButtonMouseDownEvents: Boolean
  }
  object Static {
    
    inline def apply(cancelButtonMouseDownEvents: Boolean): Static = {
      val __obj = js.Dynamic.literal(cancelButtonMouseDownEvents = cancelButtonMouseDownEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setCancelButtonMouseDownEvents(value: Boolean): Self = StObject.set(x, "cancelButtonMouseDownEvents", value.asInstanceOf[js.Any])
    }
  }
}
