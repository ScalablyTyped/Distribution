package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query484 extends StObject {
  
  var path: OwnerString
  
  var query: `484`
}
object Query484 {
  
  inline def apply(path: OwnerString, query: `484`): Query484 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query484]
  }
  
  extension [Self <: Query484](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `484`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
