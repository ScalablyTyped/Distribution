package typings.photoswipe.photoswipeUiDefaultMod

import typings.photoswipe.mod.UI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
  */
@js.native
trait PhotoSwipeUIDefault extends UI[Options] {
  /**
    * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
    */
  def update(): Unit = js.native
}

object PhotoSwipeUIDefault {
  @scala.inline
  def apply(init: () => Unit, update: () => Unit): PhotoSwipeUIDefault = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[PhotoSwipeUIDefault]
  }
  @scala.inline
  implicit class PhotoSwipeUIDefaultOps[Self <: PhotoSwipeUIDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

