package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Push")
@js.native
class Push protected () extends js.Object {
  def this(channel: Channel, event: java.lang.String, payload: js.Object, timeout: scala.Double) = this()
  def receive(status: java.lang.String, callback: js.Function1[/* response */ js.UndefOr[js.Any], _]): this.type = js.native
  def resend(timeout: scala.Double): scala.Unit = js.native
  def send(): scala.Unit = js.native
}

