package typings.nivoSankey

import typings.nivoSankey.typesMod.DefaultLink
import typings.nivoSankey.typesMod.DefaultNode
import typings.nivoSankey.typesMod.SankeyNodeDatum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyNodeTooltipMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyNodeTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyNodeTooltip[N /* <: DefaultNode */, L /* <: DefaultLink */](hasNode: SankeyNodeTooltipProps[N, L]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyNodeTooltip")(hasNode.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SankeyNodeTooltipProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var node: SankeyNodeDatum[N, L]
  }
  object SankeyNodeTooltipProps {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](node: SankeyNodeDatum[N, L]): SankeyNodeTooltipProps[N, L] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyNodeTooltipProps[N, L]]
    }
    
    extension [Self <: SankeyNodeTooltipProps[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (SankeyNodeTooltipProps[N, L])) {
      
      inline def setNode(value: SankeyNodeDatum[N, L]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
