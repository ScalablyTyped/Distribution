package typings.novaEditorNode.global

import typings.novaEditorNode.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  def apply(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  def apply(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}

