package typings
package navigoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hooks extends js.Object {
  var hooks: navigoLib.navigoMod.NavigoHooks
  var name: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[navigoLib.navigoMod.Params] = js.undefined
  var query: java.lang.String
  var url: java.lang.String
}

object Anon_Hooks {
  @scala.inline
  def apply(
    hooks: navigoLib.navigoMod.NavigoHooks,
    query: java.lang.String,
    url: java.lang.String,
    name: java.lang.String = null,
    params: navigoLib.navigoMod.Params = null
  ): Anon_Hooks = {
    val __obj = js.Dynamic.literal(hooks = hooks, query = query, url = url)
    if (name != null) __obj.updateDynamic("name")(name)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Hooks]
  }
}

