package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffEditorOptions extends IEditorOptions {
  /**
    * Allow the user to resize the diff editor split view.
    * Defaults to true.
    */
  var enableSplitViewResizing: js.UndefOr[Boolean] = js.native
  /**
    * Compute the diff by ignoring leading/trailing whitespace
    * Defaults to true.
    */
  var ignoreTrimWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * Timeout in milliseconds after which diff computation is cancelled.
    * Defaults to 5000.
    */
  var maxComputationTime: js.UndefOr[Double] = js.native
  /**
    * Original model should be editable?
    * Defaults to false.
    */
  var originalEditable: js.UndefOr[Boolean] = js.native
  /**
    * Render +/- indicators for added/deleted changes.
    * Defaults to true.
    */
  var renderIndicators: js.UndefOr[Boolean] = js.native
  /**
    * Render the differences in two side-by-side editors.
    * Defaults to true.
    */
  var renderSideBySide: js.UndefOr[Boolean] = js.native
}

object IDiffEditorOptions {
  @scala.inline
  def apply(): IDiffEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorOptions]
  }
  @scala.inline
  implicit class IDiffEditorOptionsOps[Self <: IDiffEditorOptions] (val x: Self) extends AnyVal {
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
    def setEnableSplitViewResizing(value: Boolean): Self = this.set("enableSplitViewResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSplitViewResizing: Self = this.set("enableSplitViewResizing", js.undefined)
    @scala.inline
    def setIgnoreTrimWhitespace(value: Boolean): Self = this.set("ignoreTrimWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTrimWhitespace: Self = this.set("ignoreTrimWhitespace", js.undefined)
    @scala.inline
    def setMaxComputationTime(value: Double): Self = this.set("maxComputationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxComputationTime: Self = this.set("maxComputationTime", js.undefined)
    @scala.inline
    def setOriginalEditable(value: Boolean): Self = this.set("originalEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEditable: Self = this.set("originalEditable", js.undefined)
    @scala.inline
    def setRenderIndicators(value: Boolean): Self = this.set("renderIndicators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderIndicators: Self = this.set("renderIndicators", js.undefined)
    @scala.inline
    def setRenderSideBySide(value: Boolean): Self = this.set("renderSideBySide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderSideBySide: Self = this.set("renderSideBySide", js.undefined)
  }
  
}

