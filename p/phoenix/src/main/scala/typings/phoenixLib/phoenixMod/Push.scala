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

