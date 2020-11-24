package typings.nodeHtmlParser

import typings.nodeHtmlParser.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-html-parser/dist/nodes/comment", JSImport.Namespace)
@js.native
object commentMod extends js.Object {
  
  @js.native
  trait CommentNode extends Node {
    
    /**
      * Get unescaped text value of current node and its children.
      * @return {string} text content
      */
    @JSName("text")
    def text_MCommentNode: String = js.native
  }
  
  @js.native
  class default protected () extends CommentNode {
    def this(rawText: String) = this()
  }
}
