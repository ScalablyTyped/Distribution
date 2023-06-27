package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOctocat extends StObject {
  
  var get: `1233`
  
  var getAllVersions: `1234`
  
  var getOctocat: `1235`
  
  var getZen: `1236`
  
  var root: `1237`
}
object GetOctocat {
  
  inline def apply(get: `1233`, getAllVersions: `1234`, getOctocat: `1235`, getZen: `1236`, root: `1237`): GetOctocat = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllVersions = getAllVersions.asInstanceOf[js.Any], getOctocat = getOctocat.asInstanceOf[js.Any], getZen = getZen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOctocat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOctocat] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `1233`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAllVersions(value: `1234`): Self = StObject.set(x, "getAllVersions", value.asInstanceOf[js.Any])
    
    inline def setGetOctocat(value: `1235`): Self = StObject.set(x, "getOctocat", value.asInstanceOf[js.Any])
    
    inline def setGetZen(value: `1236`): Self = StObject.set(x, "getZen", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: `1237`): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
