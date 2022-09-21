package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query112 extends StObject {
  
  var path: Org
  
  var query: `112`
}
object Query112 {
  
  inline def apply(path: Org, query: `112`): Query112 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query112]
  }
  
  extension [Self <: Query112](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `112`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
