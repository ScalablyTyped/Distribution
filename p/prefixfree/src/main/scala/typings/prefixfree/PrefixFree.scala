package typings.prefixfree

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.prefixfree.PrefixFree.KnownPrefixCSS
import typings.prefixfree.PrefixFree.KnownPrefixJS
import typings.prefixfree.StyleFix.StyleFixer
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixFree extends js.Object {
  /**
  	 * The prefix used for CSS properties in `CSSStyleDeclaration`.
  	 *
  	 * Eg.: `Moz`, `Ms`, `O` or `Webkit`.
  	 */
  var Prefix: KnownPrefixJS | String = js.native
  var atrules: js.Array[String] = js.native
  var functions: js.Array[String] = js.native
  var keywords: js.Array[String] = js.native
  /**
  	 * The prefix used for CSS properties.
  	 *
  	 * Eg.: `-moz-`, `-ms-`, `-o-` or `-webkit-`.
  	 */
  var prefix: KnownPrefixCSS | String = js.native
  @JSName("prefixCSS")
  var prefixCSS_Original: StyleFixer = js.native
  var properties: js.Array[String] = js.native
  var selectorMap: StringDictionary[String] = js.native
  var selectors: js.Array[String] = js.native
  var valueProperties: js.Array[String] = js.native
  def prefixCSS(css: String, raw: Boolean, element: Element): String = js.native
  def prefixProperty(property: String): String = js.native
  def prefixProperty(property: String, camelCase: Boolean): String = js.native
  def prefixSelector(selector: String): String = js.native
  def property(property: String): String = js.native
  def value(value: String): String = js.native
  def value(value: String, property: String): String = js.native
}

// PrefixFree
@JSGlobal("PrefixFree")
@js.native
object PrefixFree extends TopLevel[PrefixFree] {
  /** The known prefixes used for CSS properties. */
  /* Rewritten from type alias, can be one of: 
    - typings.prefixfree.prefixfreeStrings.`-moz-`
    - typings.prefixfree.prefixfreeStrings.`-ms-`
    - typings.prefixfree.prefixfreeStrings.`-o-`
    - typings.prefixfree.prefixfreeStrings.`-webkit-`
  */
  trait KnownPrefixCSS extends js.Object
  
  /** The known prefixes used for CSS properties in `CSSStyleDeclaration`. */
  /* Rewritten from type alias, can be one of: 
    - typings.prefixfree.prefixfreeStrings.Moz
    - typings.prefixfree.prefixfreeStrings.Ms
    - typings.prefixfree.prefixfreeStrings.O
    - typings.prefixfree.prefixfreeStrings.Webkit
  */
  trait KnownPrefixJS extends js.Object
  
}

