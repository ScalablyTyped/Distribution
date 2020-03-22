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

trait TriggerOptions extends js.Object {
  var condition: js.UndefOr[String] = js.undefined
  var constraint: js.UndefOr[Boolean] = js.undefined
  var deferrable: js.UndefOr[Boolean] = js.undefined
  var deferred: js.UndefOr[Boolean] = js.undefined
  var function: js.UndefOr[Name] = js.undefined
  var functionParams: js.UndefOr[js.Array[Value]] = js.undefined
  var level: js.UndefOr[STATEMENT | ROW] = js.undefined
  var operation: String | js.Array[String]
  var when: js.UndefOr[BEFORE | AFTER | (`INSTEAD OF`)] = js.undefined
}

object TriggerOptions {
  @scala.inline
  def apply(
    operation: String | js.Array[String],
    condition: String = null,
    constraint: js.UndefOr[Boolean] = js.undefined,
    deferrable: js.UndefOr[Boolean] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    function: Name = null,
    functionParams: js.Array[Value] = null,
    level: STATEMENT | ROW = null,
    when: BEFORE | AFTER | (`INSTEAD OF`) = null
  ): TriggerOptions = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (!js.isUndefined(constraint)) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable.asInstanceOf[js.Any])
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (functionParams != null) __obj.updateDynamic("functionParams")(functionParams.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerOptions]
  }
}

