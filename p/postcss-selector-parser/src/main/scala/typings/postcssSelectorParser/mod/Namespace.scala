package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import typings.postcssSelectorParser.postcssSelectorParserStrings.`class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace[Value /* <: js.UndefOr[String] */]
  extends Base[Value, js.UndefOr[Container[String]]] {
  /**
    *  namespace prefix.
    */
  var namespace: String | `true`
  /**
    * A string representing the namespace suitable for output.
    */
  val namespaceString: String
  /** alias for namespace */
  var ns: String | `true`
  /**
    * If a namespace exists, prefix the value provided with it, separated by |.
    */
  def qualifiedName(value: String): String
}

object Namespace {
  @scala.inline
  def apply[/* <: js.UndefOr[java.lang.String] */ Value](
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone: StringDictionary[js.Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    namespace: String | `true`,
    namespaceString: String,
    next: () => Node,
    ns: String | `true`,
    prev: () => Node,
    qualifiedName: String => String,
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
    parent: Container[String] = null,
    source: NodeSource = null
  ): Namespace[Value] = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), clone = js.Any.fromFunction1(clone), isAtPosition = js.Any.fromFunction2(isAtPosition), namespace = namespace.asInstanceOf[js.Any], namespaceString = namespaceString.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), ns = ns.asInstanceOf[js.Any], prev = js.Any.fromFunction0(prev), qualifiedName = js.Any.fromFunction1(qualifiedName), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace[Value]]
  }
}

