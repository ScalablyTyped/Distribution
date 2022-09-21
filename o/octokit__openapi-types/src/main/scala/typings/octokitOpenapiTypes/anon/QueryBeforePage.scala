package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBeforePage extends StObject {
  
  var path: OwnerString
  
  var query: BeforePage
}
object QueryBeforePage {
  
  inline def apply(path: OwnerString, query: BeforePage): QueryBeforePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBeforePage]
  }
  
  extension [Self <: QueryBeforePage](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: BeforePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
