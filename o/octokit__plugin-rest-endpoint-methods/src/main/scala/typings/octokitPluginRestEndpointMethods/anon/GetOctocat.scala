package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOctocat extends StObject {
  
  var get: `1229`
  
  var getAllVersions: `1230`
  
  var getOctocat: `1231`
  
  var getZen: `1232`
  
  var root: `1233`
}
object GetOctocat {
  
  inline def apply(get: `1229`, getAllVersions: `1230`, getOctocat: `1231`, getZen: `1232`, root: `1233`): GetOctocat = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllVersions = getAllVersions.asInstanceOf[js.Any], getOctocat = getOctocat.asInstanceOf[js.Any], getZen = getZen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOctocat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOctocat] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `1229`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAllVersions(value: `1230`): Self = StObject.set(x, "getAllVersions", value.asInstanceOf[js.Any])
    
    inline def setGetOctocat(value: `1231`): Self = StObject.set(x, "getOctocat", value.asInstanceOf[js.Any])
    
    inline def setGetZen(value: `1232`): Self = StObject.set(x, "getZen", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: `1233`): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
