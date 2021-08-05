package typings.nodeHtmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHtmlParser.anon.HTMLElementvalidboolean
import typings.nodeHtmlParser.anon.PartialOptions
import typings.nodeHtmlParser.anon.PartialOptionsnoFixfalse
import typings.nodeHtmlParser.anon.PartialOptionsnoFixtrue
import typings.nodeHtmlParser.anon.Valid
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("node-html-parser/dist/nodes/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-html-parser/dist/nodes/html", JSImport.Default)
  @js.native
  class default protected () extends HTMLElement {
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
  
  inline def parse(data: String): HTMLElementvalidboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[HTMLElementvalidboolean]
  inline def parse(data: String, options: PartialOptions): HTMLElementvalidboolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElementvalidboolean]
  inline def parse(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElementvalidboolean]
  inline def parse(data: String, options: PartialOptionsnoFixtrue): (HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid]
  
  inline def parse_Intersection(data: String): (HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[(HTMLElement | typings.nodeHtmlParser.textMod.default) & Valid]
  
  type Attributes = StringDictionary[String]
  
  @js.native
  trait HTMLElement
    extends typings.nodeHtmlParser.nodeMod.default {
    
    /* private */ var _attrs: js.Any = js.native
    
    /* private */ var _rawAttrs: js.Any = js.native
    
    /**
      * Append a child node to childNodes
      * @param  {Node} node node to append
      * @return {Node}      node appended
      */
    def appendChild[T /* <: typings.nodeHtmlParser.nodeMod.default */](node: T): T = js.native
    
    /**
      * Get attributes
      * @return {Object} parsed and unescaped attributes
      */
    def attributes: Attributes = js.native
    
    var classNames: js.Array[String] = js.native
    
    /**
      * Exchanges given child with new child
      * @param {HTMLElement} oldNode     node to exchange
      * @param {HTMLElement} newNode     new node
      */
    def exchangeChild(oldNode: typings.nodeHtmlParser.nodeMod.default, newNode: typings.nodeHtmlParser.nodeMod.default): Unit = js.native
    
    /**
      * Get first child node
      * @return {Node} first child node
      */
    def firstChild: typings.nodeHtmlParser.nodeMod.default = js.native
    
    /**
      * Get an attribute
      * @return {string} value of the attribute
      */
    def getAttribute(key: String): js.UndefOr[String] = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    var id: String = js.native
    
    def innerHTML: String = js.native
    
    def insertAdjacentHTML(where: InsertPosition, html: String): Unit = js.native
    
    /**
      * Get last child node
      * @return {Node} last child node
      */
    def lastChild: typings.nodeHtmlParser.nodeMod.default = js.native
    
    def nextElementSibling: HTMLElement = js.native
    
    def nextSibling: typings.nodeHtmlParser.nodeMod.default = js.native
    
    def outerHTML: String = js.native
    
    var parentNode: typings.nodeHtmlParser.nodeMod.default = js.native
    
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
    
    /* private */ var rawAttrs: js.Any = js.native
    
    var rawTagName: String = js.native
    
    /**
      * Get escpaed (as-it) text value of current node and its children.
      * @return {string} text content
      */
    @JSName("rawText")
    def rawText_MHTMLElement: String = js.native
    
    /**
      * Remove current element
      */
    def remove(): Unit = js.native
    
    def removeAttribute(key: String): Unit = js.native
    
    /**
      * Remove Child element from childNodes array
      * @param {HTMLElement} node     node to remove
      */
    def removeChild(node: typings.nodeHtmlParser.nodeMod.default): Unit = js.native
    
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
    def set_content(content: js.Array[typings.nodeHtmlParser.nodeMod.default]): Unit = js.native
    def set_content(content: js.Array[typings.nodeHtmlParser.nodeMod.default], options: Options): Unit = js.native
    def set_content(content: typings.nodeHtmlParser.nodeMod.default): Unit = js.native
    def set_content(content: typings.nodeHtmlParser.nodeMod.default, options: Options): Unit = js.native
    
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
    @JSName("text")
    def text_MHTMLElement: String = js.native
    
    /**
      * Trim element from right (in block) after seeing pattern in a TextNode.
      * @param  {RegExp} pattern pattern to find
      * @return {HTMLElement}    reference to current node
      */
    def trimRight(pattern: RegExp): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeHtmlParser.nodeHtmlParserStrings.beforebegin
    - typings.nodeHtmlParser.nodeHtmlParserStrings.afterbegin
    - typings.nodeHtmlParser.nodeHtmlParserStrings.beforeend
    - typings.nodeHtmlParser.nodeHtmlParserStrings.afterend
  */
  trait InsertPosition extends StObject
  object InsertPosition {
    
    inline def afterbegin: typings.nodeHtmlParser.nodeHtmlParserStrings.afterbegin = "afterbegin".asInstanceOf[typings.nodeHtmlParser.nodeHtmlParserStrings.afterbegin]
    
    inline def afterend: typings.nodeHtmlParser.nodeHtmlParserStrings.afterend = "afterend".asInstanceOf[typings.nodeHtmlParser.nodeHtmlParserStrings.afterend]
    
    inline def beforebegin: typings.nodeHtmlParser.nodeHtmlParserStrings.beforebegin = "beforebegin".asInstanceOf[typings.nodeHtmlParser.nodeHtmlParserStrings.beforebegin]
    
    inline def beforeend: typings.nodeHtmlParser.nodeHtmlParserStrings.beforeend = "beforeend".asInstanceOf[typings.nodeHtmlParser.nodeHtmlParserStrings.beforeend]
  }
  
  trait KeyAttributes extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object KeyAttributes {
    
    inline def apply(): KeyAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyAttributes]
    }
    
    extension [Self <: KeyAttributes](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var blockTextElements: StringDictionary[Boolean]
    
    var comment: Boolean
    
    var lowerCaseTagName: Boolean
  }
  object Options {
    
    inline def apply(blockTextElements: StringDictionary[Boolean], comment: Boolean, lowerCaseTagName: Boolean): Options = {
      val __obj = js.Dynamic.literal(blockTextElements = blockTextElements.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], lowerCaseTagName = lowerCaseTagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlockTextElements(value: StringDictionary[Boolean]): Self = StObject.set(x, "blockTextElements", value.asInstanceOf[js.Any])
      
      inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
    }
  }
  
  type RawAttributes = StringDictionary[String]
}
