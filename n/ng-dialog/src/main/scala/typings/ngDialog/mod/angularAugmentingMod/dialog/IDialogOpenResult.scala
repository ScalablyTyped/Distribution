package typings.ngDialog.mod.angularAugmentingMod.dialog

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogOpenResult extends js.Object {
  
  def close(): Unit = js.native
  def close(value: js.Any): Unit = js.native
  
  var closePromise: IPromise[IDialogClosePromise] = js.native
  
  var id: String = js.native
}
