package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidQuery extends StObject {
  
  var path: Invitationid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathInvitationidQuery {
  
  inline def apply(path: Invitationid): PathInvitationidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInvitationidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Invitationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
