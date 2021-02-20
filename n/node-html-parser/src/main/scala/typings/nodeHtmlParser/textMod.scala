package typings.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("node-html-parser/dist/nodes/text", JSImport.Default)
  @js.native
  class default protected () extends TextNode {
    def this(rawText: String) = this()
  }
  
  @js.native
  trait TextNode
    extends typings.nodeHtmlParser.nodeMod.default {
    
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
}
