package typings.ngDialog.mod.angularAugmentingMod.dialog

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogProvider extends IServiceProvider {
  /**
  			 * Default options for the dialogs.
  			 * @param defaultOptions
  			 * @returns {}
  			 */
  def setDefaults(defaultOptions: IDialogOptions): Unit = js.native
  /**
  			 * Adds additional listener on every $locationChangeSuccess event and gets updated version of body into dialog.
  			 * Maybe useful in some rare cases when you're dependant on DOM changes, defaults to false. Use it in module's
  			 * config as provider instance:
  			 * @param {boolean} force
  			 */
  def setForceBodyReload(force: Boolean): Unit = js.native
  /**
  			 * Adds an additional listener on every $locationChangeSuccess event and gets update version of html into dialog.
  			 * May be useful in some rare cases when you're dependant on DOM changes, defaults to false.
  			 * @param {boolean} force
  			 */
  def setForceHtmlReload(force: Boolean): Unit = js.native
}

