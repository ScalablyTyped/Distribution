package typings.nivoSankey

import typings.nivoSankey.anon.Align
import typings.nivoSankey.anon.AlignFunction
import typings.nivoSankey.anon.CurrentLink
import typings.nivoSankey.anon.Nodes
import typings.nivoSankey.distTypesTypesMod.DefaultLink
import typings.nivoSankey.distTypesTypesMod.DefaultNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/sankey/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNodeAndLinks[N /* <: DefaultNode */, L /* <: DefaultLink */](
    has_dataFormatValueLayoutAlignFunctionSortFunctionLinkSortModeNodeThicknessNodeSpacingNodeInnerPaddingWidthHeightGetColorGetLabel: AlignFunction[N, L]
  ): Nodes[N, L] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNodeAndLinks")(has_dataFormatValueLayoutAlignFunctionSortFunctionLinkSortModeNodeThicknessNodeSpacingNodeInnerPaddingWidthHeightGetColorGetLabel.asInstanceOf[js.Any]).asInstanceOf[Nodes[N, L]]
  
  inline def useSankey[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasDataValueFormatLayoutWidthHeightSortAlignColorsNodeThicknessNodeSpacingNodeInnerPaddingNodeBorderColorLabelLabelTextColor: Align[N, L]
  ): CurrentLink[N, L] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSankey")(hasDataValueFormatLayoutWidthHeightSortAlignColorsNodeThicknessNodeSpacingNodeInnerPaddingNodeBorderColorLabelLabelTextColor.asInstanceOf[js.Any]).asInstanceOf[CurrentLink[N, L]]
}
