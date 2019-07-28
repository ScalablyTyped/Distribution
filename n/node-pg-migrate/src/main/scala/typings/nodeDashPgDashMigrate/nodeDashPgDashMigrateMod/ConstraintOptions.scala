package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintOptions extends js.Object {
  var check: js.UndefOr[String | js.Array[String]] = js.undefined
  var deferrable: js.UndefOr[Boolean] = js.undefined
  var deferred: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[String] = js.undefined
  var foreignKeys: js.UndefOr[ForeignKeyOptions | js.Array[ForeignKeyOptions]] = js.undefined
  var primaryKey: js.UndefOr[Name | js.Array[Name]] = js.undefined
  var unique: js.UndefOr[js.Array[js.Array[Name] | Name]] = js.undefined
}

object ConstraintOptions {
  @scala.inline
  def apply(
    check: String | js.Array[String] = null,
    deferrable: js.UndefOr[Boolean] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    exclude: String = null,
    foreignKeys: ForeignKeyOptions | js.Array[ForeignKeyOptions] = null,
    primaryKey: Name | js.Array[Name] = null,
    unique: js.Array[js.Array[Name] | Name] = null
  ): ConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (foreignKeys != null) __obj.updateDynamic("foreignKeys")(foreignKeys.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (unique != null) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[ConstraintOptions]
  }
}

