package typings.nivoTreemap

import typings.nivoTreemap.nivoTreemapStrings.height
import typings.nivoTreemap.nivoTreemapStrings.width
import typings.nivoTreemap.typesMod.TreeMapSvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveTreeMapMod {
  
  @JSImport("@nivo/treemap/dist/types/ResponsiveTreeMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveTreeMap[Datum /* <: js.Object */](props: Omit[TreeMapSvgProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMap")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
