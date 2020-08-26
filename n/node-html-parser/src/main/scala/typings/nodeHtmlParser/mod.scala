package typings.nodeHtmlParser

import typings.nodeHtmlParser.anon.HTMLElementvalidboolean
import typings.nodeHtmlParser.anon.OptionsnoFixfalse
import typings.nodeHtmlParser.anon.OptionsnoFixtrue
import typings.nodeHtmlParser.anon.Valid
import typings.nodeHtmlParser.commentMod.default
import typings.nodeHtmlParser.htmlMod.KeyAttributes
import typings.nodeHtmlParser.htmlMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-html-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CommentNode protected () extends default {
    def this(value: String) = this()
  }
  
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
  
  @js.native
  abstract class Node ()
    extends typings.nodeHtmlParser.nodeMod.Node
  
  @js.native
  class TextNode protected ()
    extends typings.nodeHtmlParser.textMod.default {
    def this(value: String) = this()
  }
  
  def default(data: String): HTMLElementvalidboolean = js.native
  def default(data: String, options: OptionsnoFixfalse): HTMLElementvalidboolean = js.native
  def default(data: String, options: OptionsnoFixtrue): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  def default(data: String, options: Options): HTMLElementvalidboolean = js.native
  @JSName("default")
  def default_Intersection(data: String): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  def parse(data: String): HTMLElementvalidboolean = js.native
  def parse(data: String, options: OptionsnoFixfalse): HTMLElementvalidboolean = js.native
  def parse(data: String, options: OptionsnoFixtrue): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  def parse(data: String, options: Options): HTMLElementvalidboolean = js.native
  @JSName("parse")
  def parse_Intersection(data: String): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  @js.native
  object NodeType extends js.Object {
    /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE with Double = js.native
    /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE with Double = js.native
    /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.typeMod.NodeType.TEXT_NODE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.nodeHtmlParser.typeMod.NodeType with Double] = js.native
  }
  
}

