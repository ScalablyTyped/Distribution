package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Options extends StObject {
    
    var displacement: js.UndefOr[js.Array[Double]] = js.native
    
    var fill: js.UndefOr[typings.ol.fillMod.default] = js.native
    
    var radius: Double = js.native
    
    var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(radius: Double): Options = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      @scala.inline
      def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: typings.ol.fillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStroke(value: typings.ol.strokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
