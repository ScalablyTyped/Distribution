package typings.pkijs.generalSubtreeMod

import typings.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralSubtree extends js.Object {
  var base: typings.pkijs.generalNameMod.default = js.native
  var maximum: js.UndefOr[Double | Integer] = js.native
  var minimum: Double | Integer = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object GeneralSubtree {
  @scala.inline
  def apply(
    base: typings.pkijs.generalNameMod.default,
    fromSchema: js.Any => Unit,
    minimum: Double | Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): GeneralSubtree = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), minimum = minimum.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[GeneralSubtree]
  }
  @scala.inline
  implicit class GeneralSubtreeOps[Self <: GeneralSubtree] (val x: Self) extends AnyVal {
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
    def setBase(value: typings.pkijs.generalNameMod.default): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setMinimum(value: Double | Integer): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setMaximum(value: Double | Integer): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
  }
  
}

