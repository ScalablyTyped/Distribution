package typings.nodeHtmlParser.htmlMod

import typings.nodeHtmlParser.anon.HTMLElementvalidboolean
import typings.nodeHtmlParser.anon.PartialOptions
import typings.nodeHtmlParser.anon.PartialOptionsnoFixfalse
import typings.nodeHtmlParser.anon.PartialOptionsnoFixtrue
import typings.nodeHtmlParser.anon.Valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-html-parser/dist/nodes/html", "parse")
@js.native
object parse extends js.Object {
  
  def apply(data: String): HTMLElementvalidboolean = js.native
  def apply(data: String, options: PartialOptions): HTMLElementvalidboolean = js.native
  def apply(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = js.native
  def apply(data: String, options: PartialOptionsnoFixtrue): (HTMLElement | typings.nodeHtmlParser.textMod.default) with Valid = js.native
}
