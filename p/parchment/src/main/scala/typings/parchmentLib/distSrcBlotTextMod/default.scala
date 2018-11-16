package typings
package parchmentLib.distSrcBlotTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/text", JSImport.Default)
@js.native
class default protected () extends TextBlot {
  def this(node: stdLib.Node) = this()
}

@JSImport("parchment/dist/src/blot/text", JSImport.Default)
@js.native
object default extends js.Object {
  var blotName: java.lang.String = js.native
  var scope: parchmentLib.distSrcRegistryMod.Scope = js.native
  def create(value: java.lang.String): stdLib.Text = js.native
  def value(domNode: stdLib.Text): java.lang.String = js.native
}

