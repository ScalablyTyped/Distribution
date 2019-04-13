package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProvider
  extends angularLib.angularMod.IServiceProvider {
  /**
  			 * Default options for the dialogs.
  			 * @param defaultOptions
  			 * @returns {}
  			 */
  def setDefaults(defaultOptions: IDialogOptions): scala.Unit
  /**
  			 * Adds additional listener on every $locationChangeSuccess event and gets updated version of body into dialog.
  			 * Maybe useful in some rare cases when you're dependant on DOM changes, defaults to false. Use it in module's
  			 * config as provider instance:
  			 * @param {boolean} force
  			 */
  def setForceBodyReload(force: scala.Boolean): scala.Unit
  /**
  			 * Adds an additional listener on every $locationChangeSuccess event and gets update version of html into dialog.
  			 * May be useful in some rare cases when you're dependant on DOM changes, defaults to false.
  			 * @param {boolean} force
  			 */
  def setForceHtmlReload(force: scala.Boolean): scala.Unit
}

object IDialogProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    setDefaults: IDialogOptions => scala.Unit,
    setForceBodyReload: scala.Boolean => scala.Unit,
    setForceHtmlReload: scala.Boolean => scala.Unit
  ): IDialogProvider = {
    val __obj = js.Dynamic.literal($get = $get, setDefaults = js.Any.fromFunction1(setDefaults), setForceBodyReload = js.Any.fromFunction1(setForceBodyReload), setForceHtmlReload = js.Any.fromFunction1(setForceHtmlReload))
  
    __obj.asInstanceOf[IDialogProvider]
  }
}

