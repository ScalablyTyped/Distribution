package typings.nivoTreemap

import typings.d3Hierarchy.mod.HierarchyNode
import typings.d3Hierarchy.mod.TreemapLayout
import typings.nivoTreemap.anon.BorderColor
import typings.nivoTreemap.anon.EnableParentLabel
import typings.nivoTreemap.anon.GetValue
import typings.nivoTreemap.anon.Hierarchy
import typings.nivoTreemap.anon.IsInteractive
import typings.nivoTreemap.distTypesTypesMod.ComputedNode
import typings.nivoTreemap.distTypesTypesMod.ComputedNodeWithHandlers
import typings.nivoTreemap.distTypesTypesMod.CustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/treemap/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCustomLayerProps[Datum /* <: js.Object */](param0: CustomLayerProps[Datum]): CustomLayerProps[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomLayerProps")(param0.asInstanceOf[js.Any]).asInstanceOf[CustomLayerProps[Datum]]
  
  inline def useHierarchy[Datum /* <: js.Object */](param0: GetValue[Datum]): HierarchyNode[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHierarchy")(param0.asInstanceOf[js.Any]).asInstanceOf[HierarchyNode[Datum]]
  
  inline def useInteractiveTreeMapNodes[Datum /* <: js.Object */](nodes: js.Array[ComputedNode[Datum]], param1: IsInteractive[Datum]): js.Array[ComputedNodeWithHandlers[Datum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInteractiveTreeMapNodes")(nodes.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedNodeWithHandlers[Datum]]]
  
  inline def useTreeMap[Datum /* <: js.Object */](param0: BorderColor[Datum]): Hierarchy[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMap")(param0.asInstanceOf[js.Any]).asInstanceOf[Hierarchy[Datum]]
  
  inline def useTreeMapLayout[Datum /* <: js.Object */](param0: EnableParentLabel): TreemapLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMapLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[TreemapLayout[Datum]]
}
