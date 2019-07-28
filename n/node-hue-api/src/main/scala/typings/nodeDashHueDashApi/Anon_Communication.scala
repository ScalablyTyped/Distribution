package typings.nodeDashHueDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Communication extends js.Object {
  var communication: String
  var incoming: Boolean
  var outgoing: Boolean
  var signedon: Boolean
}

object Anon_Communication {
  @scala.inline
  def apply(communication: String, incoming: Boolean, outgoing: Boolean, signedon: Boolean): Anon_Communication = {
    val __obj = js.Dynamic.literal(communication = communication, incoming = incoming, outgoing = outgoing, signedon = signedon)
  
    __obj.asInstanceOf[Anon_Communication]
  }
}

