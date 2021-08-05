package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleCircleMod {
  
  @JSImport("ol/style/Circle", JSImport.Default)
  @js.native
  class default () extends CircleStyle {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait CircleStyle
    extends typings.ol.regularShapeMod.default {
    
    /**
      * Set the circle radius.
      */
    def setRadius(radius: Double): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var displacement: js.UndefOr[js.Array[Double]] = js.undefined
    
    var fill: js.UndefOr[typings.ol.fillMod.default] = js.undefined
    
    var radius: Double
    
    var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
  }
  object Options {
    
    inline def apply(radius: Double): Options = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value :_*))
      
      inline def setFill(value: typings.ol.fillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: typings.ol.strokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
