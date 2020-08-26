package typings.mediumEditor.MediumEditor

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarOptions extends js.Object {
  var align: js.UndefOr[String] = js.native
  var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[js.Array[Button]] = js.native
  var diffLeft: js.UndefOr[Double] = js.native
  var diffTop: js.UndefOr[Double] = js.native
  var firstButtonClass: js.UndefOr[String] = js.native
  var lastButtonClass: js.UndefOr[String] = js.native
  var relativeContainer: js.UndefOr[Node] = js.native
  var standardizeSelectionStart: js.UndefOr[Boolean] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var sticky: js.UndefOr[Boolean] = js.native
  var stickyTopOffset: js.UndefOr[Double] = js.native
  var updateOnEmptySelection: js.UndefOr[Boolean] = js.native
}

object ToolbarOptions {
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  @scala.inline
  implicit class ToolbarOptionsOps[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAllowMultiParagraphSelection(value: Boolean): Self = this.set("allowMultiParagraphSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiParagraphSelection: Self = this.set("allowMultiParagraphSelection", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setDiffLeft(value: Double): Self = this.set("diffLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiffLeft: Self = this.set("diffLeft", js.undefined)
    @scala.inline
    def setDiffTop(value: Double): Self = this.set("diffTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiffTop: Self = this.set("diffTop", js.undefined)
    @scala.inline
    def setFirstButtonClass(value: String): Self = this.set("firstButtonClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstButtonClass: Self = this.set("firstButtonClass", js.undefined)
    @scala.inline
    def setLastButtonClass(value: String): Self = this.set("lastButtonClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastButtonClass: Self = this.set("lastButtonClass", js.undefined)
    @scala.inline
    def setRelativeContainer(value: Node): Self = this.set("relativeContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeContainer: Self = this.set("relativeContainer", js.undefined)
    @scala.inline
    def setStandardizeSelectionStart(value: Boolean): Self = this.set("standardizeSelectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardizeSelectionStart: Self = this.set("standardizeSelectionStart", js.undefined)
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    @scala.inline
    def setStickyTopOffset(value: Double): Self = this.set("stickyTopOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyTopOffset: Self = this.set("stickyTopOffset", js.undefined)
    @scala.inline
    def setUpdateOnEmptySelection(value: Boolean): Self = this.set("updateOnEmptySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateOnEmptySelection: Self = this.set("updateOnEmptySelection", js.undefined)
  }
  
}

