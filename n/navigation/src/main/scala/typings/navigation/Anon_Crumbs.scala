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
    val __obj = js.Dynamic.literal(crumbs = crumbs, data = data, state = state)
  
    __obj.asInstanceOf[Anon_Crumbs]
  }
}

