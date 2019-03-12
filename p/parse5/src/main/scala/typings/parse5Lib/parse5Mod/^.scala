package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(html: java.lang.String): Document = js.native
  def parse(html: java.lang.String, options: ParserOptions): Document = js.native
  def parseFragment(fragmentContext: Element, html: java.lang.String): DocumentFragment = js.native
  def parseFragment(fragmentContext: Element, html: java.lang.String, options: ParserOptions): DocumentFragment = js.native
  def parseFragment(html: java.lang.String): DocumentFragment = js.native
  def parseFragment(html: java.lang.String, options: ParserOptions): DocumentFragment = js.native
  def serialize(node: Node): java.lang.String = js.native
  def serialize(node: Node, options: SerializerOptions): java.lang.String = js.native
}

