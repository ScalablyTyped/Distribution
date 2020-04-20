package typings.photoswipe.photoswipeUiDefaultMod

import typings.photoswipe.mod.UI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
  */
trait PhotoSwipeUIDefault extends UI[Options] {
  /**
    * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
    */
  def update(): Unit
}

object PhotoSwipeUIDefault {
  @scala.inline
  def apply(init: () => Unit, update: () => Unit): PhotoSwipeUIDefault = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[PhotoSwipeUIDefault]
  }
}

