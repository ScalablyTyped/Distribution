package typings.parse5.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(html: String): Document = js.native
  def parse(html: String, options: ParserOptions): Document = js.native
  def parseFragment(fragmentContext: Element, html: String): DocumentFragment = js.native
  def parseFragment(fragmentContext: Element, html: String, options: ParserOptions): DocumentFragment = js.native
  def parseFragment(html: String): DocumentFragment = js.native
  def parseFragment(html: String, options: ParserOptions): DocumentFragment = js.native
  def serialize(node: Node): String = js.native
  def serialize(node: Node, options: SerializerOptions): String = js.native
}

