package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Communication extends js.Object {
  var communication: String
  var incoming: Boolean
  var outgoing: Boolean
  var signedon: Boolean
}

object Communication {
  @scala.inline
  def apply(communication: String, incoming: Boolean, outgoing: Boolean, signedon: Boolean): Communication = {
    val __obj = js.Dynamic.literal(communication = communication.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], signedon = signedon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Communication]
  }
}

