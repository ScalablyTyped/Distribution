package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetForRepo extends StObject {
  
  var get: `1228`
  
  var getAllCommonlyUsed: `1229`
  
  var getForRepo: `1230`
}
object GetForRepo {
  
  inline def apply(get: `1228`, getAllCommonlyUsed: `1229`, getForRepo: `1230`): GetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllCommonlyUsed = getAllCommonlyUsed.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetForRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetForRepo] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `1228`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAllCommonlyUsed(value: `1229`): Self = StObject.set(x, "getAllCommonlyUsed", value.asInstanceOf[js.Any])
    
    inline def setGetForRepo(value: `1230`): Self = StObject.set(x, "getForRepo", value.asInstanceOf[js.Any])
  }
}
