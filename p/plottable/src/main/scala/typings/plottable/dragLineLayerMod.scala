package typings.plottable

import typings.plottable.guideLineLayerMod.GuideLineLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragLineLayerMod {
  
  @JSImport("plottable/build/src/components/dragLineLayer", "DragLineLayer")
  @js.native
  class DragLineLayer[D] protected () extends GuideLineLayer[D] {
    def this(orientation: String) = this()
    
    var _detectionEdge: js.Any = js.native
    
    var _detectionRadius: js.Any = js.native
    
    var _disconnectInteraction: js.Any = js.native
    
    var _dragCallbacks: js.Any = js.native
    
    var _dragEndCallbacks: js.Any = js.native
    
    var _dragInteraction: js.Any = js.native
    
    var _dragStartCallbacks: js.Any = js.native
    
    var _enabled: js.Any = js.native
    
    /**
      * Gets the detection radius of the drag line in pixels.
      */
    def detectionRadius(): Double = js.native
    /**
      * Sets the detection radius of the drag line in pixels.
      *
      * @param {number} detectionRadius
      * @return {DragLineLayer<D>} The calling DragLineLayer.
      */
    def detectionRadius(detectionRadius: Double): this.type = js.native
    
    /**
      * Gets whether the DragLineLayer is enabled.
      */
    def enabled(): Boolean = js.native
    /**
      * Enables or disables the DragLineLayer.
      *
      * @param {boolean} enabled
      * @return {DragLineLayer<D>} The calling DragLineLayer.
      */
    def enabled(enabled: Boolean): this.type = js.native
    
    /**
      * Removes a callback that would be called during dragging.
      *
      * @param {DragLineCallback<D>} callback
      * @returns {DragLineLayer<D>} The calling DragLineLayer.
      */
    def offDrag(callback: IDragLineCallback[D]): this.type = js.native
    
    /**
      * Removes a callback that would be called when dragging ends.
      *
      * @param {DragLineCallback<D>} callback
      * @returns {DragLineLayer<D>} The calling DragLineLayer.
      */
    def offDragEnd(callback: IDragLineCallback[D]): this.type = js.native
    
    /**
      * Removes a callback that would be called when dragging starts.
      *
      * @param {DragLineCallback<D>} callback
      * @returns {DragLineLayer<D>} The calling DragLineLayer.
      */
    def offDragStart(callback: IDragLineCallback[D]): this.type = js.native
    
    /**
      * Sets a callback to be called during dragging.
      * The callback will be passed the calling DragLineLayer.
      *
      * @param {DragLineCallback<D>} callback
      * @returns {DragLineLayer<D>} The calling DragLineLayer.
      */
    def onDrag(callback: IDragLineCallback[D]): this.type = js.native
    
    /**
      * Sets a callback to be called when dragging ends.
      * The callback will be passed the calling DragLineLayer.
      *
      * @param {DragLineCallback<D>} callback
      * @returns {DragLineLayer<D>} The calling DragLineLayer.
      */
    def onDragEnd(callback: IDragLineCallback[D]): this.type = js.native
    
    /**
      * Sets the callback to be called when dragging starts.
      * The callback will be passed the calling DragLineLayer.
      *
      * @param {DragLineCallback<D>} callback
      * @returns {DragLineLayer<D>} The calling DragLineLayer.
      */
    def onDragStart(callback: IDragLineCallback[D]): this.type = js.native
  }
  
  type IDragLineCallback[D] = js.Function1[/* dragLineLayer */ DragLineLayer[D], Unit]
}
