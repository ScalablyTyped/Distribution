package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalEditorFindOptions extends js.Object {
  val addExtraSpaceOnTop: Boolean
  val autoFindInSelection: Boolean
  val seedSearchStringFromSelection: Boolean
}

object InternalEditorFindOptions {
  @scala.inline
  def apply(addExtraSpaceOnTop: Boolean, autoFindInSelection: Boolean, seedSearchStringFromSelection: Boolean): InternalEditorFindOptions = {
    val __obj = js.Dynamic.literal(addExtraSpaceOnTop = addExtraSpaceOnTop.asInstanceOf[js.Any], autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any], seedSearchStringFromSelection = seedSearchStringFromSelection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalEditorFindOptions]
  }
}

