package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastService extends js.Object {
  def show(message: java.lang.String, duration: java.lang.String, position: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showLongBottom(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showLongCenter(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showLongTop(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showShortBottom(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showShortCenter(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showShortTop(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
}

object IToastService {
  @scala.inline
  def apply(
    show: js.Function3[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      angularLib.angularMod.angularNs.IPromise[_]
    ],
    showLongBottom: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]],
    showLongCenter: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]],
    showLongTop: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]],
    showShortBottom: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]],
    showShortCenter: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]],
    showShortTop: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]]
  ): IToastService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("showLongBottom")(showLongBottom)
    __obj.updateDynamic("showLongCenter")(showLongCenter)
    __obj.updateDynamic("showLongTop")(showLongTop)
    __obj.updateDynamic("showShortBottom")(showShortBottom)
    __obj.updateDynamic("showShortCenter")(showShortCenter)
    __obj.updateDynamic("showShortTop")(showShortTop)
    __obj.asInstanceOf[IToastService]
  }
}

