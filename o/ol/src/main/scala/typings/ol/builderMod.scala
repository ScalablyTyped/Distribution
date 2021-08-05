package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.canvasMod.FillState
import typings.ol.canvasMod.FillStrokeState
import typings.ol.canvasMod.StrokeState
import typings.ol.canvasMod.TextState
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderMod {
  
  @JSImport("ol/render/canvas/Builder", JSImport.Default)
  @js.native
  class default protected () extends CanvasBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasBuilder
    extends typings.ol.vectorContextMod.default {
    
    /* protected */ def appendFlatCoordinates(
      flatCoordinates: js.Array[Double],
      offset: Double,
      end: Double,
      stride: Double,
      closed: Boolean,
      skipFirst: Boolean
    ): Double = js.native
    
    /* protected */ def applyPixelRatio(dashArray: js.Array[Double]): js.Array[Double] = js.native
    
    def applyStroke(state: FillStrokeState): Unit = js.native
    
    /* protected */ def beginGeometry(geometry: typings.ol.geometryMod.default, feature: FeatureLike): Unit = js.native
    /* protected */ def beginGeometry(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /* protected */ var coordinates: js.Array[Double] = js.native
    
    def createFill(state: FillStrokeState): js.Array[js.Any] = js.native
    
    def createStroke(state: FillStrokeState): js.Array[js.Any] = js.native
    
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
    
    /* protected */ var hitDetectionInstructions: js.Array[js.Any] = js.native
    
    /* protected */ var instructions: js.Array[js.Any] = js.native
    
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
      createFill: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, js.Array[js.Any]]
    ): Unit = js.native
    
    def updateStrokeStyle(
      state: FillStrokeState,
      applyStroke: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, Unit]
    ): Unit = js.native
  }
  
  trait SerializableInstructions extends StObject {
    
    var coordinates: js.Array[Double]
    
    var fillStates: js.UndefOr[StringDictionary[FillState]] = js.undefined
    
    var hitDetectionInstructions: js.Array[js.Any]
    
    var instructions: js.Array[js.Any]
    
    var strokeStates: js.UndefOr[StringDictionary[StrokeState]] = js.undefined
    
    var textStates: js.UndefOr[StringDictionary[TextState]] = js.undefined
  }
  object SerializableInstructions {
    
    inline def apply(
      coordinates: js.Array[Double],
      hitDetectionInstructions: js.Array[js.Any],
      instructions: js.Array[js.Any]
    ): SerializableInstructions = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializableInstructions]
    }
    
    extension [Self <: SerializableInstructions](x: Self) {
      
      inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      inline def setFillStates(value: StringDictionary[FillState]): Self = StObject.set(x, "fillStates", value.asInstanceOf[js.Any])
      
      inline def setFillStatesUndefined: Self = StObject.set(x, "fillStates", js.undefined)
      
      inline def setHitDetectionInstructions(value: js.Array[js.Any]): Self = StObject.set(x, "hitDetectionInstructions", value.asInstanceOf[js.Any])
      
      inline def setHitDetectionInstructionsVarargs(value: js.Any*): Self = StObject.set(x, "hitDetectionInstructions", js.Array(value :_*))
      
      inline def setInstructions(value: js.Array[js.Any]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
      
      inline def setInstructionsVarargs(value: js.Any*): Self = StObject.set(x, "instructions", js.Array(value :_*))
      
      inline def setStrokeStates(value: StringDictionary[StrokeState]): Self = StObject.set(x, "strokeStates", value.asInstanceOf[js.Any])
      
      inline def setStrokeStatesUndefined: Self = StObject.set(x, "strokeStates", js.undefined)
      
      inline def setTextStates(value: StringDictionary[TextState]): Self = StObject.set(x, "textStates", value.asInstanceOf[js.Any])
      
      inline def setTextStatesUndefined: Self = StObject.set(x, "textStates", js.undefined)
    }
  }
}
