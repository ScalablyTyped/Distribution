package typings.moveto.mod

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveToOptions extends js.Object {
  /**
    * The function to be run after scrolling complete. Target passes as the first argument
    */
  var callback: js.UndefOr[callbackType] = js.native
  /**
    * The container been computed and scrolled
    */
  var container: js.UndefOr[Window | HTMLElement] = js.native
  /**
    * Duration of scrolling, in milliseconds
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Ease function name
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * The tolerance of the target to be scrolled, can be negative or positive
    */
  var tolerance: js.UndefOr[Double] = js.native
}

object MoveToOptions {
  @scala.inline
  def apply(): MoveToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToOptions]
  }
  @scala.inline
  implicit class MoveToOptionsOps[Self <: MoveToOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: /* target */ HTMLElement | Double => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setContainer(value: Window | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
  
}

