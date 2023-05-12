package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryIncludesparents extends StObject {
  
  var path: Owner
  
  var query: Includesparents
}
object QueryIncludesparents {
  
  inline def apply(path: Owner, query: Includesparents): QueryIncludesparents = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryIncludesparents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryIncludesparents] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Includesparents): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
