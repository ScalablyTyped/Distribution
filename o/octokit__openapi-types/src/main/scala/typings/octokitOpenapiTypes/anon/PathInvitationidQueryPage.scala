package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidQueryPage extends StObject {
  
  var path: Invitationid
  
  var query: Page
}
object PathInvitationidQueryPage {
  
  inline def apply(path: Invitationid, query: Page): PathInvitationidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInvitationidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Invitationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
