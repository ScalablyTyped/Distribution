package typings.nivoTreemap

import typings.nivoTreemap.typesMod.NodeProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMapNodeMod {
  
  @JSImport("@nivo/treemap/dist/types/TreeMapNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeMapNode[Datum /* <: js.Object */](hasNodeAnimatedPropsBorderWidthEnableLabelEnableParentLabelLabelSkipSize: NodeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMapNode")(hasNodeAnimatedPropsBorderWidthEnableLabelEnableParentLabelLabelSkipSize.asInstanceOf[js.Any]).asInstanceOf[Element]
}
