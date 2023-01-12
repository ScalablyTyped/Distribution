package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query452 extends StObject {
  
  var path: OrgString
  
  var query: `452`
}
object Query452 {
  
  inline def apply(path: OrgString, query: `452`): Query452 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query452]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query452] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `452`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
