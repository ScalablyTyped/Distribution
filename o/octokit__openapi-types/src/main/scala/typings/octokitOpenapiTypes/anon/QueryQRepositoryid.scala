package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQRepositoryid extends StObject {
  
  var query: QRepositoryid
}
object QueryQRepositoryid {
  
  inline def apply(query: QRepositoryid): QueryQRepositoryid = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryQRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: QRepositoryid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
