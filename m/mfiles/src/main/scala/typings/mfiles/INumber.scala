package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber extends js.Object {
  var Value: Double
  def Clone(): INumber
}

object INumber {
  @scala.inline
  def apply(Clone: () => INumber, Value: Double): INumber = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
}

