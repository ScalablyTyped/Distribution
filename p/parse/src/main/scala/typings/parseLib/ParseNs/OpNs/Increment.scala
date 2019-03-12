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
  def apply(amount: scala.Double, toJSON: () => js.Any): Increment = {
    val __obj = js.Dynamic.literal(amount = amount, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Increment]
  }
}

