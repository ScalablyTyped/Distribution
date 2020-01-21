package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorFindOptions extends js.Object {
  var addExtraSpaceOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if Find in Selection flag is turned on when multiple lines of text are selected in the editor.
    */
  var autoFindInSelection: Boolean
  /**
    * Controls if we seed search string in the Find Widget with editor selection.
    */
  var seedSearchStringFromSelection: js.UndefOr[Boolean] = js.undefined
}

object IEditorFindOptions {
  @scala.inline
  def apply(
    autoFindInSelection: Boolean,
    addExtraSpaceOnTop: js.UndefOr[Boolean] = js.undefined,
    seedSearchStringFromSelection: js.UndefOr[Boolean] = js.undefined
  ): IEditorFindOptions = {
    val __obj = js.Dynamic.literal(autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(addExtraSpaceOnTop)) __obj.updateDynamic("addExtraSpaceOnTop")(addExtraSpaceOnTop.asInstanceOf[js.Any])
    if (!js.isUndefined(seedSearchStringFromSelection)) __obj.updateDynamic("seedSearchStringFromSelection")(seedSearchStringFromSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorFindOptions]
  }
}

