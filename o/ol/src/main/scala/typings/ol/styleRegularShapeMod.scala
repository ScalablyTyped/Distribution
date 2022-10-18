package typings.ol

import typings.ol.colorlikeMod.ColorLike
import typings.ol.sizeMod.Size
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleRegularShapeMod {
  
  @JSImport("ol/style/RegularShape", JSImport.Default)
  @js.native
  open class default protected () extends RegularShape {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var displacement: js.UndefOr[js.Array[Double]] = js.undefined
    
    var fill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
    
    var points: Double
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var radius1: js.UndefOr[Double] = js.undefined
    
    var radius2: js.UndefOr[Double] = js.undefined
    
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double | Size] = js.undefined
    
    var stroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
  }
  object Options {
    
    inline def apply(points: Double): Options = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value*))
      
      inline def setFill(value: typings.ol.styleFillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      inline def setRadius1Undefined: Self = StObject.set(x, "radius1", js.undefined)
      
      inline def setRadius2(value: Double): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStroke(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  @js.native
  trait RegularShape
    extends typings.ol.styleImageMod.default {
    
    /* protected */ def createRenderOptions(): RenderOptions = js.native
    
    /**
      * Get the angle used in generating the shape.
      */
    def getAngle(): Double = js.native
    
    /**
      * Get the fill style for the shape.
      */
    def getFill(): typings.ol.styleFillMod.default = js.native
    
    /**
      * Get the number of points for generating the shape.
      */
    def getPoints(): Double = js.native
    
    /**
      * Get the (primary) radius for the shape.
      */
    def getRadius(): Double = js.native
    
    /**
      * Get the secondary radius for the shape.
      */
    def getRadius2(): js.UndefOr[Double] = js.native
    
    /**
      * Get the stroke style for the shape.
      */
    def getStroke(): typings.ol.styleStrokeMod.default = js.native
    
    /* protected */ var radius_ : Double = js.native
    
    /* protected */ def render(): Unit = js.native
  }
  
  trait RenderOptions extends StObject {
    
    var lineCap: CanvasLineCap
    
    var lineDash: js.Array[Double]
    
    var lineDashOffset: Double
    
    var lineJoin: CanvasLineJoin
    
    var miterLimit: Double
    
    var size: Double
    
    var strokeStyle: js.UndefOr[ColorLike] = js.undefined
    
    var strokeWidth: Double
  }
  object RenderOptions {
    
    inline def apply(
      lineCap: CanvasLineCap,
      lineDash: js.Array[Double],
      lineDashOffset: Double,
      lineJoin: CanvasLineJoin,
      miterLimit: Double,
      size: Double,
      strokeWidth: Double
    ): RenderOptions = {
      val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyle(value: ColorLike): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
}
