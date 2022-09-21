package typings.naverWhale.whale.tabs

import typings.chrome.anon.WindowId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions extends StObject {
  
  /** Optional. Configurations for creating a group. Cannot be used if groupId is already specified. */
  var createProperties: js.UndefOr[WindowId] = js.undefined
  
  /** Optional. The ID of the group to add the tabs to. If not specified, a new group will be created. */
  var groupId: js.UndefOr[Double] = js.undefined
  
  /** TOptional. he tab ID or list of tab IDs to add to the specified group. */
  var tabIds: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object GroupOptions {
  
  inline def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  extension [Self <: GroupOptions](x: Self) {
    
    inline def setCreateProperties(value: WindowId): Self = StObject.set(x, "createProperties", value.asInstanceOf[js.Any])
    
    inline def setCreatePropertiesUndefined: Self = StObject.set(x, "createProperties", js.undefined)
    
    inline def setGroupId(value: Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setTabIds(value: Double | js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
    
    inline def setTabIdsUndefined: Self = StObject.set(x, "tabIds", js.undefined)
    
    inline def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value*))
  }
}
