package typings.nivoBar.anon

import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarLegendProps
import typings.nivoBar.distTypesTypesMod.ComputedBarDatumWithValue
import typings.nivoBar.distTypesTypesMod.ComputedDatum
import typings.nivoBar.distTypesTypesMod.LegendLabelDatum
import typings.nivoBar.nivoBarStrings.auto
import typings.nivoBar.nivoBarStrings.grouped
import typings.nivoBar.nivoBarStrings.horizontal
import typings.nivoBar.nivoBarStrings.id
import typings.nivoBar.nivoBarStrings.indexValue
import typings.nivoBar.nivoBarStrings.stacked
import typings.nivoBar.nivoBarStrings.vertical
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Margin
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.ValueFormat
import typings.nivoScales.distTypesTypesMod.ScaleBandSpec
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColor[RawDatum /* <: BarDatum */] extends StObject {
  
  var borderColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]] = js.undefined
  
  var colorBy: js.UndefOr[id | indexValue] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var data: js.Array[RawDatum]
  
  var enableLabel: js.UndefOr[Boolean] = js.undefined
  
  var groupMode: js.UndefOr[grouped | stacked] = js.undefined
  
  var height: Double
  
  var indexBy: js.UndefOr[PropertyAccessor[RawDatum, String]] = js.undefined
  
  var indexScale: js.UndefOr[ScaleBandSpec] = js.undefined
  
  var initialHiddenIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var innerPadding: js.UndefOr[Double] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var label: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var labelSkipHeight: js.UndefOr[Double] = js.undefined
  
  var labelSkipWidth: js.UndefOr[Double] = js.undefined
  
  var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]] = js.undefined
  
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  var legendLabel: js.UndefOr[PropertyAccessor[LegendLabelDatum[RawDatum], String]] = js.undefined
  
  var legends: js.UndefOr[js.Array[BarLegendProps]] = js.undefined
  
  var margin: Margin
  
  var maxValue: js.UndefOr[Double | auto] = js.undefined
  
  var minValue: js.UndefOr[Double | auto] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var tooltipLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var valueScale: js.UndefOr[ScaleSpec] = js.undefined
  
  var width: Double
}
object BorderColor {
  
  inline def apply[RawDatum /* <: BarDatum */](data: js.Array[RawDatum], height: Double, margin: Margin, width: Double): BorderColor[RawDatum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColor[RawDatum]]
  }
  
  extension [Self <: BorderColor[?], RawDatum /* <: BarDatum */](x: Self & BorderColor[RawDatum]) {
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setColorBy(value: id | indexValue): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
    
    inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
    
    inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
    
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
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelSkipHeight(value: Double): Self = StObject.set(x, "labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipHeightUndefined: Self = StObject.set(x, "labelSkipHeight", js.undefined)
    
    inline def setLabelSkipWidth(value: Double): Self = StObject.set(x, "labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipWidthUndefined: Self = StObject.set(x, "labelSkipWidth", js.undefined)
    
    inline def setLabelTextColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLegendLabel(value: PropertyAccessor[LegendLabelDatum[RawDatum], String]): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelFunction1(value: LegendLabelDatum[RawDatum] => String): Self = StObject.set(x, "legendLabel", js.Any.fromFunction1(value))
    
    inline def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
    
    inline def setLegends(value: js.Array[BarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: BarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double | auto): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double | auto): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTooltipLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "tooltipLabel", js.Any.fromFunction1(value))
    
    inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueScale(value: ScaleSpec): Self = StObject.set(x, "valueScale", value.asInstanceOf[js.Any])
    
    inline def setValueScaleUndefined: Self = StObject.set(x, "valueScale", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
