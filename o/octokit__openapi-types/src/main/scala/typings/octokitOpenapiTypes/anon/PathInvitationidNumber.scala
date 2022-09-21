package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidNumber extends StObject {
  
  var path: InvitationidNumber
}
object PathInvitationidNumber {
  
  inline def apply(path: InvitationidNumber): PathInvitationidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidNumber]
  }
  
  extension [Self <: PathInvitationidNumber](x: Self) {
    
    inline def setPath(value: InvitationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
