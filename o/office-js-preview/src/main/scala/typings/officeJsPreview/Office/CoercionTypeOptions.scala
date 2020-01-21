package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoercionTypeOptions extends js.Object {
  var coercionType: js.UndefOr[CoercionType | String] = js.undefined
}

object CoercionTypeOptions {
  @scala.inline
  def apply(coercionType: CoercionType | String = null): CoercionTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (coercionType != null) __obj.updateDynamic("coercionType")(coercionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoercionTypeOptions]
  }
}

