package typings.officeUiFabricReact.dialogBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogBasicExampleState extends js.Object {
  var hideDialog: Boolean
  var isDraggable: Boolean
}

object IDialogBasicExampleState {
  @scala.inline
  def apply(hideDialog: Boolean, isDraggable: Boolean): IDialogBasicExampleState = {
    val __obj = js.Dynamic.literal(hideDialog = hideDialog.asInstanceOf[js.Any], isDraggable = isDraggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogBasicExampleState]
  }
}

