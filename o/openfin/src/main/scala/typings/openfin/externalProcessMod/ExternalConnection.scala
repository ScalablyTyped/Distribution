package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalConnection extends js.Object {
  var token: String
  var uuid: String
}

object ExternalConnection {
  @scala.inline
  def apply(token: String, uuid: String): ExternalConnection = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalConnection]
  }
}

