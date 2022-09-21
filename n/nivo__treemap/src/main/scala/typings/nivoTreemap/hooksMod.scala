package typings.nivoTreemap

import typings.d3Hierarchy.mod.HierarchyNode
import typings.d3Hierarchy.mod.TreemapLayout
import typings.nivoTreemap.anon.BorderColor
import typings.nivoTreemap.anon.EnableParentLabel
import typings.nivoTreemap.anon.GetValue
import typings.nivoTreemap.anon.Hierarchy
import typings.nivoTreemap.anon.IsInteractive
import typings.nivoTreemap.typesMod.ComputedNode
import typings.nivoTreemap.typesMod.ComputedNodeWithHandlers
import typings.nivoTreemap.typesMod.CustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/treemap/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCustomLayerProps[Datum /* <: js.Object */](hasNodes: CustomLayerProps[Datum]): CustomLayerProps[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomLayerProps")(hasNodes.asInstanceOf[js.Any]).asInstanceOf[CustomLayerProps[Datum]]
  
  inline def useHierarchy[Datum /* <: js.Object */](hasRootGetValue: GetValue[Datum]): HierarchyNode[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHierarchy")(hasRootGetValue.asInstanceOf[js.Any]).asInstanceOf[HierarchyNode[Datum]]
  
  inline def useInteractiveTreeMapNodes[Datum /* <: js.Object */](
    nodes: js.Array[ComputedNode[Datum]],
    hasIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip: IsInteractive[Datum]
  ): js.Array[ComputedNodeWithHandlers[Datum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInteractiveTreeMapNodes")(nodes.asInstanceOf[js.Any], hasIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedNodeWithHandlers[Datum]]]
  
  inline def useTreeMap[Datum /* <: js.Object */](
    hasDataWidthHeightIdentityValueValueFormatLeavesOnlyTileInnerPaddingOuterPaddingLabelOrientLabelEnableParentLabelParentLabelParentLabelSizeParentLabelPositionParentLabelPaddingColorsColorByNodeOpacityBorderColorLabelTextColorParentLabelTextColor: BorderColor[Datum]
  ): Hierarchy[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMap")(hasDataWidthHeightIdentityValueValueFormatLeavesOnlyTileInnerPaddingOuterPaddingLabelOrientLabelEnableParentLabelParentLabelParentLabelSizeParentLabelPositionParentLabelPaddingColorsColorByNodeOpacityBorderColorLabelTextColorParentLabelTextColor.asInstanceOf[js.Any]).asInstanceOf[Hierarchy[Datum]]
  
  inline def useTreeMapLayout[Datum /* <: js.Object */](
    hasWidthHeightTileInnerPaddingOuterPaddingEnableParentLabelParentLabelSizeParentLabelPositionLeavesOnly: EnableParentLabel
  ): TreemapLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMapLayout")(hasWidthHeightTileInnerPaddingOuterPaddingEnableParentLabelParentLabelSizeParentLabelPositionLeavesOnly.asInstanceOf[js.Any]).asInstanceOf[TreemapLayout[Datum]]
}
