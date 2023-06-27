package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOrgQuery extends StObject {
  
  var path: InvitationidOrg
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathInvitationidOrgQuery {
  
  inline def apply(path: InvitationidOrg): PathInvitationidOrgQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInvitationidOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InvitationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
