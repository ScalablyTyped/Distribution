package typings
package photoswipeLib.distPhotoswipeDashUiDashDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
  */
trait PhotoSwipeUI_Default
  extends photoswipeLib.photoswipeMod.PhotoSwipeNs.UI[
      photoswipeLib.distPhotoswipeDashUiDashDefaultMod.PhotoSwipeUIUnderscoreDefaultNs.Options
    ] {
  /**
    * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
    */
  def update(): scala.Unit
}

object PhotoSwipeUI_Default {
  @scala.inline
  def apply(init: js.Function0[scala.Unit], update: js.Function0[scala.Unit]): PhotoSwipeUI_Default = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[PhotoSwipeUI_Default]
  }
}

