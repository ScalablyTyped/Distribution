package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAffiliationPage extends StObject {
  
  var path: OwnerRepo
  
  var query: AffiliationPage
}
object QueryAffiliationPage {
  
  inline def apply(path: OwnerRepo, query: AffiliationPage): QueryAffiliationPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAffiliationPage]
  }
  
  extension [Self <: QueryAffiliationPage](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AffiliationPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
