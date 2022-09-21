package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameString extends StObject {
  
  var path: EnvironmentnameString
  
  var query: `426`
}
object PathEnvironmentnameString {
  
  inline def apply(path: EnvironmentnameString, query: `426`): PathEnvironmentnameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameString]
  }
  
  extension [Self <: PathEnvironmentnameString](x: Self) {
    
    inline def setPath(value: EnvironmentnameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
