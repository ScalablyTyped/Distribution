package typings.prefixfree

import org.scalablytyped.runtime.TopLevel
import typings.prefixfree.StyleFix.StyleFixer
import typings.std.Element
import typings.std.ElementCSSInlineStyle
import typings.std.HTMLLinkElement
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleFix extends js.Object {
  @JSName("fix")
  var fix_Original: StyleFixer = js.native
  var fixers: js.UndefOr[js.Array[StyleFixer]] = js.native
  var optIn: Boolean = js.native
  def camelCase(str: String): String = js.native
  def deCamelCase(str: String): String = js.native
  def fix(css: String, raw: Boolean, element: Element): String = js.native
  def link(link: HTMLLinkElement): Unit = js.native
  def process(): Unit = js.native
  def register(fixer: StyleFixer): Unit = js.native
  def register(fixer: StyleFixer, index: Double): Unit = js.native
  def styleAttribute(element: ElementCSSInlineStyle): Unit = js.native
  def styleElement(style: HTMLStyleElement): Unit = js.native
}

@JSGlobal("StyleFix")
@js.native
object StyleFix extends TopLevel[StyleFix] {
  type StyleFixer = js.Function3[/* css */ String, /* raw */ Boolean, /* element */ Element, String]
}

