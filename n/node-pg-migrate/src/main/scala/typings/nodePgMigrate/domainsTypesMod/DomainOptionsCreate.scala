package typings.nodePgMigrate.domainsTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptionsCreate extends DomainOptions {
  var collation: js.UndefOr[String] = js.undefined
}

object DomainOptionsCreate {
  @scala.inline
  def apply(
    check: String = null,
    collation: String = null,
    constraintName: String = null,
    default: Value = null,
    notNull: js.UndefOr[Boolean] = js.undefined
  ): DomainOptionsCreate = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (constraintName != null) __obj.updateDynamic("constraintName")(constraintName.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainOptionsCreate]
  }
}

