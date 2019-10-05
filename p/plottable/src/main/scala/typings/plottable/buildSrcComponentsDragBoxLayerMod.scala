package typings.plottable

import typings.plottable.buildSrcComponentsDragBoxLayerMod.DragBoxCallback
import typings.plottable.buildSrcComponentsSelectionBoxLayerMod.SelectionBoxLayer
import typings.plottable.buildSrcCoreInterfacesMod.Bounds
import typings.plottable.buildSrcInteractionsMod.Drag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/dragBoxLayer", JSImport.Namespace)
@js.native
object buildSrcComponentsDragBoxLayerMod extends js.Object {
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
  class DragBoxLayer () extends SelectionBoxLayer {
    var _detectionCornerBL: js.Any = js.native
    var _detectionCornerBR: js.Any = js.native
    var _detectionCornerTL: js.Any = js.native
    var _detectionCornerTR: js.Any = js.native
    var _detectionEdgeB: js.Any = js.native
    var _detectionEdgeL: js.Any = js.native
    var _detectionEdgeR: js.Any = js.native
    var _detectionEdgeT: js.Any = js.native
    var _detectionRadius: js.Any = js.native
    var _disconnectInteraction: js.Any = js.native
    var _dragCallbacks: js.Any = js.native
    var _dragEndCallbacks: js.Any = js.native
    var _dragInteraction: js.Any = js.native
    var _dragStartCallbacks: js.Any = js.native
    var _hasCorners: Boolean = js.native
    var _movable: js.Any = js.native
    var _resizable: js.Any = js.native
    /* private */ def _getResizingEdges(p: js.Any): js.Any = js.native
    /* private */ def _resetState(): js.Any = js.native
    /* private */ def _setMovableClass(): js.Any = js.native
    /* protected */ def _setResizableClasses(canResize: Boolean): Unit = js.native
    /* private */ def _setUpCallbacks(): js.Any = js.native
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

