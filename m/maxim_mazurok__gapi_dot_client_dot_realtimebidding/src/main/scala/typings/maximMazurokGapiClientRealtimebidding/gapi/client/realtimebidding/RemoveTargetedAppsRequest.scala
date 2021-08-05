package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTargetedAppsRequest extends StObject {
  
  /**
    * A list of app IDs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted app IDs in
    * PretargetingConfig.appTargeting.mobileAppTargeting.values.
    */
  var appIds: js.UndefOr[js.Array[String]] = js.undefined
}
object RemoveTargetedAppsRequest {
  
  inline def apply(): RemoveTargetedAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetedAppsRequest]
  }
  
  extension [Self <: RemoveTargetedAppsRequest](x: Self) {
    
    inline def setAppIds(value: js.Array[String]): Self = StObject.set(x, "appIds", value.asInstanceOf[js.Any])
    
    inline def setAppIdsUndefined: Self = StObject.set(x, "appIds", js.undefined)
    
    inline def setAppIdsVarargs(value: String*): Self = StObject.set(x, "appIds", js.Array(value :_*))
  }
}
