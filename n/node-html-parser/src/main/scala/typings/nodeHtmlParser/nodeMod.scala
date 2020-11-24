package typings.nodeHtmlParser

import typings.nodeHtmlParser.typeMod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-html-parser/dist/nodes/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  @js.native
  trait Node extends js.Object {
    
    var childNodes: js.Array[Node] = js.native
    
    def innerText: String = js.native
    
    var nodeType: NodeType = js.native
    
    var rawText: String = js.native
    
    var text: String = js.native
  }
  
  @js.native
  abstract class default () extends Node
}
