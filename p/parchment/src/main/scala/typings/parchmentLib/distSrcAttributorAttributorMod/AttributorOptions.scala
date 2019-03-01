package typings
package parchmentLib.distSrcAttributorAttributorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributorOptions extends js.Object {
  var scope: js.UndefOr[parchmentLib.distSrcRegistryMod.Scope] = js.undefined
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AttributorOptions {
  @scala.inline
  def apply(scope: parchmentLib.distSrcRegistryMod.Scope = null, whitelist: js.Array[java.lang.String] = null): AttributorOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[AttributorOptions]
  }
}

