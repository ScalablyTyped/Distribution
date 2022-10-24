package typings.nivoSankey

import typings.nivoSankey.distTypesTypesMod.DefaultLink
import typings.nivoSankey.distTypesTypesMod.DefaultNode
import typings.nivoSankey.distTypesTypesMod.SankeySvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyMod {
  
  @JSImport("@nivo/sankey/dist/types/Sankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Sankey[N /* <: DefaultNode */, L /* <: DefaultLink */](param0: SankeySvgProps[N, L]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Sankey")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
