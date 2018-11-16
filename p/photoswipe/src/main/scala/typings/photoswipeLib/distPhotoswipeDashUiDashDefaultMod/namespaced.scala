package typings
package photoswipeLib.distPhotoswipeDashUiDashDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
 */
@JSImport("photoswipe/dist/photoswipe-ui-default", JSImport.Namespace)
@js.native
class namespaced protected () extends PhotoSwipeUI_Default {
  def this(pswp: photoswipeLib.photoswipeMod.namespaced[
      photoswipeLib.distPhotoswipeDashUiDashDefaultMod.PhotoSwipeUIUnderscoreDefaultNs.Options
    ], framework: photoswipeLib.photoswipeMod.PhotoSwipeNs.UIFramework) = this()
  /**
           * Called by PhotoSwipe after it constructs the UI.
           */
  /* CompleteClass */
  override def init(): scala.Unit = js.native
  /**
       * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
       */
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

