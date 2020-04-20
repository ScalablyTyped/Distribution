package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSuccess extends js.Object {
  var status: String
  var token: String
  var uuid: String
}

object UpdateSuccess {
  @scala.inline
  def apply(status: String, token: String, uuid: String): UpdateSuccess = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSuccess]
  }
}

