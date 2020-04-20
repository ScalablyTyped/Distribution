package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled[TDefinition /* <: js.Object */] extends js.Object {
  var disabled: Boolean
  var info: TDefinition
}

object AnonDisabled {
  @scala.inline
  def apply[TDefinition /* <: js.Object */](disabled: Boolean, info: TDefinition): AnonDisabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled[TDefinition]]
  }
}

