package typings.next.serverRouterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteResult extends js.Object {
  var finished: Boolean
  var pathname: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[StringDictionary[String]] = js.undefined
}

object RouteResult {
  @scala.inline
  def apply(finished: Boolean, pathname: String = null, query: StringDictionary[String] = null): RouteResult = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResult]
  }
}

