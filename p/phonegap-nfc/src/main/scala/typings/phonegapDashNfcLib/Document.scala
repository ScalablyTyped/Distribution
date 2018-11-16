package typings
package phonegapDashNfcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  @JSName("addEventListener")
  def addEventListener_deviceready(
    `type`: phonegapDashNfcLib.phonegapDashNfcLibStrings.deviceready,
    listener: js.Function1[/* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceready(
    `type`: phonegapDashNfcLib.phonegapDashNfcLibStrings.deviceready,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

