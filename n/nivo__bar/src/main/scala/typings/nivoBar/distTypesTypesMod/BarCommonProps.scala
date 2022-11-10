package typings.nivoBar.distTypesTypesMod

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAxes.distTypesTypesMod.GridValues
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarCommonProps[RawDatum] extends StObject {
  
  var annotations: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]
  
  var borderColor: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var colorBy: id | indexValue
  
  var colors: OrdinalColorScaleConfig[ComputedDatum[RawDatum]]
  
  var enableGridX: Boolean
  
  var enableGridY: Boolean
  
  var enableLabel: Boolean
  
  var gridXValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var gridYValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var groupMode: grouped | stacked
  
  var indexBy: PropertyAccessor[RawDatum, String]
  
  var indexScale: ScaleBandSpec
  
  var initialHiddenIds: js.Array[String]
  
  var innerPadding: Double
  
  var isInteractive: Boolean
  
  var keys: js.Array[String]
  
  var label: PropertyAccessor[ComputedDatum[RawDatum], String]
  
  var labelFormat: String | LabelFormatter
  
  var labelSkipHeight: Double
  
  var labelSkipWidth: Double
  
  var labelTextColor: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]
  
  var layout: horizontal | vertical
  
  var legendLabel: js.UndefOr[PropertyAccessor[LegendLabelDatum[RawDatum], String]] = js.undefined
  
  var legends: js.Array[BarLegendProps]
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var maxValue: auto | Double
  
  var minValue: auto | Double
  
  var padding: Double
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var reverse: Boolean
  
  var theme: Theme
  
  var tooltip: FC[BarTooltipProps[RawDatum]]
  
  var tooltipLabel: PropertyAccessor[ComputedDatum[RawDatum], String]
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var valueScale: ScaleSpec
}
object BarCommonProps {
  
  inline def apply[RawDatum](
    annotations: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]],
    borderColor: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]],
    borderRadius: Double,
    borderWidth: Double,
    colorBy: id | indexValue,
    colors: OrdinalColorScaleConfig[ComputedDatum[RawDatum]],
    enableGridX: Boolean,
    enableGridY: Boolean,
    enableLabel: Boolean,
    groupMode: grouped | stacked,
    indexBy: PropertyAccessor[RawDatum, String],
    indexScale: ScaleBandSpec,
    initialHiddenIds: js.Array[String],
    innerPadding: Double,
    isInteractive: Boolean,
    keys: js.Array[String],
    label: PropertyAccessor[ComputedDatum[RawDatum], String],
    labelFormat: String | LabelFormatter,
    labelSkipHeight: Double,
    labelSkipWidth: Double,
    labelTextColor: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]],
    layout: horizontal | vertical,
    legends: js.Array[BarLegendProps],
    maxValue: auto | Double,
    minValue: auto | Double,
    padding: Double,
    reverse: Boolean,
    theme: Theme,
    tooltip: FC[BarTooltipProps[RawDatum]],
    tooltipLabel: PropertyAccessor[ComputedDatum[RawDatum], String],
    valueScale: ScaleSpec
  ): BarCommonProps[RawDatum] = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], enableGridX = enableGridX.asInstanceOf[js.Any], enableGridY = enableGridY.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], groupMode = groupMode.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], indexScale = indexScale.asInstanceOf[js.Any], initialHiddenIds = initialHiddenIds.asInstanceOf[js.Any], innerPadding = innerPadding.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelFormat = labelFormat.asInstanceOf[js.Any], labelSkipHeight = labelSkipHeight.asInstanceOf[js.Any], labelSkipWidth = labelSkipWidth.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any], valueScale = valueScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCommonProps[RawDatum]]
  }
  
  extension [Self <: BarCommonProps[?], RawDatum](x: Self & BarCommonProps[RawDatum]) {
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[ComputedBarDatum[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColorBy(value: id | indexValue): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
    
    inline def setColors(value: OrdinalColorScaleConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
    
    inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
    
    inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
    
    inline def setGridXValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
    
    inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
    
    inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
    
    inline def setGridYValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
    
    inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
    
    inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
    
    inline def setGroupMode(value: grouped | stacked): Self = StObject.set(x, "groupMode", value.asInstanceOf[js.Any])
    
    inline def setIndexBy(value: PropertyAccessor[RawDatum, String]): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
    
    inline def setIndexByFunction1(value: RawDatum => String): Self = StObject.set(x, "indexBy", js.Any.fromFunction1(value))
    
    inline def setIndexScale(value: ScaleBandSpec): Self = StObject.set(x, "indexScale", value.asInstanceOf[js.Any])
    
    inline def setInitialHiddenIds(value: js.Array[String]): Self = StObject.set(x, "initialHiddenIds", value.asInstanceOf[js.Any])
    
    inline def setInitialHiddenIdsVarargs(value: String*): Self = StObject.set(x, "initialHiddenIds", js.Array(value*))
    
    inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFormat(value: String | LabelFormatter): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatFunction1(value: /* label */ String | Double => String | Double): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
    
    inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelSkipHeight(value: Double): Self = StObject.set(x, "labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipWidth(value: Double): Self = StObject.set(x, "labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelTextColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLegendLabel(value: PropertyAccessor[LegendLabelDatum[RawDatum], String]): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelFunction1(value: LegendLabelDatum[RawDatum] => String): Self = StObject.set(x, "legendLabel", js.Any.fromFunction1(value))
    
    inline def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
    
    inline def setLegends(value: js.Array[BarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsVarargs(value: BarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[BarTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "tooltipLabel", js.Any.fromFunction1(value))
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueScale(value: ScaleSpec): Self = StObject.set(x, "valueScale", value.asInstanceOf[js.Any])
  }
}
