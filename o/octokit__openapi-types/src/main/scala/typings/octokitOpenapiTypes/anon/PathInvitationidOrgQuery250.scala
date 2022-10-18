package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOrgQuery250 extends StObject {
  
  var path: InvitationidOrg
  
  var query: `250`
}
object PathInvitationidOrgQuery250 {
  
  inline def apply(path: InvitationidOrg, query: `250`): PathInvitationidOrgQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOrgQuery250]
  }
  
  extension [Self <: PathInvitationidOrgQuery250](x: Self) {
    
    inline def setPath(value: InvitationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
