package typings.phonegapNfc

import typings.phonegapNfc.phonegapNfcStrings.deviceready
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  @JSName("addEventListener")
  def addEventListener_deviceready(`type`: deviceready, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceready(`type`: deviceready, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
}

