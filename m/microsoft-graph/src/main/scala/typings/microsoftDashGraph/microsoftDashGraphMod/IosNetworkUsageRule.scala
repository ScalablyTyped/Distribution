package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosNetworkUsageRule extends js.Object {
  // If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
  var cellularDataBlockWhenRoaming: js.UndefOr[Boolean] = js.undefined
  // If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
  var cellularDataBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500
    * elements.
    */
  var managedApps: js.UndefOr[js.Array[AppListItem]] = js.undefined
}

object IosNetworkUsageRule {
  @scala.inline
  def apply(
    cellularDataBlockWhenRoaming: js.UndefOr[Boolean] = js.undefined,
    cellularDataBlocked: js.UndefOr[Boolean] = js.undefined,
    managedApps: js.Array[AppListItem] = null
  ): IosNetworkUsageRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellularDataBlockWhenRoaming)) __obj.updateDynamic("cellularDataBlockWhenRoaming")(cellularDataBlockWhenRoaming)
    if (!js.isUndefined(cellularDataBlocked)) __obj.updateDynamic("cellularDataBlocked")(cellularDataBlocked)
    if (managedApps != null) __obj.updateDynamic("managedApps")(managedApps)
    __obj.asInstanceOf[IosNetworkUsageRule]
  }
}

