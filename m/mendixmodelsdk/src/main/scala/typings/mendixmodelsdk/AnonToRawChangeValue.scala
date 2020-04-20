package typings.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToRawChangeValue[P] extends js.Object {
  def toRawChangeValue(value: P): js.Any
}

object AnonToRawChangeValue {
  @scala.inline
  def apply[P](toRawChangeValue: P => js.Any): AnonToRawChangeValue[P] = {
    val __obj = js.Dynamic.literal(toRawChangeValue = js.Any.fromFunction1(toRawChangeValue))
    __obj.asInstanceOf[AnonToRawChangeValue[P]]
  }
}

