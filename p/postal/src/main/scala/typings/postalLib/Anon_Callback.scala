package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  @JSName("callback")
  var callback_Original: ICallback[_] = js.native
  var channel: js.UndefOr[java.lang.String] = js.native
  var topic: java.lang.String = js.native
  def callback(data: js.Any, envelope: IEnvelope[_]): scala.Unit = js.native
}

