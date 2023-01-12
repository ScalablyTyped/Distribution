package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOwner extends StObject {
  
  var path: InvitationidOwner
}
object PathInvitationidOwner {
  
  inline def apply(path: InvitationidOwner): PathInvitationidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInvitationidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InvitationidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
