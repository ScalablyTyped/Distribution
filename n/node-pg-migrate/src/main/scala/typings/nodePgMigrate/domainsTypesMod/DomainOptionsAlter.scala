package typings.nodePgMigrate.domainsTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptionsAlter extends DomainOptions {
  var allowNull: js.UndefOr[Boolean] = js.undefined
}

object DomainOptionsAlter {
  @scala.inline
  def apply(
    allowNull: js.UndefOr[Boolean] = js.undefined,
    check: String = null,
    constraintName: String = null,
    default: Value = null,
    notNull: js.UndefOr[Boolean] = js.undefined
  ): DomainOptionsAlter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (constraintName != null) __obj.updateDynamic("constraintName")(constraintName.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainOptionsAlter]
  }
}

