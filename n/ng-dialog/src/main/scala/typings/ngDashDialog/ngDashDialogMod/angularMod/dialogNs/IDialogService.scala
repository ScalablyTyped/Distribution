package typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs

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
  def getDefaults(): typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs.IDialogOptions = js.native
  def getOpenDialogs(): js.Array[String] = js.native
  /**
  			 * Determine whether the specified dialog is open or not.
  			 * @param id Dialog id to check for.
  			 * @returns {boolean} Indicating whether it exists or not.
  			 */
  def isOpen(id: String): Boolean = js.native
  def open(options: typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs.IDialogOpenOptions): typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs.IDialogOpenResult = js.native
  def openConfirm(options: typings.ngDashDialog.ngDashDialogMod.angularMod.dialogNs.IDialogOpenConfirmOptions): IPromise[_] = js.native
}

