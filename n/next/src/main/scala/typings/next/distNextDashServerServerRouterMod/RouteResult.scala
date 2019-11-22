package typings.next.distNextDashServerServerRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteResult extends js.Object {
  var finished: Boolean
  var pathname: js.UndefOr[String] = js.undefined
}

object RouteResult {
  @scala.inline
  def apply(finished: Boolean, pathname: String = null): RouteResult = {
    val __obj = js.Dynamic.literal(finished = finished)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    __obj.asInstanceOf[RouteResult]
  }
}

