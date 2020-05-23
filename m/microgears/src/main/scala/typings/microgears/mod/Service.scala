package typings.microgears.mod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

