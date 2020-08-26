package typings.nodePgMigrate.operatorsTypesMod

import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.function
import typings.nodePgMigrate.nodePgMigrateStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatorListDefinition extends js.Object {
  var name: Name = js.native
  var number: Double = js.native
  var params: js.UndefOr[js.Array[FunctionParam]] = js.native
  var `type`: function | operator = js.native
}

object OperatorListDefinition {
  @scala.inline
  def apply(name: Name, number: Double, `type`: function | operator): OperatorListDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorListDefinition]
  }
  @scala.inline
  implicit class OperatorListDefinitionOps[Self <: OperatorListDefinition] (val x: Self) extends AnyVal {
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: function | operator): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: FunctionParam*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[FunctionParam]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

