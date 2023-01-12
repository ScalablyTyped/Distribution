package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query467 extends StObject {
  
  var path: TeamslugString
  
  var query: `467`
}
object Query467 {
  
  inline def apply(path: TeamslugString, query: `467`): Query467 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query467]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query467] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `467`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
