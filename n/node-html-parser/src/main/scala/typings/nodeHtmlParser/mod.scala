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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-html-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): HTMLElementvalidboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[HTMLElementvalidboolean]
  inline def default(data: String, options: PartialOptions): HTMLElementvalidboolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElementvalidboolean]
  inline def default(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElementvalidboolean]
  inline def default(data: String, options: PartialOptionsnoFixtrue): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid]
  
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
      rawAttrs: String,
      parentNode: typings.nodeHtmlParser.nodeMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: Unit,
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
    def apply(value: Double): js.UndefOr[typings.nodeHtmlParser.typeMod.NodeType & Double] = js.native
    
    /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE & Double = js.native
    
    /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE & Double = js.native
    
    /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.typeMod.NodeType.TEXT_NODE & Double = js.native
  }
  
  @JSImport("node-html-parser", "TextNode")
  @js.native
  class TextNode protected ()
    extends typings.nodeHtmlParser.textMod.default {
    def this(rawText: String) = this()
  }
  
  inline def default_Intersection(data: String): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[(typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid]
  
  inline def parse(data: String): HTMLElementvalidboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[HTMLElementvalidboolean]
  inline def parse(data: String, options: PartialOptions): HTMLElementvalidboolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElementvalidboolean]
  inline def parse(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElementvalidboolean]
  inline def parse(data: String, options: PartialOptionsnoFixtrue): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid]
  
  inline def parse_Intersection(data: String): (typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[(typings.nodeHtmlParser.htmlMod.HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid]
}
