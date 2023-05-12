package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidStringQuery473 extends StObject {
  
  var path: GistidString
  
  var query: `473`
}
object PathGistidStringQuery473 {
  
  inline def apply(path: GistidString, query: `473`): PathGistidStringQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidStringQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGistidStringQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: GistidString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
