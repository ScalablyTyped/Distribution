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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPagePerpageRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageRepositoryid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
