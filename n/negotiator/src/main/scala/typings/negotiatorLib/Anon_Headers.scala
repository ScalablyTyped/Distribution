package typings
package negotiatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: negotiatorLib.negotiatorMod.NegotiatorNs.Headers
}

object Anon_Headers {
  @scala.inline
  def apply(headers: negotiatorLib.negotiatorMod.NegotiatorNs.Headers): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_Headers]
  }
}

