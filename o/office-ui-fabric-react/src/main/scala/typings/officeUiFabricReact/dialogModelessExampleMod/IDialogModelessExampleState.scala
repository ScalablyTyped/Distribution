package typings.officeUiFabricReact.dialogModelessExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogModelessExampleState extends js.Object {
  var hideDialog: Boolean
  var isDraggable: Boolean
}

object IDialogModelessExampleState {
  @scala.inline
  def apply(hideDialog: Boolean, isDraggable: Boolean): IDialogModelessExampleState = {
    val __obj = js.Dynamic.literal(hideDialog = hideDialog.asInstanceOf[js.Any], isDraggable = isDraggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogModelessExampleState]
  }
}

