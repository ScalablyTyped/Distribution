package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySecrettype extends StObject {
  
  var path: EnterpriseString
  
  var query: Secrettype
}
object QuerySecrettype {
  
  inline def apply(path: EnterpriseString, query: Secrettype): QuerySecrettype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySecrettype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuerySecrettype] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnterpriseString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Secrettype): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
