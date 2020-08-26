package typings.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalculation extends js.Object {
  var calculate: js.Function = js.native
  var fields: js.Array[String] = js.native
}

object ICalculation {
  @scala.inline
  def apply(calculate: js.Function, fields: js.Array[String]): ICalculation = {
    val __obj = js.Dynamic.literal(calculate = calculate.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalculation]
  }
  @scala.inline
  implicit class ICalculationOps[Self <: ICalculation] (val x: Self) extends AnyVal {
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
    def setCalculate(value: js.Function): Self = this.set("calculate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
  }
  
}

