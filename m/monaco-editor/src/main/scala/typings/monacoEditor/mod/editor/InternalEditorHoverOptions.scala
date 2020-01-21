package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalEditorHoverOptions extends js.Object {
  val delay: Double
  val enabled: Boolean
  val sticky: Boolean
}

object InternalEditorHoverOptions {
  @scala.inline
  def apply(delay: Double, enabled: Boolean, sticky: Boolean): InternalEditorHoverOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalEditorHoverOptions]
  }
}

