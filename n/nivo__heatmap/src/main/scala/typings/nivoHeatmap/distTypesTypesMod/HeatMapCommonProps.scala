package typings.nivoHeatmap.distTypesTypesMod

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoHeatmap.anon.OmitAnchoredContinuousCol
import typings.nivoHeatmap.nivoHeatmapBooleans.`false`
import typings.nivoHeatmap.nivoHeatmapStrings.borderColor
import typings.nivoHeatmap.nivoHeatmapStrings.cell
import typings.nivoHeatmap.nivoHeatmapStrings.color
import typings.nivoHeatmap.nivoHeatmapStrings.column
import typings.nivoHeatmap.nivoHeatmapStrings.label
import typings.nivoHeatmap.nivoHeatmapStrings.labelTextColor
import typings.nivoHeatmap.nivoHeatmapStrings.opacity
import typings.nivoHeatmap.nivoHeatmapStrings.row
import typings.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactSpringCore.mod.SpringConfig
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  valueFormat :@nivo/core.@nivo/core.ValueFormat<number, void>,   margin :@nivo/core.@nivo/core.Box,   forceSquare :boolean,   sizeVariation :false | @nivo/heatmap.@nivo/heatmap/dist/types/types.SizeVariationConfig,   xInnerPadding :number,   xOuterPadding :number,   yInnerPadding :number,   yOuterPadding :number,   opacity :number,   activeOpacity :number,   inactiveOpacity :number,   borderWidth :number,   borderColor :@nivo/colors.@nivo/colors.InheritedColorConfig<std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, 'borderColor'>>,   enableGridX :boolean,   enableGridY :boolean,   theme :@nivo/core.@nivo/core.Theme,   colors :@nivo/colors.@nivo/colors.ContinuousColorScaleConfig | (cell : std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, 'color' | 'opacity' | 'borderColor' | 'labelTextColor'>): string,   emptyColor :string,   enableLabels :boolean,   label :@nivo/core.@nivo/core.PropertyAccessor<std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, 'label' | 'color' | 'opacity' | 'borderColor' | 'labelTextColor'>, string>,   labelTextColor :@nivo/colors.@nivo/colors.InheritedColorConfig<std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, 'labelTextColor'>>,   legends :std.Array<std.Omit<@nivo/legends.@nivo/legends.AnchoredContinuousColorsLegendProps, 'scale' | 'containerWidth' | 'containerHeight'>>,   annotations :std.Array<@nivo/annotations.@nivo/annotations.AnnotationMatcher<@nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>>>,   isInteractive :boolean,   hoverTarget :'cell' | 'row' | 'column' | 'rowColumn',   tooltip :@nivo/heatmap.@nivo/heatmap/dist/types/types.TooltipComponent<Datum>, onClick (cell : @nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, event : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): void,   renderWrapper :boolean,   role :string,   ariaLabel :react.react.AriaAttributes['aria-label'],   ariaLabelledBy :react.react.AriaAttributes['aria-labelledby'],   ariaDescribedBy :react.react.AriaAttributes['aria-describedby']} & std.Required<@nivo/core.@nivo/core.MotionProps> */
trait HeatMapCommonProps[Datum /* <: HeatMapDatum */] extends StObject {
  
  var activeOpacity: Double
  
  var animate: Boolean
  
  var annotations: js.Array[AnnotationMatcher[ComputedCell[Datum]]]
  
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  
  var borderColor: InheritedColorConfig[Omit[ComputedCell[Datum], typings.nivoHeatmap.nivoHeatmapStrings.borderColor]]
  
  var borderWidth: Double
  
  var colors: ContinuousColorScaleConfig | (js.Function1[
    /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor], 
    String
  ])
  
  var emptyColor: String
  
  var enableGridX: Boolean
  
  var enableGridY: Boolean
  
  var enableLabels: Boolean
  
  var forceSquare: Boolean
  
  var hoverTarget: cell | row | column | rowColumn
  
  var inactiveOpacity: Double
  
  var isInteractive: Boolean
  
  var label: PropertyAccessor[
    Omit[
      ComputedCell[Datum], 
      typings.nivoHeatmap.nivoHeatmapStrings.label | color | opacity | borderColor | labelTextColor
    ], 
    String
  ]
  
  var labelTextColor: InheritedColorConfig[Omit[ComputedCell[Datum], typings.nivoHeatmap.nivoHeatmapStrings.labelTextColor]]
  
  var legends: js.Array[OmitAnchoredContinuousCol]
  
  var margin: Box
  
  var motionConfig: String | SpringConfig
  
  def onClick(cell: ComputedCell[Datum], event: MouseEvent[Element, NativeMouseEvent]): Unit
  
  var opacity: Double
  
  var renderWrapper: Boolean
  
  var role: String
  
  var sizeVariation: `false` | SizeVariationConfig
  
  var theme: Theme
  
  var tooltip: TooltipComponent[Datum]
  
  var valueFormat: ValueFormat[Double, Unit]
  
  var xInnerPadding: Double
  
  var xOuterPadding: Double
  
  var yInnerPadding: Double
  
  var yOuterPadding: Double
}
object HeatMapCommonProps {
  
  inline def apply[Datum /* <: HeatMapDatum */](
    activeOpacity: Double,
    animate: Boolean,
    annotations: js.Array[AnnotationMatcher[ComputedCell[Datum]]],
    borderColor: InheritedColorConfig[Omit[ComputedCell[Datum], borderColor]],
    borderWidth: Double,
    colors: ContinuousColorScaleConfig | (js.Function1[
      /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor], 
      String
    ]),
    emptyColor: String,
    enableGridX: Boolean,
    enableGridY: Boolean,
    enableLabels: Boolean,
    forceSquare: Boolean,
    hoverTarget: cell | row | column | rowColumn,
    inactiveOpacity: Double,
    isInteractive: Boolean,
    label: PropertyAccessor[
      Omit[ComputedCell[Datum], label | color | opacity | borderColor | labelTextColor], 
      String
    ],
    labelTextColor: InheritedColorConfig[Omit[ComputedCell[Datum], labelTextColor]],
    legends: js.Array[OmitAnchoredContinuousCol],
    margin: Box,
    motionConfig: String | SpringConfig,
    onClick: (ComputedCell[Datum], MouseEvent[Element, NativeMouseEvent]) => Unit,
    opacity: Double,
    renderWrapper: Boolean,
    role: String,
    sizeVariation: `false` | SizeVariationConfig,
    theme: Theme,
    tooltip: TooltipComponent[Datum],
    valueFormat: ValueFormat[Double, Unit],
    xInnerPadding: Double,
    xOuterPadding: Double,
    yInnerPadding: Double,
    yOuterPadding: Double
  ): HeatMapCommonProps[Datum] = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], emptyColor = emptyColor.asInstanceOf[js.Any], enableGridX = enableGridX.asInstanceOf[js.Any], enableGridY = enableGridY.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], forceSquare = forceSquare.asInstanceOf[js.Any], hoverTarget = hoverTarget.asInstanceOf[js.Any], inactiveOpacity = inactiveOpacity.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], motionConfig = motionConfig.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), opacity = opacity.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sizeVariation = sizeVariation.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], valueFormat = valueFormat.asInstanceOf[js.Any], xInnerPadding = xInnerPadding.asInstanceOf[js.Any], xOuterPadding = xOuterPadding.asInstanceOf[js.Any], yInnerPadding = yInnerPadding.asInstanceOf[js.Any], yOuterPadding = yOuterPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapCommonProps[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatMapCommonProps[?], Datum /* <: HeatMapDatum */] (val x: Self & HeatMapCommonProps[Datum]) extends AnyVal {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[ComputedCell[Datum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[ComputedCell[Datum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[Omit[ComputedCell[Datum], borderColor]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColors(
      value: ContinuousColorScaleConfig | (js.Function1[
          /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor], 
          String
        ])
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(
      value: /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor] => String
    ): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
    
    inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
    
    inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
    
    inline def setForceSquare(value: Boolean): Self = StObject.set(x, "forceSquare", value.asInstanceOf[js.Any])
    
    inline def setHoverTarget(value: cell | row | column | rowColumn): Self = StObject.set(x, "hoverTarget", value.asInstanceOf[js.Any])
    
    inline def setInactiveOpacity(value: Double): Self = StObject.set(x, "inactiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setLabel(
      value: PropertyAccessor[
          Omit[ComputedCell[Datum], label | color | opacity | borderColor | labelTextColor], 
          String
        ]
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: Omit[ComputedCell[Datum], label | color | opacity | borderColor | labelTextColor] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelTextColor(value: InheritedColorConfig[Omit[ComputedCell[Datum], labelTextColor]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setLegends(value: js.Array[OmitAnchoredContinuousCol]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsVarargs(value: OmitAnchoredContinuousCol*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMotionConfig(value: String | SpringConfig): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: (ComputedCell[Datum], MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSizeVariation(value: `false` | SizeVariationConfig): Self = StObject.set(x, "sizeVariation", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setXInnerPadding(value: Double): Self = StObject.set(x, "xInnerPadding", value.asInstanceOf[js.Any])
    
    inline def setXOuterPadding(value: Double): Self = StObject.set(x, "xOuterPadding", value.asInstanceOf[js.Any])
    
    inline def setYInnerPadding(value: Double): Self = StObject.set(x, "yInnerPadding", value.asInstanceOf[js.Any])
    
    inline def setYOuterPadding(value: Double): Self = StObject.set(x, "yOuterPadding", value.asInstanceOf[js.Any])
  }
}
