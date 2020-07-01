package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcssSelectorParser.postcssSelectorParserStrings.`class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base[Value /* <: js.UndefOr[String] */, ParentType /* <: js.UndefOr[Container[String]] */] extends js.Object {
  var parent: ParentType
  var rawSpaceAfter: String
  var rawSpaceBefore: String
  var source: js.UndefOr[NodeSource] = js.undefined
  var sourceIndex: Double
  var spaces: Spaces
  var `type`: typings.postcssSelectorParser.postcssSelectorParserStrings.tag | typings.postcssSelectorParser.postcssSelectorParserStrings.string | typings.postcssSelectorParser.postcssSelectorParserStrings.selector | typings.postcssSelectorParser.postcssSelectorParserStrings.root | typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typings.postcssSelectorParser.postcssSelectorParserStrings.nesting | typings.postcssSelectorParser.postcssSelectorParserStrings.id | typings.postcssSelectorParser.postcssSelectorParserStrings.comment | typings.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typings.postcssSelectorParser.postcssSelectorParserStrings.attribute | typings.postcssSelectorParser.postcssSelectorParserStrings.universal
  var value: Value
  /**
    * Some non-standard syntax doesn't follow normal escaping rules for css.
    * This allows non standard syntax to be appended to an existing property
    * by specifying the escaped value. By specifying the escaped value,
    * illegal characters are allowed to be directly inserted into css output.
    * @param {string} name the property to set
    * @param {any} value the unescaped value of the property
    * @param {string} valueEscaped optional. the escaped value of the property.
    */
  def appendToPropertyAndEscape(name: String, value: js.Any, valueEscaped: String): Unit
  def clone(opts: StringDictionary[js.Any]): Node
  /**
    * Return whether this node includes the character at the position of the given line and column.
    * Returns undefined if the nodes lack sufficient source metadata to determine the position.
    * @param line 1-index based line number relative to the start of the selector.
    * @param column 1-index based column number relative to the start of the selector.
    */
  def isAtPosition(line: Double, column: Double): js.UndefOr[Boolean]
  def next(): Node
  def prev(): Node
  def remove(): Node
  def replaceWith(nodes: Node*): Node
  /**
    * Some non-standard syntax doesn't follow normal escaping rules for css,
    * this allows the escaped value to be specified directly, allowing illegal characters to be
    * directly inserted into css output.
    * @param name the property to set
    * @param value the unescaped value of the property
    * @param valueEscaped optional. the escaped value of the property.
    */
  def setPropertyAndEscape(name: String, value: js.Any, valueEscaped: String): Unit
  /**
    * When you want a value to passed through to CSS directly. This method
    * deletes the corresponding raw value causing the stringifier to fallback
    * to the unescaped value.
    * @param name the property to set.
    * @param value The value that is both escaped and unescaped.
    */
  def setPropertyWithoutEscape(name: String, value: js.Any): Unit
}

object Base {
  @scala.inline
  def apply[/* <: js.UndefOr[java.lang.String] */ Value, /* <: js.UndefOr[typings.postcssSelectorParser.mod.Container[java.lang.String]] */ ParentType](
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone: StringDictionary[js.Any] => Node,
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
    value: Value,
    source: NodeSource = null
  ): Base[Value, ParentType] = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), clone = js.Any.fromFunction1(clone), isAtPosition = js.Any.fromFunction2(isAtPosition), next = js.Any.fromFunction0(next), parent = parent.asInstanceOf[js.Any], prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[Value, ParentType]]
  }
}

