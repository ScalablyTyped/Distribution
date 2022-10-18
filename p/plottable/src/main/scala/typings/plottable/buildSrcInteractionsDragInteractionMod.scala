package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcInteractionsInteractionMod.Interaction
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInteractionsDragInteractionMod {
  
  @JSImport("plottable/build/src/interactions/dragInteraction", "Drag")
  @js.native
  open class Drag () extends Interaction {
    def this(mouseButton: Double) = this()
    
    /* private */ var _constrainedToComponent: Any = js.native
    
    /* private */ var _doDrag: Any = js.native
    
    /* private */ var _dragCallbacks: Any = js.native
    
    /* private */ var _dragEndCallbacks: Any = js.native
    
    /* private */ var _dragOrigin: Any = js.native
    
    /* private */ var _dragStartCallbacks: Any = js.native
    
    /* private */ var _dragging: Any = js.native
    
    /* private */ var _endDrag: Any = js.native
    
    /* private */ var _mouseButton: Any = js.native
    
    /* private */ var _mouseDispatcher: Any = js.native
    
    /* private */ var _mouseDownCallback: Any = js.native
    
    /**
      * Only emit events when the mouseFilter is true for the source mouse
      * events. Use this to define custom filters (e.g. only right click,
      * require shift to be held down, etc.)
      */
    /* private */ var _mouseFilter: Any = js.native
    
    /* private */ var _mouseMoveCallback: Any = js.native
    
    /* private */ var _mouseUpCallback: Any = js.native
    
    /* private */ var _startDrag: Any = js.native
    
    /* private */ var _touchDispatcher: Any = js.native
    
    /* private */ var _touchEndCallback: Any = js.native
    
    /* private */ var _touchMoveCallback: Any = js.native
    
    /* private */ var _touchStartCallback: Any = js.native
    
    /* private */ var _translateAndConstrain: Any = js.native
    
    /**
      * Gets whether the Drag Interaction constrains Points passed to its
      * callbacks to lie inside its Component.
      *
      * If true, when the user drags outside of the Component, the closest Point
      * inside the Component will be passed to the callback instead of the actual
      * cursor position.
      *
      * @return {boolean}
      */
    def constrainedToComponent(): Boolean = js.native
    /**
      * Sets whether the Drag Interaction constrains Points passed to its
      * callbacks to lie inside its Component.
      *
      * If true, when the user drags outside of the Component, the closest Point
      * inside the Component will be passed to the callback instead of the actual
      * cursor position.
      *
      * @param {boolean}
      * @return {Interactions.Drag} The calling Drag Interaction.
      */
    def constrainedToComponent(constrainedToComponent: Boolean): this.type = js.native
    
    /**
      * Gets the current Mouse Filter. Plottable implements a default Mouse Filter
      * to only Drag on a primary (left) click.
      * @returns {MouseFilter}
      */
    def mouseFilter(): MouseFilter = js.native
    /**
      * Set the current Mouse Filter. DragInteraction will only emit events when
      * the mouseFilter evaluates to true for the source mouse events. Use this
      * to define custom filters (e.g. only right click, requires shift to be
      * held down, etc.)
      *
      * @param {MouseFilter} filter
      * @returns {this}
      */
    def mouseFilter(filter: MouseFilter): this.type = js.native
    
    /**
      * Removes a callback that would be called during dragging.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def offDrag(callback: DragCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when dragging ends.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def offDragEnd(callback: DragCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when dragging starts.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def offDragStart(callback: DragCallback): this.type = js.native
    
    /**
      * Adds a callback to be called during dragging.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def onDrag(callback: DragCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when dragging ends.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def onDragEnd(callback: DragCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when dragging starts.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def onDragStart(callback: DragCallback): this.type = js.native
  }
  /* static members */
  object Drag {
    
    @JSImport("plottable/build/src/interactions/dragInteraction", "Drag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/interactions/dragInteraction", "Drag._DEFAULT_MOUSE_FILTER")
    @js.native
    def _DEFAULT_MOUSE_FILTER: Any = js.native
    inline def _DEFAULT_MOUSE_FILTER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MOUSE_FILTER")(x.asInstanceOf[js.Any])
  }
  
  type DragCallback = js.Function2[/* start */ Point, /* end */ Point, Unit]
  
  type MouseFilter = js.Function1[/* e */ MouseEvent, Boolean]
}
