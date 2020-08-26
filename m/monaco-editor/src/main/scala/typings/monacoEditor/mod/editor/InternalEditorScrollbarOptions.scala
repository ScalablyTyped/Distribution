package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalEditorScrollbarOptions extends js.Object {
  val alwaysConsumeMouseWheel: Boolean = js.native
  val arrowSize: Double = js.native
  val handleMouseWheel: Boolean = js.native
  val horizontal: ScrollbarVisibility = js.native
  val horizontalHasArrows: Boolean = js.native
  val horizontalScrollbarSize: Double = js.native
  val horizontalSliderSize: Double = js.native
  val useShadows: Boolean = js.native
  val vertical: ScrollbarVisibility = js.native
  val verticalHasArrows: Boolean = js.native
  val verticalScrollbarSize: Double = js.native
  val verticalSliderSize: Double = js.native
}

object InternalEditorScrollbarOptions {
  @scala.inline
  def apply(
    alwaysConsumeMouseWheel: Boolean,
    arrowSize: Double,
    handleMouseWheel: Boolean,
    horizontal: ScrollbarVisibility,
    horizontalHasArrows: Boolean,
    horizontalScrollbarSize: Double,
    horizontalSliderSize: Double,
    useShadows: Boolean,
    vertical: ScrollbarVisibility,
    verticalHasArrows: Boolean,
    verticalScrollbarSize: Double,
    verticalSliderSize: Double
  ): InternalEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal(alwaysConsumeMouseWheel = alwaysConsumeMouseWheel.asInstanceOf[js.Any], arrowSize = arrowSize.asInstanceOf[js.Any], handleMouseWheel = handleMouseWheel.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], horizontalHasArrows = horizontalHasArrows.asInstanceOf[js.Any], horizontalScrollbarSize = horizontalScrollbarSize.asInstanceOf[js.Any], horizontalSliderSize = horizontalSliderSize.asInstanceOf[js.Any], useShadows = useShadows.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalHasArrows = verticalHasArrows.asInstanceOf[js.Any], verticalScrollbarSize = verticalScrollbarSize.asInstanceOf[js.Any], verticalSliderSize = verticalSliderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorScrollbarOptions]
  }
  @scala.inline
  implicit class InternalEditorScrollbarOptionsOps[Self <: InternalEditorScrollbarOptions] (val x: Self) extends AnyVal {
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
    def setAlwaysConsumeMouseWheel(value: Boolean): Self = this.set("alwaysConsumeMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowSize(value: Double): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleMouseWheel(value: Boolean): Self = this.set("handleMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: ScrollbarVisibility): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalHasArrows(value: Boolean): Self = this.set("horizontalHasArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalScrollbarSize(value: Double): Self = this.set("horizontalScrollbarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalSliderSize(value: Double): Self = this.set("horizontalSliderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseShadows(value: Boolean): Self = this.set("useShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: ScrollbarVisibility): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalHasArrows(value: Boolean): Self = this.set("verticalHasArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalScrollbarSize(value: Double): Self = this.set("verticalScrollbarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalSliderSize(value: Double): Self = this.set("verticalSliderSize", value.asInstanceOf[js.Any])
  }
  
}

