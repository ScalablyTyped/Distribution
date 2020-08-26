package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import typings.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOperator[D] extends js.Object {
  var op: AttributeOperator | CompoundOperator = js.native
  def filter(data: js.Array[_]): js.Array[_] = js.native
}

object FilterOperator {
  @scala.inline
  def apply[D](filter: js.Array[_] => js.Array[_], op: AttributeOperator | CompoundOperator): FilterOperator[D] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperator[D]]
  }
  @scala.inline
  implicit class FilterOperatorOps[Self <: FilterOperator[_], D] (val x: Self with FilterOperator[D]) extends AnyVal {
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
    def setFilter(value: js.Array[_] => js.Array[_]): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setOp(value: AttributeOperator | CompoundOperator): Self = this.set("op", value.asInstanceOf[js.Any])
  }
  
}

