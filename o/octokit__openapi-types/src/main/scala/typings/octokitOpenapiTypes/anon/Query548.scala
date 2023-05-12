package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query548 extends StObject {
  
  var path: RepoRunid
  
  var query: `548`
}
object Query548 {
  
  inline def apply(path: RepoRunid, query: `548`): Query548 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query548]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query548] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `548`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
