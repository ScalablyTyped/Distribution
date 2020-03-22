package typings.next.buildMod

import typings.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SsgRoute extends js.Object {
  var dataRoute: String
  var initialRevalidateSeconds: Double | `false`
  var srcRoute: String | Null
}

object SsgRoute {
  @scala.inline
  def apply(dataRoute: String, initialRevalidateSeconds: Double | `false`, srcRoute: String = null): SsgRoute = {
    val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], initialRevalidateSeconds = initialRevalidateSeconds.asInstanceOf[js.Any])
    if (srcRoute != null) __obj.updateDynamic("srcRoute")(srcRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsgRoute]
  }
}

