package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableScopeDefinition extends PropertyDefinition {
  var values: js.UndefOr[js.Array[VariableDefinition]] = js.native
}

object VariableScopeDefinition {
  @scala.inline
  def apply(): VariableScopeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableScopeDefinition]
  }
  @scala.inline
  implicit class VariableScopeDefinitionOps[Self <: VariableScopeDefinition] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: VariableDefinition*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[VariableDefinition]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

