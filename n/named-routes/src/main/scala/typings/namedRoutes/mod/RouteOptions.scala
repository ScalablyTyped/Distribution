package typings.namedRoutes.mod

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
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursiveWildcard = recursiveWildcard.asInstanceOf[js.Any], wildcardInPairs = wildcardInPairs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteOptions]
  }
}

