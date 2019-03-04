package typings
package nextDashServerLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteChangeError extends js.Object {
  var cancelled: scala.Boolean
}

object RouteChangeError {
  @scala.inline
  def apply(cancelled: scala.Boolean): RouteChangeError = {
    val __obj = js.Dynamic.literal(cancelled = cancelled)
  
    __obj.asInstanceOf[RouteChangeError]
  }
}

