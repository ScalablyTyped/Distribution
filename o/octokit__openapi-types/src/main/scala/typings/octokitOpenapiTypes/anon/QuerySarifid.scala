package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySarifid extends StObject {
  
  var path: OwnerRepo
  
  var query: Sarifid
}
object QuerySarifid {
  
  inline def apply(path: OwnerRepo, query: Sarifid): QuerySarifid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySarifid]
  }
  
  extension [Self <: QuerySarifid](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Sarifid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
