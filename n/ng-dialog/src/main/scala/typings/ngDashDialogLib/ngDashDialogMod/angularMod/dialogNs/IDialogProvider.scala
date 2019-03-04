package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
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
    setDefaults: js.Function1[IDialogOptions, scala.Unit],
    setForceBodyReload: js.Function1[scala.Boolean, scala.Unit],
    setForceHtmlReload: js.Function1[scala.Boolean, scala.Unit]
  ): IDialogProvider = {
    val __obj = js.Dynamic.literal($get = $get, setDefaults = setDefaults, setForceBodyReload = setForceBodyReload, setForceHtmlReload = setForceHtmlReload)
  
    __obj.asInstanceOf[IDialogProvider]
  }
}

