package typings.navigo.anon

import typings.navigo.mod.NavigoHooks
import typings.navigo.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var hooks: NavigoHooks
  var name: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[Params] = js.undefined
  var query: String
  var url: String
}

object Hooks {
  @scala.inline
  def apply(hooks: NavigoHooks, query: String, url: String, name: String = null, params: Params = null): Hooks = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hooks]
  }
}

