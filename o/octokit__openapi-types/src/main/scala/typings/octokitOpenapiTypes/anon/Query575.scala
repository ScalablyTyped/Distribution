package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query575 extends StObject {
  
  var path: BaseheadOwner
  
  var query: `575`
}
object Query575 {
  
  inline def apply(path: BaseheadOwner, query: `575`): Query575 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query575]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query575] (val x: Self) extends AnyVal {
    
    inline def setPath(value: BaseheadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `575`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
