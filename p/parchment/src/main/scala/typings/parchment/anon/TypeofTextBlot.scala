package typings.parchment.anon

import org.scalablytyped.runtime.Instantiable1
import typings.parchment.registryMod.Scope
import typings.parchment.textMod.default
import typings.std.Node
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTextBlot extends Instantiable1[/* node */ Node, default] {
  var blotName: String = js.native
  var scope: Scope = js.native
  def create(value: String): Text = js.native
  def value(domNode: Text): String = js.native
}

