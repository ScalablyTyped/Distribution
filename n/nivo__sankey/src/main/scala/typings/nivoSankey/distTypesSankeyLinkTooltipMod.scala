package typings.nivoSankey

import typings.nivoSankey.distTypesTypesMod.DefaultLink
import typings.nivoSankey.distTypesTypesMod.DefaultNode
import typings.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyLinkTooltipMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinkTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyLinkTooltip[N /* <: DefaultNode */, L /* <: DefaultLink */](param0: SankeyLinkTooltipProps[N, L]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyLinkTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SankeyLinkTooltipProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var link: SankeyLinkDatum[N, L]
  }
  object SankeyLinkTooltipProps {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](link: SankeyLinkDatum[N, L]): SankeyLinkTooltipProps[N, L] = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLinkTooltipProps[N, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SankeyLinkTooltipProps[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */] (val x: Self & (SankeyLinkTooltipProps[N, L])) extends AnyVal {
      
      inline def setLink(value: SankeyLinkDatum[N, L]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
}
