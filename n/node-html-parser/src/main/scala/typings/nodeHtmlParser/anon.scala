package typings.nodeHtmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHtmlParser.htmlMod.Attributes
import typings.nodeHtmlParser.htmlMod.HTMLElement
import typings.nodeHtmlParser.htmlMod.InsertPosition
import typings.nodeHtmlParser.htmlMod.Options
import typings.nodeHtmlParser.htmlMod.RawAttributes
import typings.nodeHtmlParser.nodeHtmlParserBooleans.`false`
import typings.nodeHtmlParser.nodeHtmlParserBooleans.`true`
import typings.nodeHtmlParser.nodeMod.Node
import typings.nodeHtmlParser.nodeMod.default
import typings.nodeHtmlParser.typeMod.NodeType
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node-html-parser.node-html-parser/dist/nodes/html.HTMLElement & {  valid :boolean} */
  @js.native
  trait HTMLElementvalidboolean extends StObject {
    
    var _attrs: js.Any = js.native
    
    var _rawAttrs: js.Any = js.native
    
    /**
      * Append a child node to childNodes
      * @param  {Node} node node to append
      * @return {Node}      node appended
      */
    def appendChild[T /* <: default */](node: T): T = js.native
    
    /**
      * Get attributes
      * @return {Object} parsed and unescaped attributes
      */
    def attributes: Attributes = js.native
    
    var childNodes: js.Array[Node] = js.native
    
    var classNames: js.Array[String] = js.native
    
    /**
      * Exchanges given child with new child
      * @param {HTMLElement} oldNode     node to exchange
      * @param {HTMLElement} newNode     new node
      */
    def exchangeChild(oldNode: default, newNode: default): Unit = js.native
    
    /**
      * Get first child node
      * @return {Node} first child node
      */
    def firstChild: default = js.native
    
    /**
      * Get an attribute
      * @return {string} value of the attribute
      */
    def getAttribute(key: String): js.UndefOr[String] = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    var id: String = js.native
    
    def innerHTML: String = js.native
    
    def innerText: String = js.native
    
    def insertAdjacentHTML(where: InsertPosition, html: String): Unit = js.native
    
    /**
      * Get last child node
      * @return {Node} last child node
      */
    def lastChild: default = js.native
    
    def nextElementSibling: HTMLElement = js.native
    
    def nextSibling: default = js.native
    
    /**
      * Node Type declaration.
      */
    var nodeType: NodeType = js.native
    
    def outerHTML: String = js.native
    
    var parentNode: default = js.native
    
    /**
      * Query CSS Selector to find matching node.
      * @param  {string}         selector Simplified CSS selector
      * @param  {Matcher}        selector A Matcher instance
      * @return {HTMLElement}    matching node
      */
    def querySelector(selector: String): HTMLElement = js.native
    def querySelector(selector: typings.nodeHtmlParser.matcherMod.default): HTMLElement = js.native
    
    /**
      * Query CSS selector to find matching nodes.
      * @param  {string}         selector Simplified CSS selector
      * @param  {Matcher}        selector A Matcher instance
      * @return {HTMLElement[]}  matching elements
      */
    def querySelectorAll(selector: String): js.Array[HTMLElement] = js.native
    def querySelectorAll(selector: typings.nodeHtmlParser.matcherMod.default): js.Array[HTMLElement] = js.native
    
    /**
      * Get escaped (as-it) attributes
      * @return {Object} parsed attributes
      */
    def rawAttributes: RawAttributes = js.native
    
    var rawAttrs: js.Any = js.native
    
    var rawTagName: String = js.native
    
    /**
      * Get escpaed (as-it) text value of current node and its children.
      * @return {string} text content
      */
    def rawText: String = js.native
    @JSName("rawText")
    var rawText_FHTMLElementvalidboolean: String = js.native
    
    /**
      * Remove current element
      */
    def remove(): Unit = js.native
    
    def removeAttribute(key: String): Unit = js.native
    
    /**
      * Remove Child element from childNodes array
      * @param {HTMLElement} node     node to remove
      */
    def removeChild(node: default): Unit = js.native
    
    /**
      * Remove whitespaces in this sub tree.
      * @return {HTMLElement} pointer to this
      */
    def removeWhitespace(): this.type = js.native
    
    /**
      * Set an attribute value to the HTMLElement
      * @param {string} key The attribute name
      * @param {string} value The value to set, or null / undefined to remove an attribute
      */
    def setAttribute(key: String, value: String): Unit = js.native
    
    /**
      * Replace all the attributes of the HTMLElement by the provided attributes
      * @param {Attributes} attributes the new attribute set
      */
    def setAttributes(attributes: Attributes): Unit = js.native
    
    def set_content(content: String): Unit = js.native
    def set_content(content: String, options: Options): Unit = js.native
    def set_content(content: js.Array[default]): Unit = js.native
    def set_content(content: js.Array[default], options: Options): Unit = js.native
    def set_content(content: default): Unit = js.native
    def set_content(content: default, options: Options): Unit = js.native
    
    /**
      * Get DOM structure
      * @return {string} strucutre
      */
    def structure: String = js.native
    
    /**
      * Get structured Text (with '\n' etc.)
      * @return {string} structured text
      */
    def structuredText: String = js.native
    
    def tagName: String = js.native
    
    /**
      * Get unescaped text value of current node and its children.
      * @return {string} text content
      */
    def text: String = js.native
    @JSName("text")
    var text_FHTMLElementvalidboolean: String = js.native
    
    /**
      * Trim element from right (in block) after seeing pattern in a TextNode.
      * @param  {RegExp} pattern pattern to find
      * @return {HTMLElement}    reference to current node
      */
    def trimRight(pattern: RegExp): this.type = js.native
    
    var valid: Boolean = js.native
  }
  
  /* Inlined std.Partial<node-html-parser.node-html-parser/dist/nodes/html.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var blockTextElements: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var comment: js.UndefOr[Boolean] = js.native
    
    var lowerCaseTagName: js.UndefOr[Boolean] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockTextElements(value: StringDictionary[Boolean]): Self = StObject.set(x, "blockTextElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTextElementsUndefined: Self = StObject.set(x, "blockTextElements", js.undefined)
      
      @scala.inline
      def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseTagNameUndefined: Self = StObject.set(x, "lowerCaseTagName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<node-html-parser.node-html-parser/dist/nodes/html.Options> & {  noFix :false} */
  @js.native
  trait PartialOptionsnoFixfalse extends StObject {
    
    var blockTextElements: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var comment: js.UndefOr[Boolean] = js.native
    
    var lowerCaseTagName: js.UndefOr[Boolean] = js.native
    
    var noFix: `false` = js.native
  }
  object PartialOptionsnoFixfalse {
    
    @scala.inline
    def apply(noFix: `false`): PartialOptionsnoFixfalse = {
      val __obj = js.Dynamic.literal(noFix = noFix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialOptionsnoFixfalse]
    }
    
    @scala.inline
    implicit class PartialOptionsnoFixfalseMutableBuilder[Self <: PartialOptionsnoFixfalse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockTextElements(value: StringDictionary[Boolean]): Self = StObject.set(x, "blockTextElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTextElementsUndefined: Self = StObject.set(x, "blockTextElements", js.undefined)
      
      @scala.inline
      def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseTagNameUndefined: Self = StObject.set(x, "lowerCaseTagName", js.undefined)
      
      @scala.inline
      def setNoFix(value: `false`): Self = StObject.set(x, "noFix", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<node-html-parser.node-html-parser/dist/nodes/html.Options> & {  noFix :true} */
  @js.native
  trait PartialOptionsnoFixtrue extends StObject {
    
    var blockTextElements: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var comment: js.UndefOr[Boolean] = js.native
    
    var lowerCaseTagName: js.UndefOr[Boolean] = js.native
    
    var noFix: `true` = js.native
  }
  object PartialOptionsnoFixtrue {
    
    @scala.inline
    def apply(noFix: `true`): PartialOptionsnoFixtrue = {
      val __obj = js.Dynamic.literal(noFix = noFix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialOptionsnoFixtrue]
    }
    
    @scala.inline
    implicit class PartialOptionsnoFixtrueMutableBuilder[Self <: PartialOptionsnoFixtrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockTextElements(value: StringDictionary[Boolean]): Self = StObject.set(x, "blockTextElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTextElementsUndefined: Self = StObject.set(x, "blockTextElements", js.undefined)
      
      @scala.inline
      def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseTagNameUndefined: Self = StObject.set(x, "lowerCaseTagName", js.undefined)
      
      @scala.inline
      def setNoFix(value: `true`): Self = StObject.set(x, "noFix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Valid extends StObject {
    
    var valid: Boolean = js.native
  }
  object Valid {
    
    @scala.inline
    def apply(valid: Boolean): Valid = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Valid]
    }
    
    @scala.inline
    implicit class ValidMutableBuilder[Self <: Valid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
