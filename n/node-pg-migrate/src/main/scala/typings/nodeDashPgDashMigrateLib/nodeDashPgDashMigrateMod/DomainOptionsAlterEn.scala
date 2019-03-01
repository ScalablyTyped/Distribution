package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptionsAlterEn extends js.Object {
  var allowNull: js.UndefOr[scala.Boolean] = js.undefined
}

object DomainOptionsAlterEn {
  @scala.inline
  def apply(allowNull: js.UndefOr[scala.Boolean] = js.undefined): DomainOptionsAlterEn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull)
    __obj.asInstanceOf[DomainOptionsAlterEn]
  }
}

