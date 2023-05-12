package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcssSelectorParser.postcssSelectorParserStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def appendToPropertyAndEscape(name: String, value: Any, valueEscaped: String): Unit = js.native
  
  def clone(opts: StringDictionary[Any]): Node = js.native
  
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
  def setPropertyAndEscape(name: String, value: Any, valueEscaped: String): Unit = js.native
  
  /**
    * When you want a value to passed through to CSS directly. This method
    * deletes the corresponding raw value causing the stringifier to fallback
    * to the unescaped value.
    * @param name the property to set.
    * @param value The value that is both escaped and unescaped.
    */
  def setPropertyWithoutEscape(name: String, value: Any): Unit = js.native
  
  var source: js.UndefOr[NodeSource] = js.native
  
  var sourceIndex: Double = js.native
  
  var spaces: Spaces = js.native
  
  var `type`: typings.postcssSelectorParser.postcssSelectorParserStrings.tag | typings.postcssSelectorParser.postcssSelectorParserStrings.string | typings.postcssSelectorParser.postcssSelectorParserStrings.selector | typings.postcssSelectorParser.postcssSelectorParserStrings.root | typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typings.postcssSelectorParser.postcssSelectorParserStrings.nesting | typings.postcssSelectorParser.postcssSelectorParserStrings.id | typings.postcssSelectorParser.postcssSelectorParserStrings.comment | typings.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typings.postcssSelectorParser.postcssSelectorParserStrings.attribute | typings.postcssSelectorParser.postcssSelectorParserStrings.universal = js.native
  
  var value: Value = js.native
}
