package typings.pkijs.generalNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralNames extends js.Object {
  var names: js.Array[typings.pkijs.generalNameMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object GeneralNames {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    names: js.Array[typings.pkijs.generalNameMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): GeneralNames = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), names = names.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[GeneralNames]
  }
  @scala.inline
  implicit class GeneralNamesOps[Self <: GeneralNames] (val x: Self) extends AnyVal {
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setNamesVarargs(value: typings.pkijs.generalNameMod.default*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[typings.pkijs.generalNameMod.default]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

