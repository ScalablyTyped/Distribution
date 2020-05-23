package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * this will be unique each time
    */
  var token: String
  /**
    * "remote-connection-uuid"
    */
  var uuid: String
}

object Token {
  @scala.inline
  def apply(token: String, uuid: String): Token = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

