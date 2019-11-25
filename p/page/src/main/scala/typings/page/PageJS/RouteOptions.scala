package typings.page.PageJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  /**
    * enable case-sensitive routes
    * @type {[type]}
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * enable strict matching for trailing slashes
    * @type {[type]}
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(sensitive: js.UndefOr[Boolean] = js.undefined, strict: js.UndefOr[Boolean] = js.undefined): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

