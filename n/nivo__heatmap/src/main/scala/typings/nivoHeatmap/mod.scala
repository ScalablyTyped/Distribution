package typings.nivoHeatmap

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoHeatmap.anon.ActiveCell
import typings.nivoHeatmap.anon.Cells
import typings.nivoHeatmap.anon.Columns
import typings.nivoHeatmap.anon.Data
import typings.nivoHeatmap.anon.Height
import typings.nivoHeatmap.anon.OmitAnchoredContinuousCol
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHe
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHeColor
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHeData
import typings.nivoHeatmap.anon.OmitComputedCellDefaultHeFormattedValue
import typings.nivoHeatmap.anon.PartialAnimationConfig
import typings.nivoHeatmap.anon.Size
import typings.nivoHeatmap.anon.Width
import typings.nivoHeatmap.anon.X
import typings.nivoHeatmap.distTypesTypesMod.ComputedCell
import typings.nivoHeatmap.distTypesTypesMod.DefaultHeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.HeatMapCanvasProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapCommonProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.HeatMapSvgProps
import typings.nivoHeatmap.distTypesTypesMod.LayerId
import typings.nivoHeatmap.distTypesTypesMod.SizeVariationConfig
import typings.nivoHeatmap.distTypesTypesMod.TooltipComponent
import typings.nivoHeatmap.nivoHeatmapBooleans.`false`
import typings.nivoHeatmap.nivoHeatmapStrings.activeOpacity
import typings.nivoHeatmap.nivoHeatmapStrings.borderColor
import typings.nivoHeatmap.nivoHeatmapStrings.cell
import typings.nivoHeatmap.nivoHeatmapStrings.colors
import typings.nivoHeatmap.nivoHeatmapStrings.column
import typings.nivoHeatmap.nivoHeatmapStrings.emptyColor
import typings.nivoHeatmap.nivoHeatmapStrings.forceSquare
import typings.nivoHeatmap.nivoHeatmapStrings.height
import typings.nivoHeatmap.nivoHeatmapStrings.hoverTarget
import typings.nivoHeatmap.nivoHeatmapStrings.inactiveOpacity
import typings.nivoHeatmap.nivoHeatmapStrings.label
import typings.nivoHeatmap.nivoHeatmapStrings.labelTextColor
import typings.nivoHeatmap.nivoHeatmapStrings.opacity
import typings.nivoHeatmap.nivoHeatmapStrings.rect
import typings.nivoHeatmap.nivoHeatmapStrings.row
import typings.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typings.nivoHeatmap.nivoHeatmapStrings.sizeVariation
import typings.nivoHeatmap.nivoHeatmapStrings.valueFormat
import typings.nivoHeatmap.nivoHeatmapStrings.width
import typings.nivoHeatmap.nivoHeatmapStrings.xInnerPadding
import typings.nivoHeatmap.nivoHeatmapStrings.xOuterPadding
import typings.nivoHeatmap.nivoHeatmapStrings.yInnerPadding
import typings.nivoHeatmap.nivoHeatmapStrings.yOuterPadding
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/heatmap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](param0: HeatMapSvgProps[Datum, ExtraProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMap")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def HeatMapCanvas[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](param0: HeatMapCanvasProps[Datum, ExtraProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapCanvas")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveHeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](props: Omit[HeatMapSvgProps[Datum, ExtraProps], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveHeatMap")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveHeatMapCanvas[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](props: Omit[HeatMapCanvasProps[Datum, ExtraProps], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveHeatMapCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.activeOpacity")
    @js.native
    def activeOpacity: Double = js.native
    inline def activeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.annotations")
    @js.native
    def annotations: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]] = js.native
    inline def annotations_=(x: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.axisBottom")
    @js.native
    def axisBottom: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisBottom_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.axisRight")
    @js.native
    def axisRight: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisRight_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[OmitComputedCellDefaultHeColor] = js.native
    inline def borderColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHeColor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.colors")
    @js.native
    def colors: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String]) = js.native
    inline def colors_=(x: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.emptyColor")
    @js.native
    def emptyColor: String = js.native
    inline def emptyColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.forceSquare")
    @js.native
    def forceSquare: Boolean = js.native
    inline def forceSquare_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.hoverTarget")
    @js.native
    def hoverTarget: cell | row | column | rowColumn = js.native
    inline def hoverTarget_=(x: cell | row | column | rowColumn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.inactiveOpacity")
    @js.native
    def inactiveOpacity: Double = js.native
    inline def inactiveOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String] = js.native
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[OmitComputedCellDefaultHe] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.legends")
    @js.native
    def legends: js.Array[OmitAnchoredContinuousCol] = js.native
    inline def legends_=(x: js.Array[OmitAnchoredContinuousCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | PartialAnimationConfig = js.native
    inline def motionConfig_=(x: String | PartialAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.renderCell")
    @js.native
    def renderCell: rect = js.native
    inline def renderCell_=(x: rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderCell")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.sizeVariation")
    @js.native
    def sizeVariation: `false` | SizeVariationConfig = js.native
    inline def sizeVariation_=(x: `false` | SizeVariationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultHeatMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultHeatMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.xInnerPadding")
    @js.native
    def xInnerPadding: Double = js.native
    inline def xInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.xOuterPadding")
    @js.native
    def xOuterPadding: Double = js.native
    inline def xOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xOuterPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.yInnerPadding")
    @js.native
    def yInnerPadding: Double = js.native
    inline def yInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "canvasDefaultProps.yOuterPadding")
    @js.native
    def yOuterPadding: Double = js.native
    inline def yOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yOuterPadding")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.HeatMapCommonProps<@nivo/heatmap.@nivo/heatmap/dist/types/types.DefaultHeatMapDatum>, 'margin' | 'theme' | 'valueFormat' | 'onClick' | 'renderWrapper' | 'role' | 'ariaLabel' | 'ariaLabelledBy' | 'ariaDescribedBy'> & {  layers :std.Array<@nivo/heatmap.@nivo/heatmap/dist/types/types.LayerId>} */
  object commonDefaultProps {
    
    @JSImport("@nivo/heatmap", "commonDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.activeOpacity")
    @js.native
    def activeOpacity: Double = js.native
    inline def activeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.annotations")
    @js.native
    def annotations: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]] = js.native
    inline def annotations_=(x: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[OmitComputedCellDefaultHeColor] = js.native
    inline def borderColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHeColor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.colors")
    @js.native
    def colors: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String]) = js.native
    inline def colors_=(x: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.emptyColor")
    @js.native
    def emptyColor: String = js.native
    inline def emptyColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.forceSquare")
    @js.native
    def forceSquare: Boolean = js.native
    inline def forceSquare_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.hoverTarget")
    @js.native
    def hoverTarget: cell | row | column | rowColumn = js.native
    inline def hoverTarget_=(x: cell | row | column | rowColumn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.inactiveOpacity")
    @js.native
    def inactiveOpacity: Double = js.native
    inline def inactiveOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String] = js.native
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[OmitComputedCellDefaultHe] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.legends")
    @js.native
    def legends: js.Array[OmitAnchoredContinuousCol] = js.native
    inline def legends_=(x: js.Array[OmitAnchoredContinuousCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any) = js.native
    inline def motionConfig_=(
      x: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.sizeVariation")
    @js.native
    def sizeVariation: `false` | SizeVariationConfig = js.native
    inline def sizeVariation_=(x: `false` | SizeVariationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultHeatMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultHeatMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.xInnerPadding")
    @js.native
    def xInnerPadding: Double = js.native
    inline def xInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.xOuterPadding")
    @js.native
    def xOuterPadding: Double = js.native
    inline def xOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xOuterPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.yInnerPadding")
    @js.native
    def yInnerPadding: Double = js.native
    inline def yInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "commonDefaultProps.yOuterPadding")
    @js.native
    def yOuterPadding: Double = js.native
    inline def yOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yOuterPadding")(x.asInstanceOf[js.Any])
  }
  
  inline def computeCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    param0: (Data[Datum, ExtraProps]) & (Pick[
      HeatMapCommonProps[Datum], 
      forceSquare | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding
    ])
  ): Cells[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCells")(param0.asInstanceOf[js.Any]).asInstanceOf[Cells[Datum]]
  
  inline def computeLayout(param0: Columns): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def computeSizeScale(size: SizeVariationConfig, min: Double, max: Double): js.Function1[/* value */ Double | Null, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSizeScale")(size.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double | Null, Double]]
  
  inline def computeSizeScale_false(size: `false`, min: Double, max: Double): js.Function1[/* value */ Double | Null, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSizeScale")(size.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double | Null, Double]]
  
  inline def getCellAnnotationDimensions[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellAnnotationDimensions")(cell.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def getCellAnnotationPosition[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellAnnotationPosition")(cell.asInstanceOf[js.Any]).asInstanceOf[X]
  
  object svgDefaultProps {
    
    @JSImport("@nivo/heatmap", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.activeOpacity")
    @js.native
    def activeOpacity: Double = js.native
    inline def activeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.annotations")
    @js.native
    def annotations: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]] = js.native
    inline def annotations_=(x: js.Array[AnnotationMatcher[ComputedCell[DefaultHeatMapDatum]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.axisBottom")
    @js.native
    def axisBottom: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisBottom_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.axisRight")
    @js.native
    def axisRight: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def axisRight_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfig[OmitComputedCellDefaultHeColor] = js.native
    inline def borderColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHeColor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.borderRadius")
    @js.native
    def borderRadius: Double = js.native
    inline def borderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.cellComponent")
    @js.native
    def cellComponent: rect = js.native
    inline def cellComponent_=(x: rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.colors")
    @js.native
    def colors: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String]) = js.native
    inline def colors_=(x: ContinuousColorScaleConfig | (js.Function1[/* cell */ OmitComputedCellDefaultHeData, String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.emptyColor")
    @js.native
    def emptyColor: String = js.native
    inline def emptyColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.enableLabels")
    @js.native
    def enableLabels: Boolean = js.native
    inline def enableLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.forceSquare")
    @js.native
    def forceSquare: Boolean = js.native
    inline def forceSquare_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.hoverTarget")
    @js.native
    def hoverTarget: cell | row | column | rowColumn = js.native
    inline def hoverTarget_=(x: cell | row | column | rowColumn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.inactiveOpacity")
    @js.native
    def inactiveOpacity: Double = js.native
    inline def inactiveOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String] = js.native
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[OmitComputedCellDefaultHe] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[OmitComputedCellDefaultHe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitComputedCellDefaultHeFormattedValue, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[OmitAnchoredContinuousCol] = js.native
    inline def legends_=(x: js.Array[OmitAnchoredContinuousCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | PartialAnimationConfig = js.native
    inline def motionConfig_=(x: String | PartialAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.sizeVariation")
    @js.native
    def sizeVariation: `false` | SizeVariationConfig = js.native
    inline def sizeVariation_=(x: `false` | SizeVariationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.tooltip")
    @js.native
    def tooltip: TooltipComponent[DefaultHeatMapDatum] = js.native
    inline def tooltip_=(x: TooltipComponent[DefaultHeatMapDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.xInnerPadding")
    @js.native
    def xInnerPadding: Double = js.native
    inline def xInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.xOuterPadding")
    @js.native
    def xOuterPadding: Double = js.native
    inline def xOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xOuterPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.yInnerPadding")
    @js.native
    def yInnerPadding: Double = js.native
    inline def yInnerPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/heatmap", "svgDefaultProps.yOuterPadding")
    @js.native
    def yOuterPadding: Double = js.native
    inline def yOuterPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yOuterPadding")(x.asInstanceOf[js.Any])
  }
  
  inline def useCellAnnotations[Datum /* <: HeatMapDatum */](
    cells: js.Array[ComputedCell[Datum]],
    annotations: js.Array[AnnotationMatcher[ComputedCell[Datum]]]
  ): js.Array[BoundAnnotation[ComputedCell[Datum]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCellAnnotations")(cells.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[js.Array[BoundAnnotation[ComputedCell[Datum]]]]
  
  inline def useComputeCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    param0: (Data[Datum, ExtraProps]) & (Pick[
      HeatMapCommonProps[Datum], 
      forceSquare | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding
    ])
  ): Cells[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputeCells")(param0.asInstanceOf[js.Any]).asInstanceOf[Cells[Datum]]
  
  inline def useHeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    param0: (Width[Datum, ExtraProps]) & (Partial[
      Pick[
        HeatMapCommonProps[Datum], 
        borderColor | opacity | label | labelTextColor | valueFormat | forceSquare | sizeVariation | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding | activeOpacity | inactiveOpacity | colors | emptyColor | hoverTarget
      ]
    ])
  ): ActiveCell[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeatMap")(param0.asInstanceOf[js.Any]).asInstanceOf[ActiveCell[Datum]]
}
