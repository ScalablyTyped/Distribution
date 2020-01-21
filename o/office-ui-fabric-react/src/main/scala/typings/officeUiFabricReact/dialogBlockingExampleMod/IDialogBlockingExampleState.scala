package typings.officeUiFabricReact.dialogBlockingExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogBlockingExampleState extends js.Object {
  var hideDialog: Boolean
  var isDraggable: Boolean
}

object IDialogBlockingExampleState {
  @scala.inline
  def apply(hideDialog: Boolean, isDraggable: Boolean): IDialogBlockingExampleState = {
    val __obj = js.Dynamic.literal(hideDialog = hideDialog.asInstanceOf[js.Any], isDraggable = isDraggable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDialogBlockingExampleState]
  }
}

