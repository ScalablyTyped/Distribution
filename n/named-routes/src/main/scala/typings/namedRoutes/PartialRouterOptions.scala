package typings.namedRoutes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<named-routes.named-routes.RouterOptions> */
trait PartialRouterOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
}

object PartialRouterOptions {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[Boolean] = js.undefined): PartialRouterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRouterOptions]
  }
}

