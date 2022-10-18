package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetForRepo extends StObject {
  
  var get: `1137`
  
  var getAllCommonlyUsed: `1138`
  
  var getForRepo: `1139`
}
object GetForRepo {
  
  inline def apply(get: `1137`, getAllCommonlyUsed: `1138`, getForRepo: `1139`): GetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllCommonlyUsed = getAllCommonlyUsed.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetForRepo]
  }
  
  extension [Self <: GetForRepo](x: Self) {
    
    inline def setGet(value: `1137`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAllCommonlyUsed(value: `1138`): Self = StObject.set(x, "getAllCommonlyUsed", value.asInstanceOf[js.Any])
    
    inline def setGetForRepo(value: `1139`): Self = StObject.set(x, "getForRepo", value.asInstanceOf[js.Any])
  }
}
