package typings.nivoCirclePacking

import typings.nivoCirclePacking.anon.CanvasEl
import typings.nivoCirclePacking.anon.ChildColor
import typings.nivoCirclePacking.anon.Filter
import typings.nivoCirclePacking.anon.Label
import typings.nivoCirclePacking.anon.Nodes
import typings.nivoCirclePacking.anon.PartialRecordonMouseMoveo
import typings.nivoCirclePacking.distTypesTypesMod.CirclePackingCustomLayerProps
import typings.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typings.nivoCirclePacking.distTypesTypesMod.MouseHandlers
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/circle-packing/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCirclePacking[RawDatum](
    hasDataIdValueValueFormatWidthHeightPaddingLeavesOnlyColorsColorByInheritColorFromParentChildColor: ChildColor[RawDatum]
  ): js.Array[ComputedDatum[RawDatum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePacking")(hasDataIdValueValueFormatWidthHeightPaddingLeavesOnlyColorsColorByInheritColorFromParentChildColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  
  inline def useCirclePackingLabels[RawDatum](hasNodesLabelFilterSkipRadiusTextColor: Filter[RawDatum]): js.Array[Label[RawDatum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingLabels")(hasNodesLabelFilterSkipRadiusTextColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Label[RawDatum]]]
  
  inline def useCirclePackingLayerContext[RawDatum](hasNodes: Nodes[RawDatum]): CirclePackingCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingLayerContext")(hasNodes.asInstanceOf[js.Any]).asInstanceOf[CirclePackingCustomLayerProps[RawDatum]]
  
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: String, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: Null, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: Unit, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  
  inline def useMouseCircleDetection[RawDatum](hasNodesCanvasElMargin: CanvasEl[RawDatum]): js.Function1[
    /* event */ MouseEvent[Element, NativeMouseEvent], 
    js.UndefOr[ComputedDatum[RawDatum] | Null]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMouseCircleDetection")(hasNodesCanvasElMargin.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* event */ MouseEvent[Element, NativeMouseEvent], 
    js.UndefOr[ComputedDatum[RawDatum] | Null]
  ]]
  
  inline def useNodeMouseHandlers[RawDatum](
    node: ComputedDatum[RawDatum],
    hasOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: MouseHandlers[RawDatum]
  ): PartialRecordonMouseMoveo = (^.asInstanceOf[js.Dynamic].applyDynamic("useNodeMouseHandlers")(node.asInstanceOf[js.Any], hasOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any])).asInstanceOf[PartialRecordonMouseMoveo]
}
