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
    addLocale: js.Function2[java.lang.String, bootboxLib.BootboxLocaleValues, scala.Unit],
    alert: js.Function1[java.lang.String, js.Promise[_]],
    confirm: js.Function1[java.lang.String, js.Promise[_]],
    customDialog: js.Function1[NgBootboxDialog, scala.Unit],
    hideAll: js.Function0[scala.Unit],
    prompt: js.Function1[java.lang.String, js.Promise[_]],
    removeLocale: js.Function1[java.lang.String, scala.Unit],
    setDefaults: js.Function1[bootboxLib.BootboxDefaultOptions, scala.Unit],
    setLocale: js.Function1[java.lang.String, scala.Unit]
  ): BootboxService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLocale")(addLocale)
    __obj.updateDynamic("alert")(alert)
    __obj.updateDynamic("confirm")(confirm)
    __obj.updateDynamic("customDialog")(customDialog)
    __obj.updateDynamic("hideAll")(hideAll)
    __obj.updateDynamic("prompt")(prompt)
    __obj.updateDynamic("removeLocale")(removeLocale)
    __obj.updateDynamic("setDefaults")(setDefaults)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.asInstanceOf[BootboxService]
  }
}

