package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.mapMod.FrameState
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasLayerMod {
  
  /**
    * @abstract
    * @template {import("../../layer/Layer.js").default} LayerType
    * @extends {LayerRenderer<LayerType>}
    */
  @JSImport("ol/renderer/canvas/Layer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, typings.ol.rendererLayerMod.default[Any]] */] () extends CanvasLayerRenderer[LayerType]
  
  @JSImport("ol/renderer/canvas/Layer", "canvasPool")
  @js.native
  val canvasPool: js.Array[HTMLCanvasElement] = js.native
  
  /**
    * @abstract
    * @template {import("../../layer/Layer.js").default} LayerType
    * @extends {LayerRenderer<LayerType>}
    */
  @js.native
  trait CanvasLayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, typings.ol.rendererLayerMod.default[Any]] */]
    extends typings.ol.rendererLayerMod.default[LayerType] {
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {import("../../extent.js").Extent} extent Clip extent.
      * @protected
      */
    /* protected */ def clipUnrotated(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    
    /**
      * @protected
      * @type {HTMLElement}
      */
    /* protected */ var container: HTMLElement = js.native
    
    /**
      * @type {boolean}
      */
    var containerReused: Boolean = js.native
    
    /**
      * @type {CanvasRenderingContext2D}
      */
    var context: CanvasRenderingContext2D = js.native
    
    /**
      * @param {import("../../render/EventType.js").default} type Event type.
      * @param {CanvasRenderingContext2D} context Context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @private
      */
    /* private */ var dispatchRenderEvent_ : Any = js.native
    
    /**
      * @protected
      * @type {import("../../Map.js").FrameState|null}
      */
    /* protected */ var frameState: FrameState | Null = js.native
    
    /**
      * @param {import('../../Map.js').FrameState} frameState Frame state.
      * @return {string} Background color.
      */
    def getBackground(frameState: FrameState): String = js.native
    
    /**
      * @param {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement} image Image.
      * @param {number} col The column index.
      * @param {number} row The row index.
      * @return {Uint8ClampedArray|null} The image data.
      */
    def getImageData(image: HTMLCanvasElement, col: Double, row: Double): js.typedarray.Uint8ClampedArray | Null = js.native
    def getImageData(image: HTMLImageElement, col: Double, row: Double): js.typedarray.Uint8ClampedArray | Null = js.native
    def getImageData(image: HTMLVideoElement, col: Double, row: Double): js.typedarray.Uint8ClampedArray | Null = js.native
    
    /**
      * Creates a transform for rendering to an element that will be rotated after rendering.
      * @param {import("../../coordinate.js").Coordinate} center Center.
      * @param {number} resolution Resolution.
      * @param {number} rotation Rotation.
      * @param {number} pixelRatio Pixel ratio.
      * @param {number} width Width of the rendered element (in pixels).
      * @param {number} height Height of the rendered element (in pixels).
      * @param {number} offsetX Offset on the x-axis in view coordinates.
      * @protected
      * @return {!import("../../transform.js").Transform} Transform.
      */
    /* protected */ def getRenderTransform(
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      pixelRatio: Double,
      width: Double,
      height: Double,
      offsetX: Double
    ): Transform = js.native
    
    /**
      * The transform for viewport CSS pixels to rendered pixels.  This transform must
      * be set when rendering a frame and may be used by other functions after rendering.
      * @protected
      * @type {import("../../transform.js").Transform}
      */
    /* protected */ var inversePixelTransform: Transform = js.native
    
    /**
      * @private
      * @type {CanvasRenderingContext2D}
      */
    /* private */ var pixelContext_ : Any = js.native
    
    /**
      * The transform for rendered pixels to viewport CSS pixels.  This transform must
      * be set when rendering a frame and may be used by other functions after rendering.
      * @protected
      * @type {import("../../transform.js").Transform}
      */
    /* protected */ var pixelTransform: Transform = js.native
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @protected
      */
    /* protected */ def postRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @protected
      */
    /* protected */ def preRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var renderedResolution: Double = js.native
    
    /**
      * A temporary transform.  The values in this transform should only be used in a
      * function that sets the values.
      * @protected
      * @type {import("../../transform.js").Transform}
      */
    /* protected */ var tempTransform: Transform = js.native
    
    /**
      * Get a rendering container from an existing target, if compatible.
      * @param {HTMLElement} target Potential render target.
      * @param {string} transform CSS Transform.
      * @param {string} [backgroundColor] Background color.
      */
    def useContainer(target: HTMLElement, transform: String): Unit = js.native
    def useContainer(target: HTMLElement, transform: String, backgroundColor: String): Unit = js.native
  }
}
