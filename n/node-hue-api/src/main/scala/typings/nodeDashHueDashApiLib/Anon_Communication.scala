package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Communication extends js.Object {
  var communication: java.lang.String
  var incoming: scala.Boolean
  var outgoing: scala.Boolean
  var signedon: scala.Boolean
}

object Anon_Communication {
  @scala.inline
  def apply(
    communication: java.lang.String,
    incoming: scala.Boolean,
    outgoing: scala.Boolean,
    signedon: scala.Boolean
  ): Anon_Communication = {
    val __obj = js.Dynamic.literal(communication = communication, incoming = incoming, outgoing = outgoing, signedon = signedon)
  
    __obj.asInstanceOf[Anon_Communication]
  }
}

