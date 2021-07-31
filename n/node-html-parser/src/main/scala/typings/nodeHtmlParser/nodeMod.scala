package typings.nodeHtmlParser

import typings.nodeHtmlParser.typeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("node-html-parser/dist/nodes/node", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with Node
  
  @js.native
  trait Node extends StObject {
    
    var childNodes: js.Array[Node] = js.native
    
    def innerText: String = js.native
    
    var nodeType: NodeType = js.native
    
    var rawText: String = js.native
    
    var text: String = js.native
  }
}
