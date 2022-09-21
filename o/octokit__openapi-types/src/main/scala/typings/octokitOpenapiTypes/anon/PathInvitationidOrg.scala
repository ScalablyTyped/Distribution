package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOrg extends StObject {
  
  var path: InvitationidOrg
}
object PathInvitationidOrg {
  
  inline def apply(path: InvitationidOrg): PathInvitationidOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOrg]
  }
  
  extension [Self <: PathInvitationidOrg](x: Self) {
    
    inline def setPath(value: InvitationidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
