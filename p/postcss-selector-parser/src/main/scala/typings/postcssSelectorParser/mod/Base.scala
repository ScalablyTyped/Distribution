package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcssSelectorParser.postcssSelectorParserStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base[Value /* <: js.UndefOr[String] */, ParentType /* <: js.UndefOr[Container[String, Node]] */] extends StObject {
  
  /**
    * Some non-standard syntax doesn't follow normal escaping rules for css.
    * This allows non standard syntax to be appended to an existing property
    * by specifying the escaped value. By specifying the escaped value,
    * illegal characters are allowed to be directly inserted into css output.
    * @param {string} name the property to set
    * @param {any} value the unescaped value of the property
    * @param {string} valueEscaped optional. the escaped value of the property.
    */
  def appendToPropertyAndEscape(name: String, value: js.Any, valueEscaped: String): Unit = js.native
  
  def clone(opts: StringDictionary[js.Any]): Node = js.native
  
  /**
    * Return whether this node includes the character at the position of the given line and column.
    * Returns undefined if the nodes lack sufficient source metadata to determine the position.
    * @param line 1-index based line number relative to the start of the selector.
    * @param column 1-index based column number relative to the start of the selector.
    */
  def isAtPosition(line: Double, column: Double): js.UndefOr[Boolean] = js.native
  
  def next(): Node = js.native
  
  var parent: ParentType = js.native
  
  def prev(): Node = js.native
  
  var rawSpaceAfter: String = js.native
  
  var rawSpaceBefore: String = js.native
  
  def remove(): Node = js.native
  
  def replaceWith(nodes: Node*): Node = js.native
  
  /**
    * Some non-standard syntax doesn't follow normal escaping rules for css,
    * this allows the escaped value to be specified directly, allowing illegal characters to be
    * directly inserted into css output.
    * @param name the property to set
    * @param value the unescaped value of the property
    * @param valueEscaped optional. the escaped value of the property.
    */
  def setPropertyAndEscape(name: String, value: js.Any, valueEscaped: String): Unit = js.native
  
  /**
    * When you want a value to passed through to CSS directly. This method
    * deletes the corresponding raw value causing the stringifier to fallback
    * to the unescaped value.
    * @param name the property to set.
    * @param value The value that is both escaped and unescaped.
    */
  def setPropertyWithoutEscape(name: String, value: js.Any): Unit = js.native
  
  var source: js.UndefOr[NodeSource] = js.native
  
  var sourceIndex: Double = js.native
  
  var spaces: Spaces = js.native
  
  var `type`: typings.postcssSelectorParser.postcssSelectorParserStrings.tag | typings.postcssSelectorParser.postcssSelectorParserStrings.string | typings.postcssSelectorParser.postcssSelectorParserStrings.selector | typings.postcssSelectorParser.postcssSelectorParserStrings.root | typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typings.postcssSelectorParser.postcssSelectorParserStrings.nesting | typings.postcssSelectorParser.postcssSelectorParserStrings.id | typings.postcssSelectorParser.postcssSelectorParserStrings.comment | typings.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typings.postcssSelectorParser.postcssSelectorParserStrings.attribute | typings.postcssSelectorParser.postcssSelectorParserStrings.universal = js.native
  
  var value: Value = js.native
}
object Base {
  
  @scala.inline
  def apply[Value /* <: js.UndefOr[String] */, ParentType /* <: js.UndefOr[Container[String, Node]] */](
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone_ : StringDictionary[js.Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    next: () => Node,
    parent: ParentType,
    prev: () => Node,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: () => Node,
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, js.Any, String) => Unit,
    setPropertyWithoutEscape: (String, js.Any) => Unit,
    sourceIndex: Double,
    spaces: Spaces,
    `type`: typings.postcssSelectorParser.postcssSelectorParserStrings.tag | typings.postcssSelectorParser.postcssSelectorParserStrings.string | typings.postcssSelectorParser.postcssSelectorParserStrings.selector | typings.postcssSelectorParser.postcssSelectorParserStrings.root | typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typings.postcssSelectorParser.postcssSelectorParserStrings.nesting | typings.postcssSelectorParser.postcssSelectorParserStrings.id | typings.postcssSelectorParser.postcssSelectorParserStrings.comment | typings.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typings.postcssSelectorParser.postcssSelectorParserStrings.attribute | typings.postcssSelectorParser.postcssSelectorParserStrings.universal,
    value: Value
  ): Base[Value, ParentType] = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), isAtPosition = js.Any.fromFunction2(isAtPosition), next = js.Any.fromFunction0(next), parent = parent.asInstanceOf[js.Any], prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[Value, ParentType]]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base[_, _], Value /* <: js.UndefOr[String] */, ParentType /* <: js.UndefOr[Container[String, Node]] */] (val x: Self with (Base[Value, ParentType])) extends AnyVal {
    
    @scala.inline
    def setAppendToPropertyAndEscape(value: (String, js.Any, String) => Unit): Self = StObject.set(x, "appendToPropertyAndEscape", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClone_(value: StringDictionary[js.Any] => Node): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAtPosition(value: (Double, Double) => js.UndefOr[Boolean]): Self = StObject.set(x, "isAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNext(value: () => Node): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: ParentType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: () => Node): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRawSpaceAfter(value: String): Self = StObject.set(x, "rawSpaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawSpaceBefore(value: String): Self = StObject.set(x, "rawSpaceBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Node): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node => Node): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertyAndEscape(value: (String, js.Any, String) => Unit): Self = StObject.set(x, "setPropertyAndEscape", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPropertyWithoutEscape(value: (String, js.Any) => Unit): Self = StObject.set(x, "setPropertyWithoutEscape", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSource(value: NodeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSpaces(value: Spaces): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: typings.postcssSelectorParser.postcssSelectorParserStrings.tag | typings.postcssSelectorParser.postcssSelectorParserStrings.string | typings.postcssSelectorParser.postcssSelectorParserStrings.selector | typings.postcssSelectorParser.postcssSelectorParserStrings.root | typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typings.postcssSelectorParser.postcssSelectorParserStrings.nesting | typings.postcssSelectorParser.postcssSelectorParserStrings.id | typings.postcssSelectorParser.postcssSelectorParserStrings.comment | typings.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typings.postcssSelectorParser.postcssSelectorParserStrings.attribute | typings.postcssSelectorParser.postcssSelectorParserStrings.universal
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
