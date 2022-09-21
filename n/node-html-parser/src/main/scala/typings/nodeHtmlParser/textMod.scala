package typings.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("node-html-parser/dist/nodes/text", JSImport.Default)
  @js.native
  open class default protected () extends TextNode {
    def this(rawText: String, parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
    def this(
      rawText: String,
      parentNode: typings.nodeHtmlParser.htmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  @js.native
  trait TextNode
    extends typings.nodeHtmlParser.nodeMod.default {
    
    /* private */ var _rawText: Any = js.native
    
    /* private */ var _trimmedRawText: Any = js.native
    
    /* private */ var _trimmedText: Any = js.native
    
    /**
      * Detect if the node contains only white space.
      * @return {boolean}
      */
    def isWhitespace: Boolean = js.native
    
    @JSName("rawText")
    def rawText_MTextNode: String = js.native
    
    /**
      * Get unescaped text value of current node and its children.
      * @return {string} text content
      */
    @JSName("text")
    def text_MTextNode: String = js.native
    
    /**
      * Returns raw text with all whitespace trimmed except single leading/trailing non-breaking space
      */
    def trimmedRawText: String = js.native
    
    /**
      * Returns text with all whitespace trimmed except single leading/trailing non-breaking space
      */
    def trimmedText: String = js.native
  }
}
