package typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProvider extends IServiceProvider {
  /**
  			 * Default options for the dialogs.
  			 * @param defaultOptions
  			 * @returns {}
  			 */
  def setDefaults(defaultOptions: typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs.IDialogOptions): Unit
  /**
  			 * Adds additional listener on every $locationChangeSuccess event and gets updated version of body into dialog.
  			 * Maybe useful in some rare cases when you're dependant on DOM changes, defaults to false. Use it in module's
  			 * config as provider instance:
  			 * @param {boolean} force
  			 */
  def setForceBodyReload(force: Boolean): Unit
  /**
  			 * Adds an additional listener on every $locationChangeSuccess event and gets update version of html into dialog.
  			 * May be useful in some rare cases when you're dependant on DOM changes, defaults to false.
  			 * @param {boolean} force
  			 */
  def setForceHtmlReload(force: Boolean): Unit
}

object IDialogProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    setDefaults: typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs.IDialogOptions => Unit,
    setForceBodyReload: Boolean => Unit,
    setForceHtmlReload: Boolean => Unit
  ): IDialogProvider = {
    val __obj = js.Dynamic.literal($get = $get, setDefaults = js.Any.fromFunction1(setDefaults), setForceBodyReload = js.Any.fromFunction1(setForceBodyReload), setForceHtmlReload = js.Any.fromFunction1(setForceHtmlReload))
  
    __obj.asInstanceOf[IDialogProvider]
  }
}

