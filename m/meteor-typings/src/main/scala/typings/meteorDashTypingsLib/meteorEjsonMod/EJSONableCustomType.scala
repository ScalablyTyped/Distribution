package typings
package meteorDashTypingsLib.meteorEjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONableCustomType extends js.Object {
  def equals(other: js.Object): scala.Boolean
  def toJSONValue(): JSONable
  def typeName(): java.lang.String
}

object EJSONableCustomType {
  @scala.inline
  def apply(
    clone: js.Function0[EJSONableCustomType],
    equals: js.Function1[js.Object, scala.Boolean],
    toJSONValue: js.Function0[JSONable],
    typeName: js.Function0[java.lang.String]
  ): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(clone = clone, equals = equals, toJSONValue = toJSONValue, typeName = typeName)
  
    __obj.asInstanceOf[EJSONableCustomType]
  }
}

