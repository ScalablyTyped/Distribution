package typings.mendixmodelsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRawChangeValue[P] extends js.Object {
  def toRawChangeValue(value: P): js.Any
}

object ToRawChangeValue {
  @scala.inline
  def apply[P](toRawChangeValue: P => js.Any): ToRawChangeValue[P] = {
    val __obj = js.Dynamic.literal(toRawChangeValue = js.Any.fromFunction1(toRawChangeValue))
    __obj.asInstanceOf[ToRawChangeValue[P]]
  }
}

