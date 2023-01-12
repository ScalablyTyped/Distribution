package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageVisibletorepository extends StObject {
  
  var path: OrgString
  
  var query: PerpageVisibletorepository
}
object QueryPerpageVisibletorepository {
  
  inline def apply(path: OrgString, query: PerpageVisibletorepository): QueryPerpageVisibletorepository = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageVisibletorepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPerpageVisibletorepository] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageVisibletorepository): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
