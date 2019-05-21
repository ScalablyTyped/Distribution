package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoercionTypeOptions extends js.Object {
  var coercionType: js.UndefOr[CoercionType | java.lang.String] = js.undefined
}

object CoercionTypeOptions {
  @scala.inline
  def apply(coercionType: CoercionType | java.lang.String = null): CoercionTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (coercionType != null) __obj.updateDynamic("coercionType")(coercionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoercionTypeOptions]
  }
}

