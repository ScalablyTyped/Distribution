package typings.nivoScatterplot

import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoScales.typesMod.ScaleSpec
import typings.nivoScatterplot.anon.OmitScatterPlotNodeDataSc
import typings.nivoScatterplot.anon.SerieId
import typings.nivoScatterplot.typesMod.ScatterPlotDatum
import typings.nivoScatterplot.typesMod.ScatterPlotLayerId
import typings.nivoScatterplot.typesMod.ScatterPlotNodeData
import typings.nivoScatterplot.typesMod.ScatterPlotNodeProps
import typings.nivoScatterplot.typesMod.ScatterPlotTooltipProps
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[SerieId] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[SerieId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.debugMesh")
    @js.native
    def debugMesh: Boolean = js.native
    inline def debugMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[ScatterPlotLayerId] = js.native
    inline def layers_=(x: js.Array[ScatterPlotLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[RawDatum /* <: ScatterPlotDatum */](
      hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: ScatterPlotNodeProps[RawDatum]
    ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.nodeId")
    @js.native
    def nodeId: PropertyAccessor[OmitScatterPlotNodeDataSc, String] = js.native
    inline def nodeId_=(x: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.nodeSize")
    @js.native
    def nodeSize: Double = js.native
    inline def nodeSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    inline def renderNode(ctx: CanvasRenderingContext2D, node: ScatterPlotNodeData[ScatterPlotDatum]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNode")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def tooltip[RawDatum_1 /* <: ScatterPlotDatum */](hasNode: ScatterPlotTooltipProps[RawDatum_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(hasNode.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.xScale")
    @js.native
    def xScale: ScaleSpec = js.native
    inline def xScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "canvasDefaultProps.yScale")
    @js.native
    def yScale: ScaleSpec = js.native
    inline def yScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yScale")(x.asInstanceOf[js.Any])
  }
  
  object commonDefaultProps {
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[SerieId] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[SerieId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.debugMesh")
    @js.native
    def debugMesh: Boolean = js.native
    inline def debugMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[RawDatum /* <: ScatterPlotDatum */](
      hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: ScatterPlotNodeProps[RawDatum]
    ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.nodeId")
    @js.native
    def nodeId: PropertyAccessor[OmitScatterPlotNodeDataSc, String] = js.native
    inline def nodeId_=(x: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.nodeSize")
    @js.native
    def nodeSize: Double = js.native
    inline def nodeSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum_1 /* <: ScatterPlotDatum */](hasNode: ScatterPlotTooltipProps[RawDatum_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(hasNode.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.xScale")
    @js.native
    def xScale: ScaleSpec = js.native
    inline def xScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "commonDefaultProps.yScale")
    @js.native
    def yScale: ScaleSpec = js.native
    inline def yScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yScale")(x.asInstanceOf[js.Any])
  }
  
  object svgDefaultProps {
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.annotations")
    @js.native
    def annotations: js.Array[scala.Nothing] = js.native
    inline def annotations_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.blendMode")
    @js.native
    def blendMode: CssMixBlendMode = js.native
    inline def blendMode_=(x: CssMixBlendMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[SerieId] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[SerieId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.debugMesh")
    @js.native
    def debugMesh: Boolean = js.native
    inline def debugMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.enableGridX")
    @js.native
    def enableGridX: Boolean = js.native
    inline def enableGridX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.enableGridY")
    @js.native
    def enableGridY: Boolean = js.native
    inline def enableGridY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[ScatterPlotLayerId] = js.native
    inline def layers_=(x: js.Array[ScatterPlotLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.markers")
    @js.native
    def markers: js.Array[scala.Nothing] = js.native
    inline def markers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    inline def nodeComponent[RawDatum /* <: ScatterPlotDatum */](
      hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: ScatterPlotNodeProps[RawDatum]
    ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeComponent")(hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.nodeId")
    @js.native
    def nodeId: PropertyAccessor[OmitScatterPlotNodeDataSc, String] = js.native
    inline def nodeId_=(x: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.nodeSize")
    @js.native
    def nodeSize: Double = js.native
    inline def nodeSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum_1 /* <: ScatterPlotDatum */](hasNode: ScatterPlotTooltipProps[RawDatum_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(hasNode.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.useMesh")
    @js.native
    def useMesh: Boolean = js.native
    inline def useMesh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.xScale")
    @js.native
    def xScale: ScaleSpec = js.native
    inline def xScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/scatterplot/dist/types/props", "svgDefaultProps.yScale")
    @js.native
    def yScale: ScaleSpec = js.native
    inline def yScale_=(x: ScaleSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yScale")(x.asInstanceOf[js.Any])
  }
}
