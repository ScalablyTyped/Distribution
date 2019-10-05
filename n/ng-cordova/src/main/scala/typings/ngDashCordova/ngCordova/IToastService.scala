package typings.ngDashCordova.ngCordova

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastService extends js.Object {
  def show(message: String, duration: String, position: String): IPromise[_]
  def showLongBottom(message: String): IPromise[_]
  def showLongCenter(message: String): IPromise[_]
  def showLongTop(message: String): IPromise[_]
  def showShortBottom(message: String): IPromise[_]
  def showShortCenter(message: String): IPromise[_]
  def showShortTop(message: String): IPromise[_]
}

object IToastService {
  @scala.inline
  def apply(
    show: (String, String, String) => IPromise[_],
    showLongBottom: String => IPromise[_],
    showLongCenter: String => IPromise[_],
    showLongTop: String => IPromise[_],
    showShortBottom: String => IPromise[_],
    showShortCenter: String => IPromise[_],
    showShortTop: String => IPromise[_]
  ): IToastService = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction3(show), showLongBottom = js.Any.fromFunction1(showLongBottom), showLongCenter = js.Any.fromFunction1(showLongCenter), showLongTop = js.Any.fromFunction1(showLongTop), showShortBottom = js.Any.fromFunction1(showShortBottom), showShortCenter = js.Any.fromFunction1(showShortCenter), showShortTop = js.Any.fromFunction1(showShortTop))
  
    __obj.asInstanceOf[IToastService]
  }
}

