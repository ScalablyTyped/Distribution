package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryManifest extends StObject {
  
  var path: OwnerString
  
  var query: Manifest
}
object QueryManifest {
  
  inline def apply(path: OwnerString, query: Manifest): QueryManifest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryManifest]
  }
  
  extension [Self <: QueryManifest](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Manifest): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
