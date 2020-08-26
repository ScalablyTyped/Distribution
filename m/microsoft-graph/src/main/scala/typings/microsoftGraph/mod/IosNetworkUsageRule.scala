package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosNetworkUsageRule extends js.Object {
  // If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
  var cellularDataBlockWhenRoaming: js.UndefOr[Boolean] = js.native
  // If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
  var cellularDataBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500
    * elements.
    */
  var managedApps: js.UndefOr[js.Array[AppListItem]] = js.native
}

object IosNetworkUsageRule {
  @scala.inline
  def apply(): IosNetworkUsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosNetworkUsageRule]
  }
  @scala.inline
  implicit class IosNetworkUsageRuleOps[Self <: IosNetworkUsageRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellularDataBlockWhenRoaming(value: Boolean): Self = this.set("cellularDataBlockWhenRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularDataBlockWhenRoaming: Self = this.set("cellularDataBlockWhenRoaming", js.undefined)
    @scala.inline
    def setCellularDataBlocked(value: Boolean): Self = this.set("cellularDataBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularDataBlocked: Self = this.set("cellularDataBlocked", js.undefined)
    @scala.inline
    def setManagedAppsVarargs(value: AppListItem*): Self = this.set("managedApps", js.Array(value :_*))
    @scala.inline
    def setManagedApps(value: js.Array[AppListItem]): Self = this.set("managedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedApps: Self = this.set("managedApps", js.undefined)
  }
  
}

