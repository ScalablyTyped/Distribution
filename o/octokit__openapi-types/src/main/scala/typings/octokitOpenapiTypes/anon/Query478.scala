package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query478 extends StObject {
  
  var path: RepoRunid
  
  var query: `478`
}
object Query478 {
  
  inline def apply(path: RepoRunid, query: `478`): Query478 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query478]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query478] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `478`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
