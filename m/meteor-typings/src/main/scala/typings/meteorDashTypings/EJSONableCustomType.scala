package typings.meteorDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONableCustomType extends js.Object {
  def equals(other: js.Object): Boolean
  def toJSONValue(): JSONable
  def typeName(): String
}

object EJSONableCustomType {
  @scala.inline
  def apply(
    clone: () => EJSONableCustomType,
    equals: js.Object => Boolean,
    toJSONValue: () => JSONable,
    typeName: () => String
  ): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), equals = js.Any.fromFunction1(equals), toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
  
    __obj.asInstanceOf[EJSONableCustomType]
  }
}

