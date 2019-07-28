package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptions extends js.Object {
  var check: js.UndefOr[String] = js.undefined
  var constraintName: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
}

object DomainOptions {
  @scala.inline
  def apply(
    check: String = null,
    constraintName: String = null,
    default: Value = null,
    notNull: js.UndefOr[Boolean] = js.undefined
  ): DomainOptions = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check)
    if (constraintName != null) __obj.updateDynamic("constraintName")(constraintName)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    __obj.asInstanceOf[DomainOptions]
  }
}

