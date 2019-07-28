package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkAsReadEndpoint extends js.Object {
  var last_read_at: js.UndefOr[String] = js.undefined
}

object ActivityMarkAsReadEndpoint {
  @scala.inline
  def apply(last_read_at: String = null): ActivityMarkAsReadEndpoint = {
    val __obj = js.Dynamic.literal()
    if (last_read_at != null) __obj.updateDynamic("last_read_at")(last_read_at)
    __obj.asInstanceOf[ActivityMarkAsReadEndpoint]
  }
}

