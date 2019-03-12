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
    show: (java.lang.String, java.lang.String, java.lang.String) => angularLib.angularMod.angularNs.IPromise[_],
    showLongBottom: java.lang.String => angularLib.angularMod.angularNs.IPromise[_],
    showLongCenter: java.lang.String => angularLib.angularMod.angularNs.IPromise[_],
    showLongTop: java.lang.String => angularLib.angularMod.angularNs.IPromise[_],
    showShortBottom: java.lang.String => angularLib.angularMod.angularNs.IPromise[_],
    showShortCenter: java.lang.String => angularLib.angularMod.angularNs.IPromise[_],
    showShortTop: java.lang.String => angularLib.angularMod.angularNs.IPromise[_]
  ): IToastService = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction3(show), showLongBottom = js.Any.fromFunction1(showLongBottom), showLongCenter = js.Any.fromFunction1(showLongCenter), showLongTop = js.Any.fromFunction1(showLongTop), showShortBottom = js.Any.fromFunction1(showShortBottom), showShortCenter = js.Any.fromFunction1(showShortCenter), showShortTop = js.Any.fromFunction1(showShortTop))
  
    __obj.asInstanceOf[IToastService]
  }
}

