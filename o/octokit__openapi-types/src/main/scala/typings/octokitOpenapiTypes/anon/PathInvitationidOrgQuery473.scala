package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOrgQuery473 extends StObject {
  
  var path: InvitationidOrg
  
  var query: `473`
}
object PathInvitationidOrgQuery473 {
  
  inline def apply(path: InvitationidOrg, query: `473`): PathInvitationidOrgQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOrgQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInvitationidOrgQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InvitationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
