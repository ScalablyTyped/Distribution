package typings.pkijs.altNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AltName extends js.Object {
  var altNames: js.Array[typings.pkijs.generalNameMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object AltName {
  @scala.inline
  def apply(
    altNames: js.Array[typings.pkijs.generalNameMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AltName = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[AltName]
  }
  @scala.inline
  implicit class AltNameOps[Self <: AltName] (val x: Self) extends AnyVal {
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
    def setAltNamesVarargs(value: typings.pkijs.generalNameMod.default*): Self = this.set("altNames", js.Array(value :_*))
    @scala.inline
    def setAltNames(value: js.Array[typings.pkijs.generalNameMod.default]): Self = this.set("altNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

