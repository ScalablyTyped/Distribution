package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.hidden
import typings.monacoEditor.monacoEditorStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorScrollbarOptions extends js.Object {
  /**
    * Always consume mouse wheel events (always call preventDefault() and stopPropagation() on the browser events).
    * Defaults to true.
    */
  var alwaysConsumeMouseWheel: js.UndefOr[Boolean] = js.native
  /**
    * The size of arrows (if displayed).
    * Defaults to 11.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  /**
    * Listen to mouse wheel events and react to them by scrolling.
    * Defaults to true.
    */
  var handleMouseWheel: js.UndefOr[Boolean] = js.native
  /**
    * Render horizontal scrollbar.
    * Defaults to 'auto'.
    */
  var horizontal: js.UndefOr[auto | visible | hidden] = js.native
  /**
    * Render arrows at the left and right of the horizontal scrollbar.
    * Defaults to false.
    */
  var horizontalHasArrows: js.UndefOr[Boolean] = js.native
  /**
    * Height in pixels for the horizontal scrollbar.
    * Defaults to 10 (px).
    */
  var horizontalScrollbarSize: js.UndefOr[Double] = js.native
  /**
    * Height in pixels for the horizontal slider.
    * Defaults to `horizontalScrollbarSize`.
    */
  var horizontalSliderSize: js.UndefOr[Double] = js.native
  /**
    * Cast horizontal and vertical shadows when the content is scrolled.
    * Defaults to true.
    */
  var useShadows: js.UndefOr[Boolean] = js.native
  /**
    * Render vertical scrollbar.
    * Defaults to 'auto'.
    */
  var vertical: js.UndefOr[auto | visible | hidden] = js.native
  /**
    * Render arrows at the top and bottom of the vertical scrollbar.
    * Defaults to false.
    */
  var verticalHasArrows: js.UndefOr[Boolean] = js.native
  /**
    * Width in pixels for the vertical scrollbar.
    * Defaults to 10 (px).
    */
  var verticalScrollbarSize: js.UndefOr[Double] = js.native
  /**
    * Width in pixels for the vertical slider.
    * Defaults to `verticalScrollbarSize`.
    */
  var verticalSliderSize: js.UndefOr[Double] = js.native
}

object IEditorScrollbarOptions {
  @scala.inline
  def apply(): IEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorScrollbarOptions]
  }
  @scala.inline
  implicit class IEditorScrollbarOptionsOps[Self <: IEditorScrollbarOptions] (val x: Self) extends AnyVal {
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
    def deleteAlwaysConsumeMouseWheel: Self = this.set("alwaysConsumeMouseWheel", js.undefined)
    @scala.inline
    def setArrowSize(value: Double): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
    @scala.inline
    def setHandleMouseWheel(value: Boolean): Self = this.set("handleMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleMouseWheel: Self = this.set("handleMouseWheel", js.undefined)
    @scala.inline
    def setHorizontal(value: auto | visible | hidden): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setHorizontalHasArrows(value: Boolean): Self = this.set("horizontalHasArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalHasArrows: Self = this.set("horizontalHasArrows", js.undefined)
    @scala.inline
    def setHorizontalScrollbarSize(value: Double): Self = this.set("horizontalScrollbarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalScrollbarSize: Self = this.set("horizontalScrollbarSize", js.undefined)
    @scala.inline
    def setHorizontalSliderSize(value: Double): Self = this.set("horizontalSliderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalSliderSize: Self = this.set("horizontalSliderSize", js.undefined)
    @scala.inline
    def setUseShadows(value: Boolean): Self = this.set("useShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseShadows: Self = this.set("useShadows", js.undefined)
    @scala.inline
    def setVertical(value: auto | visible | hidden): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    @scala.inline
    def setVerticalHasArrows(value: Boolean): Self = this.set("verticalHasArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalHasArrows: Self = this.set("verticalHasArrows", js.undefined)
    @scala.inline
    def setVerticalScrollbarSize(value: Double): Self = this.set("verticalScrollbarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalScrollbarSize: Self = this.set("verticalScrollbarSize", js.undefined)
    @scala.inline
    def setVerticalSliderSize(value: Double): Self = this.set("verticalSliderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSliderSize: Self = this.set("verticalSliderSize", js.undefined)
  }
  
}

