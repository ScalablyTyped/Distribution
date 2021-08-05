package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTargetedAppsRequest extends StObject {
  
  /**
    * A list of app IDs to target in the pretargeting configuration. These values will be added to the list of targeted app IDs in
    * PretargetingConfig.appTargeting.mobileAppTargeting.values.
    */
  var appIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The targeting mode that should be applied to the list of app IDs. If there are existing targeted app IDs, must be equal to the existing
    * PretargetingConfig.appTargeting.mobileAppTargeting.targetingMode or a 400 bad request error will be returned.
    */
  var targetingMode: js.UndefOr[String] = js.undefined
}
object AddTargetedAppsRequest {
  
  inline def apply(): AddTargetedAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTargetedAppsRequest]
  }
  
  extension [Self <: AddTargetedAppsRequest](x: Self) {
    
    inline def setAppIds(value: js.Array[String]): Self = StObject.set(x, "appIds", value.asInstanceOf[js.Any])
    
    inline def setAppIdsUndefined: Self = StObject.set(x, "appIds", js.undefined)
    
    inline def setAppIdsVarargs(value: String*): Self = StObject.set(x, "appIds", js.Array(value :_*))
    
    inline def setTargetingMode(value: String): Self = StObject.set(x, "targetingMode", value.asInstanceOf[js.Any])
    
    inline def setTargetingModeUndefined: Self = StObject.set(x, "targetingMode", js.undefined)
  }
}
