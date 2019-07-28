package typings.nextDashServer.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteChangeError extends js.Object {
  var cancelled: Boolean
}

object RouteChangeError {
  @scala.inline
  def apply(cancelled: Boolean): RouteChangeError = {
    val __obj = js.Dynamic.literal(cancelled = cancelled)
  
    __obj.asInstanceOf[RouteChangeError]
  }
}

