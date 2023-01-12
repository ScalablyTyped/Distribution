package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOrgs extends StObject {
  
  var query: Orgs
}
object QueryOrgs {
  
  inline def apply(query: Orgs): QueryOrgs = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOrgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOrgs] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Orgs): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
