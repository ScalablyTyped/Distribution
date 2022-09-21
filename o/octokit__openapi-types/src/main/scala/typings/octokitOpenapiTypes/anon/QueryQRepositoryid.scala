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
  
  extension [Self <: QueryQRepositoryid](x: Self) {
    
    inline def setQuery(value: QRepositoryid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
