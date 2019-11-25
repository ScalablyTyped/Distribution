package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled[TDefinition /* <: js.Object */] extends js.Object {
  var disabled: Boolean
  var info: TDefinition
}

object Anon_Disabled {
  @scala.inline
  def apply[TDefinition /* <: js.Object */](disabled: Boolean, info: TDefinition): Anon_Disabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Disabled[TDefinition]]
  }
}

