package typings
package prefixfreeLib

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
  var Prefix: prefixfreeLib.PrefixFreeNs.KnownPrefixJS | java.lang.String = js.native
  var atrules: js.Array[java.lang.String] = js.native
  var functions: js.Array[java.lang.String] = js.native
  var keywords: js.Array[java.lang.String] = js.native
  /**
  	 * The prefix used for CSS properties.
  	 *
  	 * Eg.: `-moz-`, `-ms-`, `-o-` or `-webkit-`.
  	 */
  var prefix: prefixfreeLib.PrefixFreeNs.KnownPrefixCSS | java.lang.String = js.native
  @JSName("prefixCSS")
  var prefixCSS_Original: prefixfreeLib.StyleFixNs.StyleFixer = js.native
  var properties: js.Array[java.lang.String] = js.native
  var selectorMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var selectors: js.Array[java.lang.String] = js.native
  var valueProperties: js.Array[java.lang.String] = js.native
  def prefixCSS(css: java.lang.String, raw: scala.Boolean, element: stdLib.Element): java.lang.String = js.native
  def prefixProperty(property: java.lang.String): java.lang.String = js.native
  def prefixProperty(property: java.lang.String, camelCase: scala.Boolean): java.lang.String = js.native
  def prefixSelector(selector: java.lang.String): java.lang.String = js.native
  def property(property: java.lang.String): java.lang.String = js.native
  def value(value: java.lang.String): java.lang.String = js.native
  def value(value: java.lang.String, property: java.lang.String): java.lang.String = js.native
}

