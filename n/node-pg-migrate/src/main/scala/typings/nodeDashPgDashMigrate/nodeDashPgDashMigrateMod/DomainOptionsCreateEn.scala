package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptionsCreateEn extends js.Object {
  var collation: js.UndefOr[String] = js.undefined
}

object DomainOptionsCreateEn {
  @scala.inline
  def apply(collation: String = null): DomainOptionsCreateEn = {
    val __obj = js.Dynamic.literal()
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainOptionsCreateEn]
  }
}

