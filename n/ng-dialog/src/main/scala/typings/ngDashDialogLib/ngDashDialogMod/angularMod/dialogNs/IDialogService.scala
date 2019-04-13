package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogService extends js.Object {
  def close(id: java.lang.String): scala.Unit = js.native
  def close(id: java.lang.String, value: js.Any): scala.Unit = js.native
  def closeAll(): scala.Unit = js.native
  def closeAll(value: js.Any): scala.Unit = js.native
  def getDefaults(): IDialogOptions = js.native
  def getOpenDialogs(): js.Array[java.lang.String] = js.native
  /**
  			 * Determine whether the specified dialog is open or not.
  			 * @param id Dialog id to check for.
  			 * @returns {boolean} Indicating whether it exists or not.
  			 */
  def isOpen(id: java.lang.String): scala.Boolean = js.native
  def open(options: IDialogOpenOptions): IDialogOpenResult = js.native
  def openConfirm(options: IDialogOpenConfirmOptions): angularLib.angularMod.IPromise[_] = js.native
}

