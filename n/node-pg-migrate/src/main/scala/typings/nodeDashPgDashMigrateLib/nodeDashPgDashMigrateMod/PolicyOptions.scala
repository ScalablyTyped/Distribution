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
    val __obj = js.Dynamic.literal(check = check, role = role.asInstanceOf[js.Any], using = using)
  
    __obj.asInstanceOf[PolicyOptions]
  }
}

