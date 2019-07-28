package typings.navigo

import typings.navigo.navigoMod.NavigoHooks
import typings.navigo.navigoMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hooks extends js.Object {
  var hooks: NavigoHooks
  var name: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[Params] = js.undefined
  var query: String
  var url: String
}

object Anon_Hooks {
  @scala.inline
  def apply(hooks: NavigoHooks, query: String, url: String, name: String = null, params: Params = null): Anon_Hooks = {
    val __obj = js.Dynamic.literal(hooks = hooks, query = query, url = url)
    if (name != null) __obj.updateDynamic("name")(name)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Hooks]
  }
}

