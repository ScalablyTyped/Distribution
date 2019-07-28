package typings.ngDashCordova.ngCordovaNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSheetService extends js.Object {
  def hide(): IPromise[Unit]
  def show(options: ShowOptions): IPromise[Double]
}

object IActionSheetService {
  @scala.inline
  def apply(hide: () => IPromise[Unit], show: ShowOptions => IPromise[Double]): IActionSheetService = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IActionSheetService]
  }
}

