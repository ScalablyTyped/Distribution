package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoercionTypeOptions extends js.Object {
  var coercionType: js.UndefOr[CoercionType] = js.undefined
}

object CoercionTypeOptions {
  @scala.inline
  def apply(coercionType: CoercionType = null): CoercionTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (coercionType != null) __obj.updateDynamic("coercionType")(coercionType)
    __obj.asInstanceOf[CoercionTypeOptions]
  }
}

