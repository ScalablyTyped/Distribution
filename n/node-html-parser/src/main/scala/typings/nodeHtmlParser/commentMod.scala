package typings.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentMod {
  
  @JSImport("node-html-parser/dist/nodes/comment", JSImport.Default)
  @js.native
  class default protected () extends CommentNode {
    def this(rawText: String) = this()
  }
  
  @js.native
  trait CommentNode
    extends typings.nodeHtmlParser.nodeMod.default {
    
    /**
      * Get unescaped text value of current node and its children.
      * @return {string} text content
      */
    @JSName("text")
    def text_MCommentNode: String = js.native
  }
}
