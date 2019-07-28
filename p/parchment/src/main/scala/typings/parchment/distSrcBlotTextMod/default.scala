package typings.parchment.distSrcBlotTextMod

import typings.parchment.distSrcRegistryMod.Scope
import typings.std.Node
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/text", JSImport.Default)
@js.native
class default protected () extends TextBlot {
  def this(node: Node) = this()
}

/* static members */
@JSImport("parchment/dist/src/blot/text", JSImport.Default)
@js.native
object default extends js.Object {
  var blotName: String = js.native
  var scope: Scope = js.native
  def create(value: String): Text = js.native
  def value(domNode: Text): String = js.native
}

