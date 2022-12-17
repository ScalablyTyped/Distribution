package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOrgQuery407 extends StObject {
  
  var path: InvitationidOrg
  
  var query: `407`
}
object PathInvitationidOrgQuery407 {
  
  inline def apply(path: InvitationidOrg, query: `407`): PathInvitationidOrgQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOrgQuery407]
  }
  
  extension [Self <: PathInvitationidOrgQuery407](x: Self) {
    
    inline def setPath(value: InvitationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
