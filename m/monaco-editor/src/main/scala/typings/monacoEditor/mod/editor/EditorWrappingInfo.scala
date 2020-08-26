package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorWrappingInfo extends js.Object {
  val isDominatedByLongLines: Boolean = js.native
  val isViewportWrapping: Boolean = js.native
  val isWordWrapMinified: Boolean = js.native
  val wrappingColumn: Double = js.native
}

object EditorWrappingInfo {
  @scala.inline
  def apply(
    isDominatedByLongLines: Boolean,
    isViewportWrapping: Boolean,
    isWordWrapMinified: Boolean,
    wrappingColumn: Double
  ): EditorWrappingInfo = {
    val __obj = js.Dynamic.literal(isDominatedByLongLines = isDominatedByLongLines.asInstanceOf[js.Any], isViewportWrapping = isViewportWrapping.asInstanceOf[js.Any], isWordWrapMinified = isWordWrapMinified.asInstanceOf[js.Any], wrappingColumn = wrappingColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWrappingInfo]
  }
  @scala.inline
  implicit class EditorWrappingInfoOps[Self <: EditorWrappingInfo] (val x: Self) extends AnyVal {
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
    def setIsDominatedByLongLines(value: Boolean): Self = this.set("isDominatedByLongLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsViewportWrapping(value: Boolean): Self = this.set("isViewportWrapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWordWrapMinified(value: Boolean): Self = this.set("isWordWrapMinified", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrappingColumn(value: Double): Self = this.set("wrappingColumn", value.asInstanceOf[js.Any])
  }
  
}

