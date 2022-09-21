package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAffiliationBefore extends StObject {
  
  var query: AffiliationBefore
}
object QueryAffiliationBefore {
  
  inline def apply(query: AffiliationBefore): QueryAffiliationBefore = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAffiliationBefore]
  }
  
  extension [Self <: QueryAffiliationBefore](x: Self) {
    
    inline def setQuery(value: AffiliationBefore): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
