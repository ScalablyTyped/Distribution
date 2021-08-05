package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRestrictionsForRepo extends StObject {
  
  var getRestrictionsForOrg: `712`
  
  var getRestrictionsForRepo: `713`
  
  var removeRestrictionsForOrg: `714`
  
  var removeRestrictionsForRepo: `715`
  
  var setRestrictionsForOrg: `716`
  
  var setRestrictionsForRepo: `717`
}
object GetRestrictionsForRepo {
  
  inline def apply(
    getRestrictionsForOrg: `712`,
    getRestrictionsForRepo: `713`,
    removeRestrictionsForOrg: `714`,
    removeRestrictionsForRepo: `715`,
    setRestrictionsForOrg: `716`,
    setRestrictionsForRepo: `717`
  ): GetRestrictionsForRepo = {
    val __obj = js.Dynamic.literal(getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any], setRestrictionsForOrg = setRestrictionsForOrg.asInstanceOf[js.Any], setRestrictionsForRepo = setRestrictionsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestrictionsForRepo]
  }
  
  extension [Self <: GetRestrictionsForRepo](x: Self) {
    
    inline def setGetRestrictionsForOrg(value: `712`): Self = StObject.set(x, "getRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetRestrictionsForRepo(value: `713`): Self = StObject.set(x, "getRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestrictionsForOrg(value: `714`): Self = StObject.set(x, "removeRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestrictionsForRepo(value: `715`): Self = StObject.set(x, "removeRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    inline def setSetRestrictionsForOrg(value: `716`): Self = StObject.set(x, "setRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    inline def setSetRestrictionsForRepo(value: `717`): Self = StObject.set(x, "setRestrictionsForRepo", value.asInstanceOf[js.Any])
  }
}
