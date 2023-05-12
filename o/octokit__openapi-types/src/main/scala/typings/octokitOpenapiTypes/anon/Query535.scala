package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query535 extends StObject {
  
  var path: TeamslugString
  
  var query: `535`
}
object Query535 {
  
  inline def apply(path: TeamslugString, query: `535`): Query535 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query535]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query535] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `535`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
