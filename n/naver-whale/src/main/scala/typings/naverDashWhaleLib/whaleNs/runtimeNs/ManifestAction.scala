package typings
package naverDashWhaleLib.whaleNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestAction extends js.Object {
  var default_icon: js.UndefOr[chromeLib.chromeNs.runtimeNs.ManifestIcons] = js.undefined
  var default_popup: js.UndefOr[java.lang.String] = js.undefined
  var default_title: js.UndefOr[java.lang.String] = js.undefined
}

object ManifestAction {
  @scala.inline
  def apply(
    default_icon: chromeLib.chromeNs.runtimeNs.ManifestIcons = null,
    default_popup: java.lang.String = null,
    default_title: java.lang.String = null
  ): ManifestAction = {
    val __obj = js.Dynamic.literal()
    if (default_icon != null) __obj.updateDynamic("default_icon")(default_icon)
    if (default_popup != null) __obj.updateDynamic("default_popup")(default_popup)
    if (default_title != null) __obj.updateDynamic("default_title")(default_title)
    __obj.asInstanceOf[ManifestAction]
  }
}

