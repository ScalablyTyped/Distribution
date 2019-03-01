package typings
package namedDashRoutesLib.namedDashRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var caseSensitive: scala.Boolean
  var name: java.lang.String
  var recursiveWildcard: scala.Boolean
  var wildcardInPairs: scala.Boolean
}

object RouteOptions {
  @scala.inline
  def apply(
    caseSensitive: scala.Boolean,
    name: java.lang.String,
    recursiveWildcard: scala.Boolean,
    wildcardInPairs: scala.Boolean
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("caseSensitive")(caseSensitive)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("recursiveWildcard")(recursiveWildcard)
    __obj.updateDynamic("wildcardInPairs")(wildcardInPairs)
    __obj.asInstanceOf[RouteOptions]
  }
}

