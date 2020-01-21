package typings.monacoEditor.mod.editor

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
    val __obj = js.Dynamic.literal(arrowSize = arrowSize.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], handleMouseWheel = handleMouseWheel.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], horizontalHasArrows = horizontalHasArrows.asInstanceOf[js.Any], horizontalScrollbarSize = horizontalScrollbarSize.asInstanceOf[js.Any], horizontalSliderSize = horizontalSliderSize.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], useShadows = useShadows.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalHasArrows = verticalHasArrows.asInstanceOf[js.Any], verticalScrollbarSize = verticalScrollbarSize.asInstanceOf[js.Any], verticalSliderSize = verticalSliderSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalEditorScrollbarOptions]
  }
}

