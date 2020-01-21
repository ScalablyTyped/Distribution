package typings.node.eventsMod

import typings.node.AnonOnce
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMEventTarget extends js.Object {
  def addEventListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def addEventListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit], opts: AnonOnce): js.Any = js.native
}

