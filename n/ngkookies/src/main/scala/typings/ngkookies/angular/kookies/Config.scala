package typings.ngkookies.angular.kookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var json: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(json: js.UndefOr[Boolean] = js.undefined, raw: js.UndefOr[Boolean] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Config]
  }
}

