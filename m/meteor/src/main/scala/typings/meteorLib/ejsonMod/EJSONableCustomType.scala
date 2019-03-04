package typings
package meteorLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONableCustomType extends js.Object {
  @JSName("clone")
  var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.undefined
  @JSName("equals")
  var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, scala.Boolean]] = js.undefined
  def toJSONValue(): JSONable
  def typeName(): java.lang.String
}

object EJSONableCustomType {
  @scala.inline
  def apply(
    toJSONValue: js.Function0[JSONable],
    typeName: js.Function0[java.lang.String],
    clone: js.Function0[EJSONableCustomType] = null,
    equals: js.Function1[/* other */ js.Object, scala.Boolean] = null
  ): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = toJSONValue, typeName = typeName)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    __obj.asInstanceOf[EJSONableCustomType]
  }
}

