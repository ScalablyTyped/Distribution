package typings.nivoPie.distTypesTypesMod

import typings.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typings.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelComponent
import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelComponent
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.nivoPie.nivoPieStrings.arc
import typings.nivoPie.nivoPieStrings.color
import typings.nivoPie.nivoPieStrings.fill
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  id :@nivo/core.@nivo/core.PropertyAccessor<RawDatum, @nivo/pie.@nivo/pie/dist/types/types.DatumId>,   value :@nivo/core.@nivo/core.PropertyAccessor<RawDatum, number>,   valueFormat :@nivo/core.@nivo/core.ValueFormat<number, void> | undefined,   margin :@nivo/core.@nivo/core.Box,   sortByValue :boolean,   innerRadius :number,   padAngle :number,   cornerRadius :number,   startAngle :number,   endAngle :number,   fit :boolean,   activeInnerRadiusOffset :number,   activeOuterRadiusOffset :number,   colors :@nivo/colors.@nivo/colors.OrdinalColorScaleConfig<std.Omit<@nivo/pie.@nivo/pie/dist/types/types.ComputedDatum<RawDatum>, 'color' | 'fill' | 'arc'>>,   theme :@nivo/core.@nivo/core.Theme,   borderWidth :number,   borderColor :@nivo/colors.@nivo/colors.InheritedColorConfig<@nivo/pie.@nivo/pie/dist/types/types.ComputedDatum<RawDatum>>,   enableArcLabels :boolean,   enableArcLinkLabels :boolean,   isInteractive :boolean,   tooltip :react.react.FC<@nivo/pie.@nivo/pie/dist/types/types.PieTooltipProps<RawDatum>>,   legends :std.Array<@nivo/legends.@nivo/legends.LegendProps>,   role :string,   renderWrapper :boolean} & std.Partial<@nivo/arcs.@nivo/arcs.ArcLabelsProps<@nivo/pie.@nivo/pie/dist/types/types.ComputedDatum<RawDatum>>> & std.Partial<@nivo/arcs.@nivo/arcs.ArcLinkLabelsProps<@nivo/pie.@nivo/pie/dist/types/types.ComputedDatum<RawDatum>>> */
trait CommonPieProps[RawDatum] extends StObject {
  
  var activeInnerRadiusOffset: Double
  
  var activeOuterRadiusOffset: Double
  
  var arcLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var arcLabelsComponent: js.UndefOr[ArcLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLabelsRadiusOffset: js.UndefOr[Double] = js.undefined
  
  var arcLabelsSkipAngle: js.UndefOr[Double] = js.undefined
  
  var arcLabelsTextColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var arcLinkLabelsColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabelsDiagonalLength: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsOffset: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsSkipAngle: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsStraightLength: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsTextColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabelsTextOffset: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsThickness: js.UndefOr[Double] = js.undefined
  
  var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]]
  
  var borderWidth: Double
  
  var colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill | arc]]
  
  var component: js.UndefOr[ArcLinkLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
  
  var cornerRadius: Double
  
  var enableArcLabels: Boolean
  
  var enableArcLinkLabels: Boolean
  
  var endAngle: Double
  
  var fit: Boolean
  
  var id: PropertyAccessor[RawDatum, DatumId]
  
  var innerRadius: Double
  
  var isInteractive: Boolean
  
  var legends: js.Array[LegendProps]
  
  var margin: Box
  
  var padAngle: Double
  
  var renderWrapper: Boolean
  
  var role: String
  
  var sortByValue: Boolean
  
  var startAngle: Double
  
  var theme: Theme
  
  var tooltip: FC[PieTooltipProps[RawDatum]]
  
  var value: PropertyAccessor[RawDatum, Double]
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
}
object CommonPieProps {
  
  inline def apply[RawDatum](
    activeInnerRadiusOffset: Double,
    activeOuterRadiusOffset: Double,
    borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    borderWidth: Double,
    colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill | arc]],
    cornerRadius: Double,
    enableArcLabels: Boolean,
    enableArcLinkLabels: Boolean,
    endAngle: Double,
    fit: Boolean,
    id: PropertyAccessor[RawDatum, DatumId],
    innerRadius: Double,
    isInteractive: Boolean,
    legends: js.Array[LegendProps],
    margin: Box,
    padAngle: Double,
    renderWrapper: Boolean,
    role: String,
    sortByValue: Boolean,
    startAngle: Double,
    theme: Theme,
    tooltip: FC[PieTooltipProps[RawDatum]],
    value: PropertyAccessor[RawDatum, Double]
  ): CommonPieProps[RawDatum] = {
    val __obj = js.Dynamic.literal(activeInnerRadiusOffset = activeInnerRadiusOffset.asInstanceOf[js.Any], activeOuterRadiusOffset = activeOuterRadiusOffset.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], enableArcLabels = enableArcLabels.asInstanceOf[js.Any], enableArcLinkLabels = enableArcLinkLabels.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sortByValue = sortByValue.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPieProps[RawDatum]]
  }
  
  extension [Self <: CommonPieProps[?], RawDatum](x: Self & CommonPieProps[RawDatum]) {
    
    inline def setActiveInnerRadiusOffset(value: Double): Self = StObject.set(x, "activeInnerRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setActiveOuterRadiusOffset(value: Double): Self = StObject.set(x, "activeOuterRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setArcLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "arcLabel", value.asInstanceOf[js.Any])
    
    inline def setArcLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "arcLabel", js.Any.fromFunction1(value))
    
    inline def setArcLabelUndefined: Self = StObject.set(x, "arcLabel", js.undefined)
    
    inline def setArcLabelsComponent(value: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => Element): Self = StObject.set(x, "arcLabelsComponent", js.Any.fromFunction1(value))
    
    inline def setArcLabelsComponentUndefined: Self = StObject.set(x, "arcLabelsComponent", js.undefined)
    
    inline def setArcLabelsRadiusOffset(value: Double): Self = StObject.set(x, "arcLabelsRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setArcLabelsRadiusOffsetUndefined: Self = StObject.set(x, "arcLabelsRadiusOffset", js.undefined)
    
    inline def setArcLabelsSkipAngle(value: Double): Self = StObject.set(x, "arcLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    inline def setArcLabelsSkipAngleUndefined: Self = StObject.set(x, "arcLabelsSkipAngle", js.undefined)
    
    inline def setArcLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "arcLabelsTextColor", value.asInstanceOf[js.Any])
    
    inline def setArcLabelsTextColorUndefined: Self = StObject.set(x, "arcLabelsTextColor", js.undefined)
    
    inline def setArcLinkLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "arcLinkLabel", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "arcLinkLabel", js.Any.fromFunction1(value))
    
    inline def setArcLinkLabelUndefined: Self = StObject.set(x, "arcLinkLabel", js.undefined)
    
    inline def setArcLinkLabelsColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "arcLinkLabelsColor", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsColorUndefined: Self = StObject.set(x, "arcLinkLabelsColor", js.undefined)
    
    inline def setArcLinkLabelsDiagonalLength(value: Double): Self = StObject.set(x, "arcLinkLabelsDiagonalLength", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsDiagonalLengthUndefined: Self = StObject.set(x, "arcLinkLabelsDiagonalLength", js.undefined)
    
    inline def setArcLinkLabelsOffset(value: Double): Self = StObject.set(x, "arcLinkLabelsOffset", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsOffsetUndefined: Self = StObject.set(x, "arcLinkLabelsOffset", js.undefined)
    
    inline def setArcLinkLabelsSkipAngle(value: Double): Self = StObject.set(x, "arcLinkLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsSkipAngleUndefined: Self = StObject.set(x, "arcLinkLabelsSkipAngle", js.undefined)
    
    inline def setArcLinkLabelsStraightLength(value: Double): Self = StObject.set(x, "arcLinkLabelsStraightLength", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsStraightLengthUndefined: Self = StObject.set(x, "arcLinkLabelsStraightLength", js.undefined)
    
    inline def setArcLinkLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "arcLinkLabelsTextColor", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsTextColorUndefined: Self = StObject.set(x, "arcLinkLabelsTextColor", js.undefined)
    
    inline def setArcLinkLabelsTextOffset(value: Double): Self = StObject.set(x, "arcLinkLabelsTextOffset", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsTextOffsetUndefined: Self = StObject.set(x, "arcLinkLabelsTextOffset", js.undefined)
    
    inline def setArcLinkLabelsThickness(value: Double): Self = StObject.set(x, "arcLinkLabelsThickness", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsThicknessUndefined: Self = StObject.set(x, "arcLinkLabelsThickness", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill | arc]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill | arc] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setComponent(value: /* props */ ArcLinkLabelProps[ComputedDatum[RawDatum]] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setEnableArcLabels(value: Boolean): Self = StObject.set(x, "enableArcLabels", value.asInstanceOf[js.Any])
    
    inline def setEnableArcLinkLabels(value: Boolean): Self = StObject.set(x, "enableArcLinkLabels", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setId(value: PropertyAccessor[RawDatum, DatumId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdFunction1(value: RawDatum => DatumId): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSortByValue(value: Boolean): Self = StObject.set(x, "sortByValue", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[PieTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
