package typings.phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def off(event: String, callback: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
  def off(event: String, callback: js.Function1[/* event */ js.Any, Unit], useCapture: Boolean): Unit = js.native
  def on(event: String, callback: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
  def on(event: String, callback: js.Function1[/* event */ js.Any, Unit], useCapture: Boolean): Unit = js.native
}

