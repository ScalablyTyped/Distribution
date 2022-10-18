package typings.nivoSankey

import typings.nivoSankey.distTypesTypesMod.DefaultLink
import typings.nivoSankey.distTypesTypesMod.DefaultNode
import typings.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinksMod {
  
  @JSImport("@nivo/sankey/dist/types/links", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sankeyLinkHorizontal[N /* <: DefaultNode */, L /* <: DefaultLink */](): js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLinkHorizontal")().asInstanceOf[js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String]]
  
  inline def sankeyLinkVertical[N /* <: DefaultNode */, L /* <: DefaultLink */](): js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLinkVertical")().asInstanceOf[js.Function2[/* link */ SankeyLinkDatum[N, L], /* contract */ Double, String]]
}
