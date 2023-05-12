package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query68 extends StObject {
  
  var path: Org
  
  var query: `68`
}
object Query68 {
  
  inline def apply(path: Org, query: `68`): Query68 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query68] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `68`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
