package typings.ngDashDialog.ngDashDialogMod.angularMod.dialog

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogService extends js.Object {
  def close(id: String): Unit = js.native
  def close(id: String, value: js.Any): Unit = js.native
  def closeAll(): Unit = js.native
  def closeAll(value: js.Any): Unit = js.native
  def getDefaults(): IDialogOptions = js.native
  def getOpenDialogs(): js.Array[String] = js.native
  /**
  			 * Determine whether the specified dialog is open or not.
  			 * @param id Dialog id to check for.
  			 * @returns {boolean} Indicating whether it exists or not.
  			 */
  def isOpen(id: String): Boolean = js.native
  def open(options: IDialogOpenOptions): IDialogOpenResult = js.native
  def openConfirm(options: IDialogOpenConfirmOptions): IPromise[_] = js.native
}

