package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidStringQuery407 extends StObject {
  
  var path: GistidString
  
  var query: `407`
}
object PathGistidStringQuery407 {
  
  inline def apply(path: GistidString, query: `407`): PathGistidStringQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidStringQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGistidStringQuery407] (val x: Self) extends AnyVal {
    
    inline def setPath(value: GistidString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
