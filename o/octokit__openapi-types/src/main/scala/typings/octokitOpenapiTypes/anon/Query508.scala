package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query508 extends StObject {
  
  var path: BaseheadOwner
  
  var query: `508`
}
object Query508 {
  
  inline def apply(path: BaseheadOwner, query: `508`): Query508 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query508]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query508] (val x: Self) extends AnyVal {
    
    inline def setPath(value: BaseheadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `508`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
