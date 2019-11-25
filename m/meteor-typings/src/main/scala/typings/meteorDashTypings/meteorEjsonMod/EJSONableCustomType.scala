package typings.meteorDashTypings.meteorEjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONableCustomType extends js.Object {
  def equals(other: js.Object): Boolean
  def toJSONValue(): typings.meteorDashTypings.meteorEjsonMod.JSONable
  def typeName(): String
}

object EJSONableCustomType {
  @scala.inline
  def apply(
    equals: js.Object => Boolean,
    toJSONValue: () => typings.meteorDashTypings.meteorEjsonMod.JSONable,
    typeName: () => String
  ): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
  
    __obj.asInstanceOf[EJSONableCustomType]
  }
}

