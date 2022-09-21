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
  
  extension [Self <: PathInvitationidOwner](x: Self) {
    
    inline def setPath(value: InvitationidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
