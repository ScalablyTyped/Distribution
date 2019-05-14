package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimListProvisionedIdentities_Options extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var org: java.lang.String
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

object ScimListProvisionedIdentities_Options {
  @scala.inline
  def apply(
    org: java.lang.String,
    count: scala.Int | scala.Double = null,
    filter: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null
  ): ScimListProvisionedIdentities_Options = {
    val __obj = js.Dynamic.literal(org = org)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimListProvisionedIdentities_Options]
  }
}

