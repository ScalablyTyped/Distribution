package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToRawChangeValue[P] extends js.Object {
  def toRawChangeValue(value: P): js.Any
}

object Anon_ToRawChangeValue {
  @scala.inline
  def apply[P](toRawChangeValue: js.Function1[P, js.Any]): Anon_ToRawChangeValue[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toRawChangeValue")(toRawChangeValue)
    __obj.asInstanceOf[Anon_ToRawChangeValue[P]]
  }
}

