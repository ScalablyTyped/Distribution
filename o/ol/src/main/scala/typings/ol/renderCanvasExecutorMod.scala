package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.renderCanvasMod.Label
import typings.ol.renderCanvasMod.SerializableInstructions
import typings.ol.sizeMod.Size
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasExecutorMod {
  
  @JSImport("ol/render/canvas/Executor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Executor {
    def this(
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      instructions: SerializableInstructions,
      renderBuffer: Size
    ) = this()
  }
  
  trait BBox extends StObject {
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
    
    var value: Any
  }
  object BBox {
    
    inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double, value: Any): BBox = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    extension [Self <: BBox](x: Self) {
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Executor extends StObject {
    
    /* protected */ var coordinates: js.Array[Double] = js.native
    
    def createLabel(text: String, textKey: String, fillKey: String, strokeKey: String): Label = js.native
    
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_declutterTree: typings.rbush.mod.default[Any]
    ): Unit = js.native
    
    def executeHitDetection[T](context: CanvasRenderingContext2D, transform: Transform, viewRotation: Double): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      opt_featureCallback: Unit,
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      opt_featureCallback: FeatureCallback[T]
    ): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      opt_featureCallback: FeatureCallback[T],
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    
    /* protected */ var hitDetectionInstructions: js.Array[Any] = js.native
    
    /* protected */ var instructions: js.Array[Any] = js.native
    
    /* protected */ var overlaps: Boolean = js.native
    
    /* protected */ var pixelRatio: Double = js.native
    
    def replayTextBackground_(
      context: CanvasRenderingContext2D,
      p1: Coordinate,
      p2: Coordinate,
      p3: Coordinate,
      p4: Coordinate,
      fillInstruction: js.Array[Any],
      strokeInstruction: js.Array[Any]
    ): Unit = js.native
    
    /* protected */ var resolution: Double = js.native
  }
  
  type FeatureCallback[T] = js.Function2[/* p0 */ FeatureLike, /* p1 */ typings.ol.geomSimpleGeometryMod.default, T]
  
  trait ImageOrLabelDimensions extends StObject {
    
    var canvasTransform: Transform
    
    var declutterBox: BBox
    
    var drawImageH: Double
    
    var drawImageW: Double
    
    var drawImageX: Double
    
    var drawImageY: Double
    
    var originX: Double
    
    var originY: Double
    
    var scale: js.Array[Double]
  }
  object ImageOrLabelDimensions {
    
    inline def apply(
      canvasTransform: Transform,
      declutterBox: BBox,
      drawImageH: Double,
      drawImageW: Double,
      drawImageX: Double,
      drawImageY: Double,
      originX: Double,
      originY: Double,
      scale: js.Array[Double]
    ): ImageOrLabelDimensions = {
      val __obj = js.Dynamic.literal(canvasTransform = canvasTransform.asInstanceOf[js.Any], declutterBox = declutterBox.asInstanceOf[js.Any], drawImageH = drawImageH.asInstanceOf[js.Any], drawImageW = drawImageW.asInstanceOf[js.Any], drawImageX = drawImageX.asInstanceOf[js.Any], drawImageY = drawImageY.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOrLabelDimensions]
    }
    
    extension [Self <: ImageOrLabelDimensions](x: Self) {
      
      inline def setCanvasTransform(value: Transform): Self = StObject.set(x, "canvasTransform", value.asInstanceOf[js.Any])
      
      inline def setCanvasTransformVarargs(value: Double*): Self = StObject.set(x, "canvasTransform", js.Array(value*))
      
      inline def setDeclutterBox(value: BBox): Self = StObject.set(x, "declutterBox", value.asInstanceOf[js.Any])
      
      inline def setDrawImageH(value: Double): Self = StObject.set(x, "drawImageH", value.asInstanceOf[js.Any])
      
      inline def setDrawImageW(value: Double): Self = StObject.set(x, "drawImageW", value.asInstanceOf[js.Any])
      
      inline def setDrawImageX(value: Double): Self = StObject.set(x, "drawImageX", value.asInstanceOf[js.Any])
      
      inline def setDrawImageY(value: Double): Self = StObject.set(x, "drawImageY", value.asInstanceOf[js.Any])
      
      inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setOriginY(value: Double): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      inline def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
    }
  }
  
  type ReplayImageOrLabelArgs = Any
}
