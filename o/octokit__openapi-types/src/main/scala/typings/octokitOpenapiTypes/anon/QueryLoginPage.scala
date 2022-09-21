package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLoginPage extends StObject {
  
  var path: OrgString
  
  var query: LoginPage
}
object QueryLoginPage {
  
  inline def apply(path: OrgString, query: LoginPage): QueryLoginPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginPage]
  }
  
  extension [Self <: QueryLoginPage](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: LoginPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
