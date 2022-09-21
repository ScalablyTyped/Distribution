package typings.nivoStream

import org.scalablytyped.runtime.StringDictionary
import typings.nivoAxes.typesMod.AxisProps
import typings.nivoAxes.typesMod.GridValues
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.AreaCurve
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.StackOffset
import typings.nivoCore.mod.StackOrder
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.typesTypesMod.LegendProps
import typings.nivoScales.typesMod.ScaleLinear
import typings.nivoScales.typesMod.ScalePoint
import typings.nivoStream.anon.BorderWidth
import typings.nivoStream.anon.OmitStreamLayerDatalabelc
import typings.nivoStream.anon.`0`
import typings.nivoStream.nivoStreamStrings.center
import typings.nivoStream.nivoStreamStrings.end
import typings.nivoStream.nivoStreamStrings.start
import typings.react.mod.FunctionComponent
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DotComponent = FunctionComponent[BorderWidth]
  
  type StackFunc[RawDatum /* <: StreamDatum */] = js.Function1[/* data */ js.Array[RawDatum], js.Array[js.Array[`0`[RawDatum]]]]
  
  type StackTooltip = FunctionComponent[StackTooltipProps]
  
  trait StackTooltipProps extends StObject {
    
    var slice: StreamSliceData
  }
  object StackTooltipProps {
    
    inline def apply(slice: StreamSliceData): StackTooltipProps = {
      val __obj = js.Dynamic.literal(slice = slice.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTooltipProps]
    }
    
    extension [Self <: StackTooltipProps](x: Self) {
      
      inline def setSlice(value: StreamSliceData): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamCommonProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var axisBottom: AxisProps[Any] | Null
    
    var axisLeft: AxisProps[Any] | Null
    
    var axisRight: AxisProps[Any] | Null
    
    var axisTop: AxisProps[Any] | Null
    
    var borderColor: InheritedColorConfig[StreamLayerData]
    
    var borderWidth: Double
    
    var colors: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]
    
    var curve: AreaCurve
    
    var dotBorderColor: InheritedColorConfig[StreamLayerDatum]
    
    var dotBorderWidth: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double
    
    var dotColor: InheritedColorConfig[StreamLayerDatum]
    
    var dotComponent: DotComponent
    
    var dotPosition: start | center | end
    
    var dotSize: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double
    
    var enableDots: Boolean
    
    var enableGridX: Boolean
    
    var enableGridY: Boolean
    
    var enableStackTooltip: Boolean
    
    var fillOpacity: Double
    
    var gridXValues: GridValues[String | Double]
    
    var gridYValues: GridValues[Double]
    
    var isInteractive: Boolean
    
    var label: PropertyAccessor[OmitStreamLayerDatalabelc, String | Double]
    
    var layers: js.Array[StreamLayer]
    
    var legends: js.Array[LegendProps]
    
    var margin: Box
    
    var offsetType: StackOffset
    
    var order: StackOrder
    
    var renderWrapper: Boolean
    
    var role: String
    
    var stack: StackFunc[RawDatum]
    
    var stackTooltip: StackTooltip
    
    var theme: Theme
    
    var tooltip: Tooltip
    
    var valueFormat: ValueFormat[Double, Unit]
  }
  object StreamCommonProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](
      borderColor: InheritedColorConfig[StreamLayerData],
      borderWidth: Double,
      colors: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc],
      curve: AreaCurve,
      dotBorderColor: InheritedColorConfig[StreamLayerDatum],
      dotBorderWidth: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double,
      dotColor: InheritedColorConfig[StreamLayerDatum],
      dotComponent: DotComponent,
      dotPosition: start | center | end,
      dotSize: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double,
      enableDots: Boolean,
      enableGridX: Boolean,
      enableGridY: Boolean,
      enableStackTooltip: Boolean,
      fillOpacity: Double,
      gridXValues: GridValues[String | Double],
      gridYValues: GridValues[Double],
      isInteractive: Boolean,
      label: PropertyAccessor[OmitStreamLayerDatalabelc, String | Double],
      layers: js.Array[StreamLayer],
      legends: js.Array[LegendProps],
      margin: Box,
      offsetType: StackOffset,
      order: StackOrder,
      renderWrapper: Boolean,
      role: String,
      stack: /* data */ js.Array[RawDatum] => js.Array[js.Array[`0`[RawDatum]]],
      stackTooltip: StackTooltip,
      theme: Theme,
      tooltip: Tooltip,
      valueFormat: ValueFormat[Double, Unit]
    ): StreamCommonProps[RawDatum] = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], dotColor = dotColor.asInstanceOf[js.Any], dotComponent = dotComponent.asInstanceOf[js.Any], dotPosition = dotPosition.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], enableDots = enableDots.asInstanceOf[js.Any], enableGridX = enableGridX.asInstanceOf[js.Any], enableGridY = enableGridY.asInstanceOf[js.Any], enableStackTooltip = enableStackTooltip.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], gridXValues = gridXValues.asInstanceOf[js.Any], gridYValues = gridYValues.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], offsetType = offsetType.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], stack = js.Any.fromFunction1(stack), stackTooltip = stackTooltip.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], valueFormat = valueFormat.asInstanceOf[js.Any], axisBottom = null, axisLeft = null, axisRight = null, axisTop = null)
      __obj.asInstanceOf[StreamCommonProps[RawDatum]]
    }
    
    extension [Self <: StreamCommonProps[?], RawDatum /* <: StreamDatum */](x: Self & StreamCommonProps[RawDatum]) {
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAxisBottom(value: AxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
      
      inline def setAxisLeft(value: AxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
      
      inline def setAxisRight(value: AxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
      
      inline def setAxisTop(value: AxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
      
      inline def setBorderColor(value: InheritedColorConfig[StreamLayerData]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColors(value: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: OmitStreamLayerDatalabelc => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCurve(value: AreaCurve): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setDotBorderColor(value: InheritedColorConfig[StreamLayerDatum]): Self = StObject.set(x, "dotBorderColor", value.asInstanceOf[js.Any])
      
      inline def setDotBorderWidth(value: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double): Self = StObject.set(x, "dotBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setDotBorderWidthFunction1(value: /* datum */ StreamLayerDatum => Double): Self = StObject.set(x, "dotBorderWidth", js.Any.fromFunction1(value))
      
      inline def setDotColor(value: InheritedColorConfig[StreamLayerDatum]): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      inline def setDotComponent(value: DotComponent): Self = StObject.set(x, "dotComponent", value.asInstanceOf[js.Any])
      
      inline def setDotPosition(value: start | center | end): Self = StObject.set(x, "dotPosition", value.asInstanceOf[js.Any])
      
      inline def setDotSize(value: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setDotSizeFunction1(value: /* datum */ StreamLayerDatum => Double): Self = StObject.set(x, "dotSize", js.Any.fromFunction1(value))
      
      inline def setEnableDots(value: Boolean): Self = StObject.set(x, "enableDots", value.asInstanceOf[js.Any])
      
      inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
      
      inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
      
      inline def setEnableStackTooltip(value: Boolean): Self = StObject.set(x, "enableStackTooltip", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridXValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
      
      inline def setGridXValuesVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "gridXValues", js.Array(value*))
      
      inline def setGridYValues(value: GridValues[Double]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
      
      inline def setGridYValuesVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "gridYValues", js.Array(value*))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[OmitStreamLayerDatalabelc, String | Double]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: OmitStreamLayerDatalabelc => String | Double): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLayers(value: js.Array[StreamLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: StreamLayer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setOffsetType(value: StackOffset): Self = StObject.set(x, "offsetType", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: StackOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setStack(value: /* data */ js.Array[RawDatum] => js.Array[js.Array[`0`[RawDatum]]]): Self = StObject.set(x, "stack", js.Any.fromFunction1(value))
      
      inline def setStackTooltip(value: StackTooltip): Self = StObject.set(x, "stackTooltip", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
    }
  }
  
  type StreamCustomLayer = FunctionComponent[StreamCustomLayerProps]
  
  trait StreamCustomLayerProps extends StObject {
    
    var layers: js.Array[StreamLayerData]
    
    var slices: js.Array[StreamSliceData]
    
    var xScale: ScalePoint[Double]
    
    var yScale: ScaleLinear[Double]
  }
  object StreamCustomLayerProps {
    
    inline def apply(
      layers: js.Array[StreamLayerData],
      slices: js.Array[StreamSliceData],
      xScale: ScalePoint[Double],
      yScale: ScaleLinear[Double]
    ): StreamCustomLayerProps = {
      val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], slices = slices.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamCustomLayerProps]
    }
    
    extension [Self <: StreamCustomLayerProps](x: Self) {
      
      inline def setLayers(value: js.Array[StreamLayerData]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: StreamLayerData*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setSlices(value: js.Array[StreamSliceData]): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      inline def setSlicesVarargs(value: StreamSliceData*): Self = StObject.set(x, "slices", js.Array(value*))
      
      inline def setXScale(value: ScalePoint[Double]): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setYScale(value: ScaleLinear[Double]): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamDataProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var data: js.Array[RawDatum]
    
    var keys: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]]
  }
  object StreamDataProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](data: js.Array[RawDatum], keys: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]]): StreamDataProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamDataProps[RawDatum]]
    }
    
    extension [Self <: StreamDataProps[?], RawDatum /* <: StreamDatum */](x: Self & StreamDataProps[RawDatum]) {
      
      inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setKeys(value: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: (Exclude[/* keyof RawDatum */ String, js.Symbol])*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
  
  type StreamDatum = StringDictionary[String | Double]
  
  type StreamLayer = StreamLayerId | StreamCustomLayer
  
  trait StreamLayerData extends StObject {
    
    var color: String
    
    var data: js.Array[StreamLayerDatum]
    
    var fill: js.UndefOr[String] = js.undefined
    
    var id: String | Double
    
    var label: String | Double
    
    var path: String
  }
  object StreamLayerData {
    
    inline def apply(
      color: String,
      data: js.Array[StreamLayerDatum],
      id: String | Double,
      label: String | Double,
      path: String
    ): StreamLayerData = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamLayerData]
    }
    
    extension [Self <: StreamLayerData](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[StreamLayerDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: StreamLayerDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamLayerDatum extends StObject {
    
    var color: String
    
    var formattedValue: Double | String
    
    var index: Double
    
    var layerId: String | Double
    
    var layerLabel: String | Double
    
    var value: Double
    
    var x: Double
    
    var y1: Double
    
    var y2: Double
  }
  object StreamLayerDatum {
    
    inline def apply(
      color: String,
      formattedValue: Double | String,
      index: Double,
      layerId: String | Double,
      layerLabel: String | Double,
      value: Double,
      x: Double,
      y1: Double,
      y2: Double
    ): StreamLayerDatum = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], layerLabel = layerLabel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamLayerDatum]
    }
    
    extension [Self <: StreamLayerDatum](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: Double | String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLayerId(value: String | Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
      
      inline def setLayerLabel(value: String | Double): Self = StObject.set(x, "layerLabel", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoStream.nivoStreamStrings.grid
    - typings.nivoStream.nivoStreamStrings.axes
    - typings.nivoStream.nivoStreamStrings.layers
    - typings.nivoStream.nivoStreamStrings.dots
    - typings.nivoStream.nivoStreamStrings.slices
    - typings.nivoStream.nivoStreamStrings.legends
  */
  trait StreamLayerId extends StObject
  object StreamLayerId {
    
    inline def axes: typings.nivoStream.nivoStreamStrings.axes = "axes".asInstanceOf[typings.nivoStream.nivoStreamStrings.axes]
    
    inline def dots: typings.nivoStream.nivoStreamStrings.dots = "dots".asInstanceOf[typings.nivoStream.nivoStreamStrings.dots]
    
    inline def grid: typings.nivoStream.nivoStreamStrings.grid = "grid".asInstanceOf[typings.nivoStream.nivoStreamStrings.grid]
    
    inline def layers: typings.nivoStream.nivoStreamStrings.layers = "layers".asInstanceOf[typings.nivoStream.nivoStreamStrings.layers]
    
    inline def legends: typings.nivoStream.nivoStreamStrings.legends = "legends".asInstanceOf[typings.nivoStream.nivoStreamStrings.legends]
    
    inline def slices: typings.nivoStream.nivoStreamStrings.slices = "slices".asInstanceOf[typings.nivoStream.nivoStreamStrings.slices]
  }
  
  trait StreamSliceData extends StObject {
    
    var index: Double
    
    var stack: js.Array[StreamLayerDatum]
    
    var x: Double
  }
  object StreamSliceData {
    
    inline def apply(index: Double, stack: js.Array[StreamLayerDatum], x: Double): StreamSliceData = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSliceData]
    }
    
    extension [Self <: StreamSliceData](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[StreamLayerDatum]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: StreamLayerDatum*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@nivo/stream.@nivo/stream/dist/types/types.StreamCommonProps<RawDatum>> & @nivo/stream.@nivo/stream/dist/types/types.StreamDataProps<RawDatum> & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/stream.@nivo/stream/dist/types/types.StreamLayerData> & @nivo/core.@nivo/core.Dimensions & @nivo/core.@nivo/core.ModernMotionProps */
  trait StreamSvgProps[RawDatum /* <: StreamDatum */] extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[StreamLayerData]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]] = js.undefined
    
    var curve: js.UndefOr[AreaCurve] = js.undefined
    
    var data: js.Array[RawDatum]
    
    var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
    
    var dotBorderColor: js.UndefOr[InheritedColorConfig[StreamLayerDatum]] = js.undefined
    
    var dotBorderWidth: js.UndefOr[(js.Function1[/* datum */ StreamLayerDatum, Double]) | Double] = js.undefined
    
    var dotColor: js.UndefOr[InheritedColorConfig[StreamLayerDatum]] = js.undefined
    
    var dotComponent: js.UndefOr[DotComponent] = js.undefined
    
    var dotPosition: js.UndefOr[start | center | end] = js.undefined
    
    var dotSize: js.UndefOr[(js.Function1[/* datum */ StreamLayerDatum, Double]) | Double] = js.undefined
    
    var enableDots: js.UndefOr[Boolean] = js.undefined
    
    var enableGridX: js.UndefOr[Boolean] = js.undefined
    
    var enableGridY: js.UndefOr[Boolean] = js.undefined
    
    var enableStackTooltip: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[js.Array[Id[StreamLayerData]]] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var gridXValues: js.UndefOr[GridValues[String | Double]] = js.undefined
    
    var gridYValues: js.UndefOr[GridValues[Double]] = js.undefined
    
    var height: Double
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]]
    
    var label: js.UndefOr[PropertyAccessor[OmitStreamLayerDatalabelc, String | Double]] = js.undefined
    
    var layers: js.UndefOr[js.Array[StreamLayer]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var offsetType: js.UndefOr[StackOffset] = js.undefined
    
    var order: js.UndefOr[StackOrder] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[StackFunc[RawDatum]] = js.undefined
    
    var stackTooltip: js.UndefOr[StackTooltip] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object StreamSvgProps {
    
    inline def apply[RawDatum /* <: StreamDatum */](
      data: js.Array[RawDatum],
      height: Double,
      keys: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]],
      width: Double
    ): StreamSvgProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSvgProps[RawDatum]]
    }
    
    extension [Self <: StreamSvgProps[?], RawDatum /* <: StreamDatum */](x: Self & StreamSvgProps[RawDatum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAxisBottom(value: AxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
      
      inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
      
      inline def setAxisLeft(value: AxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
      
      inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
      
      inline def setAxisRight(value: AxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
      
      inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
      
      inline def setAxisTop(value: AxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
      
      inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[StreamLayerData]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: OmitStreamLayerDatalabelc => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCurve(value: AreaCurve): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
      
      inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
      
      inline def setDotBorderColor(value: InheritedColorConfig[StreamLayerDatum]): Self = StObject.set(x, "dotBorderColor", value.asInstanceOf[js.Any])
      
      inline def setDotBorderColorUndefined: Self = StObject.set(x, "dotBorderColor", js.undefined)
      
      inline def setDotBorderWidth(value: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double): Self = StObject.set(x, "dotBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setDotBorderWidthFunction1(value: /* datum */ StreamLayerDatum => Double): Self = StObject.set(x, "dotBorderWidth", js.Any.fromFunction1(value))
      
      inline def setDotBorderWidthUndefined: Self = StObject.set(x, "dotBorderWidth", js.undefined)
      
      inline def setDotColor(value: InheritedColorConfig[StreamLayerDatum]): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      inline def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
      
      inline def setDotComponent(value: DotComponent): Self = StObject.set(x, "dotComponent", value.asInstanceOf[js.Any])
      
      inline def setDotComponentUndefined: Self = StObject.set(x, "dotComponent", js.undefined)
      
      inline def setDotPosition(value: start | center | end): Self = StObject.set(x, "dotPosition", value.asInstanceOf[js.Any])
      
      inline def setDotPositionUndefined: Self = StObject.set(x, "dotPosition", js.undefined)
      
      inline def setDotSize(value: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setDotSizeFunction1(value: /* datum */ StreamLayerDatum => Double): Self = StObject.set(x, "dotSize", js.Any.fromFunction1(value))
      
      inline def setDotSizeUndefined: Self = StObject.set(x, "dotSize", js.undefined)
      
      inline def setEnableDots(value: Boolean): Self = StObject.set(x, "enableDots", value.asInstanceOf[js.Any])
      
      inline def setEnableDotsUndefined: Self = StObject.set(x, "enableDots", js.undefined)
      
      inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
      
      inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
      
      inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
      
      inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
      
      inline def setEnableStackTooltip(value: Boolean): Self = StObject.set(x, "enableStackTooltip", value.asInstanceOf[js.Any])
      
      inline def setEnableStackTooltipUndefined: Self = StObject.set(x, "enableStackTooltip", js.undefined)
      
      inline def setFill(value: js.Array[Id[StreamLayerData]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: Id[StreamLayerData]*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setGridXValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
      
      inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
      
      inline def setGridXValuesVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "gridXValues", js.Array(value*))
      
      inline def setGridYValues(value: GridValues[Double]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
      
      inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
      
      inline def setGridYValuesVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "gridYValues", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setKeys(value: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: (Exclude[/* keyof RawDatum */ String, js.Symbol])*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLabel(value: PropertyAccessor[OmitStreamLayerDatalabelc, String | Double]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: OmitStreamLayerDatalabelc => String | Double): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[StreamLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: StreamLayer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setOffsetType(value: StackOffset): Self = StObject.set(x, "offsetType", value.asInstanceOf[js.Any])
      
      inline def setOffsetTypeUndefined: Self = StObject.set(x, "offsetType", js.undefined)
      
      inline def setOrder(value: StackOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStack(value: /* data */ js.Array[RawDatum] => js.Array[js.Array[`0`[RawDatum]]]): Self = StObject.set(x, "stack", js.Any.fromFunction1(value))
      
      inline def setStackTooltip(value: StackTooltip): Self = StObject.set(x, "stackTooltip", value.asInstanceOf[js.Any])
      
      inline def setStackTooltipUndefined: Self = StObject.set(x, "stackTooltip", js.undefined)
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Tooltip = FunctionComponent[TooltipProps]
  
  trait TooltipProps extends StObject {
    
    var layer: StreamLayerData
  }
  object TooltipProps {
    
    inline def apply(layer: StreamLayerData): TooltipProps = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setLayer(value: StreamLayerData): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
}
