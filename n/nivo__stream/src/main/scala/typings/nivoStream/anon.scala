package typings.nivoStream

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.AreaCurve
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.StackOffset
import typings.nivoCore.mod.StackOrder
import typings.nivoCore.mod.ValueFormat
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.nivoScales.distTypesTypesMod.ScalePoint
import typings.nivoStream.distTypesTypesMod.StreamCustomLayerProps
import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamLayerData
import typings.nivoStream.distTypesTypesMod.StreamLayerDatum
import typings.nivoStream.distTypesTypesMod.StreamSliceData
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[RawDatum /* <: StreamDatum */] extends StObject {
    
    var `0`: Double
    
    var `1`: Double
    
    var data: RawDatum
  }
  object `0` {
    
    inline def apply[RawDatum /* <: StreamDatum */](`0`: Double, `1`: Double, data: RawDatum): `0`[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[RawDatum]]
    }
    
    extension [Self <: `0`[?], RawDatum /* <: StreamDatum */](x: Self & `0`[RawDatum]) {
      
      inline def set0(value: Double): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: Double): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait BorderColor[RawDatum /* <: StreamDatum */] extends StObject {
    
    var borderColor: js.UndefOr[InheritedColorConfig[StreamLayerData]] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]] = js.undefined
    
    var curve: js.UndefOr[AreaCurve] = js.undefined
    
    var data: js.Array[RawDatum]
    
    var dotBorderColor: js.UndefOr[InheritedColorConfig[StreamLayerDatum]] = js.undefined
    
    var dotBorderWidth: js.UndefOr[Double | (js.Function1[/* datum */ StreamLayerDatum, Double])] = js.undefined
    
    var dotColor: js.UndefOr[InheritedColorConfig[StreamLayerDatum]] = js.undefined
    
    var dotSize: js.UndefOr[Double | (js.Function1[/* datum */ StreamLayerDatum, Double])] = js.undefined
    
    var height: Double
    
    var keys: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]]
    
    var label: js.UndefOr[PropertyAccessor[OmitStreamLayerDatalabelc, String | Double]] = js.undefined
    
    var offsetType: js.UndefOr[StackOffset] = js.undefined
    
    var order: js.UndefOr[StackOrder] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object BorderColor {
    
    inline def apply[RawDatum /* <: StreamDatum */](
      data: js.Array[RawDatum],
      height: Double,
      keys: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]],
      width: Double
    ): BorderColor[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderColor[RawDatum]]
    }
    
    extension [Self <: BorderColor[?], RawDatum /* <: StreamDatum */](x: Self & BorderColor[RawDatum]) {
      
      inline def setBorderColor(value: InheritedColorConfig[StreamLayerData]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: OmitStreamLayerDatalabelc => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCurve(value: AreaCurve): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
      
      inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDotBorderColor(value: InheritedColorConfig[StreamLayerDatum]): Self = StObject.set(x, "dotBorderColor", value.asInstanceOf[js.Any])
      
      inline def setDotBorderColorUndefined: Self = StObject.set(x, "dotBorderColor", js.undefined)
      
      inline def setDotBorderWidth(value: Double | (js.Function1[/* datum */ StreamLayerDatum, Double])): Self = StObject.set(x, "dotBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setDotBorderWidthFunction1(value: /* datum */ StreamLayerDatum => Double): Self = StObject.set(x, "dotBorderWidth", js.Any.fromFunction1(value))
      
      inline def setDotBorderWidthUndefined: Self = StObject.set(x, "dotBorderWidth", js.undefined)
      
      inline def setDotColor(value: InheritedColorConfig[StreamLayerDatum]): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      inline def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
      
      inline def setDotSize(value: Double | (js.Function1[/* datum */ StreamLayerDatum, Double])): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setDotSizeFunction1(value: /* datum */ StreamLayerDatum => Double): Self = StObject.set(x, "dotSize", js.Any.fromFunction1(value))
      
      inline def setDotSizeUndefined: Self = StObject.set(x, "dotSize", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: (Exclude[/* keyof RawDatum */ String, js.Symbol])*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLabel(value: PropertyAccessor[OmitStreamLayerDatalabelc, String | Double]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: OmitStreamLayerDatalabelc => String | Double): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOffsetType(value: StackOffset): Self = StObject.set(x, "offsetType", value.asInstanceOf[js.Any])
      
      inline def setOffsetTypeUndefined: Self = StObject.set(x, "offsetType", js.undefined)
      
      inline def setOrder(value: StackOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BorderWidth extends StObject {
    
    var borderColor: String
    
    var borderWidth: Double
    
    var color: String
    
    var datum: StreamLayerDatum
    
    var size: Double
    
    var x: Double
    
    var y: Double
  }
  object BorderWidth {
    
    inline def apply(
      borderColor: String,
      borderWidth: Double,
      color: String,
      datum: StreamLayerDatum,
      size: Double,
      x: Double,
      y: Double
    ): BorderWidth = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderWidth]
    }
    
    extension [Self <: BorderWidth](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: StreamLayerDatum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
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
  
  trait GetBorderColor extends StObject {
    
    var getBorderColor: InheritedColorConfigCustomFunction[StreamLayerData] | (js.Function1[/* d */ StreamLayerData, Any])
    
    var getDotBorderColor: InheritedColorConfigCustomFunction[StreamLayerDatum] | (js.Function1[/* d */ StreamLayerDatum, Any])
    
    def getDotBorderWidth(datum: StreamLayerDatum): Double
    
    var getDotColor: InheritedColorConfigCustomFunction[StreamLayerDatum] | (js.Function1[/* d */ StreamLayerDatum, Any])
    
    def getDotSize(datum: StreamLayerDatum): Double
    
    var layerContext: StreamCustomLayerProps
    
    var layers: js.Array[StreamLayerData]
    
    var slices: js.Array[StreamSliceData]
    
    var xScale: ScalePoint[Double]
    
    var yScale: ScaleLinear[Double]
  }
  object GetBorderColor {
    
    inline def apply(
      getBorderColor: InheritedColorConfigCustomFunction[StreamLayerData] | (js.Function1[/* d */ StreamLayerData, Any]),
      getDotBorderColor: InheritedColorConfigCustomFunction[StreamLayerDatum] | (js.Function1[/* d */ StreamLayerDatum, Any]),
      getDotBorderWidth: StreamLayerDatum => Double,
      getDotColor: InheritedColorConfigCustomFunction[StreamLayerDatum] | (js.Function1[/* d */ StreamLayerDatum, Any]),
      getDotSize: StreamLayerDatum => Double,
      layerContext: StreamCustomLayerProps,
      layers: js.Array[StreamLayerData],
      slices: js.Array[StreamSliceData],
      xScale: ScalePoint[Double],
      yScale: ScaleLinear[Double]
    ): GetBorderColor = {
      val __obj = js.Dynamic.literal(getBorderColor = getBorderColor.asInstanceOf[js.Any], getDotBorderColor = getDotBorderColor.asInstanceOf[js.Any], getDotBorderWidth = js.Any.fromFunction1(getDotBorderWidth), getDotColor = getDotColor.asInstanceOf[js.Any], getDotSize = js.Any.fromFunction1(getDotSize), layerContext = layerContext.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], slices = slices.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBorderColor]
    }
    
    extension [Self <: GetBorderColor](x: Self) {
      
      inline def setGetBorderColor(
        value: InheritedColorConfigCustomFunction[StreamLayerData] | (js.Function1[/* d */ StreamLayerData, Any])
      ): Self = StObject.set(x, "getBorderColor", value.asInstanceOf[js.Any])
      
      inline def setGetBorderColorFunction1(value: /* d */ StreamLayerData => Any): Self = StObject.set(x, "getBorderColor", js.Any.fromFunction1(value))
      
      inline def setGetDotBorderColor(
        value: InheritedColorConfigCustomFunction[StreamLayerDatum] | (js.Function1[/* d */ StreamLayerDatum, Any])
      ): Self = StObject.set(x, "getDotBorderColor", value.asInstanceOf[js.Any])
      
      inline def setGetDotBorderColorFunction1(value: /* d */ StreamLayerDatum => Any): Self = StObject.set(x, "getDotBorderColor", js.Any.fromFunction1(value))
      
      inline def setGetDotBorderWidth(value: StreamLayerDatum => Double): Self = StObject.set(x, "getDotBorderWidth", js.Any.fromFunction1(value))
      
      inline def setGetDotColor(
        value: InheritedColorConfigCustomFunction[StreamLayerDatum] | (js.Function1[/* d */ StreamLayerDatum, Any])
      ): Self = StObject.set(x, "getDotColor", value.asInstanceOf[js.Any])
      
      inline def setGetDotColorFunction1(value: /* d */ StreamLayerDatum => Any): Self = StObject.set(x, "getDotColor", js.Any.fromFunction1(value))
      
      inline def setGetDotSize(value: StreamLayerDatum => Double): Self = StObject.set(x, "getDotSize", js.Any.fromFunction1(value))
      
      inline def setLayerContext(value: StreamCustomLayerProps): Self = StObject.set(x, "layerContext", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[StreamLayerData]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: StreamLayerData*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setSlices(value: js.Array[StreamSliceData]): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      inline def setSlicesVarargs(value: StreamSliceData*): Self = StObject.set(x, "slices", js.Array(value*))
      
      inline def setXScale(value: ScalePoint[Double]): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setYScale(value: ScaleLinear[Double]): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@nivo/stream.@nivo/stream/dist/types/types.StreamLayerData, 'label' | 'color' | 'data'> */
  trait OmitStreamLayerDatalabelc extends StObject {
    
    var fill: js.UndefOr[String] = js.undefined
    
    var id: String | Double
    
    var path: String
  }
  object OmitStreamLayerDatalabelc {
    
    inline def apply(id: String | Double, path: String): OmitStreamLayerDatalabelc = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitStreamLayerDatalabelc]
    }
    
    extension [Self <: OmitStreamLayerDatalabelc](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
