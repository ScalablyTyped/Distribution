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
  def apply(init: () => scala.Unit, update: () => scala.Unit): PhotoSwipeUI_Default = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[PhotoSwipeUI_Default]
  }
}

