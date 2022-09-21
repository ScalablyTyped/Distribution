package typings.nivoTreemap

import typings.nivoTreemap.typesMod.TooltipProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMapNodeTooltipMod {
  
  @JSImport("@nivo/treemap/dist/types/TreeMapNodeTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeMapNodeTooltip[Datum /* <: js.Object */](hasNode: TooltipProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMapNodeTooltip")(hasNode.asInstanceOf[js.Any]).asInstanceOf[Element]
}
