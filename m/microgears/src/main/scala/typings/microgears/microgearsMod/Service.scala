package typings.microgears.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var name: String
  var namespace: String
  var pathname: js.UndefOr[String] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    name: String,
    namespace: String,
    async: js.UndefOr[Boolean] = js.undefined,
    pathname: String = null
  ): Service = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    __obj.asInstanceOf[Service]
  }
}

