package typings.nivoScatterplot

import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotMouseHandler
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotNode
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltip
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodesMod {
  
  @JSImport("@nivo/scatterplot/dist/types/Nodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Nodes[RawDatum /* <: ScatterPlotDatum */](
    hasNodesNodeComponentIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipBlendMode: NodesProps[RawDatum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Nodes")(hasNodesNodeComponentIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipBlendMode.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait NodesProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var blendMode: CssMixBlendMode
    
    var isInteractive: Boolean
    
    var nodeComponent: ScatterPlotNode[RawDatum]
    
    var nodes: js.Array[ScatterPlotNodeData[RawDatum]]
    
    var onClick: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var tooltip: ScatterPlotTooltip[RawDatum]
  }
  object NodesProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      blendMode: CssMixBlendMode,
      isInteractive: Boolean,
      nodeComponent: ScatterPlotNode[RawDatum],
      nodes: js.Array[ScatterPlotNodeData[RawDatum]],
      tooltip: ScatterPlotTooltip[RawDatum]
    ): NodesProps[RawDatum] = {
      val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], nodeComponent = nodeComponent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodesProps[RawDatum]]
    }
    
    extension [Self <: NodesProps[?], RawDatum /* <: ScatterPlotDatum */](x: Self & NodesProps[RawDatum]) {
      
      inline def setBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setNodeComponent(value: ScatterPlotNode[RawDatum]): Self = StObject.set(x, "nodeComponent", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ScatterPlotNodeData[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ScatterPlotNodeData[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTooltip(value: ScatterPlotTooltip[RawDatum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
