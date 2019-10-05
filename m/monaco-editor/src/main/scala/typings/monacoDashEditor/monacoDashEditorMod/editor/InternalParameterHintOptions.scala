package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalParameterHintOptions extends js.Object {
  val cycle: Boolean
  val enabled: Boolean
}

object InternalParameterHintOptions {
  @scala.inline
  def apply(cycle: Boolean, enabled: Boolean): InternalParameterHintOptions = {
    val __obj = js.Dynamic.literal(cycle = cycle, enabled = enabled)
  
    __obj.asInstanceOf[InternalParameterHintOptions]
  }
}

