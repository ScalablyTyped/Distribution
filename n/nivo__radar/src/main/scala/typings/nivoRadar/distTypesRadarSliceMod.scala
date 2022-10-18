package typings.nivoRadar

import typings.d3Shape.mod.Arc_
import typings.nivoRadar.anon.EndAngle
import typings.nivoRadar.distTypesTypesMod.RadarSliceTooltipComponent
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarSliceMod {
  
  @JSImport("@nivo/radar/dist/types/RadarSlice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RadarSlice[D /* <: Record[String, Any] */](
    hasDatumKeysIndexFormatValueColorByKeyRadiusStartAngleEndAngleArcGeneratorTooltip: RadarSliceProps[D]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadarSlice")(hasDatumKeysIndexFormatValueColorByKeyRadiusStartAngleEndAngleArcGeneratorTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RadarSliceProps[D /* <: Record[String, Any] */] extends StObject {
    
    var arcGenerator: Arc_[Unit, EndAngle]
    
    var colorByKey: Record[String, String]
    
    var datum: D
    
    var endAngle: Double
    
    def formatValue(value: Double, context: String): String
    
    var index: String | Double
    
    var keys: js.Array[String]
    
    var radius: Double
    
    var startAngle: Double
    
    var tooltip: RadarSliceTooltipComponent
  }
  object RadarSliceProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      arcGenerator: Arc_[Unit, EndAngle],
      colorByKey: Record[String, String],
      datum: D,
      endAngle: Double,
      formatValue: (Double, String) => String,
      index: String | Double,
      keys: js.Array[String],
      radius: Double,
      startAngle: Double,
      tooltip: RadarSliceTooltipComponent
    ): RadarSliceProps[D] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], formatValue = js.Any.fromFunction2(formatValue), index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarSliceProps[D]]
    }
    
    extension [Self <: RadarSliceProps[?], D /* <: Record[String, Any] */](x: Self & RadarSliceProps[D]) {
      
      inline def setArcGenerator(value: Arc_[Unit, EndAngle]): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setColorByKey(value: Record[String, String]): Self = StObject.set(x, "colorByKey", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: D): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setFormatValue(value: (Double, String) => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction2(value))
      
      inline def setIndex(value: String | Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: RadarSliceTooltipComponent): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
