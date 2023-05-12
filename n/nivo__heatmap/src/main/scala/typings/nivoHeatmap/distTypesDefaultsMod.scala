package typings.nivoHeatmap

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoHeatmap.anon.OmitAnchoredContinuousCol
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHe
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHeColor
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHeData
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHeFormattedValue
import typings.nivoHeatmap.anon.PartialAnimationConfig
import typings.nivoHeatmap.distTypesTypesMod.ComputedCell
import typings.nivoHeatmap.distTypesTypesMod.DefaultHeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.LayerId
import typings.nivoHeatmap.distTypesTypesMod.SizeVariationConfig
import typings.nivoHeatmap.distTypesTypesMod.TooltipComponent
import typings.nivoHeatmap.nivoHeatmapBooleans.`false`
import typings.nivoHeatmap.nivoHeatmapStrings.cell
import typings.nivoHeatmap.nivoHeatmapStrings.column
import typings.nivoHeatmap.nivoHeatmapStrings.rect
import typings.nivoHeatmap.nivoHeatmapStrings.row
import typings.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typings.reactSpringCore.mod.SpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDefaultsMod {
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.activeOpacity")
    @js.native
    def activeOpacity: Double = js.native
    inline def activeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.annotations")
    @js.native
    def annotations: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]] = js.native
    inline def annotations_=(x: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.axisBottom")
    @js.native
    def axisBottom: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisBottom_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.axisRight")
    @js.native
    def axisRight: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisRight_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[OmitComputedCellDefaultHeColor] = js.native
    inline def borderColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHeColor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.colors")
    @js.native
    def colors: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String]) = js.native
    inline def colors_=(x: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.emptyColor")
    @js.native
    def emptyColor: String = js.native
    inline def emptyColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.forceSquare")
    @js.native
    def forceSquare: Boolean = js.native
    inline def forceSquare_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.hoverTarget")
    @js.native
    def hoverTarget: cell | row | column | rowColumn = js.native
    inline def hoverTarget_=(x: cell | row | column | rowColumn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.inactiveOpacity")
    @js.native
    def inactiveOpacity: Double = js.native
    inline def inactiveOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String] = js.native
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[OmitComputedCellDefaultHe] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.legends")
    @js.native
    def legends: js.Array[OmitAnchoredContinuousCol] = js.native
    inline def legends_=(x: js.Array[OmitAnchoredContinuousCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | PartialAnimationConfig = js.native
    inline def motionConfig_=(x: String | PartialAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.renderCell")
    @js.native
    def renderCell: rect = js.native
    inline def renderCell_=(x: rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderCell")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.sizeVariation")
    @js.native
    def sizeVariation: `false` | SizeVariationConfig = js.native
    inline def sizeVariation_=(x: `false` | SizeVariationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultHeatMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultHeatMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.xInnerPadding")
    @js.native
    def xInnerPadding: Double = js.native
    inline def xInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.xOuterPadding")
    @js.native
    def xOuterPadding: Double = js.native
    inline def xOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xOuterPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.yInnerPadding")
    @js.native
    def yInnerPadding: Double = js.native
    inline def yInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "canvasDefaultProps.yOuterPadding")
    @js.native
    def yOuterPadding: Double = js.native
    inline def yOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yOuterPadding")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.HeatMapCommonProps<@nivo/heatmap.@nivo/heatmap/dist/types/types.DefaultHeatMapDatum>, 'margin' | 'theme' | 'valueFormat' | 'onClick' | 'renderWrapper' | 'role' | 'ariaLabel' | 'ariaLabelledBy' | 'ariaDescribedBy'> & {  layers :std.Array<@nivo/heatmap.@nivo/heatmap/dist/types/types.LayerId>} */
  object commonDefaultProps {
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.activeOpacity")
    @js.native
    def activeOpacity: Double = js.native
    inline def activeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.annotations")
    @js.native
    def annotations: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]] = js.native
    inline def annotations_=(x: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[OmitComputedCellDefaultHeColor] = js.native
    inline def borderColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHeColor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.colors")
    @js.native
    def colors: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String]) = js.native
    inline def colors_=(x: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.emptyColor")
    @js.native
    def emptyColor: String = js.native
    inline def emptyColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.forceSquare")
    @js.native
    def forceSquare: Boolean = js.native
    inline def forceSquare_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.hoverTarget")
    @js.native
    def hoverTarget: cell | row | column | rowColumn = js.native
    inline def hoverTarget_=(x: cell | row | column | rowColumn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.inactiveOpacity")
    @js.native
    def inactiveOpacity: Double = js.native
    inline def inactiveOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String] = js.native
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[OmitComputedCellDefaultHe] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.legends")
    @js.native
    def legends: js.Array[OmitAnchoredContinuousCol] = js.native
    inline def legends_=(x: js.Array[OmitAnchoredContinuousCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | SpringConfig = js.native
    inline def motionConfig_=(x: String | SpringConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.sizeVariation")
    @js.native
    def sizeVariation: `false` | SizeVariationConfig = js.native
    inline def sizeVariation_=(x: `false` | SizeVariationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultHeatMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultHeatMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.xInnerPadding")
    @js.native
    def xInnerPadding: Double = js.native
    inline def xInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.xOuterPadding")
    @js.native
    def xOuterPadding: Double = js.native
    inline def xOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xOuterPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.yInnerPadding")
    @js.native
    def yInnerPadding: Double = js.native
    inline def yInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "commonDefaultProps.yOuterPadding")
    @js.native
    def yOuterPadding: Double = js.native
    inline def yOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yOuterPadding")(x.asInstanceOf[js.Any])
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.activeOpacity")
    @js.native
    def activeOpacity: Double = js.native
    inline def activeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.annotations")
    @js.native
    def annotations: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]] = js.native
    inline def annotations_=(x: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.axisBottom")
    @js.native
    def axisBottom: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisBottom_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.axisRight")
    @js.native
    def axisRight: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisRight_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[OmitComputedCellDefaultHeColor] = js.native
    inline def borderColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHeColor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.borderRadius")
    @js.native
    def borderRadius: Double = js.native
    inline def borderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.cellComponent")
    @js.native
    def cellComponent: rect = js.native
    inline def cellComponent_=(x: rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.colors")
    @js.native
    def colors: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String]) = js.native
    inline def colors_=(x: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.emptyColor")
    @js.native
    def emptyColor: String = js.native
    inline def emptyColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.forceSquare")
    @js.native
    def forceSquare: Boolean = js.native
    inline def forceSquare_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.hoverTarget")
    @js.native
    def hoverTarget: cell | row | column | rowColumn = js.native
    inline def hoverTarget_=(x: cell | row | column | rowColumn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.inactiveOpacity")
    @js.native
    def inactiveOpacity: Double = js.native
    inline def inactiveOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String] = js.native
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[OmitComputedCellDefaultHe] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[OmitAnchoredContinuousCol] = js.native
    inline def legends_=(x: js.Array[OmitAnchoredContinuousCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | PartialAnimationConfig = js.native
    inline def motionConfig_=(x: String | PartialAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.sizeVariation")
    @js.native
    def sizeVariation: `false` | SizeVariationConfig = js.native
    inline def sizeVariation_=(x: `false` | SizeVariationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultHeatMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultHeatMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.xInnerPadding")
    @js.native
    def xInnerPadding: Double = js.native
    inline def xInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.xOuterPadding")
    @js.native
    def xOuterPadding: Double = js.native
    inline def xOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xOuterPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.yInnerPadding")
    @js.native
    def yInnerPadding: Double = js.native
    inline def yInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap/dist/types/defaults", "svgDefaultProps.yOuterPadding")
    @js.native
    def yOuterPadding: Double = js.native
    inline def yOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yOuterPadding")(x.asInstanceOf[js.Any])
  }
}
