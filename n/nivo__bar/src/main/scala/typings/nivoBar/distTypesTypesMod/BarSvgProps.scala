package typings.nivoBar.distTypesTypesMod

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAxes.distTypesTypesMod.AxisProps
import typings.nivoAxes.distTypesTypesMod.GridValues
import typings.nivoBar.anon.Color
import typings.nivoBar.nivoBarStrings.auto
import typings.nivoBar.nivoBarStrings.grouped
import typings.nivoBar.nivoBarStrings.horizontal
import typings.nivoBar.nivoBarStrings.id
import typings.nivoBar.nivoBarStrings.indexValue
import typings.nivoBar.nivoBarStrings.stacked
import typings.nivoBar.nivoBarStrings.vertical
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CartesianMarkerProps
import typings.nivoCore.mod.DatumValue
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoScales.distTypesTypesMod.ScaleBandSpec
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@nivo/bar.@nivo/bar/dist/types/types.BarCommonProps<RawDatum>> & @nivo/bar.@nivo/bar/dist/types/types.DataProps<RawDatum> & @nivo/bar.@nivo/bar/dist/types/types.BarHandlers<RawDatum, std.SVGRectElement> & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/bar.@nivo/bar/dist/types/types.ComputedBarDatum<RawDatum>> & @nivo/core.@nivo/core.Dimensions & @nivo/core.@nivo/core.ModernMotionProps & std.Partial<{  axisBottom :@nivo/axes.@nivo/axes.AxisProps<any> | null,   axisLeft :@nivo/axes.@nivo/axes.AxisProps<any> | null,   axisRight :@nivo/axes.@nivo/axes.AxisProps<any> | null,   axisTop :@nivo/axes.@nivo/axes.AxisProps<any> | null,   barComponent :react.react.FC<@nivo/bar.@nivo/bar/dist/types/types.BarItemProps<RawDatum>>,   markers :std.Array<@nivo/core.@nivo/core.CartesianMarkerProps<@nivo/core.@nivo/core.DatumValue>>,   layers :std.Array<@nivo/bar.@nivo/bar/dist/types/types.BarLayer<RawDatum>>,   role :string,   ariaLabel :react.react.AriaAttributes['aria-label'] | undefined,   ariaLabelledBy :react.react.AriaAttributes['aria-labelledby'] | undefined,   ariaDescribedBy :react.react.AriaAttributes['aria-describedby'] | undefined,   isFocusable :boolean | undefined,   barAriaLabel :(data : @nivo/bar.@nivo/bar/dist/types/types.ComputedDatum<RawDatum>): react.react.AriaAttributes['aria-label'] | undefined,   barAriaLabelledBy :(data : @nivo/bar.@nivo/bar/dist/types/types.ComputedDatum<RawDatum>): react.react.AriaAttributes['aria-labelledby'] | undefined,   barAriaDescribedBy :(data : @nivo/bar.@nivo/bar/dist/types/types.ComputedDatum<RawDatum>): react.react.AriaAttributes['aria-describedby'] | undefined}> */
trait BarSvgProps[RawDatum /* <: BarDatum */] extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var annotations: js.UndefOr[js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]] = js.undefined
  
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  
  var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var barAriaDescribedBy: js.UndefOr[js.Function1[/* data */ ComputedDatum[RawDatum], js.UndefOr[String]]] = js.undefined
  
  var barAriaLabel: js.UndefOr[js.Function1[/* data */ ComputedDatum[RawDatum], js.UndefOr[String]]] = js.undefined
  
  var barAriaLabelledBy: js.UndefOr[js.Function1[/* data */ ComputedDatum[RawDatum], js.UndefOr[String]]] = js.undefined
  
  var barComponent: js.UndefOr[FC[BarItemProps[RawDatum]]] = js.undefined
  
  var borderColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var colorBy: js.UndefOr[id | indexValue] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var data: js.Array[RawDatum]
  
  var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
  
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  
  var enableLabel: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[js.Array[Id[ComputedBarDatum[RawDatum]]]] = js.undefined
  
  var gridXValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var gridYValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var groupMode: js.UndefOr[grouped | stacked] = js.undefined
  
  var height: Double
  
  var indexBy: js.UndefOr[PropertyAccessor[RawDatum, String]] = js.undefined
  
  var indexScale: js.UndefOr[ScaleBandSpec] = js.undefined
  
  var initialHiddenIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var innerPadding: js.UndefOr[Double] = js.undefined
  
  var isFocusable: js.UndefOr[Boolean] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var label: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.undefined
  
  var labelSkipHeight: js.UndefOr[Double] = js.undefined
  
  var labelSkipWidth: js.UndefOr[Double] = js.undefined
  
  var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]] = js.undefined
  
  var layers: js.UndefOr[js.Array[BarLayer[RawDatum]]] = js.undefined
  
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  var legendLabel: js.UndefOr[PropertyAccessor[LegendLabelDatum[RawDatum], String]] = js.undefined
  
  var legends: js.UndefOr[js.Array[BarLegendProps]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var markers: js.UndefOr[js.Array[CartesianMarkerProps[DatumValue]]] = js.undefined
  
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  
  var minValue: js.UndefOr[auto | Double] = js.undefined
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum] & Color, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[FC[BarTooltipProps[RawDatum]]] = js.undefined
  
  var tooltipLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var valueScale: js.UndefOr[ScaleSpec] = js.undefined
  
  var width: Double
}
object BarSvgProps {
  
  inline def apply[RawDatum /* <: BarDatum */](data: js.Array[RawDatum], height: Double, width: Double): BarSvgProps[RawDatum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarSvgProps[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarSvgProps[?], RawDatum /* <: BarDatum */] (val x: Self & BarSvgProps[RawDatum]) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[ComputedBarDatum[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
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
    
    inline def setBarAriaDescribedBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): Self = StObject.set(x, "barAriaDescribedBy", js.Any.fromFunction1(value))
    
    inline def setBarAriaDescribedByUndefined: Self = StObject.set(x, "barAriaDescribedBy", js.undefined)
    
    inline def setBarAriaLabel(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): Self = StObject.set(x, "barAriaLabel", js.Any.fromFunction1(value))
    
    inline def setBarAriaLabelUndefined: Self = StObject.set(x, "barAriaLabel", js.undefined)
    
    inline def setBarAriaLabelledBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): Self = StObject.set(x, "barAriaLabelledBy", js.Any.fromFunction1(value))
    
    inline def setBarAriaLabelledByUndefined: Self = StObject.set(x, "barAriaLabelledBy", js.undefined)
    
    inline def setBarComponent(value: FC[BarItemProps[RawDatum]]): Self = StObject.set(x, "barComponent", value.asInstanceOf[js.Any])
    
    inline def setBarComponentUndefined: Self = StObject.set(x, "barComponent", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColorBy(value: id | indexValue): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
    
    inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
    
    inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
    
    inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
    
    inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
    
    inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
    
    inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
    
    inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
    
    inline def setFill(value: js.Array[Id[ComputedBarDatum[RawDatum]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: Id[ComputedBarDatum[RawDatum]]*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def setGridXValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
    
    inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
    
    inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
    
    inline def setGridYValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
    
    inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
    
    inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
    
    inline def setGroupMode(value: grouped | stacked): Self = StObject.set(x, "groupMode", value.asInstanceOf[js.Any])
    
    inline def setGroupModeUndefined: Self = StObject.set(x, "groupMode", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndexBy(value: PropertyAccessor[RawDatum, String]): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
    
    inline def setIndexByFunction1(value: RawDatum => String): Self = StObject.set(x, "indexBy", js.Any.fromFunction1(value))
    
    inline def setIndexByUndefined: Self = StObject.set(x, "indexBy", js.undefined)
    
    inline def setIndexScale(value: ScaleBandSpec): Self = StObject.set(x, "indexScale", value.asInstanceOf[js.Any])
    
    inline def setIndexScaleUndefined: Self = StObject.set(x, "indexScale", js.undefined)
    
    inline def setInitialHiddenIds(value: js.Array[String]): Self = StObject.set(x, "initialHiddenIds", value.asInstanceOf[js.Any])
    
    inline def setInitialHiddenIdsUndefined: Self = StObject.set(x, "initialHiddenIds", js.undefined)
    
    inline def setInitialHiddenIdsVarargs(value: String*): Self = StObject.set(x, "initialHiddenIds", js.Array(value*))
    
    inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
    
    inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
    
    inline def setIsFocusable(value: Boolean): Self = StObject.set(x, "isFocusable", value.asInstanceOf[js.Any])
    
    inline def setIsFocusableUndefined: Self = StObject.set(x, "isFocusable", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFormat(value: String | LabelFormatter): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatFunction1(value: /* label */ String | Double => String | Double): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
    
    inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
    
    inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelSkipHeight(value: Double): Self = StObject.set(x, "labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipHeightUndefined: Self = StObject.set(x, "labelSkipHeight", js.undefined)
    
    inline def setLabelSkipWidth(value: Double): Self = StObject.set(x, "labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipWidthUndefined: Self = StObject.set(x, "labelSkipWidth", js.undefined)
    
    inline def setLabelTextColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayers(value: js.Array[BarLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: BarLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLegendLabel(value: PropertyAccessor[LegendLabelDatum[RawDatum], String]): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelFunction1(value: LegendLabelDatum[RawDatum] => String): Self = StObject.set(x, "legendLabel", js.Any.fromFunction1(value))
    
    inline def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
    
    inline def setLegends(value: js.Array[BarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: BarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarkers(value: js.Array[CartesianMarkerProps[DatumValue]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: CartesianMarkerProps[DatumValue]*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum] & Color, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: FC[BarTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "tooltipLabel", js.Any.fromFunction1(value))
    
    inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueScale(value: ScaleSpec): Self = StObject.set(x, "valueScale", value.asInstanceOf[js.Any])
    
    inline def setValueScaleUndefined: Self = StObject.set(x, "valueScale", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
