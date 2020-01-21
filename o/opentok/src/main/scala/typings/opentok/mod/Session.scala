package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var sessionId: String
}

object Session {
  @scala.inline
  def apply(sessionId: String): Session = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Session]
  }
}

