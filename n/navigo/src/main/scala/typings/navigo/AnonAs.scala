package typings.navigo

import typings.navigo.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs extends js.Object {
  var as: String
  def uses(params: Params, query: String): Unit
}

object AnonAs {
  @scala.inline
  def apply(as: String, uses: (Params, String) => Unit): AnonAs = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], uses = js.Any.fromFunction2(uses))
    __obj.asInstanceOf[AnonAs]
  }
}

