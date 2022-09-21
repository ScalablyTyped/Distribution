package typings.nivoTreemap

import typings.nivoTreemap.nivoTreemapStrings.height
import typings.nivoTreemap.nivoTreemapStrings.width
import typings.nivoTreemap.typesMod.TreeMapHtmlProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveTreeMapHtmlMod {
  
  @JSImport("@nivo/treemap/dist/types/ResponsiveTreeMapHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveTreeMapHtml[Datum /* <: js.Object */](props: Omit[TreeMapHtmlProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMapHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
