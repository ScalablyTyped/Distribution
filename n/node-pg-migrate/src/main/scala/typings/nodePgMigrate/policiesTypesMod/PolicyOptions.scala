package typings.nodePgMigrate.policiesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyOptions extends js.Object {
  var check: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String | js.Array[String]] = js.undefined
  var using: js.UndefOr[String] = js.undefined
}

object PolicyOptions {
  @scala.inline
  def apply(check: String = null, role: String | js.Array[String] = null, using: String = null): PolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (using != null) __obj.updateDynamic("using")(using.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyOptions]
  }
}

