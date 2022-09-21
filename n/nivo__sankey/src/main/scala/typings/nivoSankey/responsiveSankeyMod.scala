package typings.nivoSankey

import typings.nivoSankey.nivoSankeyStrings.height
import typings.nivoSankey.nivoSankeyStrings.width
import typings.nivoSankey.typesMod.DefaultLink
import typings.nivoSankey.typesMod.DefaultNode
import typings.nivoSankey.typesMod.SankeySvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveSankeyMod {
  
  @JSImport("@nivo/sankey/dist/types/ResponsiveSankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveSankey[N /* <: DefaultNode */, L /* <: DefaultLink */](props: Omit[SankeySvgProps[N, L], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveSankey")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
