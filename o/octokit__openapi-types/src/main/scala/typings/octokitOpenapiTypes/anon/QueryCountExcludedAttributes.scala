package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCountExcludedAttributes extends StObject {
  
  var path: EnterpriseString
  
  var query: CountExcludedAttributes
}
object QueryCountExcludedAttributes {
  
  inline def apply(path: EnterpriseString, query: CountExcludedAttributes): QueryCountExcludedAttributes = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCountExcludedAttributes]
  }
  
  extension [Self <: QueryCountExcludedAttributes](x: Self) {
    
    inline def setPath(value: EnterpriseString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: CountExcludedAttributes): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
