package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EJSONableCustomType extends js.Object {
  @JSName("clone")
  var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.native
  @JSName("equals")
  var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.native
  def toJSONValue(): JSONable = js.native
  def typeName(): String = js.native
}

object EJSONableCustomType {
  @scala.inline
  def apply(toJSONValue: () => JSONable, typeName: () => String): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
    __obj.asInstanceOf[EJSONableCustomType]
  }
  @scala.inline
  implicit class EJSONableCustomTypeOps[Self <: EJSONableCustomType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToJSONValue(value: () => JSONable): Self = this.set("toJSONValue", js.Any.fromFunction0(value))
    @scala.inline
    def setTypeName(value: () => String): Self = this.set("typeName", js.Any.fromFunction0(value))
    @scala.inline
    def setClone(value: () => EJSONableCustomType): Self = this.set("clone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setEquals(value: /* other */ js.Object => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
  }
  
}

