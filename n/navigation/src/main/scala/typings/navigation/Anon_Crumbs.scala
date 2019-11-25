package typings.navigation

import typings.navigation.navigationMod.Crumb
import typings.navigation.navigationMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Crumbs extends js.Object {
  var crumbs: js.Array[Crumb]
  var data: js.Any
  var state: State
}

object Anon_Crumbs {
  @scala.inline
  def apply(crumbs: js.Array[Crumb], data: js.Any, state: State): Anon_Crumbs = {
    val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Crumbs]
  }
}

