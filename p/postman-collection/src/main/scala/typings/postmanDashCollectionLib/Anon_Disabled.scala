package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled[TDefinition /* <: js.Object */] extends js.Object {
  var disabled: scala.Boolean
  var info: TDefinition
}

object Anon_Disabled {
  @scala.inline
  def apply[TDefinition /* <: js.Object */](disabled: scala.Boolean, info: TDefinition): Anon_Disabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled, info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Disabled[TDefinition]]
  }
}

