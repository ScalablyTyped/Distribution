package typings.mdastUtilToHast.mod

import typings.mdast.mod.Definition
import typings.mdastUtilDefinitions.mod.DefinitionCache
import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H extends js.Object {
  var dangerous: js.UndefOr[Boolean] = js.native
  @JSName("definition")
  var definition_Original: DefinitionCache = js.native
  var footNoteById: Definition = js.native
  var footnoreOrder: js.Array[String] = js.native
  var handlers: Handlers = js.native
  @JSName("unknownHandler")
  var unknownHandler_Original: Handler = js.native
  def apply(node: Node, tagName: String): Node = js.native
  def apply(node: Node, tagName: String, props: js.Object): Node = js.native
  def apply(node: Node, tagName: String, props: js.Object, children: js.Array[Node]): Node = js.native
  def augment(left: Node, right: Node): Node = js.native
  def definition(identifier: String): Definition | Null = js.native
  def unknownHandler(h: H, node: Node): js.Any = js.native
}

