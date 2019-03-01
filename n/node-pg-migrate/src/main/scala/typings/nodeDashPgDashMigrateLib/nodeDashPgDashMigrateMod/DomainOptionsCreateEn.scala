package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptionsCreateEn extends js.Object {
  var collation: js.UndefOr[java.lang.String] = js.undefined
}

object DomainOptionsCreateEn {
  @scala.inline
  def apply(collation: java.lang.String = null): DomainOptionsCreateEn = {
    val __obj = js.Dynamic.literal()
    if (collation != null) __obj.updateDynamic("collation")(collation)
    __obj.asInstanceOf[DomainOptionsCreateEn]
  }
}

