package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToken extends js.Object {
  /**
    * this will be unique each time
    */
  var token: String
  /**
    * "remote-connection-uuid"
    */
  var uuid: String
}

object AnonToken {
  @scala.inline
  def apply(token: String, uuid: String): AnonToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonToken]
  }
}

