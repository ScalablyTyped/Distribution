package typings.navigation

import typings.navigation.navigationMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var state: State
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, state: State): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, state = state)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

