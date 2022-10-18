package typings.nodeHtmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHtmlParser.anon.ClosingSlash
import typings.nodeHtmlParser.anon.PartialOptions
import typings.std.IterableIterator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesHtmlMod {
  
  @JSImport("node-html-parser/dist/nodes/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-html-parser/dist/nodes/html", JSImport.Default)
  @js.native
  open class default protected () extends HTMLElement {
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
      parentNode: HTMLElement,
      range: js.Tuple2[Double, Double]
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double],
      voidTag: typings.nodeHtmlParser.distVoidTagMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: HTMLElement,
      range: js.Tuple2[Double, Double],
      voidTag: typings.nodeHtmlParser.distVoidTagMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double],
      voidTag: Unit,
      _parseOptions: PartialOptions
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: Null,
      range: js.Tuple2[Double, Double],
      voidTag: typings.nodeHtmlParser.distVoidTagMod.default,
      _parseOptions: PartialOptions
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: HTMLElement,
      range: js.Tuple2[Double, Double],
      voidTag: Unit,
      _parseOptions: PartialOptions
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: HTMLElement,
      range: js.Tuple2[Double, Double],
      voidTag: typings.nodeHtmlParser.distVoidTagMod.default,
      _parseOptions: PartialOptions
    ) = this()
  }
  
  inline def baseParse(data: String): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("base_parse")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def baseParse(data: String, options: PartialOptions): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("base_parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def parse(data: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def parse(data: String, options: PartialOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  type Attributes = StringDictionary[String]
  
  @js.native
  trait DOMTokenList extends StObject {
    
    /* private */ var _afterUpdate: Any = js.native
    
    /* private */ var _set: Any = js.native
    
    /* private */ var _validate: Any = js.native
    
    def add(c: String): Unit = js.native
    
    def contains(c: String): Boolean = js.native
    
    def length: Double = js.native
    
    def remove(c: String): Unit = js.native
    
    def replace(c1: String, c2: String): Unit = js.native
    
    def toggle(c: String): Unit = js.native
    
    def value: js.Array[String] = js.native
    
    def values(): IterableIterator[String] = js.native
  }
  
  @js.native
  trait HTMLElement
    extends typings.nodeHtmlParser.distNodesNodeMod.default {
    
    /* private */ var _attrs: Any = js.native
    
    /* private */ var _parseOptions: Any = js.native
    
    /* private */ var _rawAttrs: Any = js.native
    
    /**
      * Append a child node to childNodes
      * @param  {Node} node node to append
      * @return {Node}      node appended
      */
    def appendChild[T /* <: typings.nodeHtmlParser.distNodesNodeMod.default */](node: T): T = js.native
    
    def attributes: Record[String, String] = js.native
    
    /**
      * Get attributes
      * @access private
      * @return {Object} parsed and unescaped attributes
      */
    def attrs: Attributes = js.native
    
    var classList: DOMTokenList = js.native
    
    def classNames: String = js.native
    
    /**
      * traverses the Element and its parents (heading toward the document root) until it finds a node that matches the provided selector string. Will return itself or the matching ancestor. If no such element exists, it returns null.
      * @param selector a DOMString containing a selector list
      */
    def closest(selector: String): typings.nodeHtmlParser.distNodesNodeMod.default = js.native
    
    /**
      * Exchanges given child with new child
      * @param {HTMLElement} oldNode     node to exchange
      * @param {HTMLElement} newNode     new node
      */
    def exchangeChild(
      oldNode: typings.nodeHtmlParser.distNodesNodeMod.default,
      newNode: typings.nodeHtmlParser.distNodesNodeMod.default
    ): this.type = js.native
    
    /**
      * Get first child node
      * @return {Node} first child node
      */
    def firstChild: typings.nodeHtmlParser.distNodesNodeMod.default = js.native
    
    /**
      * Get an attribute
      * @return {string} value of the attribute
      */
    def getAttribute(key: String): js.UndefOr[String] = js.native
    
    /**
      * find element by it's id
      * @param {string} id the id of the element to select
      */
    def getElementById(id: String): HTMLElement = js.native
    
    /**
      * find elements by their tagName
      * @param {string} tagName the tagName of the elements to select
      */
    def getElementsByTagName(tagName: String): js.Array[HTMLElement] = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    var id: String = js.native
    
    def innerHTML: String = js.native
    def innerHTML_=(content: String): Unit = js.native
    
    def insertAdjacentHTML(where: InsertPosition, html: String): this.type = js.native
    
    def isVoidElement: Boolean = js.native
    
    /**
      * Get last child node
      * @return {Node} last child node
      */
    def lastChild: typings.nodeHtmlParser.distNodesNodeMod.default = js.native
    
    def localName: String = js.native
    
    def nextElementSibling: HTMLElement = js.native
    
    def nextSibling: typings.nodeHtmlParser.distNodesNodeMod.default = js.native
    
    def outerHTML: String = js.native
    
    def previousElementSibling: HTMLElement = js.native
    
    def previousSibling: typings.nodeHtmlParser.distNodesNodeMod.default = js.native
    
    /**
      * Query CSS Selector to find matching node.
      * @param  {string}         selector Simplified CSS selector
      * @return {(HTMLElement|null)}    matching node
      */
    def querySelector(selector: String): HTMLElement | Null = js.native
    
    /**
      * Query CSS selector to find matching nodes.
      * @param  {string}         selector Simplified CSS selector
      * @return {HTMLElement[]}  matching elements
      */
    def querySelectorAll(selector: String): js.Array[HTMLElement] = js.native
    
    /**
      * Quote attribute values
      * @param attr attribute value
      * @returns {string} quoted value
      */
    /* private */ var quoteAttribute: Any = js.native
    
    /**
      * Get escaped (as-is) attributes
      * @return {Object} parsed attributes
      */
    def rawAttributes: RawAttributes = js.native
    
    var rawAttrs: String = js.native
    
    var rawTagName: String = js.native
    
    /**
      * Get escpaed (as-it) text value of current node and its children.
      * @return {string} text content
      */
    @JSName("rawText")
    def rawText_MHTMLElement: String = js.native
    
    def removeAttribute(key: String): this.type = js.native
    
    /**
      * Remove Child element from childNodes array
      * @param {HTMLElement} node     node to remove
      */
    def removeChild(node: typings.nodeHtmlParser.distNodesNodeMod.default): this.type = js.native
    
    /**
      * Remove whitespaces in this sub tree.
      * @return {HTMLElement} pointer to this
      */
    def removeWhitespace(): this.type = js.native
    
    def replaceWith(nodes: (String | typings.nodeHtmlParser.distNodesNodeMod.default)*): this.type = js.native
    
    /**
      * Set an attribute value to the HTMLElement
      * @param {string} key The attribute name
      * @param {string} value The value to set, or null / undefined to remove an attribute
      */
    def setAttribute(key: String, value: String): this.type = js.native
    
    /**
      * Replace all the attributes of the HTMLElement by the provided attributes
      * @param {Attributes} attributes the new attribute set
      */
    def setAttributes(attributes: Attributes): this.type = js.native
    
    def set_content(content: String): this.type = js.native
    def set_content(content: String, options: PartialOptions): this.type = js.native
    def set_content(content: js.Array[typings.nodeHtmlParser.distNodesNodeMod.default]): this.type = js.native
    def set_content(content: js.Array[typings.nodeHtmlParser.distNodesNodeMod.default], options: PartialOptions): this.type = js.native
    def set_content(content: typings.nodeHtmlParser.distNodesNodeMod.default): this.type = js.native
    def set_content(content: typings.nodeHtmlParser.distNodesNodeMod.default, options: PartialOptions): this.type = js.native
    
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
    def tagName_=(newname: String): Unit = js.native
    
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
    def trimRight(pattern: js.RegExp): this.type = js.native
    
    /* private */ var voidTag: Any = js.native
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
    
    var comment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see PR #215 for explanation
      */
    var fixNestedATags: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseTagName: js.UndefOr[Boolean] = js.undefined
    
    var parseNoneClosedTags: js.UndefOr[Boolean] = js.undefined
    
    var voidTag: js.UndefOr[ClosingSlash] = js.undefined
  }
  object Options {
    
    inline def apply(blockTextElements: StringDictionary[Boolean]): Options = {
      val __obj = js.Dynamic.literal(blockTextElements = blockTextElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlockTextElements(value: StringDictionary[Boolean]): Self = StObject.set(x, "blockTextElements", value.asInstanceOf[js.Any])
      
      inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setFixNestedATags(value: Boolean): Self = StObject.set(x, "fixNestedATags", value.asInstanceOf[js.Any])
      
      inline def setFixNestedATagsUndefined: Self = StObject.set(x, "fixNestedATags", js.undefined)
      
      inline def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagNameUndefined: Self = StObject.set(x, "lowerCaseTagName", js.undefined)
      
      inline def setParseNoneClosedTags(value: Boolean): Self = StObject.set(x, "parseNoneClosedTags", value.asInstanceOf[js.Any])
      
      inline def setParseNoneClosedTagsUndefined: Self = StObject.set(x, "parseNoneClosedTags", js.undefined)
      
      inline def setVoidTag(value: ClosingSlash): Self = StObject.set(x, "voidTag", value.asInstanceOf[js.Any])
      
      inline def setVoidTagUndefined: Self = StObject.set(x, "voidTag", js.undefined)
    }
  }
  
  type RawAttributes = StringDictionary[String]
}
