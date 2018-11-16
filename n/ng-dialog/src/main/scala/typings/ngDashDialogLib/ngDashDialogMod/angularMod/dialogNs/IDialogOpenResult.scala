package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogOpenResult extends js.Object {
  var closePromise: angularLib.angularMod.angularNs.IPromise[IDialogClosePromise] = js.native
  var id: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def close(value: js.Any): scala.Unit = js.native
}

