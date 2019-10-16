package typings.node.eventsMod

import typings.node.Anon_Once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMEventTarget extends js.Object {
  def addEventListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def addEventListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit], opts: Anon_Once): js.Any = js.native
}

