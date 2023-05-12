package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInvitationsource extends StObject {
  
  var path: Org
  
  var query: Invitationsource
}
object QueryInvitationsource {
  
  inline def apply(path: Org, query: Invitationsource): QueryInvitationsource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInvitationsource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryInvitationsource] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Invitationsource): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
