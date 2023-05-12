package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.renderCanvasMod.FillStrokeState
import typings.ol.renderCanvasMod.SerializableInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasBuilderMod {
  
  @JSImport("ol/render/canvas/Builder", JSImport.Default)
  @js.native
  open class default protected () extends CanvasBuilder {
    /**
      * @param {number} tolerance Tolerance.
      * @param {import("../../extent.js").Extent} maxExtent Maximum extent.
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      */
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasBuilder
    extends typings.ol.renderVectorContextMod.default {
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {number} end End.
      * @param {number} stride Stride.
      * @param {boolean} closed Last input coordinate equals first.
      * @param {boolean} skipFirst Skip first coordinate.
      * @protected
      * @return {number} My end.
      */
    /* protected */ def appendFlatLineCoordinates(
      flatCoordinates: js.Array[Double],
      offset: Double,
      end: Double,
      stride: Double,
      closed: Boolean,
      skipFirst: Boolean
    ): Double = js.native
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} stride Stride.
      * @protected
      * @return {number} My end
      */
    /* protected */ def appendFlatPointCoordinates(flatCoordinates: js.Array[Double], stride: Double): Double = js.native
    
    /**
      * @protected
      * @param {Array<number>} dashArray Dash array.
      * @return {Array<number>} Dash array with pixel ratio applied
      */
    /* protected */ def applyPixelRatio(dashArray: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * @param {import("../canvas.js").FillStrokeState} state State.
      */
    def applyStroke(state: FillStrokeState): Unit = js.native
    
    /**
      * @protected
      * @param {import("../../geom/Geometry").default|import("../Feature.js").default} geometry The geometry.
      * @param {import("../../Feature.js").FeatureLike} feature Feature.
      */
    /* protected */ def beginGeometry(geometry: typings.ol.geomGeometryMod.default, feature: FeatureLike): Unit = js.native
    /* protected */ def beginGeometry(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @private
      * @type {Array<*>}
      */
    /* private */ var beginGeometryInstruction1_ : Any = js.native
    
    /**
      * @private
      * @type {Array<*>}
      */
    /* private */ var beginGeometryInstruction2_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../extent.js").Extent}
      */
    /* private */ var bufferedMaxExtent_ : Any = js.native
    
    /**
      * @protected
      * @type {Array<number>}
      */
    /* protected */ var coordinates: js.Array[Double] = js.native
    
    /**
      * @param {import("../canvas.js").FillStrokeState} state State.
      * @return {Array<*>} Fill instruction.
      */
    def createFill(state: FillStrokeState): js.Array[Any] = js.native
    
    /**
      * @param {import("../canvas.js").FillStrokeState} state State.
      * @return {Array<*>} Stroke instruction.
      */
    def createStroke(state: FillStrokeState): js.Array[Any] = js.native
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {Array<number>} ends Ends.
      * @param {number} stride Stride.
      * @param {Array<number>} builderEnds Builder ends.
      * @return {number} Offset.
      */
    def drawCustomCoordinates_(
      flatCoordinates: js.Array[Double],
      offset: Double,
      ends: js.Array[Double],
      stride: Double,
      builderEnds: js.Array[Double]
    ): Double = js.native
    
    /**
      * @param {import("../../Feature.js").FeatureLike} feature Feature.
      */
    def endGeometry(feature: FeatureLike): Unit = js.native
    
    /**
      * @return {import("../canvas.js").SerializableInstructions} the serializable instructions.
      */
    def finish(): SerializableInstructions = js.native
    
    /**
      * Get the buffered rendering extent.  Rendering will be clipped to the extent
      * provided to the constructor.  To account for symbolizers that may intersect
      * this extent, we calculate a buffered extent (e.g. based on stroke width).
      * @return {import("../../extent.js").Extent} The buffered rendering extent.
      * @protected
      */
    /* protected */ def getBufferedMaxExtent(): Extent = js.native
    
    /**
      * @protected
      * @type {Array<*>}
      */
    /* protected */ var hitDetectionInstructions: js.Array[Any] = js.native
    
    /**
      * @protected
      * @type {Array<*>}
      */
    /* protected */ var instructions: js.Array[Any] = js.native
    
    /**
      * @protected
      * @const
      * @type {import("../../extent.js").Extent}
      */
    /* protected */ var maxExtent: Extent = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var maxLineWidth: Double = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var pixelRatio: Double = js.native
    
    /**
      * @protected
      * @const
      * @type {number}
      */
    /* protected */ var resolution: Double = js.native
    
    /**
      * Reverse the hit detection instructions.
      */
    def reverseHitDetectionInstructions(): Unit = js.native
    
    /**
      * @protected
      * @type {import("../canvas.js").FillStrokeState}
      */
    /* protected */ var state: FillStrokeState = js.native
    
    /**
      * @private
      * @type {import("../../coordinate.js").Coordinate}
      */
    /* private */ var tmpCoordinate_ : Any = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var tolerance: Double = js.native
    
    /**
      * @param {import("../canvas.js").FillStrokeState} state State.
      * @param {function(this:CanvasBuilder, import("../canvas.js").FillStrokeState):Array<*>} createFill Create fill.
      */
    def updateFillStyle(
      state: FillStrokeState,
      createFill: js.ThisFunction1[/* this */ this.type, /* arg1 */ FillStrokeState, js.Array[Any]]
    ): Unit = js.native
    
    /**
      * @param {import("../canvas.js").FillStrokeState} state State.
      * @param {function(this:CanvasBuilder, import("../canvas.js").FillStrokeState): void} applyStroke Apply stroke.
      */
    def updateStrokeStyle(
      state: FillStrokeState,
      applyStroke: js.ThisFunction1[/* this */ this.type, /* arg1 */ FillStrokeState, Unit]
    ): Unit = js.native
  }
}
