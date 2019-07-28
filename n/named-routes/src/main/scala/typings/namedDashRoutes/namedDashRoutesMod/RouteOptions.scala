package typings.namedDashRoutes.namedDashRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var caseSensitive: Boolean
  var name: String
  var recursiveWildcard: Boolean
  var wildcardInPairs: Boolean
}

object RouteOptions {
  @scala.inline
  def apply(caseSensitive: Boolean, name: String, recursiveWildcard: Boolean, wildcardInPairs: Boolean): RouteOptions = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive, name = name, recursiveWildcard = recursiveWildcard, wildcardInPairs = wildcardInPairs)
  
    __obj.asInstanceOf[RouteOptions]
  }
}

