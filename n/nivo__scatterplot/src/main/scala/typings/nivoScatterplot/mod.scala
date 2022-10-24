package typings.nivoScatterplot

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import typings.nivoScatterplot.anon.Colors
import typings.nivoScatterplot.anon.LegendData
import typings.nivoScatterplot.anon.OmitScatterPlotCanvasProp
import typings.nivoScatterplot.anon.OmitScatterPlotNodeDataSc
import typings.nivoScatterplot.anon.PartialScatterPlotCommonP
import typings.nivoScatterplot.anon.SerieId
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotLayerId
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeProps
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotSvgProps
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltipProps
import typings.nivoScatterplot.nivoScatterplotStrings.height
import typings.nivoScatterplot.nivoScatterplotStrings.width
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/scatterplot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveScatterPlot[RawDatum /* <: ScatterPlotDatum */](props: Omit[ScatterPlotSvgProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveScatterPlot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/scatterplot", "ResponsiveScatterPlotCanvas")
  @js.native
  val ResponsiveScatterPlotCanvas: ForwardRefExoticComponent[OmitScatterPlotCanvasProp] = js.native
  
  inline def ScatterPlot[RawDatum /* <: ScatterPlotDatum */](param0: ScatterPlotSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScatterPlot")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/scatterplot", "ScatterPlotCanvas")
  @js.native
  val ScatterPlotCanvas: ForwardRefExoticComponent[PartialScatterPlotCommonP] = js.native
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[SerieId] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[SerieId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.debugMesh")
    @js.native
    def debugMesh: Boolean = js.native
    inline def debugMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[ScatterPlotLayerId] = js.native
    inline def layers_=(x: js.Array[ScatterPlotLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[RawDatum /* <: ScatterPlotDatum */](param0: ScatterPlotNodeProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.nodeId")
    @js.native
    def nodeId: PropertyAccessor[OmitScatterPlotNodeDataSc, String] = js.native
    inline def nodeId_=(x: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.nodeSize")
    @js.native
    def nodeSize: Double = js.native
    inline def nodeSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    inline def renderNode(ctx: CanvasRenderingContext2D, node: ScatterPlotNodeData[ScatterPlotDatum]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNode")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def tooltip[RawDatum_1 /* <: ScatterPlotDatum */](param0: ScatterPlotTooltipProps[RawDatum_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.xScale")
    @js.native
    def xScale: ScaleSpec = js.native
    inline def xScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "canvasDefaultProps.yScale")
    @js.native
    def yScale: ScaleSpec = js.native
    inline def yScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yScale")(x.asInstanceOf[js.Any])
  }
  
  object commonDefaultProps {
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[SerieId] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[SerieId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.debugMesh")
    @js.native
    def debugMesh: Boolean = js.native
    inline def debugMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[RawDatum /* <: ScatterPlotDatum */](param0: ScatterPlotNodeProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.nodeId")
    @js.native
    def nodeId: PropertyAccessor[OmitScatterPlotNodeDataSc, String] = js.native
    inline def nodeId_=(x: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.nodeSize")
    @js.native
    def nodeSize: Double = js.native
    inline def nodeSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum_1 /* <: ScatterPlotDatum */](param0: ScatterPlotTooltipProps[RawDatum_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.xScale")
    @js.native
    def xScale: ScaleSpec = js.native
    inline def xScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "commonDefaultProps.yScale")
    @js.native
    def yScale: ScaleSpec = js.native
    inline def yScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yScale")(x.asInstanceOf[js.Any])
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.blendMode")
    @js.native
    def blendMode: CssMixBlendMode = js.native
    inline def blendMode_=(x: CssMixBlendMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[SerieId] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[SerieId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.debugMesh")
    @js.native
    def debugMesh: Boolean = js.native
    inline def debugMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[ScatterPlotLayerId] = js.native
    inline def layers_=(x: js.Array[ScatterPlotLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[RawDatum /* <: ScatterPlotDatum */](param0: ScatterPlotNodeProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.nodeId")
    @js.native
    def nodeId: PropertyAccessor[OmitScatterPlotNodeDataSc, String] = js.native
    inline def nodeId_=(x: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.nodeSize")
    @js.native
    def nodeSize: Double = js.native
    inline def nodeSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum_1 /* <: ScatterPlotDatum */](param0: ScatterPlotTooltipProps[RawDatum_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.useMesh")
    @js.native
    def useMesh: Boolean = js.native
    inline def useMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.xScale")
    @js.native
    def xScale: ScaleSpec = js.native
    inline def xScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot", "svgDefaultProps.yScale")
    @js.native
    def yScale: ScaleSpec = js.native
    inline def yScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yScale")(x.asInstanceOf[js.Any])
  }
  
  inline def useScatterPlot[RawDatum /* <: ScatterPlotDatum */](param0: Colors[RawDatum]): LegendData[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScatterPlot")(param0.asInstanceOf[js.Any]).asInstanceOf[LegendData[RawDatum]]
  
  inline def useScatterPlotAnnotations[RawDatum /* <: ScatterPlotDatum */](
    items: js.Array[ScatterPlotNodeData[RawDatum]],
    annotations: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]
  ): js.Array[BoundAnnotation[ScatterPlotNodeData[RawDatum]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useScatterPlotAnnotations")(items.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[js.Array[BoundAnnotation[ScatterPlotNodeData[RawDatum]]]]
}
