package typings.nivoRadar

import typings.d3Scale.mod.ScaleLinear_
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.DotsItemSymbolComponent
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoRadar.distTypesTypesMod.PointData
import typings.nivoRadar.distTypesTypesMod.RadarColorMapping
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarDotsMod {
  
  @JSImport("@nivo/radar/dist/types/RadarDots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RadarDots[D /* <: Record[String, Any] */](param0: RadarDotsProps[D]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadarDots")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RadarDotsProps[D /* <: Record[String, Any] */] extends StObject {
    
    var angleStep: Double
    
    var borderColor: InheritedColorConfig[PointData]
    
    var borderWidth: Double
    
    var color: InheritedColorConfig[PointData]
    
    var colorByKey: RadarColorMapping
    
    var data: js.Array[D]
    
    var enableLabel: Boolean
    
    def formatValue(value: Double, context: String): String
    
    def getIndex(d: D): String
    
    var keys: js.Array[String]
    
    var label: PropertyAccessor[PointData, String | Double]
    
    var labelYOffset: Double
    
    var radiusScale: ScaleLinear_[Double, Double, scala.Nothing]
    
    var rotation: Double
    
    var size: Double
    
    var symbol: js.UndefOr[DotsItemSymbolComponent] = js.undefined
  }
  object RadarDotsProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      angleStep: Double,
      borderColor: InheritedColorConfig[PointData],
      borderWidth: Double,
      color: InheritedColorConfig[PointData],
      colorByKey: RadarColorMapping,
      data: js.Array[D],
      enableLabel: Boolean,
      formatValue: (Double, String) => String,
      getIndex: D => String,
      keys: js.Array[String],
      label: PropertyAccessor[PointData, String | Double],
      labelYOffset: Double,
      radiusScale: ScaleLinear_[Double, Double, scala.Nothing],
      rotation: Double,
      size: Double
    ): RadarDotsProps[D] = {
      val __obj = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], formatValue = js.Any.fromFunction2(formatValue), getIndex = js.Any.fromFunction1(getIndex), keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelYOffset = labelYOffset.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarDotsProps[D]]
    }
    
    extension [Self <: RadarDotsProps[?], D /* <: Record[String, Any] */](x: Self & RadarDotsProps[D]) {
      
      inline def setAngleStep(value: Double): Self = StObject.set(x, "angleStep", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[PointData]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColor(value: InheritedColorConfig[PointData]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorByKey(value: RadarColorMapping): Self = StObject.set(x, "colorByKey", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setFormatValue(value: (Double, String) => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction2(value))
      
      inline def setGetIndex(value: D => String): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLabel(value: PropertyAccessor[PointData, String | Double]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: PointData => String | Double): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelYOffset(value: Double): Self = StObject.set(x, "labelYOffset", value.asInstanceOf[js.Any])
      
      inline def setRadiusScale(value: ScaleLinear_[Double, Double, scala.Nothing]): Self = StObject.set(x, "radiusScale", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: DotsItemSymbolComponent): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    }
  }
}
