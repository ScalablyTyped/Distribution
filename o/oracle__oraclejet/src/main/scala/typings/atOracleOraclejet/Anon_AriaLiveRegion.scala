package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AriaLiveRegion extends js.Object {
  var ariaLiveRegion: js.UndefOr[Anon_NavigationFromKeyboard] = js.undefined
  var labelLandmark: js.UndefOr[String] = js.undefined
}

object Anon_AriaLiveRegion {
  @scala.inline
  def apply(ariaLiveRegion: Anon_NavigationFromKeyboard = null, labelLandmark: String = null): Anon_AriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    if (ariaLiveRegion != null) __obj.updateDynamic("ariaLiveRegion")(ariaLiveRegion.asInstanceOf[js.Any])
    if (labelLandmark != null) __obj.updateDynamic("labelLandmark")(labelLandmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AriaLiveRegion]
  }
}

