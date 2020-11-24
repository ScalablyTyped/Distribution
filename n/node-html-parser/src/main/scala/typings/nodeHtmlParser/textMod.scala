package typings.nodeHtmlParser

import typings.nodeHtmlParser.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-html-parser/dist/nodes/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  @js.native
  trait TextNode extends Node {
    
    /**
      * Detect if the node contains only white space.
      * @return {bool}
      */
    def isWhitespace: Boolean = js.native
    
    /**
      * Get unescaped text value of current node and its children.
      * @return {string} text content
      */
    @JSName("text")
    def text_MTextNode: String = js.native
  }
  
  @js.native
  class default protected () extends TextNode {
    def this(rawText: String) = this()
  }
}
