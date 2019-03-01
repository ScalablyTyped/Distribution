package typings
package parseLib.ParseNs.OpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment
  extends parseLib.ParseNs.IBaseObject {
  var amount: scala.Double
}

object Increment {
  @scala.inline
  def apply(amount: scala.Double, toJSON: js.Function0[js.Any]): Increment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Increment]
  }
}

