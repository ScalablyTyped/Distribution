package typings.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommunication extends js.Object {
  var communication: String
  var incoming: Boolean
  var outgoing: Boolean
  var signedon: Boolean
}

object AnonCommunication {
  @scala.inline
  def apply(communication: String, incoming: Boolean, outgoing: Boolean, signedon: Boolean): AnonCommunication = {
    val __obj = js.Dynamic.literal(communication = communication.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], signedon = signedon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommunication]
  }
}

