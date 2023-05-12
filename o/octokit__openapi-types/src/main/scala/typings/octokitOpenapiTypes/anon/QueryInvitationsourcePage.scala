package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInvitationsourcePage extends StObject {
  
  var path: OrgString
  
  var query: InvitationsourcePage
}
object QueryInvitationsourcePage {
  
  inline def apply(path: OrgString, query: InvitationsourcePage): QueryInvitationsourcePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInvitationsourcePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryInvitationsourcePage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: InvitationsourcePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
