package typings.nivoBar.anon

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAxes.distTypesTypesMod.CanvasAxisProps
import typings.nivoAxes.distTypesTypesMod.GridValues
import typings.nivoBar.distTypesTypesMod.BarCanvasLayer
import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarLegendProps
import typings.nivoBar.distTypesTypesMod.BarTooltipProps
import typings.nivoBar.distTypesTypesMod.ComputedBarDatum
import typings.nivoBar.distTypesTypesMod.ComputedBarDatumWithValue
import typings.nivoBar.distTypesTypesMod.ComputedDatum
import typings.nivoBar.distTypesTypesMod.LabelFormatter
import typings.nivoBar.distTypesTypesMod.LegendLabelDatum
import typings.nivoBar.distTypesTypesMod.RenderBarProps
import typings.nivoBar.nivoBarStrings.auto
import typings.nivoBar.nivoBarStrings.grouped
import typings.nivoBar.nivoBarStrings.horizontal
import typings.nivoBar.nivoBarStrings.id
import typings.nivoBar.nivoBarStrings.indexValue
import typings.nivoBar.nivoBarStrings.stacked
import typings.nivoBar.nivoBarStrings.vertical
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoScales.distTypesTypesMod.ScaleBandSpec
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import typings.react.mod.FC
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/bar.@nivo/bar/dist/types/types.BarCanvasProps<@nivo/bar.@nivo/bar/dist/types/types.BarDatum>, 'height' | 'width'> & react.react.RefAttributes<std.HTMLCanvasElement> */
trait OmitBarCanvasPropsBarDatu extends StObject {
  
  var annotations: js.UndefOr[js.Array[AnnotationMatcher[ComputedBarDatum[BarDatum]]]] = js.undefined
  
  var axisBottom: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var axisLeft: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var axisRight: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var axisTop: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var borderColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[BarDatum]]] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var colorBy: js.UndefOr[id | indexValue] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[ComputedDatum[BarDatum]]] = js.undefined
  
  var data: js.Array[BarDatum]
  
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  
  var enableLabel: js.UndefOr[Boolean] = js.undefined
  
  var gridXValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var gridYValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var groupMode: js.UndefOr[grouped | stacked] = js.undefined
  
  var indexBy: js.UndefOr[PropertyAccessor[BarDatum, String]] = js.undefined
  
  var indexScale: js.UndefOr[ScaleBandSpec] = js.undefined
  
  var initialHiddenIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var innerPadding: js.UndefOr[Double] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var label: js.UndefOr[PropertyAccessor[ComputedDatum[BarDatum], String]] = js.undefined
  
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.undefined
  
  var labelSkipHeight: js.UndefOr[Double] = js.undefined
  
  var labelSkipWidth: js.UndefOr[Double] = js.undefined
  
  var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[BarDatum]]] = js.undefined
  
  var layers: js.UndefOr[js.Array[BarCanvasLayer[BarDatum]]] = js.undefined
  
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  var legendLabel: js.UndefOr[PropertyAccessor[LegendLabelDatum[BarDatum], String]] = js.undefined
  
  var legends: js.UndefOr[js.Array[BarLegendProps]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  
  var minValue: js.UndefOr[auto | Double] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatumBarDatumcolo, 
      /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[BarDatum], 
      /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[BarDatum], 
      /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var ref: js.UndefOr[Ref[HTMLCanvasElement]] = js.undefined
  
  var renderBar: js.UndefOr[
    js.Function2[/* context */ CanvasRenderingContext2D, /* props */ RenderBarProps[BarDatum], Unit]
  ] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[FC[BarTooltipProps[BarDatum]]] = js.undefined
  
  var tooltipLabel: js.UndefOr[PropertyAccessor[ComputedDatum[BarDatum], String]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var valueScale: js.UndefOr[ScaleSpec] = js.undefined
}
object OmitBarCanvasPropsBarDatu {
  
  inline def apply(data: js.Array[BarDatum]): OmitBarCanvasPropsBarDatu = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitBarCanvasPropsBarDatu]
  }
  
  extension [Self <: OmitBarCanvasPropsBarDatu](x: Self) {
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[ComputedBarDatum[BarDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[ComputedBarDatum[BarDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAxisBottom(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
    
    inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
    
    inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
    
    inline def setAxisLeft(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
    
    inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
    
    inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
    
    inline def setAxisRight(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
    
    inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
    
    inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
    
    inline def setAxisTop(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
    
    inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
    
    inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedBarDatumWithValue[BarDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColorBy(value: id | indexValue): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
    
    inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[ComputedDatum[BarDatum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: ComputedDatum[BarDatum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[BarDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: BarDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
    
    inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
    
    inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
    
    inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
    
    inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
    
    inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
    
    inline def setGridXValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
    
    inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
    
    inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
    
    inline def setGridYValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
    
    inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
    
    inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
    
    inline def setGroupMode(value: grouped | stacked): Self = StObject.set(x, "groupMode", value.asInstanceOf[js.Any])
    
    inline def setGroupModeUndefined: Self = StObject.set(x, "groupMode", js.undefined)
    
    inline def setIndexBy(value: PropertyAccessor[BarDatum, String]): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
    
    inline def setIndexByFunction1(value: BarDatum => String): Self = StObject.set(x, "indexBy", js.Any.fromFunction1(value))
    
    inline def setIndexByUndefined: Self = StObject.set(x, "indexBy", js.undefined)
    
    inline def setIndexScale(value: ScaleBandSpec): Self = StObject.set(x, "indexScale", value.asInstanceOf[js.Any])
    
    inline def setIndexScaleUndefined: Self = StObject.set(x, "indexScale", js.undefined)
    
    inline def setInitialHiddenIds(value: js.Array[String]): Self = StObject.set(x, "initialHiddenIds", value.asInstanceOf[js.Any])
    
    inline def setInitialHiddenIdsUndefined: Self = StObject.set(x, "initialHiddenIds", js.undefined)
    
    inline def setInitialHiddenIdsVarargs(value: String*): Self = StObject.set(x, "initialHiddenIds", js.Array(value*))
    
    inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
    
    inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: PropertyAccessor[ComputedDatum[BarDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFormat(value: String | LabelFormatter): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatFunction1(value: /* label */ String | Double => String | Double): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
    
    inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
    
    inline def setLabelFunction1(value: ComputedDatum[BarDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelSkipHeight(value: Double): Self = StObject.set(x, "labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipHeightUndefined: Self = StObject.set(x, "labelSkipHeight", js.undefined)
    
    inline def setLabelSkipWidth(value: Double): Self = StObject.set(x, "labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipWidthUndefined: Self = StObject.set(x, "labelSkipWidth", js.undefined)
    
    inline def setLabelTextColor(value: InheritedColorConfig[ComputedBarDatumWithValue[BarDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayers(value: js.Array[BarCanvasLayer[BarDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: BarCanvasLayer[BarDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLegendLabel(value: PropertyAccessor[LegendLabelDatum[BarDatum], String]): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelFunction1(value: LegendLabelDatum[BarDatum] => String): Self = StObject.set(x, "legendLabel", js.Any.fromFunction1(value))
    
    inline def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
    
    inline def setLegends(value: js.Array[BarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: BarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatumBarDatumcolo, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[BarDatum], /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[BarDatum], /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRef(value: Ref[HTMLCanvasElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLCanvasElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderBar(value: (/* context */ CanvasRenderingContext2D, /* props */ RenderBarProps[BarDatum]) => Unit): Self = StObject.set(x, "renderBar", js.Any.fromFunction2(value))
    
    inline def setRenderBarUndefined: Self = StObject.set(x, "renderBar", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: FC[BarTooltipProps[BarDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabel(value: PropertyAccessor[ComputedDatum[BarDatum], String]): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelFunction1(value: ComputedDatum[BarDatum] => String): Self = StObject.set(x, "tooltipLabel", js.Any.fromFunction1(value))
    
    inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueScale(value: ScaleSpec): Self = StObject.set(x, "valueScale", value.asInstanceOf[js.Any])
    
    inline def setValueScaleUndefined: Self = StObject.set(x, "valueScale", js.undefined)
  }
}
