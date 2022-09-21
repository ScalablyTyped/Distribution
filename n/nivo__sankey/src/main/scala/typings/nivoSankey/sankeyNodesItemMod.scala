package typings.nivoSankey

import typings.nivoSankey.anon.Node
import typings.nivoSankey.typesMod.DefaultLink
import typings.nivoSankey.typesMod.DefaultNode
import typings.nivoSankey.typesMod.SankeyMouseHandler
import typings.nivoSankey.typesMod.SankeyNodeDatum
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyNodesItemMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyNodesItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyNodesItem[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasNodeXYWidthHeightColorOpacityBorderWidthBorderColorBorderRadiusSetCurrentIsInteractiveOnClickTooltip: SankeyNodesItemProps[N, L]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyNodesItem")(hasNodeXYWidthHeightColorOpacityBorderWidthBorderColorBorderRadiusSetCurrentIsInteractiveOnClickTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SankeyNodesItemProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var borderColor: String = js.native
    
    var borderRadius: Double = js.native
    
    var borderWidth: Double = js.native
    
    var color: String = js.native
    
    var height: Double = js.native
    
    var isInteractive: Boolean = js.native
    
    var node: SankeyNodeDatum[N, L] = js.native
    
    var onClick: js.UndefOr[SankeyMouseHandler] = js.native
    
    var opacity: Double = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(node: SankeyNodeDatum[N, L]): Unit = js.native
    
    var tooltip: FunctionComponent[Node[N, L]] = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
