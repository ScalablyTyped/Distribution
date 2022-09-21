package typings.nivoSankey

import typings.nivoSankey.typesMod.DefaultLink
import typings.nivoSankey.typesMod.DefaultNode
import typings.nivoSankey.typesMod.SankeyLinkDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linksMod {
  
  @JSImport("@nivo/sankey/dist/types/links", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sankeyLinkHorizontal[N /* <: DefaultNode */, L /* <: DefaultLink */](): js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLinkHorizontal")().asInstanceOf[js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String]]
  
  inline def sankeyLinkVertical[N /* <: DefaultNode */, L /* <: DefaultLink */](): js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLinkVertical")().asInstanceOf[js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String]]
}
