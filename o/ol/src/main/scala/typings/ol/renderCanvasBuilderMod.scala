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
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasBuilder
    extends typings.ol.renderVectorContextMod.default {
    
    /* protected */ def appendFlatLineCoordinates(
      flatCoordinates: js.Array[Double],
      offset: Double,
      end: Double,
      stride: Double,
      closed: Boolean,
      skipFirst: Boolean
    ): Double = js.native
    
    /* protected */ def appendFlatPointCoordinates(flatCoordinates: js.Array[Double], stride: Double): Double = js.native
    
    /* protected */ def applyPixelRatio(dashArray: js.Array[Double]): js.Array[Double] = js.native
    
    def applyStroke(state: FillStrokeState): Unit = js.native
    
    /* protected */ def beginGeometry(geometry: typings.ol.geomGeometryMod.default, feature: FeatureLike): Unit = js.native
    /* protected */ def beginGeometry(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /* protected */ var coordinates: js.Array[Double] = js.native
    
    def createFill(state: FillStrokeState): js.Array[Any] = js.native
    
    def createStroke(state: FillStrokeState): js.Array[Any] = js.native
    
    def drawCustomCoordinates_(
      flatCoordinates: js.Array[Double],
      offset: Double,
      ends: js.Array[Double],
      stride: Double,
      builderEnds: js.Array[Double]
    ): Double = js.native
    
    def endGeometry(feature: FeatureLike): Unit = js.native
    
    def finish(): SerializableInstructions = js.native
    
    /**
      * Get the buffered rendering extent.  Rendering will be clipped to the extent
      * provided to the constructor.  To account for symbolizers that may intersect
      * this extent, we calculate a buffered extent (e.g. based on stroke width).
      */
    /* protected */ def getBufferedMaxExtent(): Extent = js.native
    
    /* protected */ var hitDetectionInstructions: js.Array[Any] = js.native
    
    /* protected */ var instructions: js.Array[Any] = js.native
    
    /* protected */ var maxExtent: Extent = js.native
    
    /* protected */ var maxLineWidth: Double = js.native
    
    /* protected */ var pixelRatio: Double = js.native
    
    /* protected */ var resolution: Double = js.native
    
    /**
      * Reverse the hit detection instructions.
      */
    def reverseHitDetectionInstructions(): Unit = js.native
    
    /* protected */ var state: FillStrokeState = js.native
    
    /* protected */ var tolerance: Double = js.native
    
    def updateFillStyle(
      state: FillStrokeState,
      createFill: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, js.Array[Any]]
    ): Unit = js.native
    
    def updateStrokeStyle(
      state: FillStrokeState,
      applyStroke: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, Unit]
    ): Unit = js.native
  }
}
