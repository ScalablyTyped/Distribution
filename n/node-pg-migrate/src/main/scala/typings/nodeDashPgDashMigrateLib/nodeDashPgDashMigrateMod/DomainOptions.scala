package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptions extends js.Object {
  var check: js.UndefOr[java.lang.String] = js.undefined
  var constraintName: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
}

object DomainOptions {
  @scala.inline
  def apply(
    check: java.lang.String = null,
    constraintName: java.lang.String = null,
    default: Value = null,
    notNull: js.UndefOr[scala.Boolean] = js.undefined
  ): DomainOptions = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check)
    if (constraintName != null) __obj.updateDynamic("constraintName")(constraintName)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    __obj.asInstanceOf[DomainOptions]
  }
}

