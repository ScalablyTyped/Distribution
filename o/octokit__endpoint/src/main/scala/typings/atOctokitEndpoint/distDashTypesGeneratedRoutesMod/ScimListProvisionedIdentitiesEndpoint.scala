package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimListProvisionedIdentitiesEndpoint extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var org: String
  var startIndex: js.UndefOr[Double] = js.undefined
}

object ScimListProvisionedIdentitiesEndpoint {
  @scala.inline
  def apply(org: String, count: Int | Double = null, filter: String = null, startIndex: Int | Double = null): ScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(org = org)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimListProvisionedIdentitiesEndpoint]
  }
}

