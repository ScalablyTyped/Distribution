package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.multiline
import typings.monacoEditor.monacoEditorStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorFindOptions extends js.Object {
  var addExtraSpaceOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Controls if Find in Selection flag is turned on in the editor.
    */
  var autoFindInSelection: js.UndefOr[never | always | multiline] = js.native
  /**
    * Controls if we seed search string in the Find Widget with editor selection.
    */
  var seedSearchStringFromSelection: js.UndefOr[Boolean] = js.native
}

object IEditorFindOptions {
  @scala.inline
  def apply(): IEditorFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorFindOptions]
  }
  @scala.inline
  implicit class IEditorFindOptionsOps[Self <: IEditorFindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddExtraSpaceOnTop(value: Boolean): Self = this.set("addExtraSpaceOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddExtraSpaceOnTop: Self = this.set("addExtraSpaceOnTop", js.undefined)
    @scala.inline
    def setAutoFindInSelection(value: never | always | multiline): Self = this.set("autoFindInSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFindInSelection: Self = this.set("autoFindInSelection", js.undefined)
    @scala.inline
    def setSeedSearchStringFromSelection(value: Boolean): Self = this.set("seedSearchStringFromSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeedSearchStringFromSelection: Self = this.set("seedSearchStringFromSelection", js.undefined)
  }
  
}

