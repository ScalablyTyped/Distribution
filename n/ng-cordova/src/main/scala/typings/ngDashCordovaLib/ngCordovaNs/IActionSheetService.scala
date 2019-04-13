package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSheetService extends js.Object {
  def hide(): angularLib.angularMod.IPromise[scala.Unit]
  def show(options: ShowOptions): angularLib.angularMod.IPromise[scala.Double]
}

object IActionSheetService {
  @scala.inline
  def apply(
    hide: () => angularLib.angularMod.IPromise[scala.Unit],
    show: ShowOptions => angularLib.angularMod.IPromise[scala.Double]
  ): IActionSheetService = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IActionSheetService]
  }
}

