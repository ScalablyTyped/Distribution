package typings.plottable

import typings.plottable.interactionsMod.Drag
import typings.plottable.interfacesMod.Bounds
import typings.plottable.selectionBoxLayerMod.SelectionBoxLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragBoxLayerMod {
  
  @JSImport("plottable/build/src/components/dragBoxLayer", "DragBoxLayer")
  @js.native
  /**
    * Constructs a DragBoxLayer.
    *
    * A DragBoxLayer is a SelectionBoxLayer with a built-in Drag Interaction.
    * A drag gesture will set the Bounds of the box.
    * If resizing is enabled using resizable(true), the edges of box can be repositioned.
    *
    * @constructor
    */
  open class DragBoxLayer () extends SelectionBoxLayer {
    
    /* private */ var _detectionCornerBL: Any = js.native
    
    /* private */ var _detectionCornerBR: Any = js.native
    
    /* private */ var _detectionCornerTL: Any = js.native
    
    /* private */ var _detectionCornerTR: Any = js.native
    
    /* private */ var _detectionEdgeB: Any = js.native
    
    /* private */ var _detectionEdgeL: Any = js.native
    
    /* private */ var _detectionEdgeR: Any = js.native
    
    /* private */ var _detectionEdgeT: Any = js.native
    
    /* private */ var _detectionRadius: Any = js.native
    
    /* private */ var _disconnectInteraction: Any = js.native
    
    /* private */ var _dragCallbacks: Any = js.native
    
    /* private */ var _dragEndCallbacks: Any = js.native
    
    /* private */ var _dragInteraction: Any = js.native
    
    /* private */ var _dragStartCallbacks: Any = js.native
    
    /* private */ var _getResizingEdges: Any = js.native
    
    /* protected */ var _hasCorners: Boolean = js.native
    
    /* private */ var _movable: Any = js.native
    
    /* private */ var _resetState: Any = js.native
    
    /* private */ var _resizable: Any = js.native
    
    /* private */ var _setMovableClass: Any = js.native
    
    /* protected */ def _setResizableClasses(canResize: Boolean): Unit = js.native
    
    /* private */ var _setUpCallbacks: Any = js.native
    
    /**
      * Gets the detection radius of the drag box in pixels.
      */
    def detectionRadius(): Double = js.native
    /**
      * Sets the detection radius of the drag box in pixels.
      *
      * @param {number} r
      * @return {DragBoxLayer} The calling DragBoxLayer.
      */
    def detectionRadius(r: Double): this.type = js.native
    
    /**
      * Gets the internal Interactions.Drag of the DragBoxLayer.
      */
    def dragInteraction(): Drag = js.native
    
    /**
      * Gets the enabled state.
      */
    def enabled(): Boolean = js.native
    /**
      * Enables or disables the interaction and drag box.
      */
    def enabled(enabled: Boolean): this.type = js.native
    
    /**
      * Gets whether or not the drag box is movable.
      */
    def movable(): Boolean = js.native
    /**
      * Sets whether or not the drag box is movable.
      *
      * @param {boolean} movable
      * @return {DragBoxLayer} The calling DragBoxLayer.
      */
    def movable(movable: Boolean): this.type = js.native
    
    /**
      * Removes a callback to be called during dragging.
      *
      * @param {DragBoxCallback} callback
      * @returns {DragBoxLayer} The calling DragBoxLayer.
      */
    def offDrag(callback: DragBoxCallback): this.type = js.native
    
    /**
      * Removes a callback to be called when dragging ends.
      *
      * @param {DragBoxCallback} callback
      * @returns {DragBoxLayer} The calling DragBoxLayer.
      */
    def offDragEnd(callback: DragBoxCallback): this.type = js.native
    
    /**
      * Removes a callback to be called when dragging starts.
      *
      * @param {DragBoxCallback} callback
      * @returns {DragBoxLayer} The calling DragBoxLayer.
      */
    def offDragStart(callback: DragBoxCallback): this.type = js.native
    
    /**
      * Sets a callback to be called during dragging.
      *
      * @param {DragBoxCallback} callback
      * @returns {DragBoxLayer} The calling DragBoxLayer.
      */
    def onDrag(callback: DragBoxCallback): this.type = js.native
    
    /**
      * Sets a callback to be called when dragging ends.
      *
      * @param {DragBoxCallback} callback
      * @returns {DragBoxLayer} The calling DragBoxLayer.
      */
    def onDragEnd(callback: DragBoxCallback): this.type = js.native
    
    /**
      * Sets the callback to be called when dragging starts.
      *
      * @param {DragBoxCallback} callback
      * @returns {DragBoxLayer} The calling DragBoxLayer.
      */
    def onDragStart(callback: DragBoxCallback): this.type = js.native
    
    /**
      * Gets whether or not the drag box is resizable.
      */
    def resizable(): Boolean = js.native
    /**
      * Sets whether or not the drag box is resizable.
      *
      * @param {boolean} canResize
      * @return {DragBoxLayer} The calling DragBoxLayer.
      */
    def resizable(canResize: Boolean): this.type = js.native
  }
  
  type DragBoxCallback = js.Function1[/* bounds */ Bounds, Unit]
}
