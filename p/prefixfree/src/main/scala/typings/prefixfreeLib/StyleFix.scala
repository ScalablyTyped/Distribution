package typings
package prefixfreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleFix extends js.Object {
  @JSName("fix")
  var fix_Original: prefixfreeLib.StyleFixNs.StyleFixer = js.native
  var fixers: js.UndefOr[js.Array[prefixfreeLib.StyleFixNs.StyleFixer]] = js.native
  var optIn: scala.Boolean = js.native
  def camelCase(str: java.lang.String): java.lang.String = js.native
  def deCamelCase(str: java.lang.String): java.lang.String = js.native
  def fix(css: java.lang.String, raw: scala.Boolean, element: stdLib.Element): java.lang.String = js.native
  def link(link: stdLib.HTMLLinkElement): scala.Unit = js.native
  def process(): scala.Unit = js.native
  def register(fixer: prefixfreeLib.StyleFixNs.StyleFixer): scala.Unit = js.native
  def register(fixer: prefixfreeLib.StyleFixNs.StyleFixer, index: scala.Double): scala.Unit = js.native
  def styleAttribute(element: stdLib.ElementCSSInlineStyle): scala.Unit = js.native
  def styleElement(style: stdLib.HTMLStyleElement): scala.Unit = js.native
}

