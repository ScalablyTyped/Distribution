package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query498 extends StObject {
  
  var path: RepoRunid
  
  var query: `498`
}
object Query498 {
  
  inline def apply(path: RepoRunid, query: `498`): Query498 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query498]
  }
  
  extension [Self <: Query498](x: Self) {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `498`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
