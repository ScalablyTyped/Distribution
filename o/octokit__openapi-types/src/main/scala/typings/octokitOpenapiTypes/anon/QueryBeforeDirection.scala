package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBeforeDirection extends StObject {
  
  var query: BeforeDirection
}
object QueryBeforeDirection {
  
  inline def apply(query: BeforeDirection): QueryBeforeDirection = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBeforeDirection]
  }
  
  extension [Self <: QueryBeforeDirection](x: Self) {
    
    inline def setQuery(value: BeforeDirection): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
