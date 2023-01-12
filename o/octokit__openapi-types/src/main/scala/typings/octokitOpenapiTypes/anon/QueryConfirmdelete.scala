package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryConfirmdelete extends StObject {
  
  var path: Analysisid
  
  var query: Confirmdelete
}
object QueryConfirmdelete {
  
  inline def apply(path: Analysisid, query: Confirmdelete): QueryConfirmdelete = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryConfirmdelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryConfirmdelete] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Analysisid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Confirmdelete): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
