package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AriaLiveRegion extends js.Object {
  var ariaLiveRegion: js.UndefOr[Anon_NavigationFromKeyboard] = js.undefined
  var labelLandmark: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AriaLiveRegion {
  @scala.inline
  def apply(ariaLiveRegion: Anon_NavigationFromKeyboard = null, labelLandmark: java.lang.String = null): Anon_AriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    if (ariaLiveRegion != null) __obj.updateDynamic("ariaLiveRegion")(ariaLiveRegion)
    if (labelLandmark != null) __obj.updateDynamic("labelLandmark")(labelLandmark)
    __obj.asInstanceOf[Anon_AriaLiveRegion]
  }
}

