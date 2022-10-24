package typings.nivoRadar

import typings.nivoRadar.distTypesTypesMod.RadarColorMapping
import typings.nivoRadar.distTypesTypesMod.RadarSliceTooltipComponent
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarSlicesMod {
  
  @JSImport("@nivo/radar/dist/types/RadarSlices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RadarSlices[D /* <: Record[String, Any] */](param0: RadarSlicesProps[D]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadarSlices")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RadarSlicesProps[D /* <: Record[String, Any] */] extends StObject {
    
    var angleStep: Double
    
    var colorByKey: RadarColorMapping
    
    var data: js.Array[D]
    
    def formatValue(value: Double, context: String): String
    
    def getIndex(d: D): String | Double
    
    var keys: js.Array[String]
    
    var radius: Double
    
    var rotation: Double
    
    var tooltip: RadarSliceTooltipComponent
  }
  object RadarSlicesProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      angleStep: Double,
      colorByKey: RadarColorMapping,
      data: js.Array[D],
      formatValue: (Double, String) => String,
      getIndex: D => String | Double,
      keys: js.Array[String],
      radius: Double,
      rotation: Double,
      tooltip: RadarSliceTooltipComponent
    ): RadarSlicesProps[D] = {
      val __obj = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction2(formatValue), getIndex = js.Any.fromFunction1(getIndex), keys = keys.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarSlicesProps[D]]
    }
    
    extension [Self <: RadarSlicesProps[?], D /* <: Record[String, Any] */](x: Self & RadarSlicesProps[D]) {
      
      inline def setAngleStep(value: Double): Self = StObject.set(x, "angleStep", value.asInstanceOf[js.Any])
      
      inline def setColorByKey(value: RadarColorMapping): Self = StObject.set(x, "colorByKey", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFormatValue(value: (Double, String) => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction2(value))
      
      inline def setGetIndex(value: D => String | Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: RadarSliceTooltipComponent): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
