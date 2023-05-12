package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryEnvironmentPage extends StObject {
  
  var path: OwnerString
  
  var query: EnvironmentPage
}
object QueryEnvironmentPage {
  
  inline def apply(path: OwnerString, query: EnvironmentPage): QueryEnvironmentPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEnvironmentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryEnvironmentPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: EnvironmentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
