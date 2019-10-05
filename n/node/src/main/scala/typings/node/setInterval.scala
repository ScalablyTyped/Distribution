package typings.node

import typings.node.NodeJS.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setInterval")
@js.native
object setInterval extends js.Object {
  def apply(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
}

