package typings
package pageLib.PageJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  /**
    * enable case-sensitive routes
    * @type {[type]}
    */
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * enable strict matching for trailing slashes
    * @type {[type]}
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RouteOptions]
  }
}

