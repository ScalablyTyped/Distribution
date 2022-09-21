package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQueryClientipLocation extends StObject {
  
  var path: OwnerString
  
  var query: ClientipLocation
}
object PathOwnerStringQueryClientipLocation {
  
  inline def apply(path: OwnerString, query: ClientipLocation): PathOwnerStringQueryClientipLocation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQueryClientipLocation]
  }
  
  extension [Self <: PathOwnerStringQueryClientipLocation](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ClientipLocation): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
