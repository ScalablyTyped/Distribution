package typings.ngDialog.mod.angularAugmentingMod.dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogClosePromise extends js.Object {
  var id: String
  var value: js.Any
}

object IDialogClosePromise {
  @scala.inline
  def apply(id: String, value: js.Any): IDialogClosePromise = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDialogClosePromise]
  }
}

