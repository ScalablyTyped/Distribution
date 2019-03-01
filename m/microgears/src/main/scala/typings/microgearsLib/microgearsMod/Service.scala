package typings
package microgearsLib.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var namespace: java.lang.String
  var pathname: js.UndefOr[java.lang.String] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    name: java.lang.String,
    namespace: java.lang.String,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    pathname: java.lang.String = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    __obj.asInstanceOf[Service]
  }
}

