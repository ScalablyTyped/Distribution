package typings.ngDashCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastService extends js.Object {
  def show(message: String, duration: String, position: String): js.Any
  def showLongBottom(message: String): js.Any
  def showLongCenter(message: String): js.Any
  def showLongTop(message: String): js.Any
  def showShortBottom(message: String): js.Any
  def showShortCenter(message: String): js.Any
  def showShortTop(message: String): js.Any
}

object IToastService {
  @scala.inline
  def apply(
    show: (String, String, String) => js.Any,
    showLongBottom: String => js.Any,
    showLongCenter: String => js.Any,
    showLongTop: String => js.Any,
    showShortBottom: String => js.Any,
    showShortCenter: String => js.Any,
    showShortTop: String => js.Any
  ): IToastService = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction3(show), showLongBottom = js.Any.fromFunction1(showLongBottom), showLongCenter = js.Any.fromFunction1(showLongCenter), showLongTop = js.Any.fromFunction1(showLongTop), showShortBottom = js.Any.fromFunction1(showShortBottom), showShortCenter = js.Any.fromFunction1(showShortCenter), showShortTop = js.Any.fromFunction1(showShortTop))
  
    __obj.asInstanceOf[IToastService]
  }
}

