package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionSheetService extends js.Object {
  def hide(): IPromise[Unit] = js.native
  def show(options: ShowOptions): IPromise[Double] = js.native
}

object IActionSheetService {
  @scala.inline
  def apply(hide: () => IPromise[Unit], show: ShowOptions => IPromise[Double]): IActionSheetService = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IActionSheetService]
  }
  @scala.inline
  implicit class IActionSheetServiceOps[Self <: IActionSheetService] (val x: Self) extends AnyVal {
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
    def setHide(value: () => IPromise[Unit]): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: ShowOptions => IPromise[Double]): Self = this.set("show", js.Any.fromFunction1(value))
  }
  
}

