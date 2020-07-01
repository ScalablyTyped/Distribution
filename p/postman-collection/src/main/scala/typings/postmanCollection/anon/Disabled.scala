package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled[TDefinition /* <: js.Object */] extends js.Object {
  var disabled: Boolean
  var info: TDefinition
}

object Disabled {
  @scala.inline
  def apply[/* <: js.Object */ TDefinition](disabled: Boolean, info: TDefinition): Disabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[TDefinition]]
  }
}

