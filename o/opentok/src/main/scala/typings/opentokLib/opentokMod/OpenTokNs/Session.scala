package typings
package opentokLib.opentokMod.OpenTokNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var sessionId: java.lang.String
}

object Session {
  @scala.inline
  def apply(sessionId: java.lang.String): Session = {
    val __obj = js.Dynamic.literal(sessionId = sessionId)
  
    __obj.asInstanceOf[Session]
  }
}

