package typings.plottable

import typings.plottable.buildSrcComponentsGuideLineLayerMod.GuideLineLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcComponentsDragLineLayerMod {
  
  @JSImport("plottable/build/src/components/dragLineLayer", "DragLineLayer")
  @js.native
  open class DragLineLayer[D] protected () extends GuideLineLayer[D] {
    def this(orientation: String) = this()
    
    /* private */ var _detectionEdge: Any = js.native
    
    /* private */ var _detectionRadius: Any = js.native
    
    /* private */ var _disconnectInteraction: Any = js.native
    
    /* private */ var _dragCallbacks: Any = js.native
    
    /* private */ var _dragEndCallbacks: Any = js.native
    
    /* private */ var _dragInteraction: Any = js.native
    
    /* private */ var _dragStartCallbacks: Any = js.native
    
    /* private */ var _enabled: Any = js.native
    
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
