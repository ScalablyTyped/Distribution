package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AriaLiveRegion extends js.Object {
  var ariaLiveRegion: js.UndefOr[NavigationFromKeyboard] = js.undefined
  var labelLandmark: js.UndefOr[String] = js.undefined
}

object AriaLiveRegion {
  @scala.inline
  def apply(ariaLiveRegion: NavigationFromKeyboard = null, labelLandmark: String = null): AriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    if (ariaLiveRegion != null) __obj.updateDynamic("ariaLiveRegion")(ariaLiveRegion.asInstanceOf[js.Any])
    if (labelLandmark != null) __obj.updateDynamic("labelLandmark")(labelLandmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaLiveRegion]
  }
}

