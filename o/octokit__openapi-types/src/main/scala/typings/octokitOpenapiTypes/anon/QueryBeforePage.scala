package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBeforePage extends StObject {
  
  var query: BeforePage
}
object QueryBeforePage {
  
  inline def apply(query: BeforePage): QueryBeforePage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBeforePage]
  }
  
  extension [Self <: QueryBeforePage](x: Self) {
    
    inline def setQuery(value: BeforePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
