package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an option for the data format.
  */
trait CoercionTypeOptions extends js.Object {
  /**
    * The desired data format.
    */
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

