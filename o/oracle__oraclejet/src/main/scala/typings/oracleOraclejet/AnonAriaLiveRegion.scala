package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAriaLiveRegion extends js.Object {
  var ariaLiveRegion: js.UndefOr[AnonNavigationFromKeyboard] = js.undefined
  var labelLandmark: js.UndefOr[String] = js.undefined
}

object AnonAriaLiveRegion {
  @scala.inline
  def apply(ariaLiveRegion: AnonNavigationFromKeyboard = null, labelLandmark: String = null): AnonAriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    if (ariaLiveRegion != null) __obj.updateDynamic("ariaLiveRegion")(ariaLiveRegion.asInstanceOf[js.Any])
    if (labelLandmark != null) __obj.updateDynamic("labelLandmark")(labelLandmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAriaLiveRegion]
  }
}

