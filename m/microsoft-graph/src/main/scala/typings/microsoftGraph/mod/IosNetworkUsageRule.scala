package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosNetworkUsageRule extends StObject {
  
  // If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
  var cellularDataBlockWhenRoaming: js.UndefOr[Boolean] = js.undefined
  
  // If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
  var cellularDataBlocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500
    * elements.
    */
  var managedApps: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
}
object IosNetworkUsageRule {
  
  @scala.inline
  def apply(): IosNetworkUsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosNetworkUsageRule]
  }
  
  @scala.inline
  implicit class IosNetworkUsageRuleMutableBuilder[Self <: IosNetworkUsageRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellularDataBlockWhenRoaming(value: Boolean): Self = StObject.set(x, "cellularDataBlockWhenRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularDataBlockWhenRoamingUndefined: Self = StObject.set(x, "cellularDataBlockWhenRoaming", js.undefined)
    
    @scala.inline
    def setCellularDataBlocked(value: Boolean): Self = StObject.set(x, "cellularDataBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularDataBlockedUndefined: Self = StObject.set(x, "cellularDataBlocked", js.undefined)
    
    @scala.inline
    def setManagedApps(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "managedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedAppsNull: Self = StObject.set(x, "managedApps", null)
    
    @scala.inline
    def setManagedAppsUndefined: Self = StObject.set(x, "managedApps", js.undefined)
    
    @scala.inline
    def setManagedAppsVarargs(value: AppListItem*): Self = StObject.set(x, "managedApps", js.Array(value :_*))
  }
}
