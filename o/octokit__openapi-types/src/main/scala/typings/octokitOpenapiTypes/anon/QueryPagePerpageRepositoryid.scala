package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageRepositoryid extends StObject {
  
  var query: PagePerpageRepositoryid
}
object QueryPagePerpageRepositoryid {
  
  inline def apply(query: PagePerpageRepositoryid): QueryPagePerpageRepositoryid = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageRepositoryid]
  }
  
  extension [Self <: QueryPagePerpageRepositoryid](x: Self) {
    
    inline def setQuery(value: PagePerpageRepositoryid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
