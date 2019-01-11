package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(html: java.lang.String): parse5Lib.parse5Mod.Document = js.native
  def parse(html: java.lang.String, options: parse5Lib.parse5Mod.ParserOptions): parse5Lib.parse5Mod.Document = js.native
  def parseFragment(fragmentContext: parse5Lib.parse5Mod.Element, html: java.lang.String): parse5Lib.parse5Mod.DocumentFragment = js.native
  def parseFragment(
    fragmentContext: parse5Lib.parse5Mod.Element,
    html: java.lang.String,
    options: parse5Lib.parse5Mod.ParserOptions
  ): parse5Lib.parse5Mod.DocumentFragment = js.native
  def parseFragment(html: java.lang.String): parse5Lib.parse5Mod.DocumentFragment = js.native
  def parseFragment(html: java.lang.String, options: parse5Lib.parse5Mod.ParserOptions): parse5Lib.parse5Mod.DocumentFragment = js.native
  def serialize(node: parse5Lib.parse5Mod.Node): java.lang.String = js.native
  def serialize(node: parse5Lib.parse5Mod.Node, options: parse5Lib.parse5Mod.SerializerOptions): java.lang.String = js.native
}

