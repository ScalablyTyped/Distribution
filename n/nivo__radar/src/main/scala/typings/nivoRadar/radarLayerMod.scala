package typings.nivoRadar

import typings.d3Path.mod.Path_
import typings.d3Scale.mod.ScaleLinear_
import typings.d3Shape.mod.CurveFactory
import typings.d3Shape.mod.CurveGenerator
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoRadar.anon.Color
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radarLayerMod {
  
  @JSImport("@nivo/radar/dist/types/RadarLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RadarLayer[D /* <: Record[String, Any] */](
    hasDataKeyColorByKeyFillByKeyRadiusScaleRotationAngleStepCurveFactoryBorderWidthBorderColorFillOpacityBlendMode: RadarLayerProps[D]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadarLayer")(hasDataKeyColorByKeyFillByKeyRadiusScaleRotationAngleStepCurveFactoryBorderWidthBorderColorFillOpacityBlendMode.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RadarLayerProps[D /* <: Record[String, Any] */] extends StObject {
    
    var angleStep: Double
    
    var blendMode: CssMixBlendMode
    
    var borderColor: InheritedColorConfig[Color]
    
    var borderWidth: Double
    
    var colorByKey: Record[String | Double, String]
    
    var curveFactory: CurveFactory
    
    var data: js.Array[D]
    
    var fillByKey: Record[String, String | Null]
    
    var fillOpacity: Double
    
    var item: String
    
    var radiusScale: ScaleLinear_[Double, Double, scala.Nothing]
    
    var rotation: Double
  }
  object RadarLayerProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      angleStep: Double,
      blendMode: CssMixBlendMode,
      borderColor: InheritedColorConfig[Color],
      borderWidth: Double,
      colorByKey: Record[String | Double, String],
      curveFactory: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator,
      data: js.Array[D],
      fillByKey: Record[String, String | Null],
      fillOpacity: Double,
      item: String,
      radiusScale: ScaleLinear_[Double, Double, scala.Nothing],
      rotation: Double
    ): RadarLayerProps[D] = {
      val __obj = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], curveFactory = js.Any.fromFunction1(curveFactory), data = data.asInstanceOf[js.Any], fillByKey = fillByKey.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarLayerProps[D]]
    }
    
    extension [Self <: RadarLayerProps[?], D /* <: Record[String, Any] */](x: Self & RadarLayerProps[D]) {
      
      inline def setAngleStep(value: Double): Self = StObject.set(x, "angleStep", value.asInstanceOf[js.Any])
      
      inline def setBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[Color]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColorByKey(value: Record[String | Double, String]): Self = StObject.set(x, "colorByKey", value.asInstanceOf[js.Any])
      
      inline def setCurveFactory(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self = StObject.set(x, "curveFactory", js.Any.fromFunction1(value))
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFillByKey(value: Record[String, String | Null]): Self = StObject.set(x, "fillByKey", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setRadiusScale(value: ScaleLinear_[Double, Double, scala.Nothing]): Self = StObject.set(x, "radiusScale", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
}
