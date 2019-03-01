package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prepared extends js.Object {
  var prepared: scala.Boolean
  var value: java.lang.String
}

object Anon_Prepared {
  @scala.inline
  def apply(prepared: scala.Boolean, value: java.lang.String): Anon_Prepared = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prepared")(prepared)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Prepared]
  }
}

