package typings.naverDashWhale.whale.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeSettingSetDetails
  extends typings.chrome.chrome.types.ChromeSettingClearDetails {
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An extension should not set a value of a different type.
    */
  var value: js.Any
}

object ChromeSettingSetDetails {
  @scala.inline
  def apply(value: js.Any, scope: String = null): ChromeSettingSetDetails = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeSettingSetDetails]
  }
}

