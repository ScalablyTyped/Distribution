package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query451 extends StObject {
  
  var path: RunnergroupidNumber
  
  var query: `451`
}
object Query451 {
  
  inline def apply(path: RunnergroupidNumber, query: `451`): Query451 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query451]
  }
  
  extension [Self <: Query451](x: Self) {
    
    inline def setPath(value: RunnergroupidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `451`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
