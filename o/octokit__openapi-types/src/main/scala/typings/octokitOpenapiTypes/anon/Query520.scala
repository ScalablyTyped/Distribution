package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query520 extends StObject {
  
  var path: OrgString
  
  var query: `520`
}
object Query520 {
  
  inline def apply(path: OrgString, query: `520`): Query520 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query520]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query520] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `520`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
