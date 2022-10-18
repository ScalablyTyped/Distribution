package typings.nivoSankey

import typings.nivoSankey.distTypesTypesMod.DefaultLink
import typings.nivoSankey.distTypesTypesMod.DefaultNode
import typings.nivoSankey.distTypesTypesMod.SankeySvgProps
import typings.nivoSankey.nivoSankeyStrings.height
import typings.nivoSankey.nivoSankeyStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveSankeyMod {
  
  @JSImport("@nivo/sankey/dist/types/ResponsiveSankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveSankey[N /* <: DefaultNode */, L /* <: DefaultLink */](props: Omit[SankeySvgProps[N, L], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveSankey")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
