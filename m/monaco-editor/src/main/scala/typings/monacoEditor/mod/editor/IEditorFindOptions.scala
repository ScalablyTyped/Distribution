package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.multiline
import typings.monacoEditor.monacoEditorStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorFindOptions extends js.Object {
  var addExtraSpaceOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if Find in Selection flag is turned on in the editor.
    */
  var autoFindInSelection: js.UndefOr[never | always | multiline] = js.undefined
  /**
    * Controls if we seed search string in the Find Widget with editor selection.
    */
  var seedSearchStringFromSelection: js.UndefOr[Boolean] = js.undefined
}

object IEditorFindOptions {
  @scala.inline
  def apply(
    addExtraSpaceOnTop: js.UndefOr[Boolean] = js.undefined,
    autoFindInSelection: never | always | multiline = null,
    seedSearchStringFromSelection: js.UndefOr[Boolean] = js.undefined
  ): IEditorFindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addExtraSpaceOnTop)) __obj.updateDynamic("addExtraSpaceOnTop")(addExtraSpaceOnTop.asInstanceOf[js.Any])
    if (autoFindInSelection != null) __obj.updateDynamic("autoFindInSelection")(autoFindInSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(seedSearchStringFromSelection)) __obj.updateDynamic("seedSearchStringFromSelection")(seedSearchStringFromSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorFindOptions]
  }
}

