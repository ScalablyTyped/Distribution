package typings.nodeHtmlParser

import typings.nodeHtmlParser.anon.PartialOptions
import typings.nodeHtmlParser.commentMod.default
import typings.nodeHtmlParser.htmlMod.KeyAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-html-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(data: String): typings.nodeHtmlParser.htmlMod.default = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[typings.nodeHtmlParser.htmlMod.default]
    inline def apply(data: String, options: PartialOptions): typings.nodeHtmlParser.htmlMod.default = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeHtmlParser.htmlMod.default]
    
    @JSImport("node-html-parser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_comment.default` */
    @JSImport("node-html-parser", "default.CommentNode")
    @js.native
    open class CommentNode protected ()
      extends typings.nodeHtmlParser.mod.parse.CommentNode {
      def this(rawText: String, parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
      def this(
        rawText: String,
        parentNode: typings.nodeHtmlParser.htmlMod.default,
        range: js.Tuple2[Double, Double]
      ) = this()
    }
    
    /* was `typeof imported_html.default` */
    @JSImport("node-html-parser", "default.HTMLElement")
    @js.native
    open class HTMLElement protected ()
      extends typings.nodeHtmlParser.mod.parse.HTMLElement {
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double]
      ) = this()
      /**
        * Creates an instance of HTMLElement.
        * @param keyAttrs	id and class attribute
        * @param [rawAttrs]	attributes in string
        *
        * @memberof HTMLElement
        */
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typings.nodeHtmlParser.htmlMod.HTMLElement,
        range: js.Tuple2[Double, Double]
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double],
        voidTag: typings.nodeHtmlParser.voidTagMod.default
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typings.nodeHtmlParser.htmlMod.HTMLElement,
        range: js.Tuple2[Double, Double],
        voidTag: typings.nodeHtmlParser.voidTagMod.default
      ) = this()
    }
    
    /* was `typeof imported_node.default` */
    @JSImport("node-html-parser", "default.Node")
    @js.native
    abstract class Node ()
      extends typings.nodeHtmlParser.mod.parse.Node {
      def this(parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
      def this(parentNode: Unit, range: js.Tuple2[Double, Double]) = this()
      def this(parentNode: typings.nodeHtmlParser.htmlMod.default, range: js.Tuple2[Double, Double]) = this()
    }
    
    /* was `typeof imported_type.default` */
    @JSImport("node-html-parser", "default.NodeType")
    @js.native
    object NodeType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.nodeHtmlParser.typeMod.NodeType & Double] = js.native
      
      /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE & Double = js.native
      
      /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE & Double = js.native
      
      /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.typeMod.NodeType.TEXT_NODE & Double = js.native
    }
    
    /* was `typeof imported_text.default` */
    @JSImport("node-html-parser", "default.TextNode")
    @js.native
    open class TextNode protected ()
      extends typings.nodeHtmlParser.mod.parse.TextNode {
      def this(rawText: String, parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
      def this(
        rawText: String,
        parentNode: typings.nodeHtmlParser.htmlMod.default,
        range: js.Tuple2[Double, Double]
      ) = this()
    }
    
    /* was `typeof baseParse` */
    inline def parse(data: String): typings.nodeHtmlParser.htmlMod.HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[typings.nodeHtmlParser.htmlMod.HTMLElement]
    inline def parse(data: String, options: PartialOptions): typings.nodeHtmlParser.htmlMod.HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeHtmlParser.htmlMod.HTMLElement]
    
    /* was `typeof imported_valid.default` */
    inline def valid(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def valid(data: String, options: PartialOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("node-html-parser", "CommentNode")
  @js.native
  open class CommentNode protected () extends default {
    def this(rawText: String, parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
    def this(
      rawText: String,
      parentNode: typings.nodeHtmlParser.htmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  @JSImport("node-html-parser", "HTMLElement")
  @js.native
  open class HTMLElement protected ()
    extends typings.nodeHtmlParser.htmlMod.default {
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double]
    ) = this()
    /**
      * Creates an instance of HTMLElement.
      * @param keyAttrs	id and class attribute
      * @param [rawAttrs]	attributes in string
      *
      * @memberof HTMLElement
      */
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typings.nodeHtmlParser.htmlMod.HTMLElement,
      range: js.Tuple2[Double, Double]
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double],
      voidTag: typings.nodeHtmlParser.voidTagMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typings.nodeHtmlParser.htmlMod.HTMLElement,
      range: js.Tuple2[Double, Double],
      voidTag: typings.nodeHtmlParser.voidTagMod.default
    ) = this()
  }
  
  @JSImport("node-html-parser", "Node")
  @js.native
  abstract class Node ()
    extends typings.nodeHtmlParser.nodeMod.default {
    def this(parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
    def this(parentNode: Unit, range: js.Tuple2[Double, Double]) = this()
    def this(parentNode: typings.nodeHtmlParser.htmlMod.default, range: js.Tuple2[Double, Double]) = this()
  }
  
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
  open class TextNode protected ()
    extends typings.nodeHtmlParser.textMod.default {
    def this(rawText: String, parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
    def this(
      rawText: String,
      parentNode: typings.nodeHtmlParser.htmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  object parse {
    
    inline def apply(data: String): typings.nodeHtmlParser.htmlMod.default = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[typings.nodeHtmlParser.htmlMod.default]
    inline def apply(data: String, options: PartialOptions): typings.nodeHtmlParser.htmlMod.default = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeHtmlParser.htmlMod.default]
    
    @JSImport("node-html-parser", "parse")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_comment.default` */
    @JSImport("node-html-parser", "parse.CommentNode")
    @js.native
    open class CommentNode protected () extends default {
      def this(rawText: String, parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
      def this(
        rawText: String,
        parentNode: typings.nodeHtmlParser.htmlMod.default,
        range: js.Tuple2[Double, Double]
      ) = this()
    }
    
    /* was `typeof imported_html.default` */
    @JSImport("node-html-parser", "parse.HTMLElement")
    @js.native
    open class HTMLElement protected ()
      extends typings.nodeHtmlParser.htmlMod.default {
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double]
      ) = this()
      /**
        * Creates an instance of HTMLElement.
        * @param keyAttrs	id and class attribute
        * @param [rawAttrs]	attributes in string
        *
        * @memberof HTMLElement
        */
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typings.nodeHtmlParser.htmlMod.HTMLElement,
        range: js.Tuple2[Double, Double]
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: Null,
        range: js.Tuple2[Double, Double],
        voidTag: typings.nodeHtmlParser.voidTagMod.default
      ) = this()
      def this(
        tagName: String,
        keyAttrs: KeyAttributes,
        rawAttrs: String,
        parentNode: typings.nodeHtmlParser.htmlMod.HTMLElement,
        range: js.Tuple2[Double, Double],
        voidTag: typings.nodeHtmlParser.voidTagMod.default
      ) = this()
    }
    
    /* was `typeof imported_node.default` */
    @JSImport("node-html-parser", "parse.Node")
    @js.native
    abstract class Node ()
      extends typings.nodeHtmlParser.nodeMod.default {
      def this(parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
      def this(parentNode: Unit, range: js.Tuple2[Double, Double]) = this()
      def this(parentNode: typings.nodeHtmlParser.htmlMod.default, range: js.Tuple2[Double, Double]) = this()
    }
    
    /* was `typeof imported_type.default` */
    @JSImport("node-html-parser", "parse.NodeType")
    @js.native
    object NodeType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.nodeHtmlParser.typeMod.NodeType & Double] = js.native
      
      /* 8 */ val COMMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE & Double = js.native
      
      /* 1 */ val ELEMENT_NODE: typings.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE & Double = js.native
      
      /* 3 */ val TEXT_NODE: typings.nodeHtmlParser.typeMod.NodeType.TEXT_NODE & Double = js.native
    }
    
    /* was `typeof imported_text.default` */
    @JSImport("node-html-parser", "parse.TextNode")
    @js.native
    open class TextNode protected ()
      extends typings.nodeHtmlParser.textMod.default {
      def this(rawText: String, parentNode: typings.nodeHtmlParser.htmlMod.default) = this()
      def this(
        rawText: String,
        parentNode: typings.nodeHtmlParser.htmlMod.default,
        range: js.Tuple2[Double, Double]
      ) = this()
    }
    
    /* was `typeof baseParse` */
    inline def parse(data: String): typings.nodeHtmlParser.htmlMod.HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[typings.nodeHtmlParser.htmlMod.HTMLElement]
    inline def parse(data: String, options: PartialOptions): typings.nodeHtmlParser.htmlMod.HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeHtmlParser.htmlMod.HTMLElement]
    
    /* was `typeof imported_valid.default` */
    inline def valid(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def valid(data: String, options: PartialOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  inline def valid(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def valid(data: String, options: PartialOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
