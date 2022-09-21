package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidStringQuery426 extends StObject {
  
  var path: GistidString
  
  var query: `426`
}
object PathGistidStringQuery426 {
  
  inline def apply(path: GistidString, query: `426`): PathGistidStringQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidStringQuery426]
  }
  
  extension [Self <: PathGistidStringQuery426](x: Self) {
    
    inline def setPath(value: GistidString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
