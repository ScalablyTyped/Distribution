package typings.openfin.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/transport/transport", "Message")
@js.native
class Message[T] () extends js.Object {
  var action: String = js.native
  var correlationId: js.UndefOr[Double] = js.native
  var payload: T = js.native
}

