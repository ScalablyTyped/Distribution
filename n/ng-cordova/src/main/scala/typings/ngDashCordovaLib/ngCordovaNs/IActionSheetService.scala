package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSheetService extends js.Object {
  def hide(): angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def show(options: ShowOptions): angularLib.angularMod.angularNs.IPromise[scala.Double]
}

object IActionSheetService {
  @scala.inline
  def apply(
    hide: js.Function0[angularLib.angularMod.angularNs.IPromise[scala.Unit]],
    show: js.Function1[ShowOptions, angularLib.angularMod.angularNs.IPromise[scala.Double]]
  ): IActionSheetService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[IActionSheetService]
  }
}

