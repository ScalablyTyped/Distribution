package typings
package ngbootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootboxService extends js.Object {
  def addLocale(name: java.lang.String, values: bootboxLib.BootboxLocaleValues): scala.Unit
  def alert(msg: java.lang.String): js.Promise[_]
  def confirm(msg: java.lang.String): js.Promise[_]
  def customDialog(options: NgBootboxDialog): scala.Unit
  def hideAll(): scala.Unit
  def prompt(msg: java.lang.String): js.Promise[_]
  def removeLocale(name: java.lang.String): scala.Unit
  def setDefaults(options: bootboxLib.BootboxDefaultOptions): scala.Unit
  def setLocale(name: java.lang.String): scala.Unit
}

object BootboxService {
  @scala.inline
  def apply(
    addLocale: (java.lang.String, bootboxLib.BootboxLocaleValues) => scala.Unit,
    alert: java.lang.String => js.Promise[_],
    confirm: java.lang.String => js.Promise[_],
    customDialog: NgBootboxDialog => scala.Unit,
    hideAll: () => scala.Unit,
    prompt: java.lang.String => js.Promise[_],
    removeLocale: java.lang.String => scala.Unit,
    setDefaults: bootboxLib.BootboxDefaultOptions => scala.Unit,
    setLocale: java.lang.String => scala.Unit
  ): BootboxService = {
    val __obj = js.Dynamic.literal(addLocale = js.Any.fromFunction2(addLocale), alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm), customDialog = js.Any.fromFunction1(customDialog), hideAll = js.Any.fromFunction0(hideAll), prompt = js.Any.fromFunction1(prompt), removeLocale = js.Any.fromFunction1(removeLocale), setDefaults = js.Any.fromFunction1(setDefaults), setLocale = js.Any.fromFunction1(setLocale))
  
    __obj.asInstanceOf[BootboxService]
  }
}

