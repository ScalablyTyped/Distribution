package typings.parchment.distSrcAttributorAttributorMod

import typings.parchment.distSrcRegistryMod.Scope
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
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[AttributorOptions]
  }
}

