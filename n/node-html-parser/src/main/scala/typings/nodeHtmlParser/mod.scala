package typings.nodeHtmlParser

import typings.nodeHtmlParser.anon.HTMLElementvalidboolean
import typings.nodeHtmlParser.anon.PartialOptions
import typings.nodeHtmlParser.anon.PartialOptionsnoFixfalse
import typings.nodeHtmlParser.anon.PartialOptionsnoFixtrue
import typings.nodeHtmlParser.anon.Valid
import typings.nodeHtmlParser.commentMod.default
import typings.nodeHtmlParser.htmlMod.KeyAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String, options: PartialOptions): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String, options: PartialOptionsnoFixtrue): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  
  @JSImport("node-html-parser", "CommentNode")
  @js.native
  class CommentNode protected () extends default {
    def this(rawText: String) = this()
  }
  
  @JSImport("node-html-parser", "HTMLElement")
  @js.native
  class HTMLElement protected ()
    extends typings.nodeHtmlParser.htmlMod.default {
    /**
      * Creates an instance of HTMLElement.
      * @param keyAttrs	id and class attribute
      * @param [rawAttrs]	attributes in string
      *
      * @memberof HTMLElement
      */
    def this(tagName: String, keyAttrs: KeyAttributes) = this()
    def this(tagName: String, keyAttrs: KeyAttributes, rawAttrs: String) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: js.UndefOr[scala.Nothing],
      parentNode: typings.nodeHtmlParser.nodeMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typings.nodeHtmlParser.nodeMod.default
    ) = this()
  }
  
  @JSImport("node-html-parser", "Node")
  @js.native
  abstract class Node ()
    extends typings.nodeHtmlParser.nodeMod.default
  
  @JSImport("node-html-parser", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.nodeHtmlParser.typeMod.NodeType with Double] = js.native
    
    /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE with Double = js.native
    
    /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE with Double = js.native
    
    /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.typeMod.NodeType.TEXT_NODE with Double = js.native
  }
  
  @JSImport("node-html-parser", "TextNode")
  @js.native
  class TextNode protected ()
    extends typings.nodeHtmlParser.textMod.default {
    def this(rawText: String) = this()
  }
  
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default_Intersection(data: String): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String, options: PartialOptions): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String, options: PartialOptionsnoFixtrue): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse_Intersection(data: String): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
}
