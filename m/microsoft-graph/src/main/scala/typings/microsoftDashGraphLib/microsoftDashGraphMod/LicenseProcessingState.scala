package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseProcessingState extends js.Object {
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object LicenseProcessingState {
  @scala.inline
  def apply(state: java.lang.String = null): LicenseProcessingState = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[LicenseProcessingState]
  }
}

