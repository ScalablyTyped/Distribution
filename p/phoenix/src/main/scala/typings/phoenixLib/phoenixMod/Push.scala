package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Push extends js.Object {
  def receive(status: java.lang.String, callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]): Push
  def resend(timeout: scala.Double): scala.Unit
  def send(): scala.Unit
}

object Push {
  @scala.inline
  def apply(
    receive: js.Function2[java.lang.String, js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit], Push],
    resend: js.Function1[scala.Double, scala.Unit],
    send: js.Function0[scala.Unit]
  ): Push = {
    val __obj = js.Dynamic.literal(receive = receive, resend = resend, send = send)
  
    __obj.asInstanceOf[Push]
  }
}

