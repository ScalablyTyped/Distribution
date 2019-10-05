package typings.ngDashDialog.ngDashDialogMod.angularMod.dialog

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogOpenResult extends js.Object {
  var closePromise: IPromise[typings.ngDashDialog.ngDashDialogMod.angularMod.dialog.IDialogClosePromise] = js.native
  var id: String = js.native
  def close(): Unit = js.native
  def close(value: js.Any): Unit = js.native
}

