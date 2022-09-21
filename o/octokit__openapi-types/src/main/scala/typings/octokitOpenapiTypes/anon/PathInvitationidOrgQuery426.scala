package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOrgQuery426 extends StObject {
  
  var path: InvitationidOrg
  
  var query: `426`
}
object PathInvitationidOrgQuery426 {
  
  inline def apply(path: InvitationidOrg, query: `426`): PathInvitationidOrgQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOrgQuery426]
  }
  
  extension [Self <: PathInvitationidOrgQuery426](x: Self) {
    
    inline def setPath(value: InvitationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
