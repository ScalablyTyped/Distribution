package typings.ngbootbox

import typings.bootbox.BootboxDefaultOptions
import typings.bootbox.BootboxLocaleValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootboxService extends js.Object {
  def addLocale(name: String, values: BootboxLocaleValues): Unit
  def alert(msg: String): js.Promise[_]
  def confirm(msg: String): js.Promise[_]
  def customDialog(options: NgBootboxDialog): Unit
  def hideAll(): Unit
  def prompt(msg: String): js.Promise[_]
  def removeLocale(name: String): Unit
  def setDefaults(options: BootboxDefaultOptions): Unit
  def setLocale(name: String): Unit
}

object BootboxService {
  @scala.inline
  def apply(
    addLocale: (String, BootboxLocaleValues) => Unit,
    alert: String => js.Promise[_],
    confirm: String => js.Promise[_],
    customDialog: NgBootboxDialog => Unit,
    hideAll: () => Unit,
    prompt: String => js.Promise[_],
    removeLocale: String => Unit,
    setDefaults: BootboxDefaultOptions => Unit,
    setLocale: String => Unit
  ): BootboxService = {
    val __obj = js.Dynamic.literal(addLocale = js.Any.fromFunction2(addLocale), alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm), customDialog = js.Any.fromFunction1(customDialog), hideAll = js.Any.fromFunction0(hideAll), prompt = js.Any.fromFunction1(prompt), removeLocale = js.Any.fromFunction1(removeLocale), setDefaults = js.Any.fromFunction1(setDefaults), setLocale = js.Any.fromFunction1(setLocale))
  
    __obj.asInstanceOf[BootboxService]
  }
}

