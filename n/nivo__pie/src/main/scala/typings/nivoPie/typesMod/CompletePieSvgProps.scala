package typings.nivoPie.typesMod

import typings.nivoArcs.arcLabelMod.ArcLabelProps
import typings.nivoArcs.arcLabelsLayerMod.ArcLabelComponent
import typings.nivoArcs.arcLinkLabelMod.ArcLinkLabelProps
import typings.nivoArcs.arcLinkLabelsLayerMod.ArcLinkLabelComponent
import typings.nivoArcs.arcTransitionModeMod.ArcTransitionMode
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.typesTypesMod.LegendProps
import typings.nivoPie.nivoPieStrings.arc
import typings.nivoPie.nivoPieStrings.color
import typings.nivoPie.nivoPieStrings.fill
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @nivo/pie.@nivo/pie/dist/types/types.DataProps<RawDatum> & @nivo/core.@nivo/core.Dimensions & @nivo/pie.@nivo/pie/dist/types/types.CommonPieProps<RawDatum> & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/pie.@nivo/pie/dist/types/types.ComputedDatum<RawDatum>> & @nivo/pie.@nivo/pie/dist/types/types.PieHandlers<RawDatum, std.SVGPathElement> & {  layers :std.Array<@nivo/pie.@nivo/pie/dist/types/types.PieLayer<RawDatum>>,   animate :boolean,   motionConfig :@nivo/core.@nivo/core.ModernMotionProps['motionConfig'],   transitionMode :@nivo/arcs.@nivo/arcs.ArcTransitionMode} & @nivo/pie.@nivo/pie/dist/types/types.PieSvgCustomComponents<RawDatum> */
trait CompletePieSvgProps[RawDatum] extends StObject {
  
  var activeInnerRadiusOffset: Double
  
  var activeOuterRadiusOffset: Double
  
  var animate: Boolean
  
  var arcLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var arcLabelsComponent: js.UndefOr[ArcLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLabelsRadiusOffset: js.UndefOr[Double] = js.undefined
  
  var arcLabelsSkipAngle: js.UndefOr[Double] = js.undefined
  
  var arcLabelsTextColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var arcLinkLabelComponent: js.UndefOr[ArcLinkLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
  
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
  
  var data: js.Array[RawDatum]
  
  var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
  
  var enableArcLabels: Boolean
  
  var enableArcLinkLabels: Boolean
  
  var endAngle: Double
  
  var fill: js.UndefOr[js.Array[Id[ComputedDatum[RawDatum]]]] = js.undefined
  
  var fit: Boolean
  
  var height: Double
  
  var id: PropertyAccessor[RawDatum, DatumId]
  
  var innerRadius: Double
  
  var isInteractive: Boolean
  
  var layers: js.Array[PieLayer[RawDatum]]
  
  var legends: js.Array[LegendProps]
  
  var margin: Box
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var padAngle: Double
  
  var renderWrapper: Boolean
  
  var role: String
  
  var sortByValue: Boolean
  
  var startAngle: Double
  
  var theme: Theme
  
  var tooltip: FC[PieTooltipProps[RawDatum]]
  
  var transitionMode: ArcTransitionMode
  
  var value: PropertyAccessor[RawDatum, Double]
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var width: Double
}
object CompletePieSvgProps {
  
  inline def apply[RawDatum](
    activeInnerRadiusOffset: Double,
    activeOuterRadiusOffset: Double,
    animate: Boolean,
    borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    borderWidth: Double,
    colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill | arc]],
    cornerRadius: Double,
    data: js.Array[RawDatum],
    enableArcLabels: Boolean,
    enableArcLinkLabels: Boolean,
    endAngle: Double,
    fit: Boolean,
    height: Double,
    id: PropertyAccessor[RawDatum, DatumId],
    innerRadius: Double,
    isInteractive: Boolean,
    layers: js.Array[PieLayer[RawDatum]],
    legends: js.Array[LegendProps],
    margin: Box,
    padAngle: Double,
    renderWrapper: Boolean,
    role: String,
    sortByValue: Boolean,
    startAngle: Double,
    theme: Theme,
    tooltip: FC[PieTooltipProps[RawDatum]],
    transitionMode: ArcTransitionMode,
    value: PropertyAccessor[RawDatum, Double],
    width: Double
  ): CompletePieSvgProps[RawDatum] = {
    val __obj = js.Dynamic.literal(activeInnerRadiusOffset = activeInnerRadiusOffset.asInstanceOf[js.Any], activeOuterRadiusOffset = activeOuterRadiusOffset.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableArcLabels = enableArcLabels.asInstanceOf[js.Any], enableArcLinkLabels = enableArcLinkLabels.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sortByValue = sortByValue.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], transitionMode = transitionMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletePieSvgProps[RawDatum]]
  }
  
  extension [Self <: CompletePieSvgProps[?], RawDatum](x: Self & CompletePieSvgProps[RawDatum]) {
    
    inline def setActiveInnerRadiusOffset(value: Double): Self = StObject.set(x, "activeInnerRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setActiveOuterRadiusOffset(value: Double): Self = StObject.set(x, "activeOuterRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
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
    
    inline def setArcLinkLabelComponent(value: /* props */ ArcLinkLabelProps[ComputedDatum[RawDatum]] => Element): Self = StObject.set(x, "arcLinkLabelComponent", js.Any.fromFunction1(value))
    
    inline def setArcLinkLabelComponentUndefined: Self = StObject.set(x, "arcLinkLabelComponent", js.undefined)
    
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
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
    
    inline def setEnableArcLabels(value: Boolean): Self = StObject.set(x, "enableArcLabels", value.asInstanceOf[js.Any])
    
    inline def setEnableArcLinkLabels(value: Boolean): Self = StObject.set(x, "enableArcLinkLabels", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setFill(value: js.Array[Id[ComputedDatum[RawDatum]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: Id[ComputedDatum[RawDatum]]*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: PropertyAccessor[RawDatum, DatumId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdFunction1(value: RawDatum => DatumId): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[PieLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: PieLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSortByValue(value: Boolean): Self = StObject.set(x, "sortByValue", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[PieTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
