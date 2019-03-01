package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyOptions extends js.Object {
  var check: java.lang.String
  var role: java.lang.String | js.Array[java.lang.String]
  var using: java.lang.String
}

object PolicyOptions {
  @scala.inline
  def apply(
    check: java.lang.String,
    role: java.lang.String | js.Array[java.lang.String],
    using: java.lang.String
  ): PolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check)
    __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(using)
    __obj.asInstanceOf[PolicyOptions]
  }
}

