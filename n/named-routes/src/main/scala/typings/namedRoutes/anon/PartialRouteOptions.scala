package typings.namedRoutes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<named-routes.named-routes.RouteOptions> */
trait PartialRouteOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var recursiveWildcard: js.UndefOr[Boolean] = js.undefined
  var wildcardInPairs: js.UndefOr[Boolean] = js.undefined
}

object PartialRouteOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    recursiveWildcard: js.UndefOr[Boolean] = js.undefined,
    wildcardInPairs: js.UndefOr[Boolean] = js.undefined
  ): PartialRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(recursiveWildcard)) __obj.updateDynamic("recursiveWildcard")(recursiveWildcard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcardInPairs)) __obj.updateDynamic("wildcardInPairs")(wildcardInPairs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRouteOptions]
  }
}

