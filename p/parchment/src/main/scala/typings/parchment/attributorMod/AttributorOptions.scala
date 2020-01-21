package typings.parchment.attributorMod

import typings.parchment.registryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributorOptions extends js.Object {
  var scope: js.UndefOr[Scope] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object AttributorOptions {
  @scala.inline
  def apply(scope: Scope = null, whitelist: js.Array[String] = null): AttributorOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributorOptions]
  }
}

