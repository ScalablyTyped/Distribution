package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRefSarifid extends StObject {
  
  var path: OwnerString
  
  var query: RefSarifid
}
object QueryRefSarifid {
  
  inline def apply(path: OwnerString, query: RefSarifid): QueryRefSarifid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRefSarifid]
  }
  
  extension [Self <: QueryRefSarifid](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: RefSarifid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
