package typings.next.distNextDashServerLibRouterRouterMod

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRouter extends js.Object {
  var asPath: String
  var pathname: String
  var query: ParsedUrlQuery
  var route: String
}

object BaseRouter {
  @scala.inline
  def apply(asPath: String, pathname: String, query: ParsedUrlQuery, route: String): BaseRouter = {
    val __obj = js.Dynamic.literal(asPath = asPath, pathname = pathname, query = query, route = route)
  
    __obj.asInstanceOf[BaseRouter]
  }
}

