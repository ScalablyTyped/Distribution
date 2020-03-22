package typings.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Connection **/
trait Connection extends js.Object {
  var clientAddress: String
  var close: js.Function
  var httpHeaders: js.Object
  var id: String
  var onClose: js.Function
}

object Connection {
  @scala.inline
  def apply(
    clientAddress: String,
    close: js.Function,
    httpHeaders: js.Object,
    id: String,
    onClose: js.Function
  ): Connection = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

