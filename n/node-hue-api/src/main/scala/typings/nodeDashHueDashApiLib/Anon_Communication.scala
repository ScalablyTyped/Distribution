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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("communication")(communication)
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("outgoing")(outgoing)
    __obj.updateDynamic("signedon")(signedon)
    __obj.asInstanceOf[Anon_Communication]
  }
}

