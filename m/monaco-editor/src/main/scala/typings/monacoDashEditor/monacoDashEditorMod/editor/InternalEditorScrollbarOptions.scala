package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalEditorScrollbarOptions extends js.Object {
  val arrowSize: Double
  val fastScrollSensitivity: Double
  val handleMouseWheel: Boolean
  val horizontal: ScrollbarVisibility
  val horizontalHasArrows: Boolean
  val horizontalScrollbarSize: Double
  val horizontalSliderSize: Double
  val mouseWheelScrollSensitivity: Double
  val useShadows: Boolean
  val vertical: ScrollbarVisibility
  val verticalHasArrows: Boolean
  val verticalScrollbarSize: Double
  val verticalSliderSize: Double
}

object InternalEditorScrollbarOptions {
  @scala.inline
  def apply(
    arrowSize: Double,
    fastScrollSensitivity: Double,
    handleMouseWheel: Boolean,
    horizontal: ScrollbarVisibility,
    horizontalHasArrows: Boolean,
    horizontalScrollbarSize: Double,
    horizontalSliderSize: Double,
    mouseWheelScrollSensitivity: Double,
    useShadows: Boolean,
    vertical: ScrollbarVisibility,
    verticalHasArrows: Boolean,
    verticalScrollbarSize: Double,
    verticalSliderSize: Double
  ): InternalEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal(arrowSize = arrowSize, fastScrollSensitivity = fastScrollSensitivity, handleMouseWheel = handleMouseWheel, horizontal = horizontal, horizontalHasArrows = horizontalHasArrows, horizontalScrollbarSize = horizontalScrollbarSize, horizontalSliderSize = horizontalSliderSize, mouseWheelScrollSensitivity = mouseWheelScrollSensitivity, useShadows = useShadows, vertical = vertical, verticalHasArrows = verticalHasArrows, verticalScrollbarSize = verticalScrollbarSize, verticalSliderSize = verticalSliderSize)
  
    __obj.asInstanceOf[InternalEditorScrollbarOptions]
  }
}

