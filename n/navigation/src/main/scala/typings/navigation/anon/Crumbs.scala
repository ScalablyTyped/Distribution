package typings.navigation.anon

import typings.navigation.mod.Crumb
import typings.navigation.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crumbs extends js.Object {
  var crumbs: js.Array[Crumb]
  var data: js.Any
  var state: State
}

object Crumbs {
  @scala.inline
  def apply(crumbs: js.Array[Crumb], data: js.Any, state: State): Crumbs = {
    val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crumbs]
  }
}

