package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOctocat extends StObject {
  
  var get: `1183`
  
  var getAllVersions: `1184`
  
  var getOctocat: `1185`
  
  var getZen: `1186`
  
  var root: `1187`
}
object GetOctocat {
  
  inline def apply(get: `1183`, getAllVersions: `1184`, getOctocat: `1185`, getZen: `1186`, root: `1187`): GetOctocat = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllVersions = getAllVersions.asInstanceOf[js.Any], getOctocat = getOctocat.asInstanceOf[js.Any], getZen = getZen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOctocat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOctocat] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `1183`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAllVersions(value: `1184`): Self = StObject.set(x, "getAllVersions", value.asInstanceOf[js.Any])
    
    inline def setGetOctocat(value: `1185`): Self = StObject.set(x, "getOctocat", value.asInstanceOf[js.Any])
    
    inline def setGetZen(value: `1186`): Self = StObject.set(x, "getZen", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: `1187`): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
