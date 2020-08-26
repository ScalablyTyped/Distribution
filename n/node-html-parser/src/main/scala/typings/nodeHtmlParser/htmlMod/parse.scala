package typings.nodeHtmlParser.htmlMod

import typings.nodeHtmlParser.anon.HTMLElementvalidboolean
import typings.nodeHtmlParser.anon.OptionsnoFixfalse
import typings.nodeHtmlParser.anon.OptionsnoFixtrue
import typings.nodeHtmlParser.anon.Valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-html-parser/dist/nodes/html", "parse")
@js.native
object parse extends js.Object {
  def apply(data: String): HTMLElementvalidboolean = js.native
  def apply(data: String, options: OptionsnoFixfalse): HTMLElementvalidboolean = js.native
  def apply(data: String, options: OptionsnoFixtrue): (HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
  def apply(data: String, options: Options): HTMLElementvalidboolean = js.native
}

