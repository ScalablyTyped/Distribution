package typings.nodePgMigrate.triggersTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.AFTER
import typings.nodePgMigrate.nodePgMigrateStrings.BEFORE
import typings.nodePgMigrate.nodePgMigrateStrings.ROW
import typings.nodePgMigrate.nodePgMigrateStrings.STATEMENT
import typings.nodePgMigrate.nodePgMigrateStrings.`INSTEAD OF`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerOptions extends js.Object {
  var condition: js.UndefOr[String] = js.native
  var constraint: js.UndefOr[Boolean] = js.native
  var deferrable: js.UndefOr[Boolean] = js.native
  var deferred: js.UndefOr[Boolean] = js.native
  var function: js.UndefOr[Name] = js.native
  var functionParams: js.UndefOr[js.Array[Value]] = js.native
  var level: js.UndefOr[STATEMENT | ROW] = js.native
  var operation: String | js.Array[String] = js.native
  var when: js.UndefOr[BEFORE | AFTER | (`INSTEAD OF`)] = js.native
}

object TriggerOptions {
  @scala.inline
  def apply(operation: String | js.Array[String]): TriggerOptions = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerOptions]
  }
  @scala.inline
  implicit class TriggerOptionsOps[Self <: TriggerOptions] (val x: Self) extends AnyVal {
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
    def setOperationVarargs(value: String*): Self = this.set("operation", js.Array(value :_*))
    @scala.inline
    def setOperation(value: String | js.Array[String]): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setConstraint(value: Boolean): Self = this.set("constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
    @scala.inline
    def setDeferrable(value: Boolean): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    @scala.inline
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    @scala.inline
    def setFunction(value: Name): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setFunctionParamsVarargs(value: Value*): Self = this.set("functionParams", js.Array(value :_*))
    @scala.inline
    def setFunctionParams(value: js.Array[Value]): Self = this.set("functionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionParams: Self = this.set("functionParams", js.undefined)
    @scala.inline
    def setLevel(value: STATEMENT | ROW): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setWhen(value: BEFORE | AFTER | (`INSTEAD OF`)): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

