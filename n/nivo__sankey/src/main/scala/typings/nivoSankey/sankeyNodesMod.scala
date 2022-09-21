package typings.nivoSankey

import typings.nivoSankey.anon.Node
import typings.nivoSankey.typesMod.DefaultLink
import typings.nivoSankey.typesMod.DefaultNode
import typings.nivoSankey.typesMod.SankeyLinkDatum
import typings.nivoSankey.typesMod.SankeyMouseHandler
import typings.nivoSankey.typesMod.SankeyNodeDatum
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyNodesMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyNodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyNodes[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasNodesNodeOpacityNodeHoverOpacityNodeHoverOthersOpacityBorderWidthGetBorderColorBorderRadiusSetCurrentNodeCurrentNodeCurrentLinkIsCurrentNodeIsInteractiveOnClickTooltip: SankeyNodesProps[N, L]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyNodes")(hasNodesNodeOpacityNodeHoverOpacityNodeHoverOthersOpacityBorderWidthGetBorderColorBorderRadiusSetCurrentNodeCurrentNodeCurrentLinkIsCurrentNodeIsInteractiveOnClickTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SankeyNodesProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var borderRadius: Double = js.native
    
    var borderWidth: Double = js.native
    
    var currentLink: (SankeyLinkDatum[N, L]) | Null = js.native
    
    var currentNode: (SankeyNodeDatum[N, L]) | Null = js.native
    
    def getBorderColor(node: SankeyNodeDatum[N, L]): String = js.native
    
    def isCurrentNode(node: SankeyNodeDatum[N, L]): Boolean = js.native
    
    var isInteractive: Boolean = js.native
    
    var nodeHoverOpacity: Double = js.native
    
    var nodeHoverOthersOpacity: Double = js.native
    
    var nodeOpacity: Double = js.native
    
    var nodes: js.Array[SankeyNodeDatum[N, L]] = js.native
    
    var onClick: js.UndefOr[SankeyMouseHandler] = js.native
    
    def setCurrentNode(): Unit = js.native
    def setCurrentNode(node: SankeyNodeDatum[N, L]): Unit = js.native
    
    var tooltip: FunctionComponent[Node[N, L]] = js.native
  }
}
