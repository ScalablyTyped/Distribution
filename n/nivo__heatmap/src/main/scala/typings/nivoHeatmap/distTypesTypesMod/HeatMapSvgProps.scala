package typings.nivoHeatmap.distTypesTypesMod

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAxes.distTypesTypesMod.AxisProps
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
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@nivo/heatmap.@nivo/heatmap/dist/types/types.HeatMapCommonProps<Datum>> & @nivo/heatmap.@nivo/heatmap/dist/types/types.HeatMapDataProps<Datum, ExtraProps> & @nivo/core.@nivo/core.Dimensions & std.Partial<{  axisTop :@nivo/axes.@nivo/axes.AxisProps<any> | null,   axisRight :@nivo/axes.@nivo/axes.AxisProps<any> | null,   axisBottom :@nivo/axes.@nivo/axes.AxisProps<any> | null,   axisLeft :@nivo/axes.@nivo/axes.AxisProps<any> | null,   borderRadius :number,   layers :std.Array<@nivo/heatmap.@nivo/heatmap/dist/types/types.LayerId | @nivo/heatmap.@nivo/heatmap/dist/types/types.CustomLayer<Datum>>,   cellComponent :@nivo/heatmap.@nivo/heatmap/dist/types/types.CellShape | @nivo/heatmap.@nivo/heatmap/dist/types/types.CellComponent<Datum>, onMouseEnter (cell : @nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, event : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): void, onMouseMove (cell : @nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, event : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): void, onMouseLeave (cell : @nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<Datum>, event : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): void}> */
trait HeatMapSvgProps[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] extends StObject {
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var annotations: js.UndefOr[js.Array[AnnotationMatcher[ComputedCell[Datum]]]] = js.undefined
  
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  
  var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var borderColor: js.UndefOr[
    InheritedColorConfig[Omit[ComputedCell[Datum], typings.nivoHeatmap.nivoHeatmapStrings.borderColor]]
  ] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var cellComponent: js.UndefOr[CellShape | CellComponent[Datum]] = js.undefined
  
  var colors: js.UndefOr[
    ContinuousColorScaleConfig | (js.Function1[
      /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor], 
      String
    ])
  ] = js.undefined
  
  var data: js.Array[HeatMapSerie[Datum, ExtraProps]]
  
  var emptyColor: js.UndefOr[String] = js.undefined
  
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  
  var enableLabels: js.UndefOr[Boolean] = js.undefined
  
  var forceSquare: js.UndefOr[Boolean] = js.undefined
  
  var height: Double
  
  var hoverTarget: js.UndefOr[cell | row | column | rowColumn] = js.undefined
  
  var inactiveOpacity: js.UndefOr[Double] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[
    PropertyAccessor[
      Omit[
        ComputedCell[Datum], 
        typings.nivoHeatmap.nivoHeatmapStrings.label | color | opacity | borderColor | labelTextColor
      ], 
      String
    ]
  ] = js.undefined
  
  var labelTextColor: js.UndefOr[
    InheritedColorConfig[Omit[ComputedCell[Datum], typings.nivoHeatmap.nivoHeatmapStrings.labelTextColor]]
  ] = js.undefined
  
  var layers: js.UndefOr[js.Array[LayerId | CustomLayer[Datum]]] = js.undefined
  
  var legends: js.UndefOr[js.Array[OmitAnchoredContinuousCol]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[
      /* cell */ ComputedCell[Datum], 
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* cell */ ComputedCell[Datum], 
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* cell */ ComputedCell[Datum], 
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* cell */ ComputedCell[Datum], 
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var sizeVariation: js.UndefOr[`false` | SizeVariationConfig] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[TooltipComponent[Datum]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var width: Double
  
  var xInnerPadding: js.UndefOr[Double] = js.undefined
  
  var xOuterPadding: js.UndefOr[Double] = js.undefined
  
  var yInnerPadding: js.UndefOr[Double] = js.undefined
  
  var yOuterPadding: js.UndefOr[Double] = js.undefined
}
object HeatMapSvgProps {
  
  inline def apply[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](data: js.Array[HeatMapSerie[Datum, ExtraProps]], height: Double, width: Double): HeatMapSvgProps[Datum, ExtraProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapSvgProps[Datum, ExtraProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatMapSvgProps[?, ?], Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] (val x: Self & (HeatMapSvgProps[Datum, ExtraProps])) extends AnyVal {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[ComputedCell[Datum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[ComputedCell[Datum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
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
    
    inline def setBorderColor(value: InheritedColorConfig[Omit[ComputedCell[Datum], borderColor]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCellComponent(value: CellShape | CellComponent[Datum]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
    
    inline def setCellComponentUndefined: Self = StObject.set(x, "cellComponent", js.undefined)
    
    inline def setColors(
      value: ContinuousColorScaleConfig | (js.Function1[
          /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor], 
          String
        ])
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(
      value: /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor] => String
    ): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setData(value: js.Array[HeatMapSerie[Datum, ExtraProps]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (HeatMapSerie[Datum, ExtraProps])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
    
    inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
    
    inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
    
    inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
    
    inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
    
    inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
    
    inline def setEnableLabelsUndefined: Self = StObject.set(x, "enableLabels", js.undefined)
    
    inline def setForceSquare(value: Boolean): Self = StObject.set(x, "forceSquare", value.asInstanceOf[js.Any])
    
    inline def setForceSquareUndefined: Self = StObject.set(x, "forceSquare", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHoverTarget(value: cell | row | column | rowColumn): Self = StObject.set(x, "hoverTarget", value.asInstanceOf[js.Any])
    
    inline def setHoverTargetUndefined: Self = StObject.set(x, "hoverTarget", js.undefined)
    
    inline def setInactiveOpacity(value: Double): Self = StObject.set(x, "inactiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setInactiveOpacityUndefined: Self = StObject.set(x, "inactiveOpacity", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLabel(
      value: PropertyAccessor[
          Omit[ComputedCell[Datum], label | color | opacity | borderColor | labelTextColor], 
          String
        ]
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: Omit[ComputedCell[Datum], label | color | opacity | borderColor | labelTextColor] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelTextColor(value: InheritedColorConfig[Omit[ComputedCell[Datum], labelTextColor]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayers(value: js.Array[LayerId | CustomLayer[Datum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: (LayerId | CustomLayer[Datum])*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLegends(value: js.Array[OmitAnchoredContinuousCol]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: OmitAnchoredContinuousCol*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setOnClick(value: (/* cell */ ComputedCell[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* cell */ ComputedCell[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* cell */ ComputedCell[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: (/* cell */ ComputedCell[Datum], /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSizeVariation(value: `false` | SizeVariationConfig): Self = StObject.set(x, "sizeVariation", value.asInstanceOf[js.Any])
    
    inline def setSizeVariationUndefined: Self = StObject.set(x, "sizeVariation", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXInnerPadding(value: Double): Self = StObject.set(x, "xInnerPadding", value.asInstanceOf[js.Any])
    
    inline def setXInnerPaddingUndefined: Self = StObject.set(x, "xInnerPadding", js.undefined)
    
    inline def setXOuterPadding(value: Double): Self = StObject.set(x, "xOuterPadding", value.asInstanceOf[js.Any])
    
    inline def setXOuterPaddingUndefined: Self = StObject.set(x, "xOuterPadding", js.undefined)
    
    inline def setYInnerPadding(value: Double): Self = StObject.set(x, "yInnerPadding", value.asInstanceOf[js.Any])
    
    inline def setYInnerPaddingUndefined: Self = StObject.set(x, "yInnerPadding", js.undefined)
    
    inline def setYOuterPadding(value: Double): Self = StObject.set(x, "yOuterPadding", value.asInstanceOf[js.Any])
    
    inline def setYOuterPaddingUndefined: Self = StObject.set(x, "yOuterPadding", js.undefined)
  }
}
