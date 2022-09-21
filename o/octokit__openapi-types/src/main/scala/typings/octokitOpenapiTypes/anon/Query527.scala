package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query527 extends StObject {
  
  var path: BaseheadOwner
  
  var query: `527`
}
object Query527 {
  
  inline def apply(path: BaseheadOwner, query: `527`): Query527 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query527]
  }
  
  extension [Self <: Query527](x: Self) {
    
    inline def setPath(value: BaseheadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `527`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
