package typings.photoswipe.distPhotoswipeDashUiDashDefaultMod

import typings.photoswipe.photoswipeMod.UIFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
  */
@JSImport("photoswipe/dist/photoswipe-ui-default", JSImport.Namespace)
@js.native
class ^ protected () extends PhotoSwipeUI_Default {
  def this(pswp: typings.photoswipe.photoswipeMod.^[Options], framework: UIFramework) = this()
  /**
    * Called by PhotoSwipe after it constructs the UI.
    */
  /* CompleteClass */
  override def init(): Unit = js.native
  /**
    * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
    */
  /* CompleteClass */
  override def update(): Unit = js.native
}

