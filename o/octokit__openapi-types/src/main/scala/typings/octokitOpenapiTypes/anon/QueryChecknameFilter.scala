package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryChecknameFilter extends StObject {
  
  var path: ChecksuiteidOwner
  
  var query: ChecknameFilter
}
object QueryChecknameFilter {
  
  inline def apply(path: ChecksuiteidOwner, query: ChecknameFilter): QueryChecknameFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryChecknameFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryChecknameFilter] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ChecksuiteidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ChecknameFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
