package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query464 extends StObject {
  
  var path: CommentnumberDiscussionnumberOrg
  
  var query: `464`
}
object Query464 {
  
  inline def apply(path: CommentnumberDiscussionnumberOrg, query: `464`): Query464 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query464]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query464] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumberOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `464`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
