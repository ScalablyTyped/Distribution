package typings.navigation

import typings.navigation.mod.Crumb
import typings.navigation.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrumbs extends js.Object {
  var crumbs: js.Array[Crumb]
  var data: js.Any
  var state: State
}

object AnonCrumbs {
  @scala.inline
  def apply(crumbs: js.Array[Crumb], data: js.Any, state: State): AnonCrumbs = {
    val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCrumbs]
  }
}

