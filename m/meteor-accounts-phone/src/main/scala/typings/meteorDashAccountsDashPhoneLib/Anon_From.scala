package typings
package meteorDashAccountsDashPhoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: java.lang.String
  var text: js.Function
}

object Anon_From {
  @scala.inline
  def apply(from: java.lang.String, text: js.Function): Anon_From = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_From]
  }
}

