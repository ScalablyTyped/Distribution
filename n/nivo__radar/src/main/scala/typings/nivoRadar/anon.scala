package typings.nivoRadar

import org.scalablytyped.runtime.StringDictionary
import typings.d3Path.mod.Path_
import typings.d3Scale.mod.ScaleLinear_
import typings.d3Shape.mod.CurveFactory
import typings.d3Shape.mod.CurveGenerator
import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.ClosedCurveFactoryId
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.SvgFillMatcher
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.typesTypesMod.LegendProps
import typings.nivoRadar.nivoRadarStrings.Asterisk
import typings.nivoRadar.nivoRadarStrings.auto
import typings.nivoRadar.nivoRadarStrings.nivo
import typings.nivoRadar.typesMod.BoundLegendProps
import typings.nivoRadar.typesMod.RadarColorMapping
import typings.nivoRadar.typesMod.RadarCustomLayerProps
import typings.nivoRadar.typesMod.RadarSvgFillMatcherDatum
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AngleStep[D /* <: Record[String, Any] */] extends StObject {
    
    var angleStep: Double
    
    var boundDefs: Any
    
    var boundLegends: js.Array[BoundLegendProps]
    
    var centerX: Double
    
    var centerY: Double
    
    var colorByKey: RadarColorMapping
    
    var curveFactory: CurveFactory
    
    var customLayerProps: RadarCustomLayerProps[D]
    
    var fillByKey: Record[String, String | Null]
    
    def formatValue(value: Double, context: String): String
    
    def getIndex(datum: D): String
    
    var indices: js.Array[String]
    
    var legendData: js.Array[Label]
    
    var radius: Double
    
    var radiusScale: ScaleLinear_[Double, Double, scala.Nothing]
    
    var rotation: Double
  }
  object AngleStep {
    
    inline def apply[D /* <: Record[String, Any] */](
      angleStep: Double,
      boundDefs: Any,
      boundLegends: js.Array[BoundLegendProps],
      centerX: Double,
      centerY: Double,
      colorByKey: RadarColorMapping,
      curveFactory: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator,
      customLayerProps: RadarCustomLayerProps[D],
      fillByKey: Record[String, String | Null],
      formatValue: (Double, String) => String,
      getIndex: D => String,
      indices: js.Array[String],
      legendData: js.Array[Label],
      radius: Double,
      radiusScale: ScaleLinear_[Double, Double, scala.Nothing],
      rotation: Double
    ): AngleStep[D] = {
      val __obj = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], boundDefs = boundDefs.asInstanceOf[js.Any], boundLegends = boundLegends.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], curveFactory = js.Any.fromFunction1(curveFactory), customLayerProps = customLayerProps.asInstanceOf[js.Any], fillByKey = fillByKey.asInstanceOf[js.Any], formatValue = js.Any.fromFunction2(formatValue), getIndex = js.Any.fromFunction1(getIndex), indices = indices.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngleStep[D]]
    }
    
    extension [Self <: AngleStep[?], D /* <: Record[String, Any] */](x: Self & AngleStep[D]) {
      
      inline def setAngleStep(value: Double): Self = StObject.set(x, "angleStep", value.asInstanceOf[js.Any])
      
      inline def setBoundDefs(value: Any): Self = StObject.set(x, "boundDefs", value.asInstanceOf[js.Any])
      
      inline def setBoundLegends(value: js.Array[BoundLegendProps]): Self = StObject.set(x, "boundLegends", value.asInstanceOf[js.Any])
      
      inline def setBoundLegendsVarargs(value: BoundLegendProps*): Self = StObject.set(x, "boundLegends", js.Array(value*))
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setColorByKey(value: RadarColorMapping): Self = StObject.set(x, "colorByKey", value.asInstanceOf[js.Any])
      
      inline def setCurveFactory(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self = StObject.set(x, "curveFactory", js.Any.fromFunction1(value))
      
      inline def setCustomLayerProps(value: RadarCustomLayerProps[D]): Self = StObject.set(x, "customLayerProps", value.asInstanceOf[js.Any])
      
      inline def setFillByKey(value: Record[String, String | Null]): Self = StObject.set(x, "fillByKey", value.asInstanceOf[js.Any])
      
      inline def setFormatValue(value: (Double, String) => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction2(value))
      
      inline def setGetIndex(value: D => String): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
      
      inline def setIndices(value: js.Array[String]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: String*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setLegendData(value: js.Array[Label]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
      
      inline def setLegendDataVarargs(value: Label*): Self = StObject.set(x, "legendData", js.Array(value*))
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusScale(value: ScaleLinear_[Double, Double, scala.Nothing]): Self = StObject.set(x, "radiusScale", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
    
    var key: String
  }
  object Color {
    
    inline def apply(color: String, key: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Colors[D /* <: Record[String, Any] */] extends StObject {
    
    var colors: OrdinalColorScaleConfig[Index]
    
    var curve: ClosedCurveFactoryId
    
    var data: js.Array[D]
    
    var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
    
    var fill: js.UndefOr[js.Array[Id[D]]] = js.undefined
    
    var height: Double
    
    var indexBy: PropertyAccessor[D, String]
    
    var keys: js.Array[String]
    
    var legends: js.Array[LegendProps]
    
    var maxValue: Double | auto
    
    var rotationDegrees: Double
    
    var valueFormat: js.UndefOr[ValueFormat[Double, String]] = js.undefined
    
    var width: Double
  }
  object Colors {
    
    inline def apply[D /* <: Record[String, Any] */](
      colors: OrdinalColorScaleConfig[Index],
      curve: ClosedCurveFactoryId,
      data: js.Array[D],
      height: Double,
      indexBy: PropertyAccessor[D, String],
      keys: js.Array[String],
      legends: js.Array[LegendProps],
      maxValue: Double | auto,
      rotationDegrees: Double,
      width: Double
    ): Colors[D] = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], rotationDegrees = rotationDegrees.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors[D]]
    }
    
    extension [Self <: Colors[?], D /* <: Record[String, Any] */](x: Self & Colors[D]) {
      
      inline def setColors(value: OrdinalColorScaleConfig[Index]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Index => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCurve(value: ClosedCurveFactoryId): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
      
      inline def setFill(value: js.Array[Id[D]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: Id[D]*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIndexBy(value: PropertyAccessor[D, String]): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
      
      inline def setIndexByFunction1(value: D => String): Self = StObject.set(x, "indexBy", js.Any.fromFunction1(value))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMaxValue(value: Double | auto): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setRotationDegrees(value: Double): Self = StObject.set(x, "rotationDegrees", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, String]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatFunction2(value: (Double, String) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var id: String
  }
  object Dictkey {
    
    inline def apply(id: String): Dictkey = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndAngle extends StObject {
    
    var endAngle: Double
    
    var startAngle: Double
  }
  object EndAngle {
    
    inline def apply(endAngle: Double, startAngle: Double): EndAngle = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndAngle]
    }
    
    extension [Self <: EndAngle](x: Self) {
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fill extends StObject {
    
    var fill: String
    
    var stroke: String
    
    var x: Double
    
    var y: Double
  }
  object Fill {
    
    inline def apply(fill: String, stroke: String, x: Double, y: Double): Fill = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fill]
    }
    
    extension [Self <: Fill](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: String
  }
  object From {
    
    inline def apply(from: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id[D /* <: Record[String, Any] */] extends StObject {
    
    var id: String
    
    var `match`: (Record[String, Any]) | Asterisk | SvgFillMatcher[RadarSvgFillMatcherDatum[D]]
  }
  object Id {
    
    inline def apply[D /* <: Record[String, Any] */](
      id: String,
      `match`: (Record[String, Any]) | Asterisk | SvgFillMatcher[RadarSvgFillMatcherDatum[D]]
    ): Id[D] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id[D]]
    }
    
    extension [Self <: Id[?], D /* <: Record[String, Any] */](x: Self & Id[D]) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: (Record[String, Any]) | Asterisk | SvgFillMatcher[RadarSvgFillMatcherDatum[D]]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchFunction1(value: RadarSvgFillMatcherDatum[D] => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var key: String
  }
  object Index {
    
    inline def apply(index: Double, key: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var color: String
    
    var id: String
    
    var label: String
  }
  object Label {
    
    inline def apply(color: String, id: String, label: String): Label = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scheme extends StObject {
    
    var scheme: nivo
  }
  object Scheme {
    
    inline def apply(): Scheme = {
      val __obj = js.Dynamic.literal(scheme = "nivo")
      __obj.asInstanceOf[Scheme]
    }
    
    extension [Self <: Scheme](x: Self) {
      
      inline def setScheme(value: nivo): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}
