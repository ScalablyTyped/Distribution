package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Connection **/
trait Connection extends js.Object {
  var clientAddress: java.lang.String
  var close: js.Function
  var httpHeaders: js.Object
  var id: java.lang.String
  var onClose: js.Function
}

object Connection {
  @scala.inline
  def apply(
    clientAddress: java.lang.String,
    close: js.Function,
    httpHeaders: js.Object,
    id: java.lang.String,
    onClose: js.Function
  ): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientAddress")(clientAddress)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("httpHeaders")(httpHeaders)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("onClose")(onClose)
    __obj.asInstanceOf[Connection]
  }
}

